package com.porwau.designpattern.facade;

public class UserValidate {
	private String username = "utkarsh";
	private String password = "password";
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}

	public boolean validateUser(String username, String password) {
		
		return this.username == username  && this.password == password;
	}
	

}
