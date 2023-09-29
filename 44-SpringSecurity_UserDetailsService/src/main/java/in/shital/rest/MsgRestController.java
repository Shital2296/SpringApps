package in.shital.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/contact")
	public String contact() {
		return "Contact Us::+91 8080166124";
	}
	
	@GetMapping("/greet")
	public String greet() {
		return "Good Morning...";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to our App";
	}
}