package in.shital.beans;

public class Car {

	//In byName mode, ioc will match variable name eng with bean id given in xml file, here eng=eng so DieselEng class will be called at runtime
	private IEngine eng;
	
	public Car() {
		System.out.println("Car::0-param-Constructor");
	}
	
	//In constructor mode, ioc will match eng with eng in xml file,So DieselEng class will be called at runtime
	public Car(IEngine eng) {
		System.out.println("Car::param-Constructor");
		this.eng=eng;
	}
	/*
	 * public void setEng(IEngine eng) { this.eng=eng; }
	 */
	
	public void drive() {
		int status=eng.start();
		
		if(status>=1) {
			System.out.println("Engine started");
		}else {
			System.out.println("Engine trouble");
		}
	}
	
}
