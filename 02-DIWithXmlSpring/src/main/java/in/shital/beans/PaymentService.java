package in.shital.beans;

public class PaymentService {
	
	private IPayment payment;

	//0-param construtor
	public PaymentService(){
		System.out.println("PaymentService::constructor");
	}
	//construtor Injection
	//public PaymentService(IPayment payment) {
	//	this.payment=payment;
	//}
	//xml configuration for construtor
	//<constructor-arg name="payment" ref="debit"/>
      
	//setter injection
	public void setPayment(IPayment payment) {
		this.payment=payment;
	}
	//xml configuration for setter method
	//<property name="payment" ref="credit" />
	public void doPayment(double billAmt) {
		boolean status=payment.processPayment(billAmt);
		if(status) {
		System.out.println("Payment Successful");
		}else {
			System.out.println("Payment failed");
		}
		
	}
}
