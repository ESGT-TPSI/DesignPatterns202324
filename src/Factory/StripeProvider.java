package Factory;
public class StripeProvider implements PaymentProvider {
    private String apiKey;
    private String apiSecret;

    public StripeProvider(String apiKey, String apiSecret) {
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Stripe payment of amount " + amount);
        // Lógica para processar pagamento usando a API do Stripe
    }
}