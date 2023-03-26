<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Find flight</title>
</head>
<body>
<h1>Display flight</h1>

<table style="width: 50%">
    <tr>
        <th>Airline</th>
        <th>DepartureCity</th>
        <th>ArrivalCity</th>
        <th>DepartureTime</th>
    </tr>
    <c:forEach items="${flight}" var="flight">
        <tr>
            <td>${flight.operatingAirline}</td>
            <td>${flight.departureCity}</td>
            <td>${flight.arivalCity}</td>
            <td>${flight.dateOfDeparture}</td>
            <td><a href="showCompleteReservation=${flight.id}">Select</a></td>
        </tr>
    </c:forEach>
</table>


</body>
</html>