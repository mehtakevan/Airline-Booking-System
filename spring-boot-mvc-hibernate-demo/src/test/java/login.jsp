<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>

<form method="POST" name="login"
		action="<%=request.getContextPath()%>/login">
		Username: <input name="username" value="${username}" type="text" /> <br /> <br />
		Password: <input name="password" value="${password}" type="password" />
		<br /> <br />
		<input value="Login" type="submit" />
</form>




</body>
</html>