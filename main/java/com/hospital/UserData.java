package com.hospital;

public class UserData {
	private String email;
	private String username;
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserData(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public UserData(String email, String username, String password) {
		this(username,password);
		this.email = email;
	}
	
}
