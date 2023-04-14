<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
<style>
body {
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
    margin: 0 auto;
    padding-top: 100px;
}

form {
    background-color: #fff;
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
    background-color: #007bff;
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
    <form method="POST" name="signup" action="<%=request.getContextPath()%>/signup">
        <label for="name">Name:</label>
        <input id="name" name="name" value="${name}" type="text" required = "true"/>
        <label for="email">Email:</label>
        <input id="email" name="email" value="${email}" type="text" required = "true"/>
        <label for="contact_no">Contact No:</label>
        <input id="contact_no" name="contact_no" value="${contact_no}" type="text" required = "true"/>
        <label for="age">Age:</label>
        <input id="age" name="age" value="${age}" type="number" required = "true"/>
        <label for="gender">Gender:</label>
        <input id="gender" name="gender" value="${gender}" type="text" required = "true"/>
        <label for="username">Username:</label>
        <input id="username" name="username" value="${username}" type="text" required = "true"/>
        <label for="password">Password:</label>
        <input id="password" name="password" value="${password}" type="password" required = "true"/>
        <input value="Sign Up" type="submit" />
    </form>
</div>

</body>
</html>