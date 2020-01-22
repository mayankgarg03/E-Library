<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.util.ArrayList , com.xyz.elibrary.dto.BookDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/bootstrap.min.css" rel="stylesheet" >
<title>View Book</title>
</head>
<body>
<h1 class="alert-info text-center">View Book</h1>
<table class="table table-bordered">
<thead class="thead-dark">
<tr>
<th>Id</th>
<th>bookno</th>
<th>name</th>
<th>author</th>
<th>publisher</th>
<th>qunatity</th>
</tr>
</thead>
<tbody>

<%ArrayList<BookDTO> list = (ArrayList<BookDTO>)request.getAttribute("bookdata");
if(list!=null){
	for(BookDTO obj : list){
		%>
		
		<tr>
		<td><%=obj.getBookid()%></td>
		<td><%=obj.getBookno()%></td>
		<td><%=obj.getBookname()%></td>
		<td><%=obj.getAuthor() %></td>
		<td><%=obj.getPublisher() %></td>
		<td><%=obj.getQuantity()%></td>
		
		</tr>
		<% 
	}
} %>
<% if(list==null){%>
<h1>Invalid</h1>
<% }%>






</tbody>
</table>

</body>
</html>