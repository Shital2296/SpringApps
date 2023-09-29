package in.shital;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@GetMapping("/")
	public String getMsg() {
		return "Welcome to REST API";
	}
}

//URL: localhost:8080/actuator/

//localhost:8080/actuator/beans
//localhost:8080/actuator/health