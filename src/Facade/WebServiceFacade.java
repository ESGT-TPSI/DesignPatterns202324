package Facade;

public class WebServiceFacade {
	  	private PagamentoService service1;
	    private PickingService service2;
	    private FaturacaoService service3;
	    private ATService at;

	    public WebServiceFacade() {
	        service1 = new PagamentoService();
	        service2 = new PickingService();
	        service3 = new FaturacaoService();
	        at= new ATService();
	    }

	    public void ProcessarCompra() {
	        service1.doSomething();
	        service2.doSomething();
	        service3.doSomething();
	        at.doSomething();
	    }
}
