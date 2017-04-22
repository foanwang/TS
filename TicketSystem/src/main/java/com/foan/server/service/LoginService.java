package com.foan.server.service;

import com.foan.server.entity.User;

public interface LoginService {
	public User login(String uid, String password);
}
