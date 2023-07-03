<%@ page language="java" contentType="application/json; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
  <link th:href="@{/css/bootstrap.min.css}" rel="stylesheet">
  <link th:href="@{/css/style.css}" rel="stylesheet">
  <style>
    body {
      background-color: #f8f9fa;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }

    .form-container {
      max-width: 400px;
      padding: 20px;
      background-color: #ffffff;
      border-radius: 8px;
      box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    }

    .form-container h1 {
      text-align: center;
      margin-bottom: 20px;
    }

    .form-control {
      width: 100%;
      height: 40px;
      font-size: 16px;
      border: 1px solid #ced4da;
      border-radius: 4px;
      padding: 8px;
      margin-bottom: 10px;
    }

    .submit-button {
      background-color: #007bff;
      color: white;
      border: none;
      padding: 10px 20px;
      font-size: 16px;
      border-radius: 4px;
      width: 100%;
    }

    .submit-button:hover {
      background-color: #0056b3;
    }

    .login-link {
      display: flex;
      justify-content: center;
      margin-top: 20px;
    }

    .login-link a {
      background-color: #4CAF50;
      color: white;
      padding: 10px 20px;
      text-decoration: none;
      border-radius: 4px;
    }

    .login-link a:hover {
      background-color: #45a049;
    }
    
    .logo {
      text-align: center;
      margin-bottom: 20px;
    }

    .logo img {
      width: 150px;
      }
  </style>
</head>
<body>
  <div class="form-container">
    <div class="logo">
      <img src="C:\Users\sapra\OneDrive\Pictures\download.jpg" alt="Logo">
    </div>
    <h3>Welcome to my application, please sign up</h3>

    <form method="post" action="/postForm" enctype="application/json">
      <input type="text" class="form-control" id="id" name="id" placeholder="ID" />
      <input type="email" class="form-control" id="exampleInputEmail1" name="email" placeholder="Email" />
      <input type="password" class="form-control" id="exampleInputPassword1" name="password" placeholder="Password" />
      <button type="submit" class="submit-button">Submit</button>
    </form>
<h1> If you already have account,please Login<h1>
    <div class="login-link">
      <a href="loginform">Login</a>
    </div>

  <script th:src="@{/js/jquery.min.js}"></script>
  <script th:src="@{/js/bootstrap.min.js}"></script>
  <script th:src="@{/js/scripts.js}"></script>
</body>
</html>
    