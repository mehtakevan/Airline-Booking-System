<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Findyourflight</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
             background-image: url('https://images.unsplash.com/photo-1488085061387-422e29b40080?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1331&q=80 ');
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: cover;
        }
        .container {
        
            width: 300px;
            margin-top: 200px;
            margin-left: 540px;
            padding: 20px;
            background-color: #ffffff;
            box-shadow: 0 0 5px rgba(0,0,0,0.2);
            border-radius: 5px;
        }
        .form-group {
            margin-bottom: 10px;
            background: linear-gradient(to top, rgba(0,0,0,0.8)50%,rgba(0,0,0,0.8)50%);
             transform: translate(0%,-5%);
    border-radius: 10px;
    padding: 25px;
    color:white;
        }
        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }
        input[type="text"] {
            width: 100%;
            padding: 5px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
        input[type="submit"] {
            display: block;
            width: 100%;
            padding: 8px;
            background-color: #007bff;
            color: #ffffff;
            text-align: center;
            font-weight: bold;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Get your Flight</h1>
    <form method="POST" name="findbus" action="<%=request.getContextPath()%>/find/flight">
        <div class="form-group">
            <label for="source">Source:</label>
            <input name="source" value="${source}" type="text" id="source" required = "true"/>
        </div>
        <div class="form-group">
            <label for="destination">Destination:</label>
            <input name="destination" value="${destination}" type="text" id="destination" required = "true"/>
        </div>
        <input value="Get Flight" type="submit" />
    </form>
</div>

</body>
</html>