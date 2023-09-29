package in.shital.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	private Logger logger=LoggerFactory.getLogger(DemoController.class);
	
	@GetMapping("/greet")
	public String greetMsg(Model model) {
		String msg1="Good Evening..";
		model.addAttribute("msg", msg1);
		return "index";
	}
	
	@GetMapping("/msg")
	public String getMsg(Model model) {
		String msg1="Welcome here...";
		int i=10/0;
		model.addAttribute("msg", msg1);
		return "index";
	}
	
	@ExceptionHandler(value=Exception.class)
	public String handleException(Exception e) {
		String msg=e.getMessage();
		logger.error(msg);
		return "errorPage";
	}
}

//handleException method in the controller class will handle the exception for the methods in this class only.
//this is called local exception handling
//Exception class is the superclass for all the exceptions (eg. NullPointerException, ArithmeticException)
//logger is used to log the error messages

