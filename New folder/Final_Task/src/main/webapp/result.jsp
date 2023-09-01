<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<style>
body {
    background-color: #333;
    color: #fff;
    font-family: 'Poppins', sans-serif;
    text-align: center;
}

.container {
    margin-top: 40px;
    border: 2px solid #007BFF;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
}

h2 {
    color: #007BFF;
}
</style>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Data</title>
    <link rel="stylesheet" type="text/css" href="your-stylesheet.css">
</head>
<body>
    <div class="container">
        <h2>Login Details</h2>
        <p><strong>Name:</strong> ${name}</p>
        <p><strong>Date of Birth:</strong> ${dob}</p>
        <p><strong>Gender:</strong> ${gender}</p>
        <p><strong>Mobile No:</strong> ${mobile}</p>
        <p><strong>Email id:</strong> ${email}</p>
    </div>
</body>
</html>
