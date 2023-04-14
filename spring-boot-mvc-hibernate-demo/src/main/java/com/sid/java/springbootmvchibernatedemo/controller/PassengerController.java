package com.sid.java.springbootmvchibernatedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sid.java.springbootmvchibernatedemo.entity.Passenger;
import com.sid.java.springbootmvchibernatedemo.service.PassengerService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class PassengerController {
	
	@Autowired
	private PassengerService passengerService;
	
	@GetMapping("/login")
	public String login2() {
		return "login";
	}
	
	@PostMapping("/login/user")
	public String login(@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "password", required = true) String password,ModelMap passengerModel,HttpServletRequest request) {
		boolean crt = passengerService.login(username,password);
		if(crt == true) {
			request.getSession().setAttribute("user_name",username);
			return "main";
		}
		else {
			System.out.print(crt);
			return "error_login";
		}
	}
	
	@GetMapping("/new")
	public String user() {
		return "signup";
	}
	
	@PostMapping("/signup")
	public String signup(@RequestParam(value = "name", required = true) String name,@RequestParam(value = "email", required = true) String email,
			@RequestParam(value = "contact_no", required = true) String contact_no,@RequestParam(value = "age", required = true) int age,
			@RequestParam(value = "gender", required = true) String gender,
			@RequestParam(value = "username", required = true) String username,@RequestParam(value = "password", required = true) String password) {
		Passenger passenger = new Passenger();
		passenger.setName(name);
		passenger.setEmail(email);
		passenger.setContact_no(contact_no);
		passenger.setAge(age);
		passenger.setGender(gender);
		passenger.setUsername(username);
		passenger.setPasswrod(password);
		boolean crt = passengerService.signup(passenger);
		if(crt == true)
			return "login";
		else
			return "error_sign_up";
	}
	
}
