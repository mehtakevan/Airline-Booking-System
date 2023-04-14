<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Add flight</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
        }

        .container {
            width: 300px;
            margin: 0 auto;
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
    <h2 style="text-align: center;">Add Flight</h2>
    <c:if test="${not empty msg}">
        ${msg}
    </c:if>
    <form method="POST" name="add_flight" action="<%=request.getContextPath()%>/add/flight" style="display: grid; gap: 10px;">
        <label for="name">Name:</label>
        <input id="name" name="name" value="${name}" type="text" required = "true"/>
        <label for="source">Source:</label>
        <input id="source" name="source" value="${source}" type="text" required = "true" />
        <label for="destination">Destination:</label>
        <input id="destination" name="destination" value="${destination}" type="text" required = "true"/>
        <label for="price">Price:</label>
        <input id="price" name="price" value="${price}" type="number" required = "true"/>
        <label for="departure_time">Departure Time:</label>
        <input id="departure_time" name="departure_time" value="${departure_time}" type="time" required = "true" />
        <input value="Add Flight" type="submit" style="margin-top: 10px;" />
    </form>
</div>

</body>
</html>