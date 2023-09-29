package in.shital;

public class Car {

	private IEngine eng;
	
	public Car() {
		System.out.println("Car::Constructor");
	}
	
	public void setEng(IEngine eng) {
		this.eng=eng;
	}
	
	
}
