package com.sid.java.springbootmvchibernatedemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Passenger")
public class Passenger {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String email;
	
	@Column
	private String contact_no;
	
	@Column
	private int age;
	
	@Column
	private String gender;
	
	@Column
	private String username;
	
	@Column
	private String passwrod;

	public Passenger(int id, String name, String email, String contact_no, int age, String gender, String username,
			String passwrod) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact_no = contact_no;
		this.age = age;
		this.gender = gender;
		this.username = username;
		this.passwrod = passwrod;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswrod() {
		return passwrod;
	}

	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}

	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", email=" + email + ", contact_no=" + contact_no + ", age="
				+ age + ", gender=" + gender + "]";
	}
	

}
