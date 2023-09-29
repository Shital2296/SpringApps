package in.shital;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("Beans.xml");

		//singleton is default scope for every application...It will create same object every time we call 
		//we have to specify prototype scope in xml file as scope="prototype"
		//It will create new object every time we call
		
		Car c1=ctxt.getBean(Car.class);
		System.out.println(c1.hashCode());
		
		Car c2=ctxt.getBean(Car.class);
		System.out.println(c2.hashCode());
		
		Car c3=ctxt.getBean(Car.class);
		System.out.println(c3.hashCode());
	}

}
