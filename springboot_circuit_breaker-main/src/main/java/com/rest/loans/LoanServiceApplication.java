package com.rest.loans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class LoanServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(LoanServiceApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	
}

//Circuit Breaker
//3 states-->1)CLOSED
//           2)OPEN
//           3)HALF-OPEN