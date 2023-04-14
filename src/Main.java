import Adapter.AdaptadorCirculoParaRetangulo;
import Adapter.Circulo;
import Adapter.Retangulo;
import ExemploDeConversorFicheiro.ConversorFacade;
import Factory.PaymentProviderFactory;
import Singleton.Configuration;
import Facade.FaturacaoService;
import Facade.PagamentoService;
import Facade.PickingService;
import Facade.WebServiceFacade;
import Facade.ATService;
public class Main {
    public static void main(String[] args) {
    	
    	var conv = new ConversorFacade();
    	
    	var jpgTopng = conv.RealizaConversao("ficheiro.jpg");
    	jpgTopng.write();
    	
    	var bmpTopng = conv.RealizaConversao("ficheiro.bmp");
    	bmpTopng.write();
    	
    	var xptoTopng = conv.RealizaConversao("ficheiro.xpto");
    	xptoTopng.write();
    	
     	var zTopng = conv.RealizaConversao("ficheiro.z");
    	zTopng.write();
    	
    	// Ecrã 1
    	/*
    	PagamentoService service1 = new PagamentoService();
    	PickingService service2 = new PickingService();
    	FaturacaoService service3 = new FaturacaoService();
    	ATService ats= new ATService();
    	
        service1.doSomething();
        service2.doSomething();
        service3.doSomething();
        ats.doSomething();
        */
        /*
    	var compra =new WebServiceFacade();
    	compra.ProcessarCompra();
    	
    	// Ecrã 2
    	var compra2 =new WebServiceFacade();
    	compra2.ProcessarCompra();
    	*/
     /*
	     Circulo circulo = new Circulo();
	     Retangulo retangulo = new AdaptadorCirculoParaRetangulo(circulo);
	     retangulo.desenhar(0, 0, 50, 50);
      */
    	
    /*	var pagamento1= new PaymentProviderFactory()
    						.createPaymentProvider("MBWAY");
    	pagamento1.processPayment(100);
    	
    	var pagamento2= new PaymentProviderFactory()
    						.createPaymentProvider("STRIPE");
    	pagamento2.processPayment(3300);
    	
       	var pagamento3= new PaymentProviderFactory()
       							.createPaymentProvider("VISA");
    	pagamento3.processPayment(5000);
    	
    	
    	// Ecrã 1
    	var configurations = new Configuration();
    	
    	// Ecrã 2
    	var configurations2 = new Configuration();
    	
    	// Ecrã 3
    	var configurations3 = new Configuration();
    	
    	// Ecrã 1
    	configurations.setTipoPagamento("VISA");
       	configurations2.setTipoPagamento("XPTO");
       	configurations3.setTipoPagamento("MBWAY");
      	
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
    */
    }
}

/*
 public class WebServiceFacade {
    private Service1 service1;
    private Service2 service2;
    private Service3 service3;

    public WebServiceFacade() {
        service1 = new Service1();
        service2 = new Service2();
        service3 = new Service3();
    }

    public void doSomething() {
        service1.doSomething();
        service2.doSomething();
        service3.doSomething();
    }
}
*/ 
 
