package com.sid.java.springbootmvchibernatedemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sid.java.springbootmvchibernatedemo.entity.Passenger;
import com.sid.java.springbootmvchibernatedemo.repository.PassengerDao;

@Service
public class PassengerService {
	
	@Autowired
	private PassengerDao passengerdao;
	
	public boolean login(String username,String password) {
		return passengerdao.login(username,password);
	}
	
	public boolean signup(Passenger passenger) {
		return passengerdao.signup(passenger);
	}
	
	public Passenger getPassenger(final String username) {
		return passengerdao.getPassenger(username);
	}
	
}
