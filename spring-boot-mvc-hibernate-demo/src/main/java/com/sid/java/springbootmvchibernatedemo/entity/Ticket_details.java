package com.sid.java.springbootmvchibernatedemo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ticket_details")
public class Ticket_details{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Ticket_id")
	private int id;
	
	
    private int PassengerId;
    
    private String PassengerName;
    
    private String source;
    
    private String destination;
    
    private int price;
    
    @OneToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;

	public Ticket_details() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket_details(int id, int passengerId, String passengerName, String source, String destination, int price,
			Flight flight) {
		super();
		this.id = id;
		PassengerId = passengerId;
		PassengerName = passengerName;
		this.source = source;
		this.destination = destination;
		this.price = price;
		this.flight = flight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPassengerId() {
		return PassengerId;
	}

	public void setPassengerId(int passengerId) {
		PassengerId = passengerId;
	}

	public String getPassengerName() {
		return PassengerName;
	}

	public void setPassengerName(String passengerName) {
		PassengerName = passengerName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

    
    
}