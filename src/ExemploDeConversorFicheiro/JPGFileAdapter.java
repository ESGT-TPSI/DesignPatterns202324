package ExemploDeConversorFicheiro;

public  class JPGFileAdapter implements Adapter {
	private File file;
	public JPGFileAdapter(JPGFile file)
	{
		this.file= file;	
	}
	public PNGFile Converte() {
	    System.out.println("Converteu via JPG" + file.fileName);
		return new PNGFile(file.fileName);
	}
	
}
