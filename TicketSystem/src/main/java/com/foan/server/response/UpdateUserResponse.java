package com.foan.server.response;

import com.foan.server.entity.User;

public class UpdateUserResponse {
	private String result;
	private User user;
	public UpdateUserResponse(){}
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
	};
	
}
