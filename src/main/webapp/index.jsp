<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>index</title>
</head>
<body>
	<h2>Spring-Mail</h2>
	<form action="sendMail.do" method="post">
		<label>To:</label> <input type="email" name="toMailId"><br>
		<label>Subject:</label><input type="text" name="subject"><br>
		<label>Body</label>
		<textarea rows="3" name="body"></textarea>
		<br> <input type="submit" value="Send Mail">
	</form>
</body>
</html>