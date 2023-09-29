package in.shital.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@PostMapping("/msg")
	public ResponseEntity<String> getMsg() {
		String responseBody="Msg saved successfully...!";
		return new ResponseEntity<String>(responseBody,HttpStatus.CREATED);
	}

	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg() {
		String msg="Welcome to REST API...!";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		return "Good Evening";
	}
}

//When you want to customize the Http Status code, you can go for ResponseEntity as return type of the method
//in the return statement, take body and HttpStatus as required
//HttpStatus.OK=200 & HttpStatus.CREATED=201

//In the rest controller, we are getting direct response
//so we cant test post methods by using browser, we can use postman to test the RestController POST methods
//@RestController=@Controller+@ResponseBody