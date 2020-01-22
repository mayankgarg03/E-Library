<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.ArrayList , com.xyz.elibrary.dto.ViewIssueBookDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view issued book</title>
<link rel = "stylesheet" type = "text/css" href = "css/bootstrap.min.css">
</head>
<body>
<h1 class="alert-info text-center">View Book</h1>
<table class="table table-bordered">
<thead class="thead-dark">
<tr>
<th>studentname</th>
<th>rollno</th>
<th>branch</th>
<th>semester</th>
<th>bookname</th>
<th>bookno</th>
<th>returndate</th>

</tr>
</thead>
<tbody>

<%ArrayList<ViewIssueBookDTO> list = (ArrayList<ViewIssueBookDTO>)request.getAttribute("book");
if(list!=null){
	for(ViewIssueBookDTO obj : list){
		%>
		
		<tr>
		<td><%=obj.getName()%></td>
		<td><%=obj.getRollno() %></td>
		<td><%=obj.getBranch() %></td>
		<td><%=obj.getSemester()%></td>
		<td><%=obj.getBookname()%></td>
		<td><%=obj.getBookno()%></td>
		<td><%=obj.getReturndate()%></td>
		
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