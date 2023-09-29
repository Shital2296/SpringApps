package in.shital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class Application {

	static String url="localhost:8081/ticket/{ticketNum}";
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		WebClient webClient=WebClient.create();
		
		System.out.println("request sending starts.......");
		
		webClient.get()
		         .uri(url,6)
		         .header("Accept", "application/json")
		         .retrieve()
		         .bodyToMono(String.class)
		         .subscribe(Application::handleResponse);
	}

	public static void handleResponse(String response) {
		System.out.println(response);
	}
}

//response coming from the api will given to the handleResponse() method as a parameter
//If the url is expecting path parameters, we can specify that as 2nd,3rd,... parameters in .uri method
//If the url is expecting query parameters, we can pass map object. In that map we need to set keys and values. [.uri(url, map)]
//header method---> .header("Accept", "application/json")