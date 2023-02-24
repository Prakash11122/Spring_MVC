<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>welcome to employee data page</h3>
<table border="1">
   <tr>
     <th>ID</th>
     <th>NAME</th>
     <th>EMAIL</th>
     <th>SALARY</th>
     <th>DEPAT</th>
     <th>HRA</th>
     <th>DA</th>
   </tr>
   
   <c:forEach items="${list}" var="ob">
     <tr>
         <td>${ob.eid }</td>
         <td>${ob.ename }</td>
         <td>${ob.email }</td>
         <td>${ob.esal }</td>
         <td>${ob.edept }</td>
         <td>${ob.hra }</td>
         <td>${ob.da }</td>
         
     </tr>
   
   </c:forEach>


</table>
</body>
</html>