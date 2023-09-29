package in.shital.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	@GetMapping(value="/admin")
	public String admin() {
		return "<h3>Welcome Admin :)</h3>";
	}
	
	@GetMapping(value="/user")
	public String user() {
		return "<h3>Hello User :)</h3>";
	}
	
	@GetMapping(value="/welcome")
	public String welcome() {
		return "<h3>Welcome :)</h3>";
	}
	
}

//In realtime the creds data will be stored in the database only
//Spring security will fetch the data from database itself to provide aunthentication and authorization


//Setup Database tables with required data
//
//-- users table structure
//
//CREATE TABLE `users` (
// `username` VARCHAR(50) NOT NULL,
// `password` VARCHAR(120) NOT NULL,
// `enabled` TINYINT(1) NOT NULL,
// PRIMARY KEY (`username`)
//);
//
//
//-- authorities table structure
//
//CREATE TABLE `authorities` (
// `username` VARCHAR(50) NOT NULL,
// `authority` VARCHAR(50) NOT NULL,
// KEY `username` (`username`),
// CONSTRAINT `authorities_ibfk_1` FOREIGN KEY (`username`)
// REFERENCES `users` (`username`)
//);
//
//
//========= Online Encrypt Generator: https://bcrypt-generator.com/ ======================
//
//-- insert records into table
//
//insert into users values ('admin', '$2a$12$eD7HSQiSTfHrrv.9Ck6w1e.WwBXrCTeUMF8i33IAr9Zjw2Ul2EaPu',  1);
//insert into users values ('user', '$2a$12$BmJs7yLBkZJwiM./e1Kv7ODk5Lez4ieVFktuJDEtjGYEsxxYYAHKa',  1);
//
//insert into authorities values ('admin', 'ROLE_ADMIN');
//insert into authorities values ('admin', 'ROLE_USER');
//insert into authorities values ('user', 'ROLE_USER');