package com.security.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private String username;
    private String password;
	private String email;
	private String role;
	
	
	
	public Customer(String username, String password, String email) {
	
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public Customer(String username, String password, String email, String role) {
		
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = role;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Customer() {
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
