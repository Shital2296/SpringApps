package in.shital;

public class DieselEng implements IEngine{

	public DieselEng() {
		System.out.println("DieselEngine::Constructor");
	}
	public int start() {
		System.out.println("DieselEng started....");
		return 1;
	}

}
