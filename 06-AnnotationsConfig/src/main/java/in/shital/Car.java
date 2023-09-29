package in.shital;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Car {

	public Car() {
		System.out.println("Car::Constructor");
	}
	
}

//default scope for a bean class is singleton...then IoC will create object for those classes
//when the scope is prototype,object will be created when we call the getBean() method