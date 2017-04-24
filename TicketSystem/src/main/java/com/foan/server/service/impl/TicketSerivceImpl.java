package com.foan.server.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foan.server.entity.Permission;
import com.foan.server.entity.Ticket;
import com.foan.server.entity.User;
import com.foan.server.repository.PermissionRepository;
import com.foan.server.repository.TicketRepository;
import com.foan.server.repository.UserRepository;
import com.foan.server.response.CreateTicketReponse;
import com.foan.server.response.DeleteTicketResponse;
import com.foan.server.response.GetAllTicketListResponse;
import com.foan.server.response.GetTickListByTypeResponse;
import com.foan.server.response.UpdateTicketResponse;
import com.foan.server.service.TicketService;


@Service
public class TicketSerivceImpl implements TicketService {

	@Autowired
	TicketRepository ticketRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	PermissionRepository permissionRepository;
	
	@Override
	public CreateTicketReponse addTicket(String uid, Ticket ticket) {
		CreateTicketReponse response = new CreateTicketReponse();
		int check = checkpermission(uid, ticket.getType());
		if(check!=1){
			response.setResult("-1");
		}else{
			ticketRepository.save(ticket);
			response.setResult("0");
			response.setTicket(ticket);
		}
		return response;
	}

	@Override
	public UpdateTicketResponse updateTicket(String uid, Ticket ticket) {
		UpdateTicketResponse response = new UpdateTicketResponse();
		int check = checkpermission(uid, ticket.getType());
		if(check!=1||check!=2){
			response.setResult("-1");
		}else{
			ticketRepository.save(ticket);
			response.setResult("0");
			response.setTicket(ticket);
		}
		return response;
	}

	@Override
	public GetTickListByTypeResponse getTicketListBytype(String uid, int type) {
		GetTickListByTypeResponse response = new GetTickListByTypeResponse();
		int check = checkpermission(uid, type);
		if(check == 0){
			response.setResult("-1");
		}else{
			response.setResult("0");
			response.setTicketlist((List<Ticket>) ticketRepository.findByType(type));
		}
		return response;
	}	


	@Override
	public DeleteTicketResponse deleteTicket(String uid, Ticket ticket) {
		DeleteTicketResponse response =  new DeleteTicketResponse();
		int check = checkpermission(uid, ticket.getType());
		if(check != 1){
			response.setResult("-1");
		}else{
			response.setResult("0");
		}
		return response;
	}
	
	public int checkpermission(String uid, int ticketroleId){
		User user = userRepository.findByUid(uid);
		if(user==null){
			return 0;
		}
		Permission permission =permissionRepository.findByRoleIdAndTickettypeId(user.getRoleid(), ticketroleId);
		if(permission==null){
			return 0;
		}
		return permission.getPermission();
	}

	@Override
	public GetAllTicketListResponse getAllTicketList(String uid) {
		GetAllTicketListResponse response = new GetAllTicketListResponse();
		User user = userRepository.findByUid(uid);
		if(user==null){
			response.setResult("-1");
		}else if(user.getRoleid()!=1){
			response.setResult("-1");
		}else{
			response.setResult("0");
			response.setTicketlist((List<Ticket>) ticketRepository.findAll());
		}
		return response;
	}

}
