<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Booking</title>
</head>
<body>
			<h1>Bookings</h1>
			<table cellpadding="6" cellspacing="7">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Source</th>
						<th>Destination</th>
						<th>Price</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="t" items="${passengers}">
							<tr>
								<td>${t.passengerId}</td>
								<td>${t.passengerName}</td>
								<td>${t.source}</td>
								<td>${t.destination}</td>
								<td>${t.price}</td>
							</tr>
					</c:forEach>
				</tbody>
			</table>
</body>
</html>