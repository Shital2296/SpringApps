package in.shital;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/greet")
public class GreetController {

	//localhost:8080/greet/hello
	
	@GetMapping("/hello")
	public String welcomeMsg(Model model) {
		model.addAttribute("msg", "Welcome people");
		return "index";
	}
}

//At project level, two methods with same url pattern having same HTTP request mapping,
//there will also be ambiguity
//To solve this ambiguity, we have one annotation @RequestMapping at class level, 
//we can specify different url's'

//To set context-path, write server.servlet.context-path=/SBMS  in application.properties file