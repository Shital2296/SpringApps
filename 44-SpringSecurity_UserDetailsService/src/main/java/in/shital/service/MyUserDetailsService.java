package in.shital.service;

import java.util.Collections;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("loadUserByUsername() method called....");
		//logic to get user data
		//userRepo.findByUsername(name);     (you can get user data using data jpa)
		return new User("shital","shital@123",Collections.emptyList());
	}

}

//Authentication Manager will talk to UserDetailsService for authentication
//UserDetailsService is an predefined interface which has 1 method-->loadUserByUsername(String name)
//It locates the user based on the username from the User class 
//User class in Spring Security is used to represent user account details, such as the username, password, and authorities (roles) associated with a user
//If we give UserDetailsService object to AuthenticationManagerBuilder then AuthManager will call this method for every login request