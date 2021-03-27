package fileBrowser_Jan;

import java.io.File;

import java.io.IOException;

public class showFileDetails {


	    public static void main(String[] args) throws IOException {

	        File f = new File("archivos/../archivos/fichero1.txt");

	        System.out.println("Nombre del fichero: " + f.getName());

	        System.out.println("Ruta del fichero: " + f.getPath());

	        System.out.println("Ruta absoluta del fichero: " + f.getAbsolutePath());

	        System.out.println("Ruta canónica del fichero: " + f.getCanonicalPath());

	    }

	}