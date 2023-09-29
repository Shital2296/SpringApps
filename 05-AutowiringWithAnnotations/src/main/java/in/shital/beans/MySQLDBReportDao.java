package in.shital.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mysqlDB")
@Primary
public class MySQLDBReportDao implements ReportDao{

	public void getData() {
		// TODO Auto-generated method stub
		System.out.println("getting data from mysql db.......");
	}

}
