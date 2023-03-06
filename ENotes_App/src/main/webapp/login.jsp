<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>


<meta charset="ISO-8859-1">
<title>Login page</title>

<%@include file="all_component/allcss.jsp"%>

</head>
<body>
	<%@include file="all_component/navbar.jsp"%>




	<div class="container-fluid div-color">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card mt-3">
					<div class="card-header text-center bg-custom ">
						<i class="fa fa-user-circle-o mr-2 fa-3 x" aria-hidden="true"></i>


						<h4>Login</h4>

					</div>




					<%
					String invalidMsg = (String) session.getAttribute("login-failed");

					if (invalidMsg != null)

					{
					%>

					<div class="alert alert-danger" role="alert">
						<%=invalidMsg%></div>

					<%
					session.removeAttribute("login-failed");
					}
					%>




					<%
					String withoutlogin = (String) session.getAttribute("login-error");

					if (withoutlogin != null)

					{
					%>

					<div class="alert alert-danger" role="alert">
						<%=withoutlogin%></div>



					<%
					session.removeAttribute("login-error");

					}
					%>



					<% String logoutmsg = (String)session.getAttribute("logout-msg"); 
                   
                  if(logoutmsg!=null)
                  {
                   %>
                        <div class="alert alert-success" role="alert">
						<%=logoutmsg%></div>
					<%
					
                  
					session.removeAttribute("login-error");

                  
                  }%>


					

					<div class="card-body">



						<form action="loginServlet" method="post">

							<div class="form-group">


								<label for="exampleInputEmail1">Email address</label> <input
									type="email" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" placeholder="Enter email"
									name="uemail">

							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Password</label> <input
									type="password" class="form-control" id="exampleInputPassword1"
									placeholder="Password" name="upassword">
							</div>
							<button type="submit"
								class="btn btn-primary badge-pill btn-block">Login</button>
						</form>




					</div>



				</div>



			</div>



		</div>


	</div>





	<div class="conainer-fluid bg-dark mt-1">

<p class="text-center text-danger"> All rights reserved </p>
<p class="text-center text-danger"> @Anurag kulkarni-2023-24</p>
</div>










</body>
</html>