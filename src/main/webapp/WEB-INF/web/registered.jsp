<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>registered</title>
</head>
<body>
<form action="RegisterController" method="post">
username:<input type="text" name="u_username"><br>
password:<input type="password" name="u_password"><br>
<input type="submit" >
<%out.println(request.getAttribute("rems"));%>
</form>
</body>
</html>