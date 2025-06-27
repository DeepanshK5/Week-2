import React, { useState } from 'react';
import { useLocation } from 'react-router-dom';
import axios from 'axios';

function BookTicket() {
    const location = useLocation();
    const { trainId, travelDate, source, destination } = location.state || {};

    const [bookingData, setBookingData] = useState({
        passengerName: '',
        trainId: trainId || '',
        seatsBooked: 1,
        source: source || '',
        destination: destination || '',
        travelDate: travelDate || ''
    });

    const [message, setMessage] = useState('');
    const [error, setError] = useState('');

    const handleChange = (e) => {
        setBookingData(prev => ({
            ...prev,
            [e.target.name]: e.target.value
        }));
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        setMessage('');
        setError('');
        const token = localStorage.getItem("jwtToken");
        const email = localStorage.getItem("userEmail");  // Make sure you set this on login

        try {
            const response = await axios.post(
                'http://localhost:8080/api/bookings/book',
                bookingData,
                {
                    headers: {
                        Authorization: `Bearer ${token}`,
                        'X-User-Email': email
                    }
                }
            );
            setMessage('Booking successful! Your PNR: ' + response.data.pnr);
        } catch (err) {
            console.error(err);
            setError('Booking failed! ' + (err.response?.data?.message || ''));
        }
    };

    return (
        <div style={{ padding: '30px', maxWidth: '400px', margin: 'auto' }}>
            <h2>Book Ticket</h2>
            <form onSubmit={handleSubmit} style={{ display: 'flex', flexDirection: 'column', gap: '10px' }}>
                <input
                    type="text"
                    name="passengerName"
                    placeholder="Passenger Name"
                    value={bookingData.passengerName}
                    onChange={handleChange}
                    required
                />
                <input
                    type="number"
                    name="seatsBooked"
                    placeholder="Seats to Book"
                    min="1"
                    value={bookingData.seatsBooked}
                    onChange={handleChange}
                    required
                />
                <input type="text" value={bookingData.source} readOnly />
                <input type="text" value={bookingData.destination} readOnly />
                <input type="date" value={bookingData.travelDate} readOnly />
                <button
                    type="submit"
                    style={{ padding: '10px', backgroundColor: '#007BFF', color: '#fff', border: 'none' }}
                >
                    Book Now
                </button>
            </form>
            {message && <p style={{ color: 'green', marginTop: '10px' }}>{message}</p>}
            {error && <p style={{ color: 'red', marginTop: '10px' }}>{error}</p>}
        </div>
    );
}

export default BookTicket;
