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
public class PassengerDao {
	
	// define field for entitymanager
	private EntityManager entityManager;
	
	@Autowired
	public PassengerDao(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	public boolean login(final String username,final String password) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		TypedQuery<Passenger> theQuery = currentSession.createQuery("from Passenger where username = '"+username+"'" , Passenger.class);
		boolean crt = theQuery.getResultList().isEmpty();
		
		
		
		if(!crt) {
			Passenger passenger2 = theQuery.getSingleResult();
			if(passenger2.getUsername().equals(username)) {
				if(passenger2.getPasswrod().equals(password))
					return true;
				else {
					System.out.print(passenger2.getUsername()+passenger2.getPasswrod());
					currentSession.close();
					return false;
				}
			}
			else
				return false;
		}
		else {
			currentSession.close();
			return false;
		}
	}

	public boolean signup(final Passenger passenger) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		TypedQuery<Passenger> theQuery = currentSession.createQuery("from Passenger where username = '"+passenger.getUsername()+"'" , Passenger.class);
		boolean crt = theQuery.getResultList().isEmpty();
		
		if(!crt)
			return false;
		else {
			currentSession.persist(passenger);
			currentSession.close();
			return true;
		}
		// TODO Auto-generated method stub
	}

	public Passenger getPassenger(final String username) {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		
		TypedQuery<Passenger> theQuery = currentSession.createQuery("from Passenger where username = '"+username+"'" , Passenger.class);
		Passenger passenger = theQuery.getSingleResult();
		currentSession.close();
		return passenger;
	}

}
