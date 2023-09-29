package in.shital.service;

import in.shital.request.Passenger;
import in.shital.response.Ticket;

public interface BookingService {

	//to book ticket
	public Ticket bookTicket(Passenger passenger);
	
	//to get ticket data
	public Ticket getTicket(Integer ticketNumber);
}
