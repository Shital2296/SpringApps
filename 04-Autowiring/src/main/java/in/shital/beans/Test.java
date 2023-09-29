package in.shital.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("Beans.xml");
		
		Car c=ctxt.getBean(Car.class);
		c.drive();

	}

}
// ####################Autowiring###########################
// 1)byName mode
// <bean id="eng" class="in.shital.beans.DieselEng" />
// <bean id="eng1" class="in.shital.beans.PetrolEng" />
// <bean id="car" class="in.shital.beans.Car" autowire="byName">
// </bean>
// 2)byType mode
// <bean id="eng" class="in.shital.beans.DieselEng" autowire-candidate="false"/>
// <bean id="eng1" class="in.shital.beans.PetrolEng" />
// <bean id="car" class="in.shital.beans.Car" autowire="byType">
// </bean>
// ****************OR******************************
// <bean id="eng" class="in.shital.beans.DieselEng" primary="true" />
// <bean id="eng1" class="in.shital.beans.PetrolEng" />
// <bean id="car" class="in.shital.beans.Car" autowire="byType">
// </bean>
// In these two modes of autowiring, setter injection happened
// Constructor mode
// <bean id="eng" class="in.shital.beans.DieselEng" />
// <bean id="eng1" class="in.shital.beans.PetrolEng" />
// <bean id="car" class="in.shital.beans.Car" autowire="constructor">
// </bean>