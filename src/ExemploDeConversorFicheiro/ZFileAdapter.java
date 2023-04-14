package ExemploDeConversorFicheiro;

public  class ZFileAdapter implements Adapter {
	private File file;
	public ZFileAdapter(ZFile file)
	{
		this.file= file;	
	}
	public PNGFile Converte() {
	    System.out.println("Converteu via Z" + file.fileName);
		return new PNGFile(file.fileName);
	}
	
}
