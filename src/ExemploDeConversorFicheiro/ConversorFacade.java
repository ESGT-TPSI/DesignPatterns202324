package ExemploDeConversorFicheiro;

public class ConversorFacade {
	public void ConversorFacede() {
		
	}
	
	//String fileName = "example.txt";
	public PNGFile RealizaConversao(String fileName) {
		String fileExtension = "";
		int dotIndex = fileName.lastIndexOf(".");
		if (dotIndex == -1) {
		} else {
		    fileExtension = fileName.substring(dotIndex + 1);
		    System.out.println("File extension is: " + fileExtension);
		}
		
		var factory = new AdapterFactory();
		var adapter=factory.getAdapter(fileName, fileExtension);

		return adapter.Converte();
	}
}
