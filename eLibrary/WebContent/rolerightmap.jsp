<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.ArrayList , com.xyz.elibrary.dto.RightDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>role right mapping</title>
<link href="css/bootstrap.min.css" rel="stylesheet" >
</head>
<body>
<div class="container">
<h1 class="alert-info text-center">role right mapping</h1>

 	<%ArrayList<RightDTO> right = (ArrayList<RightDTO>) request.getAttribute("rights"); %>
<form action="rolerightmap" method="post">
<div class="form-group">
<label>Enter Role</label>
<input type="text" placeholder= "enter role here" name="role" class="form-control">
</div>
<div class="form-group">
<label>Enter Rights:</label>
<br>
 <%for(RightDTO obj : right){ %>
<input type="checkbox" name="right"  value = <%=obj.getRightid()%>>
<label for="rights"><%=obj.getRightname() %> </label>
<%} %> 
</div>

<div class="form-group">
<button type="submit" class="btn btn-primary">Submit</button>

</div>



</form>
</div>
</body>
</html>