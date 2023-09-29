package in.shital.beans;

public class PetrolEngine implements IEngine{

	public int start() {
		System.out.println("PetrolEngine started");
		return 1;
	}

}
