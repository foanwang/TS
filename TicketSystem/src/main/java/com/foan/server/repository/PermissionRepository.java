package com.foan.server.repository;

import org.springframework.data.repository.CrudRepository;

import com.foan.server.entity.Permission;


public interface PermissionRepository extends CrudRepository<Permission, Integer> {
	Permission findById(int id);
	Permission findByRoleIdAndTickettypeId(int roleid, int tickettypeid);
}
