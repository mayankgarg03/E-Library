<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel = "stylesheet" type = "text/css" href = "css/bootstrap.min.css">
</head>
<body>


<h1 class="heading text-center" >Registration</h1>

<form action="register" method="post">

<%--  <%String msg = request.getParameter("msg"); 
 if(msg.equals("not insert")){%>
	 <p><%=msg %></p>
<%} 
	else if(msg.equals("Insert")){%>
		<p class="text-center " style="color:green"> <%=msg%> </p>
	<%} %> --%>
	



<div class="form-group" >
<label >Enter username </label>
<input  type="text"  placeholder="Enter the name here" name="username" class="form-control">
</div>


<div class="form-group" >
<label >Password</label>
<input type="password" placeholder="Enter the password here" name="password" class="form-control">
</div>


<div class="form-group" >
<label>EmailID</label>
<input type="email" placeholder="Enter the email here" name="email" class="form-control">
</div>


<div class="form-group" >
<label>PhoneNo</label>
<input type="number" placeholder="Enter the phone no here" name="phone" class="form-control">
</div>


<div class="form-group" >
<button type="submit" class="btn btn-primary">Register</button>
</div>







</form>



</body>
</html>