package in.shital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}


//to test get requests in browser, simply access it from url's mentioned in the controller as =====
//localhost:8080/welcome and localhost:8080/greet