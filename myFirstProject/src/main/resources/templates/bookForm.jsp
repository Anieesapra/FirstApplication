<%@ page language="java" contentType="application/json; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
  
</head>
<body>
  <form method="post" action="/posthello" enctype="application/json">
  <h1>Enter details for book</h1>
        bookid : <input type="text" name="id" />
        bookName : <input type="text" name="name" /> 
         bookpublisher : <input type="text" name="publisher" /> 
          bookdoi : <input type="text" name="doi" /> 
        
        
        <h1>Enter details for Student</h1>
          Studentid : <input type="text" name="studentid" />
        studentName : <input type="text" name="studentname" /> 
         studentStandard : <input type="text" name="standard" /> 
          studentSection : <input type="text" name="section" /> 
        <input type="submit" />
    </form>


 
</body>
</html>