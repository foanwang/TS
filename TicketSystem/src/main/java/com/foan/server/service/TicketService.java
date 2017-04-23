package com.foan.server.service;

import java.util.List;

import com.foan.server.entity.Ticket;

public interface TicketService {
	Ticket addTicket(Ticket ticket);
	Ticket updateTicket(Ticket ticket);
	List<Ticket> getTicketListBytype(int type);
	List<Ticket> getAllTicketList();
	void deleteRole(Ticket ticket);
}
