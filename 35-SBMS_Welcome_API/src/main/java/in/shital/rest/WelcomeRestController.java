package in.shital.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.shital.feign.GreetFeignClient;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private GreetFeignClient greetClient;

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String greetResp=greetClient.invokeGreetApi();
		return greetResp+", Welcome to REST API";
	}
}


//*********************************Feign Client & Load Balancing*******************************************************
//Annotations-->@EnableDiscoveryClient, @EnableFeignClients
//FeignClient is used to consume REST API endpoints which are exposed by third-party or microservice
//Create an interface and annotate it with @FeignClient and give the name of the endpoint which you want to send request

//Load balancing is the process of distributing incoming requests among multiple instances of a service, in order to achieve high availability, scalability, and efficiency.
//Steps for creating multiple instances of a microservice--->
//run as-> run configurations -> select project->arguments -> VM arguments-> -Dserver.port=portNo (you can give any portNo like 8081,8082,etc)->apply ->run 