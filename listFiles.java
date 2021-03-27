package fileBrowser_Jan;

import java.io.File;

public class listFiles {

	public static void main(String[] args) {

		        //Abre el directorio actual '.'

		        File f = new File(".");

		        System.out.println("Lista de ficheros y directorios del directorio actual");

		        System.out.println("---------------------------------------------------");

		        //recorre la lista de ficheros (recordad que un directorio es un tipo especial de fichero)

		        for (String e : f.list()){

		            System.out.println(e);

		        }

		    }

		
		
	}


