
package in.shital.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

	//@Autowired
	//@Qualifier("oracleDB")
	private ReportDao dao;
	
	//@Autowired
	//public void setDao(ReportDao dao) {
	//	System.out.println("setter method called");
	//	this.dao=dao;
	//}
	
	public ReportService() {
		System.out.println("0-param-Constructor");
	}
	@Autowired
	public ReportService(ReportDao dao) {
		this.dao=dao;
		System.out.println("ReportService::Constructor");
	}
	
	public void generateReport() {
		dao.getData();
		System.out.println("Report generated.....");
	}
}

//@Qualifier is used to identify the bean based on the given name for DI
//If you dont want to specify @Qaulifier then go for @Primary Annotation in one of the implementation classes 
// If you specify both @Qualifier will get the priority

// If you have only one param-constructor in the class, @Autowired annotation is optional
// If you have both 0-param and param constructor, always 0-param constructor will be called....
// If you want to call param Constructor then @Autowired annotation is mandatory