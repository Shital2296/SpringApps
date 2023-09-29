package in.shital.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@GetMapping("/greet")
	public String getGreetMsg() {
		return "Good Morning";
	}
}
