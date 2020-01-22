<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.time.LocalDate"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Issue</title>
<link href="css/bootstrap.min.css" rel="stylesheet" >
</head>
<body>

<h1 class="text-center alert-info">Book Issue</h1>
<form action="issuebook" method="post">
<%-- <%String msg = request.getParameter("msg"); 
	if(msg!=null){%>
		<p class="text-center " style="color:green"> <%=msg%> </p>
	<%} %> --%>
<div class="form-group">
<label>bookno</label>
<input type="text" placeholder="enter bookno here" name="bookno" class="form-control">
</div>

<div class="form-group">
<label>rollno</label>
<input type="text" placeholder="enter rollno here" name="rollno" class="form-control">
</div>

<div class="form-group">
<label>issue date</label>
<input type="date" data-date-inline-picker = "true" name="issuedate" value = <%= LocalDate.now() %> class="form-control">
</div>

<div class="form-group">
<label>issue date</label>
<input type="date" data-date-inline-picker = "true" name="returndate" value = <%= LocalDate.now().plusDays(14) %> class="form-control">
</div>


<div class="form-group">
<button class="btn btn-primary">Submit</button>
</div>
</form>

</body>
</html>