package com.foan.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foan.server.entity.User;
import com.foan.server.repository.UserRepository;
import com.foan.server.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User login(String uid, String password) {
		User user = userRepository.findByUid(uid);
		if(user == null){
			return null;
		}else if(user.getPassword().equals(password)!=true){
			return null;
		}	
		return user;
	}

}
