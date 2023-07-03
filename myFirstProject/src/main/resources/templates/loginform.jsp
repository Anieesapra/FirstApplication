<%@ page language="java" contentType="application/json; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
>
<link th:href="@{/css/bootstrap.min.css}" rel="stylesheet">
<link th:href="@{/css/style.css}" rel="stylesheet">
  
</head>
<body style="background-color: #f8f9fa;">
<h1> Please login to your Account</h1>
<form method="post" action="/authentication" enctype="application/json">
  <div style="margin-bottom: 20px;">
    <label for="exampleInputEmail1" style="font-weight: bold; font-size: 18px;">Email:</label>
    <input type="email" class="form-control" id="exampleInputEmail1" name="email" style="width: 300px; height: 40px; font-size: 16px;" />
  </div>
  <div style="margin-bottom: 20px;">
    <label for="exampleInputPassword1" style="font-weight: bold; font-size: 18px;">Password:</label>
    <input type="password" class="form-control" id="exampleInputPassword1" name="password" style="width: 300px; height: 40px; font-size: 16px;" />
  </div>
  <button type="submit" style="background-color: #007bff; color: white; border: none; padding: 10px 20px; font-size: 16px; border-radius: 4px;">Submit</button>
</form>

  <script th:src="@{/js/jquery.min.js}"></script>
<script th:src="@{/js/bootstrap.min.js}"></script>
<script th:src="@{/js/scripts.js}"></script>
 
</body>
</html>