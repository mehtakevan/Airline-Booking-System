package com.sid.java.springbootmvchibernatedemo.repository;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.object.SqlQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sid.java.springbootmvchibernatedemo.entity.Flight;

@Repository
//@Transactional
public class FlightDao {

	// define field for entitymanager
	private EntityManager entityManager;

	// set up constructor injection
	@Autowired
	public FlightDao(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	public Flight getFlight(final int id) {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		Flight flight = currentSession.get(Flight.class, id);
		currentSession.close();
		return flight;
	}

	public List<Flight> getFlights() {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		// create a query
		TypedQuery<Flight> theQuery = currentSession.createQuery("from Flight", Flight.class);

		// execute query and get result list
		List<Flight> flights = theQuery.getResultList();

		currentSession.close();
		return flights;
	}
	
	public List<Flight> findFlights(final String source,final String destination){
		Session currentSession = entityManager.unwrap(Session.class);
		
		TypedQuery<Flight> theQuery = currentSession.createQuery("from Flight where source = '" + source + "' and destination = '"+destination+"'" , Flight.class);
		List<Flight> flights = theQuery.getResultList();
		currentSession.close();
		return flights;
	}
	
	public Flight findFlight(final int id){
		Session currentSession = entityManager.unwrap(Session.class);
		
		TypedQuery<Flight> theQuery = currentSession.createQuery("from Flight where id = "+id , Flight.class);
		Flight flight = theQuery.getSingleResult();
		currentSession.close();
		return flight;
	}

	@Transactional
	public void addFlight(final Flight flight) {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.persist(flight);
		currentSession.close();
	}

	@Transactional
	public void updateFlight(final Flight flight) {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.merge(flight);
		currentSession.close();
	}

	@Transactional
	public void deleteFlight(final int id) {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		// create a query
//		TypedQuery<Flight> theQuery =
//			currentSession.createQuery("delete from Flight where id=:bid", Flight.class);
//		theQuery.setParameter("bid", id);
//		theQuery.executeUpdate();
		Flight flight = currentSession.get(Flight.class, id);
		currentSession.remove(flight);
		currentSession.close();
	}
}