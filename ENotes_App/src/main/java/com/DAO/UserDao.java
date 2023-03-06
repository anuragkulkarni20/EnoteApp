package com.DAO;
/*after pojo(UserDetails class) class is created this class should start write the code   */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.User.UserDetails;

public class UserDao {
	
	private Connection conn;
	
	public UserDao(Connection conn) 
	
	{
		super();
		this.conn=conn;
		
	}
	
	// for adding user
	
	public boolean adduser(UserDetails us) 
	{
		boolean f= false;
		
		// adding of user qury written in try block
		try 
		{
			String query="insert into user (name,email,password)values(?,?,?)";
			
			PreparedStatement ps =conn.prepareStatement(query);
			
			ps.setString(1,us.getName());
			
			ps.setString(2, us.getEmail());
			
			ps.setString(3, us.getPassword());
			
			int i = ps.executeUpdate();
			
			// ths block suggest value is inserting 
			if(i==1) {
				f= true;
			}
			
			
		}
		catch(Exception e) 
		{
			
			e.printStackTrace();
		}
	
	return f;
	
	}
	
	
	public UserDetails loginUser(UserDetails us) 
	
	{
		//boolean f= false;
		
		//new changes
		
		UserDetails user = null;
		try 
		{
			// check the data is present or not in database
			String query = "select * from user where email=? and password=?";
			
			PreparedStatement ps= conn.prepareStatement(query);
			
			
			ps.setString(1, us.getEmail());
			
			ps.setString(2, us.getPassword());

			ResultSet rs = ps.executeQuery();
			
			
			if(rs.next()) 
			
			{
				//f=true;
			
				
				user =new UserDetails();
				
				user.setId(rs.getInt("id"));
				
				
				
				user.setName(rs.getString("name"));
				
				user.setEmail(rs.getString("email"));
				
				user.setPassword("password");
			}
			/*
			 * else {
			 * 
			 * f = false; }
			 */	
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		
		
		
		//return f;
		
		
		return user;
	}
	

}
