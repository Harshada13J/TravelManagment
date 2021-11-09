<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link  rel="stylesheet" type="text/css" href="StyleS4.css">
<title>Harshada Travels</title>
</head>
<body>
<header>
<center>
<p> <u>Book your Ticket Here</u></p>
</center>
</header>
<form action="book" method="post">
<table cellspacing="10" cellpadding="5">
<tr><td>Select your city:</td>
<td><select name="YourCity">
<option></option>
<option value="nsk">Nashik</option>
<option value="pn">Pune</option>
</select></td></tr>

<tr><td>Select Destination:</td>
<td><select name="destination">
<option></option>
<option value="nashik">Nashik</option>
<option value="pune">Pune</option>
<option value="nagpur">Nagpur</option>
<option value="mumbai">Mumbai</option>
<option value="thane">Thane</option>
<option value="ahmadnagar">Ahmadnagar</option>
</select></td></tr>

<tr><td>Select Time Slot:</td>
<td><select >
<option></option name="time">
<option value="10">10 am</option>
<option value="1">1 pm</option>
<option value="4">4 pm</option>
<option value="7">7 pm</option>
<option value="10">10 pm</option>
</select></td></tr>
</table>
<input style="color: Blue; font-size: 20px;" type="submit" Value="Book Ticket" ><br><br>

</form>
<p style="position: fixed; bottom: 0; width:100%; text-align: center">
 <a style="padding: 20px; margin: 42px; text-decoration: none;font-size: 20px" href="Welcome.html">Click here to Visit Home Page</a>
                </p>
</body>
</html>