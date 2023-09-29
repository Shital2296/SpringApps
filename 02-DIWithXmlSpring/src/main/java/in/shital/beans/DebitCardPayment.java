package in.shital.beans;

public class DebitCardPayment implements IPayment{

	public DebitCardPayment() {
		System.out.println("DebitCardPayment::constructor");
		
	}

	public boolean processPayment(double billAmt) {
		System.out.println("DebitCardPayment successful");
		return true;
	}

}
