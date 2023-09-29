package in.shital.service;

import in.shital.request.Passenger;
import in.shital.response.Ticket;

public interface MakeMyTripService {

	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicketByNum(Integer ticketNum);
}
