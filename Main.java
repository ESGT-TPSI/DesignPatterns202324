import Factory.PaymentProviderFactory;
import Singleton.Configuration;

public class Main {
    public static void main(String[] args) {
    /*
    	var pagamento1= new PaymentProviderFactory()
    						.createPaymentProvider("MBWAY");
    	pagamento1.processPayment(100);
    	
    	var pagamento2= new PaymentProviderFactory()
    						.createPaymentProvider("STRIPE");
    	pagamento2.processPayment(3300);
    	
       	var pagamento3= new PaymentProviderFactory()
       							.createPaymentProvider("VISA");
    	pagamento3.processPayment(5000);
    	*/
    	
    	// Ecrã 1
    	var configurations = new Configuration();
    	
    	// Ecrã 2
    	var configurations2 = new Configuration();
    	
    	// Ecrã 3
    	var configurations3 = new Configuration();
    	
    	// Ecrã 1
    	configurations.setTipoPagamento("VISA");
       	configurations2.setTipoPagamento("STRIPE");
      	
    	// Ecrã 1   
    	System.out.println(configurations.getTipoPagamento());
    	
    	// Ecrã 2
    	System.out.println(configurations2.getTipoPagamento());

    	// Ecrã 3
    	System.out.println(configurations3.getTipoPagamento());
    
    	// asda
    	var pagamento2= new PaymentProviderFactory()
    			.createPaymentProviderComBaseNoSingleton();
    	pagamento2.processPayment(3300);
    	
    	var pagamento3= new PaymentProviderFactory()
    			.createPaymentProviderComBaseNoSingleton();
    	pagamento3.processPayment(5300);
    
    }
}
