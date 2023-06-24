<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head> <%@ page isELIgnored="false" %>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

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
			<form role="form">
				<div class="form-group">
					 
					<label for="exampleInputEmail1">
						ID 
					</label>
					<input type="text" class="form-control" id="exampleInputEmail1" />
				</div>
				<div class="form-group">
					 
					<label for="exampleInputPassword1">
						Name of book
					</label>
					<input type="text" class="form-control" id="exampleInputPassword1" />
				</div>
				<div class="form-group">
					 
					<label for="dateofissue">
						Date of issue
					</label>
					<input type="text" class="form-control" id="dateofissue" />
				</div>
				<div class="form-group">
					 
					<label for="publisher">
						publisher
					</label>
					<input type="text" class="form-control" id="publisher" />
				</div>
				
				<button type="submit" class="btn btn-primary">
					Submit
				</button>
			</form>
		</div>
	</div>
</div>
 
    <script th:src="@{/js/jquery.min.js}"></script>
<script th:src="@{/js/bootstrap.min.js}"></script>
<script th:src="@{/js/scripts.js}"></script>
</body>
</html>