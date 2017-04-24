package com.foan.server.response;

import com.foan.server.entity.User;

public class LoginResponse {
	
	private String result;
	
	private User user;
	
	public LoginResponse(){
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
