package fileBrowser_Jan;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Jan Vidal
 *
 */

public class fileBrowser {
	
	public static void imprimeDirectorio(File f) throws IOException {
		
		int index = 0;
		
		if (f.exists()) {
			if (f.isDirectory()) {
				
				System.out.println("Lista de ficheros y directorios del directorio: " + f.getCanonicalPath());
				System.out.println("------------------------------------------------------");
				System.out.println(index + ".- " + "Directorio padre ");
				
				for (File e : f.listFiles()) {
					
					index++;
					
					if (e.isFile()) {
						System.out.println(index + ".- " + e.getName() + " " + e.length());
					}
					if (e.isDirectory()) {
						System.out.println(index + ".- " + e.getName() + " <Directorio>");
					}
				}
				
			} else 
				System.out.println("No es un directorio");
			
		} else 
			System.out.println("No existe el directorio");
		
	}

	private static int menuManager(int numberOfFiles) throws IOException {
		
		boolean isValid;
		int option = -1;
		
		do{
			isValid=true;
			System.out.println("Introduce la opción que desees: (-1 para salir) : ");
			String ent = new BufferedReader(new InputStreamReader(System.in)).readLine();
			
			try {
				
				option=Integer.parseInt(ent);
				
				if(option>numberOfFiles || option < -1) {
					isValid=false;
					System.out.println("Solo se permiten valores entre -1 y " +numberOfFiles);
				}
				
			}catch(NumberFormatException nfe) {
				System.out.println("Solo se aceptan numeros.");
				isValid=false;
			}
			
		}while(!isValid);
		
		return option;
		
	}
	
	
	private static File getDirectory(File nowIn, int directoryNum) {
		
		if(nowIn==null) {
			return File.listRoots()[0];
		}else if(directoryNum==0) {
			if(nowIn.getParentFile() != null && nowIn.getParentFile().canRead())
				return nowIn.getParentFile();
		}else {
			if(nowIn.listFiles()[directoryNum -1].isDirectory() && nowIn.listFiles()[directoryNum -1].canRead())
			return nowIn.listFiles()[directoryNum -1];
		}
			
		return nowIn;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		File f = null;
		int option = Integer.MIN_VALUE;
		
		do {
			f=getDirectory(f, option);
			imprimeDirectorio(f);
			option = menuManager(f.listFiles().length);
			
		}while(option != -1);
		
    }

}
	


