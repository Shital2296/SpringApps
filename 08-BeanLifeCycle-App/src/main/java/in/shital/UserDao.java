package in.shital;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
	
	

	public void getData() {
		System.out.println("getting data from database.......");
	}

	
	public void destroy() throws Exception {
		System.out.println("destroy method.....");
		
	}

	
	public void init() throws Exception {
		System.out.println("init method.....");
		
	}
	
}
