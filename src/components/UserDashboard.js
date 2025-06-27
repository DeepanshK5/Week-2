import React from 'react';
import { useNavigate } from 'react-router-dom';

function UserDashboard() {
    const navigate = useNavigate();

    const handleLogout = () => {
        localStorage.removeItem("jwtToken");
        navigate("/");
    };

    return (
        <div style={styles.container}>
            <h2>Welcome to User Dashboard</h2>
            <div style={styles.buttonContainer}>
                <button onClick={() => navigate('/search-trains')} style={styles.button}>Search Trains</button>
                <button onClick={() => navigate('/my-bookings')} style={styles.button}>My Bookings</button>
                <button onClick={handleLogout} style={{ ...styles.button, backgroundColor: 'tomato' }}>Logout</button>
            </div>
        </div>
    );
}

const styles = {
    container: {
        padding: '30px',
        textAlign: 'center'
    },
    buttonContainer: {
        display: 'flex',
        flexDirection: 'column',
        gap: '15px',
        alignItems: 'center',
        marginTop: '20px'
    },
    button: {
        padding: '10px 25px',
        fontSize: '16px',
        cursor: 'pointer',
        border: 'none',
        backgroundColor: '#007BFF',
        color: 'white',
        borderRadius: '5px'
    }
};

export default UserDashboard;
