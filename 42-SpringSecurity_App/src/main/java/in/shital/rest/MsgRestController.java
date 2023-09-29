package in.shital.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/logincheck")
	public String login() {
		return "Login Page Loading....";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "+91 8080166124";
	}
	
	@GetMapping("/hi")
	public String sayHi() {
		return "Hi, How are you?";
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, Good Morning";
	}
}

//When you add Sping-Security dependency in pom.xml, it will automatically provide basic authentication for all the methods
//When you access these url's, browser will ask for username and password
//when you dont give username and password then the password will be generated automatically in console and the username is "user"
//once you login, it will not ask for credentials again in the same browser
//but if you will access in different browser then it will ask for credentials
//if you close the browser cookies will be deleted and it will ask for creds again

//by using postman-->Authorization->Basic Auth
//when you access using postman, one header gets created. key is Authorization and value is "Basic (user and pass in encoded format)"  
//e.g. Basic dXNlcjo5NGEzODY4MC1mODAxLTQ5NmMtODI1OS1jNWU3MTA4MzhlNDc=

//If you want to override Default creds and give your own username and password, write some properties in properties or yml file
//  spring:
//   security:
//    user:
//      name: shital
//      password: shital@123