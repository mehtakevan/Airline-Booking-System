<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Main</title>
    <style type="text/css">
        body {
            background-image: url('https://images.unsplash.com/photo-1464037866556-6812c9d1c72e?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2070&q=80 ');
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: cover;
            font-family: 'Open Sans', sans-serif;
            font-size: 20px;
            color: #333;
            margin: 0;
        }
        h1 {
            text-align: center;
            padding-top: 150px;
            font-size: 60px;
            font-weight: 400;
            color:black;
            margin-top: 40px;
            font-family: Times New Roman;
           
            
            
        }
        a {
            text-decoration: none;
            border: 1px solid #333;
            padding: 10px 20px;
            color: #FFD700;
            background-color: black;
            font-size: 20px;
            margin: 0 auto;
            display: block;
            width: 150px;
            text-align: center;
            border-radius: 10px;
            margin-top: 50px;
        }
        a:hover {
            background-color: #333;
            color: #fff;
        }
    </style>
</head>
<title>Main</title>
<body>

    <h1>Let's Begin Your Journey</h1>
    <a href="<%=request.getContextPath()%>/findflight">Find Flight</a>
    
</body>
</html>








