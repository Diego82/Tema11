package ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LecturaFichero {

	public static void main(String[] args)throws FileNotFoundException {
		Scanner in = new Scanner(new File("nombres_mujer.txt"));
		List<String> lista = new ArrayList<String>();
		System.out.println("Inicia programa");
		while(in.hasNext()){
			lista.add(in.next());
		}
		in.close();
		System.out.println(lista);

	}

}
