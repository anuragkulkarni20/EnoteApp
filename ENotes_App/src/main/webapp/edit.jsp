<%@page import="com.User.Post"%>
<%@page import="com.Db.DBConnect"%>
<%@page import="com.DAO.PostDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>



<%
UserDetails user3 = (UserDetails) session.getAttribute("userD");

if (user3 == null) {
	response.sendRedirect("login.jsp");

	session.setAttribute("login-error", "Please Login..");
}
%>








<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Notes</title>

<%@ include file="all_component/allcss.jsp"%>


</head>
<body>


	<%
	Integer noteid = Integer.parseInt(request.getParameter("noteid"));
	
	PostDAO post= new PostDAO(DBConnect.getConn());
   Post p =post.getDataById(noteid);
		
%>


	<div class="container-fluid">


		<%@ include file="all_component/navbar.jsp"%>

	</div>
	<h1>edit page</h1>

	<h1 class="text-center">Edit your Notes</h1>


	<div class="container">

		<div class="row">
			<div class="col-md-12">

				<form action="NotesEditServlet" method="post">

					<input type="hidden" value="<%=noteid%>" name="noteid">

					<div class="form-group">


						<label for="exampleInputEmail1">Enter Title</label> <input
							type="text" class="form-control" id="exampleInputEmail1"
							aria-describedby="emailHelp" name="title" required="required"
							value = "<%=p.getTitle()%>">

					</div>


					<div class="form-group">

						<label for="exampleInputEmail1">Enter Content</label>
						<textarea rows="9" cols="" class="form-control" name="content"
							required="required">value = "<%=p.getContent()%>"</textarea>

					</div>







					<div class="container text-center">

						<button type="submit" class="btn btn-primary md-1 mt-1">Add
							Notes</button>
					</div>



				</form>





			</div>

		</div>
	</div>
	

		<%@ include file="all_component/footer.jsp"%>








</body>
</html>