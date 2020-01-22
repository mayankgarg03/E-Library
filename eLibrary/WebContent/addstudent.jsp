<%@page import="com.xyz.elibrary.dto.RegisterDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import ="com.xyz.elibrary.dto.RegisterDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
<link rel = "stylesheet" type = "text/css" href = "css/bootstrap.min.css">
</head>
<body>


<h1 class="heading text-center" >Registration</h1>

<form action="addstudent" method="post">

<%--  <%String msg = request.getParameter("msg"); 
	if(msg.equals("Insert")){%>
		<p class="text-center " style="color:green"> <%=msg%> </p>
	<%} 
	else{%>
	<p class="text-center" style="color:red"><%=msg %></p>
	<%} %>  
 --%>


<div class="form-group" >


<div class="form-group" >
<label >rollno</label>
<input type="number" placeholder="Enter the rollno here" name="rollno" class="form-control">
</div>

<label >Enter username </label>
<input  type="text"  placeholder="Enter the name here" name="username" class="form-control" >
</div>







<div class="form-group" >
<label>PhoneNo</label>
<input type="number" placeholder="Enter the phone no here" name="phone" class="form-control">

</div>

<label >Enter semester </label>
<input  type="text"  placeholder="Enter the sem here" name="sem" class="form-control" >
</div>

<label >Enter branch </label>
<input  type="text"  placeholder="Enter the branch here" name="branch" class="form-control" >
</div>


<div class="form-group" >
<button type="submit" class="btn btn-primary">Register</button>
</div>







</form>



</body>
</html>