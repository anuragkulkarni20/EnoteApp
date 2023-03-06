package com.User;
/*this is pojo class create propteies of users*/
public class UserDetails {
	
	//step 1:decaler variables of users 
	
	private int id;
	
	
	
	private String name;
    
	private String email;
	
	private String password;

	//2: genrate constructor using super class
	
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//3: gernate const using feilds

	public UserDetails(String name, String email, String password) {
		super();
		//this.id =id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
   
	
	//4 gnerate getter setter 
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
	
	
}
