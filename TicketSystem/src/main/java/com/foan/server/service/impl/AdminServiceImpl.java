package com.foan.server.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foan.server.entity.Permission;
import com.foan.server.entity.Role;
import com.foan.server.entity.TicketType;
import com.foan.server.entity.User;
import com.foan.server.repository.PermissionRepository;
import com.foan.server.repository.RoleRepository;
import com.foan.server.repository.TicketTypeRepository;
import com.foan.server.repository.UserRepository;
import com.foan.server.service.AdminService;


@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	PermissionRepository permissionRepository;
	
	@Autowired
	RoleRepository roleRepository;
	

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	TicketTypeRepository tickettypeRepository;
	
	@Override
	public void addRole(Role role) {
		roleRepository.save(role);
	}

	@Override
	public List<Role> getRoleList() {
		// TODO Auto-generated method stub
		return (List<Role>) roleRepository.findAll();
	}

	@Override
	public Role updateRole(Role role) {
		Role newrole =  roleRepository.save(role);
		return newrole;
	}

	@Override
	public void deleteRole(Role role) {
		roleRepository.delete(role.getId());
	}

	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(User user) {
		userRepository.delete(user.getId());
	}

	@Override
	public void addPermission(Permission permission) {
		// TODO Auto-generated method stub
		permissionRepository.save(permission);
		}

	@Override
	public List<Permission> getPermissionList() {
		// TODO Auto-generated method stub
		return (List<Permission>) permissionRepository.findAll();
	}

	@Override
	public Permission updatePermission(Permission permission) {
		return permissionRepository.save(permission);
	}

	@Override
	public void deletePermission(Permission permission) {
		permissionRepository.delete(permission.getId());
	}

	@Override
	public void addTickettype(TicketType tickettype) {
		tickettypeRepository.save(tickettype);
	}

	@Override
	public List<TicketType> getTicketTypeList() {
		return tickettypeRepository.findAll();
	}

	@Override
	public TicketType updateTicketType(TicketType tickettype) { 
		return tickettypeRepository.save(tickettype);
	}

	@Override
	public void deleteTicketType(TicketType tickettype) {
		// TODO Auto-generated method stub
		tickettypeRepository.delete(tickettype.getId());
	}

}
