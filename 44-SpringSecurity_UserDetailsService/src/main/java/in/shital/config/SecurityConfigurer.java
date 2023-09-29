package in.shital.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import in.shital.service.MyUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfigurer {
	
	//****************In Memory Authentication*****************************

//	@Bean
//	public InMemoryUserDetailsManager configureUsers() {
//		
//		UserDetails adminUser=User.withDefaultPasswordEncoder()
//				                  .username("shital")
//				                  .password("shital@123")
//				                  .authorities("ADMIN")
//				                  .build();
//		
//		UserDetails normalUser=User.withDefaultPasswordEncoder()
//                                   .username("raja")
//                                   .password("raja@123")
//                                   .authorities("USER")
//                                   .build();
//		
//		return new InMemoryUserDetailsManager(adminUser,normalUser);
//	}
	
	//********************************Authentication**************************************
	@Autowired
	private MyUserDetailsService userDtlsService;
	
	@Autowired
	public void configureUsers(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userDtlsService)
		     .passwordEncoder(NoOpPasswordEncoder.getInstance());
	}
	
	//********************************Authorization**************************************
	@Bean
	public SecurityFilterChain security(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((req) ->
		     req.antMatchers("/contact")
		        .permitAll()
		        .anyRequest()
		        .authenticated()
				).formLogin();
		
		return http.build();
	}
}