package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.PostDAO;
import com.Db.DBConnect;
import com.User.Post;

/**
 * Servlet implementation class AddNotesServlet
 */
@WebServlet("/AddNotesServlet")
public class AddNotesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	
	
	
	int id = Integer.parseInt(request.getParameter("id"));
	
	
	String title =request.getParameter("title");
	String content = request.getParameter("content");
	
	//Post po = new Post();
	
	
	PostDAO dao= new PostDAO(DBConnect.getConn());
	
	boolean f =dao.AddNotes(title, content, id);
	
	
	
	if(f) 
	
	{
		
		System.out.println("Data inserted successfully");
		
		response.sendRedirect("showNotes.jsp");
	}
	
	else	
	  {
		System.out.println("data is not inserted");
	  }
	}

}
