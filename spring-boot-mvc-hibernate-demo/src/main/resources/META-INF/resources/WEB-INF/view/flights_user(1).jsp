<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<style>
table, th, td {
  border: 1px solid white;
  border-collapse: collapse;
}
th, td {
  background-color: #96D4D4;
}
a:link, a:visited {
  background-color: #F1B56D;
  color: white;
  padding: 14px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

a:hover, a:active {
  background-color: black;
}
</style>
</head>
<title>Flight ticket booking system</title>
<body>
	
	
	<c:if test="${not empty msg}">
        ${msg}
    </c:if>
	<c:choose>
		<c:when test="${flights != null}">
			<h1>Flight Schedule</h1>
			<table cellpadding="6" cellspacing="7">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Source</th>
						<th>Destination</th>
						<th>Price<th>
						<th>DepartureTime</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="t" items="${flights}">
						<tr>
							<td>${t.id}</td>
							<td>${t.name}</td>
							<td>${t.source}</td>
							<td>${t.destination}</td>
							<td>${t.price}</td>
							<td>${t.departure_time}</td>
							<td>
							<a
								href="<%=request.getContextPath()%>/flight/${t.id}">Details</a>
								&nbsp;<a
								href="<%=request.getContextPath()%>/book/flight/${t.id}">Book</a>
								&nbsp;
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:when>
		<c:otherwise>
        No Flight found in the DB!
        </c:otherwise>
	</c:choose>
</body>
</html>