package in.shital.beans;

import org.springframework.stereotype.Repository;

@Repository("oracleDB")
public class OracleDBReportDao implements ReportDao {

	public void getData() {
		// TODO Auto-generated method stub
		System.out.println("getting data from oracle db.....");
	}

}
