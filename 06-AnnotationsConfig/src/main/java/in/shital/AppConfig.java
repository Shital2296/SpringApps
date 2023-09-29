package in.shital;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig::Constructor");
	}
	
	@Bean
	public Engine getEngine() {
		Engine eng=new Engine();
		return eng;
	}
}


// @ComponentScan will only scan current package. You will have to give basePackage name to component scan
//@ComponentScan(basePackages="in.shital")
// OR you can create AppConfig class in base package itself
// You can also give multiple base packages...@ComponentScan(basePackages={"in.shital","com.tcs"})

//@Bean is method level annotation
// If we want to customize the bean object creation for a particular class, go for @Bean annotation