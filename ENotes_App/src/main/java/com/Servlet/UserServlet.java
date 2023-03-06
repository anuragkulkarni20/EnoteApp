package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.UserDao;
import com.Db.DBConnect;
import com.User.UserDetails;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,HttpServletResponse responce)throws ServletException, IOException
	{
		
		// witeing the code for  geting the data retrive
		//this names should matche with rgister.jsp page name given at input filelds(fname,uemail,upassword)
		
		
		String name= request.getParameter("fname"); 
		
		String email=request.getParameter("uemail");
		
		String password=request.getParameter("upassword");
		
		
		//seting intto the object
		
		
		UserDetails us =new UserDetails();
		
		us.setName(name);
		
		us.setEmail(email);
		
		us.setPassword(password);
		
		//for accessing userdao method create ist object
		
		UserDao dao= new UserDao(DBConnect.getConn());
		
	boolean f=	dao.adduser(us);
	
	//PrintWriter out=responce.getWriter();
	HttpSession session;
	
	// data is stroed or not 
	
	if(f) 
	{
		
		//out.print("user Register Successfully");
	
		
		 session =request.getSession();
		
		session.setAttribute("reg-success", "Registration Successfully..");
		
		responce.sendRedirect("register.jsp");
	}
	else 
	  {
		//out.print("Data is not inserted");
	  
		

        session =request.getSession();
		
		session.setAttribute("failed-msg", "Something went wrong on server..");
		
		responce.sendRedirect("register.jsp");

		
		
		
	  }
	
	
		
		
		
		
		
		
	}

}
