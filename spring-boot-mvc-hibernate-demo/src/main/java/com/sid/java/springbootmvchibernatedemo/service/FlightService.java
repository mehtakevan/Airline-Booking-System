package com.sid.java.springbootmvchibernatedemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sid.java.springbootmvchibernatedemo.entity.Flight;
import com.sid.java.springbootmvchibernatedemo.repository.FlightDao;

@Service
public class FlightService {

	@Autowired
	private FlightDao flightDao;

	public Flight getFlight(final int id) {
		return flightDao.getFlight(id);
	}

	public List<Flight> getFlights() {
		return flightDao.getFlights();
	}
	
	public List<Flight> findFlights(final String source,final String destination){
		return flightDao.findFlights(source,destination);
	}
	
	public Flight findFlight(final int id) {
		return flightDao.findFlight(id);
	}

	public void addFlight(final Flight flight) {
		flightDao.addFlight(flight);
	}

	public void updateFlight(final Flight flight) {
		flightDao.updateFlight(flight);
	}

	public void deleteFlight(final int id) {
		flightDao.deleteFlight(id);
	}

}