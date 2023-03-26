<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Find flight</title>
</head>
<body>
    <h1>find flight</h1>
    <form action="findFlight" method="post">
        <table style="width: 50%">
            <tr>
                <td>From : </td>
                <td><input type="text" name="from" /></td>
            </tr>
            <tr>
                <td>To : </td>
                <td><input type="text" name="to" /></td>
            </tr>
            <tr>
                <td>Departure date</td>
                <td><input type="text" name="departureDate" /></td>
            </tr>
        </table>
        <input type="submit" value="Search" />
    </form>

</body>
</html>