<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.ArrayList , com.xyz.elibrary.dto.RegisterDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<title>view librarian</title>
</head>
<body>
<style>
.size{
height:72px;
}
</style>

<h1 class="text-center alert-info">View Librarian</h1>

<table class="table table-bordered">
<thead class="thead-dark">
<tr>
<th>Id</th>
<th>Name</th>
<th>password</th>
<th>email</th>
<th>phone no</th>
<th>Operations</th>
</tr>
</thead>
<tbody>

<%ArrayList<RegisterDTO> list = (ArrayList<RegisterDTO>)request.getAttribute("data");
if(list!=null){
	for(RegisterDTO obj : list){
		%>
		
		<tr>
		<td><%=obj.getUid()%></td>
		<td><%=obj.getName() %></td>
		<td><%=obj.getPassword() %></td>
		<td><%=obj.getEmailid() %></td>
		<td><%=obj.getPhoneno() %></td>
		<td><a href="delete?id=<%=obj.getUid()%>"><img class="size" src="images/deleteicon.png"></a>
		<a href="getuser?id=<%=obj.getUid()%>"><img class="size" src="images/editicon.jpg"></a>
		
		</td>
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