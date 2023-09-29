package in.shital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}


//Annotation-->@EnableDiscoveryClient
//dependencies--->1)web starter, 
                //2)devtools, 
                //3)actuator, 
                //4)spring-cloud-sleuth-zipkin, 
                //5)spring-boot-admin-starter-client, 
                //6)spring-cloud-starter-netflix-eureka-client
                //7)spring-cloud-starter-sleuth

//add spring-boot-admin-client-url in app.yml file
//if the default port no of eureka server(service_registry) is not 8761, you will have to add that port no in app.yml file