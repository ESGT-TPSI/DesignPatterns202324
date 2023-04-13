package Factory;
public class MBWayProvider implements PaymentProvider {
    private String phone;

    public MBWayProvider(String phone) {
        this.phone = phone;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing MBWay payment of amount " + amount);
        // Lógica para processar pagamento usando a API do MBWay
    }
}