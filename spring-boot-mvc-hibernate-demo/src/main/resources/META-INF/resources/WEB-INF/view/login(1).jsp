<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN</title>
<style>
body{
 font-family: Arial, sans-serif;
            background-color: #f0f0f0;
             background-image: url('https://images.unsplash.com/photo-1464037866556-6812c9d1c72e?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2070&q=80 ');
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: cover;
            font-family: 'Open Sans', sans-serif;
            font-size: 20px;
            color: #333;
            margin: 0;
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
        }
            
</style>
</head>
<body>

<div class="container">
<h1> Log in </h1>
<form method = "POST" value = "login" action ="/login/user">
<div class="form-group">
	Username: <input name="username" value="${username}" type="text" required = "true"/>
		<br /> <br />
		</div>
		<div class = "form-group">
	Password: <input name="password" value="${password}" type="password" required = "true"/>
		<br /> <br />
		</div>
	<input value="Login" type="submit" /> 
</form>


<form method = "GET" value = "new" action = "/new">
	<input value="Sign Up" type="submit" />
</form>
</div>

</body>
</html>