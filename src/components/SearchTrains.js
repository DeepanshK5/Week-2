import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom'; // <-- import navigate hook
import axios from 'axios';

function SearchTrains() {
    const [source, setSource] = useState('');
    const [destination, setDestination] = useState('');
    const [date, setDate] = useState('');
    const [trains, setTrains] = useState([]);
    const [error, setError] = useState('');

    const navigate = useNavigate();  // <-- add navigate

    const handleSearch = async () => {
        const token = localStorage.getItem("jwtToken");
        setError('');
        setTrains([]);

        try {
            const response = await axios.get("http://localhost:8080/api/trains/search", {
                params: { source, destination, date },
                headers: {
                    Authorization: `Bearer ${token}`
                },
                withCredentials: false
            });

            setTrains(response.data);
        } catch (err) {
            console.error("Axios error:", err);
            setError("Failed to fetch trains or unauthorized access.");
        }
    };


    return (
        <div style={styles.container}>
            <h2>Search Trains</h2>
            <div style={styles.form}>
                <input
                    type="text"
                    placeholder="Source"
                    value={source}
                    onChange={(e) => setSource(e.target.value)}
                    style={styles.input}
                />
                <input
                    type="text"
                    placeholder="Destination"
                    value={destination}
                    onChange={(e) => setDestination(e.target.value)}
                    style={styles.input}
                />
                <input
                    type="date"
                    value={date}
                    onChange={(e) => setDate(e.target.value)}
                    style={styles.input}
                />
                <button onClick={handleSearch} style={styles.button}>Search</button>
            </div>

            {error && <p style={styles.error}>{error}</p>}

            {Array.isArray(trains) && trains.length > 0 && (
                <div style={styles.results}>
                    <h3>Available Trains</h3>
                    <ul>
                        {trains.map((train) => {
                            return (
                                <li key={train.id} style={styles.trainItem}>
                                    <strong>{train.trainName}</strong> ({train.trainNumber}) - Seats: {train.availableSeats}
                                    <button
                                        onClick={() => {
                                            const sourceStation = train.stationList.find(
                                                (s) => s.stationCode === source
                                            );
                                            const destinationStation = train.stationList.find(
                                                (s) => s.stationCode === destination
                                            );

                                            if (!sourceStation || !destinationStation) {
                                                alert("Invalid station selection.");
                                                return;
                                            }

                                            navigate('/book-ticket', {
                                                state: {
                                                    trainId: train.id,
                                                    travelDate: train.travelDate,
                                                    source: sourceStation.stationName,
                                                    destination: destinationStation.stationName
                                                }
                                            });
                                        }}
                                        style={{
                                            ...styles.button,
                                            marginLeft: '15px',
                                            backgroundColor: 'green'
                                        }}
                                    >
                                        Book Ticket
                                    </button>
                                </li>
                            );
                        })}

                    </ul>
                </div>
            )}
        </div>
    );
}

const styles = {
    container: { padding: '30px' },
    form: { display: 'flex', flexDirection: 'column', gap: '10px', maxWidth: '300px', margin: 'auto' },
    input: { padding: '8px', fontSize: '16px' },
    button: { padding: '10px', backgroundColor: '#007BFF', color: '#fff', border: 'none', cursor: 'pointer' },
    error: { color: 'red', marginTop: '10px' },
    results: { marginTop: '20px' },
    trainItem: { padding: '8px', borderBottom: '1px solid #ccc', display: 'flex', alignItems: 'center' }
};

export default SearchTrains;
