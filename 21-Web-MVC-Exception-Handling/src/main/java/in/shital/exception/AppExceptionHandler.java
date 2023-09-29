package in.shital.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {

	
	private Logger logger=LoggerFactory.getLogger(AppExceptionHandler.class);
	
	@ExceptionHandler(value=Exception.class)
	public String handleException(Exception e) {
		String msg=e.getMessage();
		logger.error(msg);
		return "errorPage";
	}
}


//This class will handle the exceptions that occurred in any other class
//This is called Global Exception Handling
//@ControllerAdvice annotation allows handling exceptions across the whole application 
//in one global handling component
//@ExceptionHandler is an annotation used to handle the specific exceptions 
//and sending the custom responses to the client.

