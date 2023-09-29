package in.shital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}


//dependency-->spring-boot-admin-starter-server
//annotation-->@EnableAdminServer

//portNo-->server.port=1111


//-------------------------------------------------------------------------------------------------------
//*************************Steps for configuring zipkin server*******************************************

//1)download jar file from zipkin.io site
//2)open cmd from the location where it has downloaded
//3)run command--> java -jar <jar-file-name>.jar [java -jar zipkin-server-2.24.3-exec.jar]
//4)portNo-->9411