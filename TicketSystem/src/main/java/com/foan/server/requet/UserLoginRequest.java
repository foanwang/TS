package com.foan.server.requet;

import com.foan.server.entity.Ticket;

public class UserLoginRequest {
	private String userid;
	private String password;
	public UserLoginRequest(){}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	};
	
}
