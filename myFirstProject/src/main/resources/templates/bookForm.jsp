<%@ page language="java" contentType="application/json; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
     <link th:href="@{/css/bootstrap.min.css}" rel="stylesheet">
<link th:href="@{/css/style.css}" rel="stylesheet">
</head>
<body>
 
  <form method="post" action="/posthello" enctype="application/json">
  <h1>Enter details for book</h1>
  <label>
    Book ID:
    <input type="text" name="id" />
  </label>
  <br>
  <label>
    Book Name:
    <input type="text" name="name" />
  </label>
  <br>
  <label>
    Book Publisher:
    <input type="text" name="publisher" />
  </label>
  <br>
  <label>
    Book DOI:
    <input type="text" name="doi" />
  </label>
  <br>
  <h1>Enter details for Student</h1>
  <label>
    Student ID:
    <input type="text" name="studentid" />
  </label>
  <br>
  <label>
    Student Name:
    <input type="text" name="studentname" />
  </label>
  <br>
  <label>
    Student Standard:
    <input type="text" name="standard" />
  </label>
  <br>
  <label>
    Student Section:
    <input type="text" name="section" />
  </label>
  <br>
  <input type="submit" />
</form>
  

    <script th:src="@{/js/jquery.min.js}"></script>
<script th:src="@{/js/bootstrap.min.js}"></script>
<script th:src="@{/js/scripts.js}"></script>

 
</body>
</html>