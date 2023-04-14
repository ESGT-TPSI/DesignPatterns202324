package Factory;
public class VisaProvider implements PaymentProvider {
    private String apiKey;
    private String apiSecret;

    public VisaProvider() {
   
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("ASDASD " + amount);
        // Lógica para processar pagamento usando a API do PayPal
    }
}