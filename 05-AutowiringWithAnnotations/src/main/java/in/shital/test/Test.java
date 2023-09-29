package in.shital.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.shital.AppConfig;
import in.shital.beans.ReportService;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext  ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		ReportService service=ctx.getBean(ReportService.class);
		service.generateReport();
	}

}

