<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
<%@include file="all_component/allcss.jsp"%>

</head>
<body>

	<%@include file="all_component/navbar.jsp"%>


	<div class="container-fluid div-color">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card mt-3">
					<div class="card-header text-center bg-custom ">
						<i class="fa fa-user-plus fa-2x" aria-hidden="true"></i>

						<h4>Regiestration</h4>

					</div>


					

                    <%  
                       String regMsg=(String)session.getAttribute("reg-success");
                          
                          if(regMsg!=null)
                          { %>
                        	  <div class="alert alert-success" role="alert">
          					 <%= regMsg  %>Login <a href="login.jsp">Click here</a></div>    	  
                      
                        <% 	  
                        session.removeAttribute("reg-success");
                          }%>
                          





                    <%  
                       String FailedMsg=(String)session.getAttribute("failed-msg");
                          
                          if(FailedMsg!=null)
                          { %>
                        	  <div class="alert alert-danger" role="alert">
          					 <%=FailedMsg %></div>    	  
                        <% 	 
                        
                        session.removeAttribute("failed-msg");
                          }%>
                          







					<div class="card-body">



						<form action="UserServlet" method="post">

							<div class="form-group">


								<label for="exampleInputEmail1">Full Name</label> <input
									type="text" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" placeholder="Enter Full Name"
									name="fname">

							</div>







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
								class="btn btn-primary badge-pill btn-block">Register</button>
						</form>




					</div>



				</div>



			</div>



		</div>


	</div>



	<%@ include file="all_component/footer.jsp"%>

</body>
</html>