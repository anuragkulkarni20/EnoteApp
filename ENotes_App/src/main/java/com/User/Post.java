package com.User;

import java.sql.Date;

// this is pojo class for addnote page 

public class Post {

	private int NoteId;
	
	private String title;
	
	private String content;
	
	//importing java util date package 
	private Date pdate;
	
	private UserDetails user;
// genrating constructor using feilds i.eparamterized const
	public Post(int noteId, String title, String content, Date pdate, UserDetails user) {
		super();
		NoteId = noteId;
		this.title = title;
		this.content = content;
		this.pdate = pdate;
		this.user = user;
	}
	
	
	// Genrating const using super class.

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int getNoteId() {
		return NoteId;
	}
	public void setNoteId(int noteId) {
		NoteId = noteId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPdate() {
		return pdate;
	}
	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}
	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}
	
	
	
	
}
