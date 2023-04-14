package ExemploDeConversorFicheiro;



public class AdapterFactory {
    public static Adapter getAdapter(String filename, String fileextention) {
    	switch (fileextention) {
            case "bmp":
        		var bmp= new BMPFile(filename);
                return new BMPFileAdapter(bmp);
            case "jpg":
            	var jpg= new JPGFile(filename);
                return new JPGFileAdapter(jpg);

            case "xpto":
            	var xpto= new XPTOFile(filename);
                return new XPTOFileAdapter(xpto);
            case "z":
            	var z= new ZFile(filename);
                return new ZFileAdapter(z);
            default:
                throw new IllegalArgumentException("Invalid payment provider name: ");
        }
    }
}
