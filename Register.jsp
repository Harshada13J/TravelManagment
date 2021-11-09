<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="StyleS2.css">
<title>Harshada Travels</title>
</head>
<body>
<header>

<div class="logo">

<img style ="width: 200px; height: 100px;
	padding-left: 20px;"src="logo.png">
	
	<center>
<a style="padding: 10px; margin: 42px; text-decoration: none; font-size: 40px;">Registration</a>
</center>

</div>


<form action="Demo" methos="post" >
<table cellspacing="10" cellpadding="5">
<tr><td><label>Username:</label></td>
<td><input type="text" name="username"></td></tr>
<tr><td><label>Mobile No.:</label></td>
<td><input type="text" name="mobileno"></td></tr>
<tr><td><label>EmailId :</label></td>
<td><input type="email" name="emailId"></td></tr>
<tr><td><label>Create User-Id: :</label></td>
<td><input type="text" name="userId"></td></tr><br><br>
<tr><td><label>Create Password:</label></td>
<td><input type="password" name="password"></td></tr>
<tr><td><label> Confirm Password:</label></td>
<td><input type="password" name="password1"></td></tr>
</table>
<center><input style="color: Blue; font-size: 30px;" type="submit" Value="Submit" >
<input style="color: Red; font-size: 30px;" type="reset" Value="Cancel" >
</center>


<br><br>
<center>
<a style="padding: 20px; margin: 42px; text-decoration: none;font-size: 20px" href="Welcome.html">Click here to Visit Home Page</a>
<marquee  style="font-size: 30px; padding-top: 100px " direction="down" width="1000" >
<p style="font-size: 30px">After Sucessful registration user need to login for Ticket booking</p>
</center>
</form>
</header>
</body>
</html>