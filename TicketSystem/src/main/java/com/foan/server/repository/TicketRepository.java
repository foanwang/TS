package com.foan.server.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.foan.server.entity.Ticket;
import com.foan.server.entity.TicketType;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {
	List<Ticket> findByType(int type);
}
