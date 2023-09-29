package in.shital.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value=UserNotFoundException.class)
	public ResponseEntity<ErrorInfo> handleUserNFE(Exception e){
	
		String exMsg=e.getMessage();
		
		ErrorInfo info=new ErrorInfo();
		info.setCode("SBIEX0001");
		info.setMsg(exMsg);
		info.setWhen(LocalDateTime.now());
		
		return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value=Exception.class)
	public ResponseEntity<ErrorInfo> handleException(Exception e){
	
		String exMsg=e.getMessage();
		
		ErrorInfo info=new ErrorInfo();
		info.setCode("SBIEX0003");
		info.setMsg(exMsg);
		info.setWhen(LocalDateTime.now());
		
		return new ResponseEntity<>(info,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}


//Whenever there is Arithmetic exception, it will check for handler method who handles Arithmetic exception
//If there is no such method, then it will go for generic exception handler method i.e.(Exception.class)

//In web applications, Error page will be displayed.
//But in the Rest, there are no error pages. We are sending direct response in JSON format