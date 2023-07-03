<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head> <%@ page isELIgnored="false" %>

 

    <title>Bootstrap 4, from LayoutIt!</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    
   <link th:href="@{/css/bootstrap.min.css}" rel="stylesheet">
<link th:href="@{/css/style.css}" rel="stylesheet">
   
 

 
</head>
<body>
 <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<h3 class="text-center text-success">
				Welcome to the application
			</h3>
		</div>
	</div>
</div>

    <script th:src="@{/js/jquery.min.js}"></script>
<script th:src="@{/js/bootstrap.min.js}"></script>
<script th:src="@{/js/scripts.js}"></script>
  <a href="bookForm" class="btn btn-primary">Student</a>
</body>
</html>