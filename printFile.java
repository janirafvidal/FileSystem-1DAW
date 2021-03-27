package fileBrowser_Jan;

import java.io.BufferedReader;

import java.io.File;

import java.io.IOException;

import java.io.InputStreamReader;

public class printFile {

	    private static String nombreDeFichero() throws IOException {

	         String fichero = new BufferedReader(new InputStreamReader(System.in)).readLine();

	         return fichero;

	    }

	    private static void imprimirFichero(File e) {

	         //No imprime los ficheros/directorios ocultos

	        if (!e.isHidden()) {

	            if (e.isFile()) {

	                System.out.println(e.getName() + " " + e.length());

	            }

	            if (e.isDirectory()){

	                System.out.println(e.getName() + " <Directorio>");

	            }

	        }

	    }

	    private static void imprimirDirectorio(File f) throws IOException {

	        if (f.exists()) {

	            if (f.isDirectory()) {

	                System.out.println("Lista de ficheros y directorios del directorio: " + f.getCanonicalPath());

	                System.out.println("---------------------------------------------------");

	                for (File e : f.listFiles()){

	                    imprimirFichero(e);

	                }

	            } else {

	                System.out.println("No es un directorio");

	            }

	        } else {

	            System.out.println("No existe el directorio");

	        }

	    }

	    public static void main(String[] args) throws IOException {

	        System.out.println("Introduce un directorio:");

	        String ent = nombreDeFichero();

	        File f = new File(ent);

	        try {

	            imprimirDirectorio(f);

	        } catch(IOException e) {

	            System.out.println("No existe el directorio");

	        }

	    }

	}