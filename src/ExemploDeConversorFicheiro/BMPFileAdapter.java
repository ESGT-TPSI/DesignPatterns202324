package ExemploDeConversorFicheiro;

public class BMPFileAdapter implements Adapter {
	private File file;
	
	public  BMPFileAdapter(BMPFile file)
	{
		this.file= file;	
	}
	public PNGFile Converte() {
	    System.out.println("Converteu via BMP" + file.fileName);
		return new PNGFile(file.fileName);
	}

	
}
