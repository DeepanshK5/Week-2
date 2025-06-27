import React from 'react';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import Login from './components/Login';
import Register from './components/Register';
import UserDashboard from './components/UserDashboard';
import AdminDashboard from './components/AdminDashboard';
import SearchTrains from './components/SearchTrains';
import BookTicket from './components/BookTicket';


function App() {
    return (
        <Router>
            <div className="App">
                <h1>Railway Booking Portal</h1>
                <nav>
                    <Link to="/">Login</Link> | <Link to="/register">Register</Link>
                </nav>
                <Routes>
                    <Route path="/" element={<Login />} />
                    <Route path="/register" element={<Register />} />
                    <Route path="/user-dashboard" element={<UserDashboard />} />
                    <Route path="/admin-dashboard" element={<AdminDashboard />} />
                    <Route path="/search-trains" element={<SearchTrains />} /><Route path="/booking" element={<BookTicket />} />
                    <Route path="/book-ticket" element={<BookTicket />} />
                    <Route path="/my-bookings" element={<div>My Bookings Page (Coming Soon)</div>} />
                </Routes>
            </div>
        </Router>
    );
}

export default App;
