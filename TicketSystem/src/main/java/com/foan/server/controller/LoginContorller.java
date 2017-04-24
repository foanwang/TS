package com.foan.server.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.foan.server.entity.User;
import com.foan.server.response.LoginResponse;
import com.foan.server.service.LoginService;


@RestController
@RequestMapping("/login")
public class LoginContorller {
	// ---------------------------------------------------------------
	private static final Logger logger = LoggerFactory.getLogger(LoginContorller.class);
	
	@Autowired
	LoginService loginservice;
		
	@RequestMapping(value="/{uid}", method = RequestMethod.GET) 
	public LoginResponse login(@PathVariable String uid, @RequestParam String password) {
//		System.out.println("Start to login uid:"+uid+" password:"+password);
		User user = loginservice.login(uid, password);
		LoginResponse response = new LoginResponse();
		if(user !=null){
			response.setResult("0");
			response.setUser(user);
		}else{
			response.setResult("-1");
		}
		return response;
	}
	
}
