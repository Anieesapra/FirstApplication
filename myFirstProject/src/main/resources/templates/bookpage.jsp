<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head> <%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  
  <h1>welcome to my first application</h1>
  <h1> trippy hu maine</h1>
 
  <h1 th:text="${book.id}"></h1>
  
  <h1 th:text="${book.publisher}"></h1>
   <h1>Book Name is :</h1><h1 th:text="${book.name}">book Name is </h1>
 <h1 th:text="${book.doi}"></h1>
 
 
</body>
</html>