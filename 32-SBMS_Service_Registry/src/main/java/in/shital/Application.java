package in.shital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}


//To use Eureka Server Registry, we have to add spring-cloud-starter-netflix-eureka-server dependency in pom.xml 
//& also we have to add @EnableEurekaServer annotation in main class

//If you want client to auto-register with the Eureka server, give port no as 8761

//to disable self-registration of this app, add this property in .properties/.yml file-->eureka.client.register-with-eureka=false
