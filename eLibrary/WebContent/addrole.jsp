<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add role</title>
<link href="css/bootstrap.min.css" rel="stylesheet" >
</head>
<body>
<h1 class="text-center">Add Role</h1>
<form action="addrole" method="post">
<%-- <%String msg = request.getParameter("msg"); 
	if(msg!=null){%>
		<p class="text-center " style="color:green"> <%=msg%> </p>
	<%} %> --%>
<div class="form-group">
<label>Add Role</label>
<input type="text" placeholder="enter role here" name="rolename" class="form-control">
</div>

<div class="form-group">
<label>Add Description</label>
<input type="text" placeholder="enter role here" name="desc" class="form-control">
</div>

<div class="form-group">
<button class="btn btn-primary">Submit</button>
</div>
</form>
</body>
</html>