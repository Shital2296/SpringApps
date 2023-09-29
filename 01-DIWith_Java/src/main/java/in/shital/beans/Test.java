package in.shital.beans;

public class Test {

	public static void main(String[] args) {
		//Calling Construtor 
		//Car C=new Car(new DieselEngine());
		//C.drive();

		//Calling setter method
		Car C=new Car();
		C.setCar(new PetrolEngine());
		C.drive();
	}

}
