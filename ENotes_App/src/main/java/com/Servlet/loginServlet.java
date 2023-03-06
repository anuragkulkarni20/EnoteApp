package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.UserDao;
import com.Db.DBConnect;
import com.User.UserDetails;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email=request.getParameter("uemail");
		
		String password=request.getParameter("upassword");
		
		
		// create object 
		
		UserDetails us= new UserDetails();
		
		us.setEmail(email);
		
		us.setPassword(password);
		
		// create connection 
		
		UserDao dao= new UserDao(DBConnect.getConn());
		
		
		UserDetails user =dao.loginUser(us);
		
		// f is true then login page navigate to home page
		// f is true means username and password is matches then it will naviagte to home page else show error page.
		if(user!=null) 
		{
			HttpSession session = request.getSession();
			
			session.setAttribute("userD", user);
			
			response.sendRedirect("home.jsp");
		}
		else 
		{
			HttpSession session= request.getSession();
			
			session.setAttribute("login-failed", "Invalid User Name and Password");
			
			response.sendRedirect("login.jsp");
			
		}
		
	}

}
