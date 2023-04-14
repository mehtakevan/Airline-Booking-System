package com.sid.java.springbootmvchibernatedemo.entity;

import java.io.Serializable;

import java.sql.Time;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "Flight")
public class Flight implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;

	@Column
	private String name;

	@Column
	private String source;
	
	@Column
	private String destination;

	@Column
	private int price;
	
	@Column
	@Temporal(TemporalType.TIME)
	private LocalTime Departure_time;
	
	public LocalTime getDeparture_time() {
		return Departure_time;
	}

	public void setDeparture_time(LocalTime departure_time) {
		Departure_time = departure_time;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flight(int id, String name, String source, String destination, int price, LocalTime departure_time2) {
		super();
		this.id = id;
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.price = price;
		this.Departure_time = departure_time2;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", name=" + name + ", source=" + source + ", destination=" + destination + ", price="
				+ price + ", Departure_time=" + Departure_time + "]";
	}



	

}