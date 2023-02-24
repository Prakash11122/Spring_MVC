<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%=new java.util.Date(2) %>
<h3>welcome to msg page</h3>
<%response.addHeader("Refresh", "5; https://www.google.com/") ;%>
</body>
</html>