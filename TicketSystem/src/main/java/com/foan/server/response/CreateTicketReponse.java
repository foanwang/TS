package com.foan.server.response;

import com.foan.server.entity.Ticket;

public class CreateTicketReponse {
	private String result;
	private Ticket ticket;
	public CreateTicketReponse(){}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
}
