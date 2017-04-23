package com.foan.server.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.foan.server.entity.Ticket;
import com.foan.server.repository.TicketRepository;
import com.foan.server.service.TicketService;

public class TicketSerivceImpl implements TicketService {

	@Autowired
	TicketRepository ticketRepository;
	
	@Override
	public Ticket addTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
	}

	@Override
	public Ticket updateTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
	}

	@Override
	public List<Ticket> getTicketListBytype(int type) {
		return ticketRepository.findByType(type);
	}

	@Override
	public List<Ticket> getAllTicketList() {
		return (List<Ticket>) ticketRepository.findAll();
	}

	@Override
	public void deleteRole(Ticket ticket) {
		ticketRepository.delete(ticket.getId());
	}

}
