<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/bootstrap.min.css" rel="stylesheet" >
<title>Add Book</title>
</head>
<body>
<h1 class="text-center alert-info">Add book </h1>

<form method = "post" action = "addbook"> 


<div class="form-group">
<label >Enter Book number </label>
<input  type="text"  placeholder="Enter the book no here" name="bookno" class="form-control" >
</div>


<div class="form-group" >
<label>enter book name</label>
<input type="text" placeholder="Enter the book name here" name="bname" class="form-control">
</div>


<div class="form-group" >
<label>Author</label>
<input type="text" placeholder="Enter the author here" name="author" class="form-control">
</div>


<div class="form-group" >
<label>Publisher</label>
<input type="text" placeholder="Enter the publisher here" name="publisher" class="form-control">
</div>

<div class="form-group" >
<label>Quantity</label>
<input type="number" placeholder="Enter the quantity here" name="quantity" class="form-control">

</div>


<div class="form-group" >
<button type="submit" class="btn btn-primary">Add Book</button>
</div>


</form>

</body>
</html>