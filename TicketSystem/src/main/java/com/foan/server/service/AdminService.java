package com.foan.server.service;

import java.util.List;

import com.foan.server.entity.Permission;
import com.foan.server.entity.Role;
import com.foan.server.entity.TicketType;
import com.foan.server.entity.User;
import com.foan.server.response.UpdateUserResponse;

public interface AdminService {
	void addRole(Role role);
	List<Role> getRoleList();
	Role updateRole(Role role);
	void deleteRole(Role role);
	void addUser(User user);
	List<User> getUserList();
	UpdateUserResponse updateUser(User user);
	void deleteUser(User user);
	void addPermission(Permission permission);
	List<Permission> getPermissionList();
	Permission updatePermission(Permission permission);
	void deletePermission(Permission permission);
	void addTickettype(TicketType tickettype);
	List<TicketType> getTicketTypeList();
	TicketType updateTicketType(TicketType tickettype);
	void deleteTicketType(TicketType tickettype);
}
