<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.xyz.elibrary.dto.RegisterDTO , java.util.ArrayList , com.xyz.elibrary.dto.RightDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>dashboard</title>
<link href="css/bootstrap.min.css" rel="stylesheet" >
<link href="dashboard.css" rel="stylesheet"  type = "text/css" >
</head>
<body>
<div class="banner">

 
 
<%RegisterDTO registerdto = (RegisterDTO) request.getAttribute("data"); %> 
<%if(registerdto.getRolename().equals("admin")){
%>
       <img alt="" src="images/admin2.jpg">      

<div class="text">
 
<h1 class="role"><%=registerdto.getRolename() %> <%=registerdto.getName() %></h1>
 <%ArrayList<RightDTO> list = registerdto.getRights();
 for(RightDTO obj : list){%>
<a class="link" href="<%=obj.getLinkname()%>"> <%=obj.getRightname() %></a> 
<br>
<%} %> 
 </div>
  <%} 
else{%>
<img alt="" src="images/library1.jpg">  
<div class="text">

<h1 class="role"><%=registerdto.getRolename() %> <%=registerdto.getName() %></h1>

 <%ArrayList<RightDTO> list = registerdto.getRights();
 for(RightDTO obj : list){%>
<a class="link1" href="<%=obj.getLinkname()%>"> <%=obj.getRightname() %></a> 
<br>
<%} %> 
 </div>
<%} %>   

       <a class="btn btn-secondary" style="position:absolute;right:20px; margin-top:20px;" href="logout.jsp">Logout</a>
   


</div>

</body>
</html>