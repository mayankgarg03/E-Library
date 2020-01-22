<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/bootstrap.min.css" rel="stylesheet" >
<title>Return Book</title>
</head>
<body>
<h1 class="text-center alert-info">Add book </h1>

<form method = "post" action = "returnbook"> 


<div class="form-group">
<label >Enter Book number </label>
<input  type="text"  placeholder="Enter the book no here" name="bookno" class="form-control" >
</div>


<div class="form-group" >
<label>enter rollno</label>
<input type="text" placeholder="Enter the rollno here" name="rollno" class="form-control">
</div>



<div class="form-group" >
<button type="submit" class="btn btn-primary">Return Book</button>
</div>


</form>

</body>
</html>