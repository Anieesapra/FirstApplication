<%@ page language="java" contentType="application/json; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
  
</head>
<body>
<h1> Welcome to my application, please signup<h1>

 <form method="post" action="/postForm" enctype="application/json">
 <input type="text" class="form-control" id="id" name="id" />
<input type="email" class="form-control" id="exampleInputEmail1" name="email" />
<input type="password" class="form-control" id="exampleInputPassword1" name="password" />
 <input type="submit" />
 
</form>
<h1> if you already have account, pleasee click here <a href="loginform"> login </a>
 
</body>
</html>