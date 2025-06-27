import React, { useState } from 'react';

function Register() {
    const [user, setUser] = useState({
        name: '',
        email: '',
        username: '',
        password: '',
        role: 'USER'
    });

    const handleChange = (e) => {
        setUser({ ...user, [e.target.name]: e.target.value });
    };

    const handleRegister = async (e) => {
        e.preventDefault();
        const res = await fetch("http://localhost:8080/api/users/register", {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(user),
        });

        if (res.ok) {
            alert("Registration Successful");
            setUser({ name: '', email: '', username: '', password: '', role: 'USER' });
        } else {
            alert("Registration Failed");
        }
    };

    return (
        <div className="form-container">
            <h2>Register</h2>
            <form onSubmit={handleRegister}>
                <input name="name" value={user.name} onChange={handleChange} placeholder="Name" required />
                <input name="email" value={user.email} onChange={handleChange} placeholder="Email" required />
                <input name="username" value={user.username} onChange={handleChange} placeholder="Username" required />
                <input type="password" name="password" value={user.password} onChange={handleChange} placeholder="Password" required />
                <button type="submit">Register</button>
            </form>
        </div>
    );
}

export default Register;
