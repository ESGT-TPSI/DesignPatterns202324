package Factory;

import Singleton.Configuration;

public class PaymentProviderFactory {
    public static PaymentProvider createPaymentProvider(String providerName) {
    	switch (providerName.toLowerCase()) {
            case "paypal":
                return new PayPalProvider("API-KEY", "PAYPAL-SECRET");
            case "stripe":
                return new StripeProvider("API-KEY", "STRIPE-SECRET");
            case "mbway":
                return new MBWayProvider("934235069");
            case "visa":
                return new VisaProvider();
            default:
                throw new IllegalArgumentException("Invalid payment provider name: " + providerName);
        }
    }
    
    public static PaymentProvider createPaymentProviderComBaseNoSingleton() {
       	var configurations = new Configuration();
     	var providerName = configurations.getTipoPagamento();
    	switch (providerName.toLowerCase()) {
            case "paypal":
                return new PayPalProvider("API-KEY", "PAYPAL-SECRET");
            case "stripe":
                return new StripeProvider("API-KEY", "STRIPE-SECRET");
            case "mbway":
                return new MBWayProvider("934235069");
            case "visa":
                return new VisaProvider();
            default:
                throw new IllegalArgumentException("Invalid payment provider name: " + providerName);
        }
    }
}
