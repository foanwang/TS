package com.foan.server.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.foan.server.entity.TicketType;

public interface TicketTypeRepository extends CrudRepository<TicketType, Integer>{
	TicketType findById(int id);
	void delete(int id);
	List<TicketType> findAll();
}
