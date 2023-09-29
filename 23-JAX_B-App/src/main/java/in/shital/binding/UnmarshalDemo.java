package in.shital.binding;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class UnmarshalDemo {

	public static void main(String[] args) throws Exception{
		
		File f=new File("customer.xml");
		
		JAXBContext context=JAXBContext.newInstance(Customer.class);
		Unmarshaller unmarshaller=context.createUnmarshaller();
		Object object=unmarshaller.unmarshal(f);
		Customer c=(Customer) object;
		System.out.println(c);
		}
}

//customer.xml file is already available
//calling newInstance method of JAXBContext, we are getting context object
//calling createUnmarshaller method of context, we are getting unmarshaller object of Unmarshaller class
//by using unmarshal method,we are converting file data into object and storing into object class

//