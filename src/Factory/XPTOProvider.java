package Factory;

public class XPTOProvider implements PaymentProvider {

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.print("Master Card payment" + amount/2);
		
	}
	
}
