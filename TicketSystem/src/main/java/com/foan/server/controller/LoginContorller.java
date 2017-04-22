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
import com.foan.server.service.LoginService;


@RestController
@RequestMapping("/user")
public class LoginContorller {
	// ---------------------------------------------------------------
	private static final Logger logger = LoggerFactory.getLogger(LoginContorller.class);
	
	@Autowired
	LoginService loginservice;
	
	@RequestMapping(value="/{uid}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	public User login(@RequestBody String password,@PathVariable String uid) {
		logger.info("Start to login.");
		User user = loginservice.login(uid, password);
		return user;
	}
}
