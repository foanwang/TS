package com.foan.server.response;

import java.util.List;

import com.foan.server.entity.Ticket;

public class GetAllTicketListResponse {
	private String result;
	private List<Ticket> ticketlist;
	public GetAllTicketListResponse(){}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public List<Ticket> getTicketlist() {
		return ticketlist;
	}
	public void setTicketlist(List<Ticket> ticketlist) {
		this.ticketlist = ticketlist;
	};
}
