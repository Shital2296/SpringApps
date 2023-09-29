package in.shital.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

	@Value("${msg}")
	private String msg;
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		return msg;
	}
}

//dependencies-->web starter, devtools, config-client
//in app.yml file, specify config server uri
//Specify application name same as file name
//write (msg: Good morning) in file  
//@Value annotation is used to load the yml or properties file data based on the key and store into the variable