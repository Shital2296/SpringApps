package in.shital.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.shital.binding.Book;

@RestController
public class BookRestController {
	
	
	@PostMapping(
			value="/book",
			consumes= {"application/xml","application/json"}
	)
	public ResponseEntity<String> addBook(@RequestBody Book b){
		System.out.println(b);
		//logic to save in db
		String msg="Record saved...";
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}

	@GetMapping(
			value="/book",
			produces= {"application/xml","application/json"}
	)
	public Book getBook() {
		Book b=new Book();
		b.setId(101);
		b.setName("Java");
		b.setPrice(150.00);
		return b;
	}
}

//Note-----------In Get method, if we specify application/json first in produces and then application/xml, then it will give json data as response &
//if we specify application/xml first in produces and then application/json, then it will give xml data as response
//If you want to edit format of the response from client/consumer side, then you will have to set header 'Accept' as application/json or application/xml


//---------------------------------------******************************--------------------------------------------------------


//consumes-> It represents in which format REST API method can accept input data from client

//produces-> It represents in which format REST API method can provide response to clients

//Content-Type-> This header will represent in which format client sending data to server in request body

//Accept-> This header will represent in which format client expecting response from server
