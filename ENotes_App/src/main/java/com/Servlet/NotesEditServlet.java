package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.PostDAO;
import com.Db.DBConnect;

/**
 * Servlet implementation class NotesEditServlet
 */
@WebServlet("/NotesEditServlet")
public class NotesEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	try 
	{
		Integer noteid = Integer.parseInt(request.getParameter("noteid"));
		
		String Title=request.getParameter("title");
		
		String Content= request.getParameter("content");
		
		PostDAO dao= new PostDAO(DBConnect.getConn());
		
		boolean f =dao.PostUpdate(noteid, Title, Content);
		
		if(f) {
			System.out.println("data is upadte successfully");
			HttpSession session = request.getSession();
			
					session.setAttribute("updateMsg","Notes Update Successfully");
			response.sendRedirect("showNotes.jsp");
			
			
			
		}else 
		{
			System.out.println("data is not updateed");
		}
		
		
	}catch(Exception e) 
	{
		e.printStackTrace();
	}
	
	
	}

}
