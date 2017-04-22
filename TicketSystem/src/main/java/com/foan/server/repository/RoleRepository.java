package com.foan.server.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.foan.server.entity.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {
	Role findByRolename(String name);
	//List<Role> findall();
}
