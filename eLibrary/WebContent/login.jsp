<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel = "stylesheet" type = "text/css" href = "css/bootstrap.min.css">
<link rel="stylesheet"  type = "text/css"  href = "login.css">
</head>
<body>


<!-- <h1 class="heading text-center" >Login</h1> -->





<form action="login" method="post">

<%-- <%String msg = request.getParameter("msg"); 
	if(msg!=null){%>
		<p class="text-center  error" style="color:red"> <%=msg%> </p>
	<%}
	else{%>
	<p></p>
	<%} %>  
 --%>

<!-- 
<div class="form-group" >
<label >Enter username </label>
<input  type="text"  placeholder="Enter the name here" name="username" class="form-control">
</div>


<div class="form-group" >
<label >Password</label>
<input type="password" placeholder="Enter the password here" name="password" class="form-control">
</div>


<div class="form-group" >
<button type="submit"  class="btn btn-primary">Login</button>
</div>


<div class="form-group"  >
<a href="changepassword.jsp">Forgot your password?</a>
<a class="signuplink" href="Registeration.jsp">haven't login? signup now</a>
</div> -->


 <div class="loginbox">
            
            <img src="images/Licon.png" alt="">
                        <h1>Login</h1>
                     
                          <div class="form-group">
                       <p> Enter Name</p>
                       <input type="text" name="username" placeholder="Enter username" class="form-control">
                    </div>
                <div class="form-group">
                       <p>Enter Password</p>
                       <input type="password" name="password" placeholder="Enter password" class="form-control">
                    </div>
                    <div class="form-group">
                       <button  class="btn btn-primary loginbtn " >Login</button>
                    </div>
                     		
					<div class="form-group links"  >
						<a href="changepassword.jsp">Forgot your password?</a>
						<a class="signuplink" href="Registeration.jsp">haven't login? signup now</a>
						</div> 
                     
          
    </div> 
    





</form>



</body>
</html>