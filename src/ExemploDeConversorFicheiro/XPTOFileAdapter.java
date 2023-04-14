package ExemploDeConversorFicheiro;

public  class XPTOFileAdapter implements Adapter {
	private File file;
	public XPTOFileAdapter(XPTOFile file)
	{
		this.file= file;	
	}
	public PNGFile Converte() {
	    System.out.println("Converteu via XPTO" + file.fileName);
		return new PNGFile(file.fileName);
	}
	
}
