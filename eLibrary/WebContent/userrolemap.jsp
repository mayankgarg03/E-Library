<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="javax.servlet.ServletContext"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>user role mapping</title>
<link href="css/bootstrap.min.css" rel="stylesheet" >
</head>
<body>
<div class="container">
<h1 class="alert-info text-center">user role mapping</h1>

 	
<form action="userrolemap" method="post">

<%String msg = request.getParameter("msg"); 
	if(msg!=null){%>
		<p class="text-center " style="color:green"> <%=msg%> </p>
	<%} %>
<div class="form-group">
<label>Enter Name</label>
<input type="text" placeholder= "enter username here" name="username" class="form-control">
</div>
<div class="form-group">
<label>Enter Role</label>
<input type="text" placeholder= "enter user role here" name="role" class="form-control">
</div>

<div class="form-group">
<button type="submit" class="btn btn-primary">Submit</button>

</div>



</form>
</div>
</body>
</html>