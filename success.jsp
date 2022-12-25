<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to advance Java</h1>
<%
String uname = (String)request.getAttribute("data");
out.print("Your Username is:"+uname);



%>

</body>
</html>