package in.shital.beans;

public class CreditCardPayment implements IPayment{

	public CreditCardPayment() {
		// TODO Auto-generated method stub
		System.out.println("CreditCardPayment::constructor");
	}

	public boolean processPayment(double billAmt) {
		System.out.println("CreditCardPayment Successful");
		return true;
	}

}
