<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import =  "javax.servlet.ServletContext , com.xyz.elibrary.dto.RegisterDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index</title>
<link href="css/bootstrap.min.css" rel="stylesheet" >
</head>
<body>
   	<% ServletContext ctx = getServletContext();%>
  	<%String a = (String)ctx.getAttribute("flag"); %>
  	<%=a %> 
  	
  	<%if(a.equals("y")){
  		response.sendRedirect("updateflag");
  	}
  	else{
   		// RegisterDTO registerdto = (RegisterDTO)request.getAttribute("name");
  		//String name = registerdto.getName();
  		//String role = registerdto.getRolename();	
  		
  		//System.out.println("&&&&"+registerdto.getName());
  		//System.out.println("###"+registerdto.getRolename());
  		request.setAttribute("data",request.getAttribute("name"));
  		RequestDispatcher rd = request.getRequestDispatcher("dashboard.jsp");
  		rd.forward(request, response);  
  		//response.sendRedirect("dashboard.jsp");
  		//response.sendRedirect("dashboard.jsp?name="+name + "&role="+role);
  	}%>
  	
  	
  	
  	
  	
  	
</body>
</html>