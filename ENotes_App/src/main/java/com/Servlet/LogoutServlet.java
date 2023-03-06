package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		try {
			
			HttpSession session= request.getSession();
			
			session.removeAttribute("userD");
		
			
			HttpSession session2= request.getSession();
			
			session.setAttribute("logout-msg"," Logout Successfully.." );
			
			response.sendRedirect("login.jsp");
			
			
			
		} catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		
	
	}

}
