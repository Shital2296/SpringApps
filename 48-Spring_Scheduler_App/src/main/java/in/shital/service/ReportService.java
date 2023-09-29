package in.shital.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

	@Scheduled(cron="0 40 13 * * *")
	public void generateReport() {
		//logic to generate report`12
		System.out.println("Report generated....");
	}
}

//In main class, write @EnableScheduling annotation

//@Scheduled(fixedRate = 3000)-->first time it will execute and then after every 3 seconds (does not depend on previous execution)
//@Scheduled(fixedDelay = 3000)-->it will check how much time its taking for method execution and then after 3 seconds it will be executed
                                         //(depend on previous execution)
//To customize time for execution-->write cron expression
//@Scheduled(cron="* * * * * *")
//*--> second(0-59)
//*--> minute(0-59)
//*--> hour(0-23)
//*--> day of the month(0-31)
//*--> month(1-12) or (JAN-DEC)
//*--> day of the week (0-7) (0 or 7 is sunday, or MON-SUN)