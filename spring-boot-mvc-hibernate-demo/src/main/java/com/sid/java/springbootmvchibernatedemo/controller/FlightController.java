package com.sid.java.springbootmvchibernatedemo.controller;

import java.sql.Time;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sid.java.springbootmvchibernatedemo.entity.Flight;
import com.sid.java.springbootmvchibernatedemo.entity.Passenger;
import com.sid.java.springbootmvchibernatedemo.entity.Ticket_details;
import com.sid.java.springbootmvchibernatedemo.service.FlightService;
import com.sid.java.springbootmvchibernatedemo.service.PassengerService;
import com.sid.java.springbootmvchibernatedemo.service.Ticket_detailsService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class FlightController {

	@Autowired
	private FlightService flightService;
	
	@Autowired
	private PassengerService passengerService;
	
	@Autowired
	private Ticket_detailsService ticket_detailsService;
	
	@GetMapping("/main")
	public String first() {
		return "main";
	}
	
	
	@GetMapping("/flight/{id}")
	public String getFlight(@PathVariable int id, ModelMap flightModel) {
		Flight flight = flightService.getFlight(id);
		flightModel.addAttribute("flight", flight);
		return "flight";
	}

	@GetMapping("/flights")
	public String getFlights(ModelMap flightModel) {
		List<Flight> flights = flightService.getFlights();
		flightModel.addAttribute("flights", flights);
		return "flights";
	}
	
	@GetMapping("findflight")
	public String find() {
		return "findflight";
	}
	
	@PostMapping("/find/flight")
	public String findFlights(@RequestParam(value = "source",required = true) String source,
			@RequestParam(value="destination",required = true) String destination,ModelMap flightModel) {
		
		
		List<Flight> flight = flightService.findFlights(source,destination);
		flightModel.addAttribute("flights",flight);
		return "flights_user";
	}
	
	@GetMapping("/book/flight/{id}")
	public String bookflight(@PathVariable int id,ModelMap flightModel,HttpServletRequest request) {
		
		String username = (String) request.getSession().getAttribute("user_name");
		Flight flight = flightService.findFlight(id);
		Passenger passenger = passengerService.getPassenger(username);
		Ticket_details tkt = new Ticket_details();
		tkt.setFlight(flight);
		tkt.setPassengerId(passenger.getId());
		tkt.setPassengerName(passenger.getName());
		tkt.setSource(flight.getSource());
		tkt.setDestination(flight.getDestination());
		tkt.setPrice(flight.getPrice());
		ticket_detailsService.addTicket(tkt);
		flightModel.addAttribute("flight",flight);
		return "bookflight";
	}

	@GetMapping("addFlight")
	public String addPage() {
		return "add";
	}

	@PostMapping("/add/flight")
	public String addFlight(@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "source", required = true) String source,@RequestParam(value = "destination", required = true) String destination,@RequestParam(value = "price", required = true) int price,@RequestParam(value = "departure_time", required = true) LocalTime departure_time, ModelMap flightModel) {
		Flight flight = new Flight();
		flight.setName(name);
		flight.setSource(source);
		flight.setDestination(destination);
		flight.setPrice(price);
		flight.setDeparture_time(departure_time);
		flightService.addFlight(flight);
		flightModel.addAttribute("msg", "Flight added successfully");
		List<Flight> flights = flightService.getFlights();
		flightModel.addAttribute("flights", flights);
		return "redirect:/flights";
	}

	@GetMapping("update/flight/{id}")
	public String updatePage(@PathVariable("id") int id, ModelMap flightModel) {
		flightModel.addAttribute("id", id);
		Flight flight = flightService.getFlight(id);
		flightModel.addAttribute("flight", flight);
		return "update";
	}

	@PostMapping("/update/flight")
	public String updateFlight(@RequestParam int id, @RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "source", required = true) String source,@RequestParam(value = "destination", required = true) String destination,@RequestParam(value = "price", required = true) int price,@RequestParam(value = "departure_time", required = true) LocalTime departure_time, ModelMap flightModel) {
		Flight flight = new Flight(id,name,source,destination,price,departure_time);
		/*
		 * flight.setId(id); flight.setName(name); flight.setSource(source);
		 */
		flightService.updateFlight(flight);
		List<Flight> flights = flightService.getFlights();
		flightModel.addAttribute("flights", flights);
		flightModel.addAttribute("msg", "Flight updated successfully");
		flightModel.addAttribute("id", id);
		return "redirect:/flights";
	}

	@GetMapping("/delete/flight/{id}")
	public String deleteFlight(@PathVariable int id, ModelMap flightModel) {
		flightService.deleteFlight(id);
		List<Flight> flights = flightService.getFlights();
		flightModel.addAttribute("flights", flights);
		flightModel.addAttribute("msg", "Flight delted successfully");
		return "redirect:/flights";
	}
	
	@GetMapping("viewbooking/flight/{id}")
	public String ViewBooking(@PathVariable int id,ModelMap flightModel) {
		Flight flight = flightService.getFlight(id);
		List<Ticket_details> passengers = ticket_detailsService.getTicketList(flight);
//		System.out.println(passengers.get(1).getPassengerName());
		flightModel.addAttribute("passengers",passengers);
//		System.out.println(passengers);
		return "booking";
	}
	
}
