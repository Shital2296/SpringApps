package in.ashokit.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {

	public static void main(String[] args) throws Exception{
		
		Address addr=new Address();
		addr.setCity("Blr");
		addr.setState("KA");
		addr.setCountry("India");
		
		Customer c=new Customer();
		c.setId(1);
		c.setName("shital");
		c.setEmail("shital@gmail.com");
		c.setPhno(1234);
		c.setAddr(addr);
		
		ObjectMapper mapper=new ObjectMapper();
		mapper.writeValue(new File("customer.json"), c);
		System.out.println("Json File created");
	}
	
}


//in this project first we created a simple maven project 
//customer.java is a binding class with variables
//we are creating customer object in JavaToJsonConverter class & setting the values for each variable
//with the help of ObjectMapper interface, we will write the object values into a json file(.writeValue() method
//customer.json file will be created. Press ctrl+shift+F to format it