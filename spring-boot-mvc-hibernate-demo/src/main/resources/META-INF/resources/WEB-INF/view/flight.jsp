<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
	<title>Flight Details</title>
	<style>
	body{
	background-color: black;
	}
		table {
			margin-top: 100px;
			margin-left:380px;
			width: 50%;
			border-collapse: collapse;
			border: 1px solid white;
			border-radius: 5px;
		}
		th, td {
			padding: 10px;
			border: 2px solid white;
			color: yellow;
		}
		.head{
		padding-top:100px;
		padding-left: 650px;
		text-align: centre;
		font-size: 40px;
		background: black;
		color: Yellow;
		}
	</style>
	<div class="head">
	 Flight Details 
	</div>
</head>
<body>

	<table>
		<tr>
			<th>Id :</th>
			<td>${flight.id}</td>
		</tr>
		<tr>
			<th>Name :</th>
			<td>${flight.name}</td>
		</tr>
		<tr>
			<th>Source :</th>
			<td>${flight.source}</td>
		</tr>
		<tr>
			<th>Destination :</th>
			<td>${flight.destination}</td>
		</tr>
		<tr>
			<th>Price :</th>
			<td>${flight.price}</td>
		</tr>
		<tr>
			<th>Departure Time :</th>
			<td>${flight.departure_time}</td>
		</tr>
	</table>
</body>
</html>