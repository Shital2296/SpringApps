package in.ashokit.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaConverter {

	public static void main(String[] args) throws Exception {
		File f=new File("customer.json");
		
		ObjectMapper mapper=new ObjectMapper();
		Customer c=mapper.readValue(f, Customer.class);
		System.out.println(c);
	}
	
	
}

//json file already available in the project
//by using readValue() method we are reading data from json file & store into customer class object c

//this was about Jackson api
//If u go for GSON api, toJson() & fromJson() methods will be available