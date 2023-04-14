package Factory;

public class MasterCardProvider implements PaymentProvider {
	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.print("Master Card payment" + amount);
	}
}
