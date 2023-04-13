package Factory;
public class PayPalProvider implements PaymentProvider {
    private String apiKey;
    private String apiSecret;

    public PayPalProvider(String apiKey, String apiSecret) {
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of amount " + amount);
        // Lógica para processar pagamento usando a API do PayPal
    }
}