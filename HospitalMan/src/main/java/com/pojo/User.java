package com.pojo;


import java.util.Date;


public class User {
	
	private String username;
	private String password;
	private Date createdAt;
	private Date updatedAt;
	
	
	public User(String username, String password) {
		
		this.username = username;
		this.password = password;
		this.createdAt = new Date();
		this.updatedAt = this.createdAt;
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
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
}
