package in.shital.binding;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class MarshalDemo {

	public static void main(String[] args) throws Exception{
		
		Customer c=new Customer();
		c.setId(101);
		c.setName("Shital");
		c.setEmail("shital@gmail.com");
		c.setPhno(17524675218l);

		JAXBContext context=JAXBContext.newInstance(Customer.class);
		Marshaller marshaller=context.createMarshaller();
		marshaller.marshal(c, new File("customer.xml"));
		
		System.out.println("xml file created....");
	}

}

//first we are creating object for customer class(annotate customer class with @XmlRootElement)
//calling newInstance method of JAXBContext, we are getting context object
//calling createMarshaller method of context, we are getting marshaller object
//by using marshal method, we are converting object c into xml file

//add required dependencies in pom.xml