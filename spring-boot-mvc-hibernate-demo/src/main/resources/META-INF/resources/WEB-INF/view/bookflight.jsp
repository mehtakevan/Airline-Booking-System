<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book your Flight</title>
<style>
body{
 font-family: Arial, sans-serif;
            background-color: #f0f0f0;
             background-image: url('https://images.unsplash.com/photo-1520437358207-323b43b50729?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80 ');
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: cover;
            font-family: 'Open Sans', sans-serif;
            font-size: 20px;
            color: #333;
            margin: 0;
            }
            
            .message{
            color: white;
         
            padding-left:500px;
           padding-top:400px;
            font-size: 70px;
            }
</style>
</head>
<body>
<div class="message">
Your ticket has been booked for "${flight.source}" to "${flight.destination}"
</div>

</body>
</html>