<%@ page language="java" contentType="application/json; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
  
</head>
<body>

 <form method="post" action="/authentication" enctype="application/json">

<input type="email" class="form-control" id="exampleInputEmail1" name="email" />
<input type="password" class="form-control" id="exampleInputPassword1" name="password" />
 <input type="submit" />
</form>

 
</body>
</html>