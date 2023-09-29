package in.shital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}


//Annotate main class by @EnableConfigServer annotation
//Config server will clone configuration properties from the file stored in github and give it to the API
//specify github url in yml file
//file name and API name should be same

//dependency-->config-server