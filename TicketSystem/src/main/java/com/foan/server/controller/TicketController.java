package com.foan.server.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.foan.server.entity.Ticket;
import com.foan.server.response.CreateTicketReponse;
import com.foan.server.response.DeleteTicketResponse;
import com.foan.server.response.GetAllTicketListResponse;
import com.foan.server.response.GetTickListByTypeResponse;
import com.foan.server.response.UpdateTicketResponse;
import com.foan.server.service.TicketService;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	// ---------------------------------------------------------------
	private static final Logger logger = LoggerFactory.getLogger(TicketController.class);
	
	@Autowired
	TicketService ticketService;
	
	@RequestMapping(value="/admin/{uid}", method = RequestMethod.GET) 
	public GetAllTicketListResponse getAllticketlist(@PathVariable String uid) {
		GetAllTicketListResponse reponse =  new GetAllTicketListResponse();
		reponse  = ticketService.getAllTicketList(uid);
		return reponse;
	}
	
	@RequestMapping(value="/{uid}", method = RequestMethod.GET) 
	public GetTickListByTypeResponse getAllticketlistByType(@PathVariable String uid, @RequestBody int type) {
		GetTickListByTypeResponse reponse =  new GetTickListByTypeResponse();
		reponse  = ticketService.getTicketListBytype(uid, type);
		return reponse;
	}
	@RequestMapping(value="{uid}", method = RequestMethod.POST) 
	public CreateTicketReponse createTicket(@PathVariable String uid,@RequestBody Ticket ticket) {
		CreateTicketReponse response = ticketService.addTicket(uid, ticket);
		return response;
	}
	
	@RequestMapping(value="{uid}", method = RequestMethod.DELETE) 
	public DeleteTicketResponse deleteTicket(@PathVariable String uid,@RequestBody Ticket ticket) {
		DeleteTicketResponse response = ticketService.deleteTicket(uid, ticket);
		return response;
	}
	
	@RequestMapping(value="{uid}", method = RequestMethod.PUT) 
	public UpdateTicketResponse updateTicket(@PathVariable String uid,@RequestBody Ticket ticket) {
		UpdateTicketResponse response = ticketService.updateTicket(uid, ticket);
		return response;
	}
	
	
	
}
