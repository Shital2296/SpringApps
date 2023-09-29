package in.shital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(Application.class, args);
		System.out.println(ctx.getClass().getName());
	}

}

//run method is a static method of SpringApplication class. It has logic to start IoC container. 
//Which class is used to start the IoC and to create object by run method is depends on which dependency you have in the pom.xml file 
//ConfigurableApplicationContext is a parent interface for every Applicationcontext class 
//boot-starter:AnnotationConfigApplicationContext
//web-starter:AnnotationConfigServeletWebServerApplicationContext
//starter-webflux:AnnotationConfigReactiveWebServerApplicationContext