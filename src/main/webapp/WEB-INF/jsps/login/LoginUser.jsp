<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login Form</title>
</head>
<body>
<h1 style="text-align: center;margin: 10px;padding: 10px;font-size: 2rem;color: blue">Login page</h1>
<form action="login" method="post">
    <table style="with: 50%">

        <tr>
            <td>Email</td>
            <td><input type="text" name="email" value="${email}"/></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="password" /></td>
        </tr>
    </table>
    <pre><input type="submit" value="Login" /> OR <button><a href="showReg">Register</a> </button></pre>
</form>

</body>
</html>