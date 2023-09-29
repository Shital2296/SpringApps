package in.shital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

//In this app, we have used same entity and binding class
//to access h2 database in the browser, http:8080/h2-console
//here we are using jsp pages, for presentation layer dvlpmnt
//create jsp pages in src/main/webapps/views folder
//specify path for jsp pages in application.properties file
//add jasper dependency in pom.xml for using jsp