package in.shital.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		//here no need to create object for paymentservice class by using new keyword...
		//Ioc is creating objects for configured classes............
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("Beans.xml");
	    PaymentService s=ctxt.getBean(PaymentService.class);
	    s.doPayment(11.11);
		
		
	    
	}
}
