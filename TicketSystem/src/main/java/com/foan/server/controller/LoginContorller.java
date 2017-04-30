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
import com.foan.server.requet.UserLoginRequest;
import com.foan.server.response.LoginResponse;
import com.foan.server.service.LoginService;


@RestController
@RequestMapping("/login")
public class LoginContorller {
	// ---------------------------------------------------------------
	private static final Logger logger = LoggerFactory.getLogger(LoginContorller.class);
	
	@Autowired
	LoginService loginservice;
		
	@RequestMapping(value="", method = RequestMethod.POST) 
	public LoginResponse login(@RequestBody UserLoginRequest userdata) {
		System.out.println("Start to login uid:"+userdata.getUserid()+" password:"+userdata.getPassword());
		User user = loginservice.login(userdata.getUserid(), userdata.getPassword());
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
