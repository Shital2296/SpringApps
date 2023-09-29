package in.shital.beans;

public class Car {

	
		
		private IEngine eng;
		
		//Construtor injetion in java 
		//public Car(IEngine eng) {
		//	this.eng=eng;
		//}
		
		//setter injetion in java
		public void setCar(IEngine eng) {
			this.eng=eng;
		}
		
		public void drive() {
			int status=eng.start();
			
			if(status>=1) {
				System.out.println("Engine started");
			}else {
				System.out.println("Engine trouble");
			}
		}

	

}
