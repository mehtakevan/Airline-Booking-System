package com.sid.java.springbootmvchibernatedemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sid.java.springbootmvchibernatedemo.entity.Flight;
import com.sid.java.springbootmvchibernatedemo.entity.Ticket_details;
import com.sid.java.springbootmvchibernatedemo.repository.Ticket_detailsDao;



@Service
public class Ticket_detailsService {

	@Autowired
	private Ticket_detailsDao ticket_detailsdao;
	
	public void addTicket(final Ticket_details tkt) {
		ticket_detailsdao.addTicket(tkt);
	}
	
	public List<Ticket_details> getTicketList(final Flight flight){
		return ticket_detailsdao.getTicketList(flight);
	}
	
}
