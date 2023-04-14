package com.sid.java.springbootmvchibernatedemo.repository;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sid.java.springbootmvchibernatedemo.entity.Flight;
import com.sid.java.springbootmvchibernatedemo.entity.Passenger;
import com.sid.java.springbootmvchibernatedemo.entity.Ticket_details;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class Ticket_detailsDao {
	
private EntityManager entityManager;
	
	@Autowired
	public Ticket_detailsDao(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	public void addTicket(final Ticket_details tkt) {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.persist(tkt);
		currentSession.close();
	}
	
	public List<Ticket_details> getTicketList(final Flight flight){
		Session currentSession = entityManager.unwrap(Session.class);
		TypedQuery<Ticket_details> theQuery = currentSession.createQuery("from Ticket_details where flight = "+flight.getId(), Ticket_details.class);
		List<Ticket_details> tkt = theQuery.getResultList();
		currentSession.close();
		return tkt;
	}

}
