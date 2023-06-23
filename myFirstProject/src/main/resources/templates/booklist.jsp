<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <!DOCTYPE html>
<html>
<head> <%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Bootstrap 4, from LayoutIt!</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

</head>
<body>

<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>
							id
						</th>
						<th>
							publisher
						</th>
						<th>
							FirstName
						</th>
						<th>
							LastName
						</th>
					</tr>
				</thead>
				<tbody>
				<tr class="table-active">
				 <tr th:each="book : ${book}">
					
						
							   <td><span th:text="${book.id}"> </span>
						</td>
						
						 <td><span th:text="${book.name}"> </span>
						</td>
						
							 <td><span th:text="${book.doi}">
						</td>
						<td>
						<span th:text="${book.publisher}"> 
							
						</td>
						</span>
					</td>
				
					</tr>
				
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>
  <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
</body>
</html>