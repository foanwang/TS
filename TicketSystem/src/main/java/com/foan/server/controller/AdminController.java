	package com.foan.server.controller;

import java.util.List;

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

import com.foan.server.entity.Permission;
import com.foan.server.entity.Role;
import com.foan.server.entity.TicketType;
import com.foan.server.entity.User;
import com.foan.server.response.UpdateUserResponse;
import com.foan.server.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	// ---------------------------------------------------------------
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	AdminService adminService;
	
	@RequestMapping(value="/user", method = RequestMethod.POST) 
	public User addUser(@RequestBody User user) {
		adminService.addUser(user);
		return user;
	}
	@RequestMapping(value="/user", method = RequestMethod.GET) 
	public List<User> getUserlest() {
		return adminService.getUserList();
	}
	
	@RequestMapping(value="/user/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE) 
	public UpdateUserResponse updateUser(@RequestBody User user) {
		UpdateUserResponse response = new UpdateUserResponse();
		response = adminService.updateUser(user);
		return response; 
	}
	
	@RequestMapping(value="/user", method = RequestMethod.DELETE) 
	public String deleteUser(@RequestBody User user) {
		adminService.deleteUser(user);; 
		return "success";
	}	
	
	@RequestMapping(value="/permission", method = RequestMethod.POST) 
	public Permission addPermission(@RequestBody Permission permission) {
		adminService.addPermission(permission);
		return permission;
	}
	
	@RequestMapping(value="/permission", method = RequestMethod.GET) 
	public List<Permission> getPermissionlist() {
		return adminService.getPermissionList();
	}
	
	@RequestMapping(value="/permission/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE) 
	public Permission updatePermission(@RequestBody Permission permission) {
		return adminService.updatePermission(permission); 
	}
	
	@RequestMapping(value="/permission", method = RequestMethod.DELETE) 
	public String deletePermission(@RequestBody Permission permission) {
		adminService.deletePermission(permission); 
		return "success";
	}	
	
	@RequestMapping(value="/role", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE) 
	public Role addRole(@RequestBody Role role) {
		//System.out.println("create role.....");
		adminService.addRole(role);
		return role;
	}
	
	@RequestMapping(value="/role", method = RequestMethod.GET) 
	public List<Role> getRolelist() {
		//System.out.println("get role list.....");
		return adminService.getRoleList();
	}
	
	@RequestMapping(value="/role/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE) 
	public Role updateRole(@RequestBody Role role) {
		return adminService.updateRole(role); 
	}
	
	@RequestMapping(value="/role", method = RequestMethod.DELETE) 
	public String deleteRole(@RequestBody Role role) {
		adminService.deleteRole(role);
		return "success";
	}
	
	@RequestMapping(value="/tickettype", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE) 
	public TicketType addTicketType(@RequestBody TicketType tickettype) {
		adminService.addTickettype(tickettype);
		return tickettype;
	}
	
	@RequestMapping(value="/tickettype", method = RequestMethod.GET) 
	public List<TicketType> getTicketTypelist() {
		return adminService.getTicketTypeList();
	}
	
	@RequestMapping(value="/tickettype/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE) 
	public TicketType updateRole(@RequestBody TicketType tickettype) {
		return adminService.updateTicketType(tickettype); 
	}
	
	@RequestMapping(value="/tickettype", method = RequestMethod.DELETE) 
	public String deleteRole(@RequestBody TicketType tickettype) {
		adminService.deleteTicketType(tickettype);
		return "success";
	}	
}
