package fileBrowser_Jan;

import java.io.BufferedReader;

import java.io.File;

import java.io.IOException;

import java.io.InputStreamReader;

public class showContentFromFile {

		    public static void main(String[] args) throws IOException {

		        System.out.println("Introduce un directorio:");

		        String ent = new BufferedReader(new InputStreamReader(System.in)).readLine();

		        File f = new File(ent);

		        System.out.println("Lista de ficheros y directorios del directorio: " + ent);

		        System.out.println("---------------------------------------------------");

		        for (String e : f.list()) {

		            System.out.println(e);

		        }

		    }
		
	}


