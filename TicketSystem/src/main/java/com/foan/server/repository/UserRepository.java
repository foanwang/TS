package com.foan.server.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.foan.server.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	User findByUid(String uid);
	void delete(User user);
	//List<User> getUserList();
}
