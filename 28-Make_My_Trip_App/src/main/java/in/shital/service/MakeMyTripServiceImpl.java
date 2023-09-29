package in.shital.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import in.shital.request.Passenger;
import in.shital.response.Ticket;

@Service
public class MakeMyTripServiceImpl implements MakeMyTripService {

	private String BOOK_TICKET_URL="localhost:8081/ticket";
	
	private String GET_TICKET_URL="localhost:8081/ticket/{ticketNum}";
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
		
		//get the instance of webclient(impl class obj)
		WebClient webClient=WebClient.create();
				
		//send POST request with passenger data and map response to Ticket obj
		Ticket ticket=webClient.post()
				               .uri(BOOK_TICKET_URL)
				               .bodyValue(passenger)   //sending passenger data from ui to provider
				               .retrieve()
				               .bodyToMono(Ticket.class)    //converting json data to Ticket obj
				               .block();
		
		return ticket;
		
		/*
		 * RestTemplate rt=new RestTemplate(); 
		 * ResponseEntity<Ticket> respEntity=rt.postForEntity(BOOK_TICKET_URL, passenger, Ticket.class); 
		 * Ticket ticket=respEntity.getBody(); 
		 * return ticket;
		 */
		
	}

	@Override
	public Ticket getTicketByNum(Integer ticketNum) {
		
		//get the instance of webclient(impl class obj)
		WebClient webClient=WebClient.create();
		
		//send get request and map response to Ticket obj
		Ticket ticket=webClient.get()
				               .uri(GET_TICKET_URL, ticketNum)
				               .retrieve()
				               .bodyToMono(Ticket.class)
				               .block();   //synchronous call
		
		return ticket;
		/*
		RestTemplate rt=new RestTemplate();
		ResponseEntity<Ticket> respEntity=rt.getForEntity(GET_TICKET_URL, Ticket.class, ticketNum);
		Ticket ticket=respEntity.getBody();
		return ticket;
		*/
		
	}

}

//*****************************using RestTemplate*********************************

//In first method, we want to book the ticket.so we will use postForEntity() method
//(postForEntity is used to send post request with the body to the given url)
//first parameter is url,
//second parameter represents data that we need to send in the requestBody
//third parameter represents response type.i.e.after receiving response from api how u want to represent the response
//here we are representing response as Ticket class object
//directly it is not giving the ticket object. we have to store it into responseEntity

//in 2nd method,we are getting ticket details
//first parameter is url
//we are receiving Ticket.class response from get method in swagger so second parameter is Ticket.class
//{ticketNum} is a path parameter .give that as a third parameter 

//Note:If you have 2 path parameters, you can set it as 4th parameter in getForEntity() method

//Here client is sending post and get request by using postForEntity() and getForEntity() methods


//RestTemplate only supports synchronous communication----->class
//Whereas, web client supports both synchronous and asynchronous communication---------->Interface

//If you want to go for asynchronous comm, instead of writing block() method you should write subscribe() method in web client