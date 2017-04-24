package com.foan.server.service;

import com.foan.server.entity.Ticket;
import com.foan.server.response.CreateTicketReponse;
import com.foan.server.response.DeleteTicketResponse;
import com.foan.server.response.GetAllTicketListResponse;
import com.foan.server.response.GetTickListByTypeResponse;
import com.foan.server.response.UpdateTicketResponse;

public interface TicketService {
	CreateTicketReponse addTicket(String uid, Ticket ticket);
	UpdateTicketResponse updateTicket(String uid, Ticket ticket);
	GetTickListByTypeResponse getTicketListBytype(String uid, int type);
	GetAllTicketListResponse getAllTicketList(String uid);
	DeleteTicketResponse deleteTicket(String uid,Ticket ticket);
	int checkpermission(String uid, int ticketroleId);
}
