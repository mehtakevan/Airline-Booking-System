<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Update Flight</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: white;
        }

        .container {
            width: 300px;
            margin-top :80px;
            margin-left:600px;
            padding-top: 100px;
        }

        form {
            background-color: #007bff;
            padding: 20px;
            border-radius: 5px;
        }

        form label,
        form input {
            display: block;
            margin-bottom: 10px;
            width: 100%;
            
        }

        form input[type="submit"] {
            background-color: black;
            color: #fff;
            border: none;
            padding: 10px;
            cursor: pointer;
        }

        form input[type="submit"]:hover {
            background-color: #0069d9;
        }
    </style>
</head>
<body>

<div class="container">
    <h1 style="text-align: center;">Airlines ticket booking system</h1>
    <c:if test="${not empty msg}">
        ${msg}
    </c:if>
    <h2 style="text-align: center;">Update Flight Details</h2>
    <form method="POST" name="update_flight" action="<%=request.getContextPath()%>/update/flight" style="display: grid; gap: 10px;">
        <input hidden="hidden" name="id" value="${id}" type="text" />
        <label for="name">Name:</label>
        <input id="name" name="name" value="${bus.name}" type="text" />
        <label for="source">Source:</label>
        <input id="source" name="source" value="${bus.source}" type="text" />
        <label for="destination">Destination:</label>
        <input id="destination" name="destination" value="${bus.destination}" type="text" />
        <label for="price">Price:</label>
        <input id="price" name="price" value="${bus.price}" type="number" />
        <label for="departure_time">Departure Time:</label>
        <input id="departure_time" name="departure_time" value="${bus.departure_time}" type="time" />
        <input value="Update Flight" type="submit" style="margin-top: 10px;" />
    </form>
</div>

</body>
</html>