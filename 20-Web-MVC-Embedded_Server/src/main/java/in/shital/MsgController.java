package in.shital;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
@RequestMapping("/msg")
public class MsgController {

	//localhost:8080/msg/hello
	
	@GetMapping("/hello")
	public String welcomeMsg(Model model) {
		model.addAttribute("msg", "Welcome people");
		return "index";
	}
	
	@GetMapping("/")
	@ResponseBody
	public String sayHello() {
		String msg="Hello, how are you?";
		return msg;
	}
}

//@Controller methods always return view pages
//@RestController methods always return ResponseBody
//@RestController=@Controller+@ResponseBody
//We can specify @ResponseBody annotation at class level also

//in controller classes, every method should have unique url pattern 
//if both methods having same url and same GET or POST request mapping then there will be ambiguity
//if tro methods having same url but different HTTP request mapping then there will be no ambiguity	
