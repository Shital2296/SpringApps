package in.shital;

public class PetrolEng implements IEngine{

	public PetrolEng() {
		System.out.println("PetrolEngine::Constructor");
	}
	public int start() {
		System.out.println("PetrolEng started....");
		return 1;
	}

}
