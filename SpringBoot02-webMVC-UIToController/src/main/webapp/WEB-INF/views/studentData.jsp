<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>welcome to student register page</h3>
<form action="add" method="post">
<pre>
ID  :<input type="text" name="stdId"/> 
NAME:<input type="text" name="stsName"/>
MARK:<input type="text" name="stsMark"/>

PWD :<input type="password" name="stdPwd"/>
GEN :<input type="radio" name="empGen" value="men"/> men
     <input type="radio" name="empGen" value="women"/>women

DEPT :<select name="empDept">
         <option value="">-SELECT-</option>
         <option value="DEV">DEV</option>
         <option value="QA">QA</option>
         <option value="BA">BA</option>

     </select>     
ADDR :<textarea name="empAdd"></textarea>     
LANGS: <input type="checkbox"/ name="empLang" value="ENG">ENG
LANGS: <input type="checkbox"/ name="empLang" value="HINDI">hind
LANGS: <input type="checkbox"/ name="empLang" value="ODIA">OD
LANGS: <input type="checkbox"/ name="empLang" value="TEL">TEL

PROJ: 
    <select name="empProj" multiple>
       <option value="HCL">HCL</option>
       <option value="TCS">TCS</option>
       <option value="IFS">IFS</option>
       <option value="CAP">CAP</option>

   </select>
COLOR: <input type="color" name="empColor"/>
DATE  :<input type="date" name="empData"/>
TIME  :<input type="time" name="empTime"/>
File  :<input type="file" name="empFile"/>
email:<input TYPE="email" name="empEmail"/>
<input type="submit" value="register"/>
</pre>

</form>

</body>
</html>