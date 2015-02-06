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
		List<String> listaNombresEmpiezanPorA = new ArrayList<String>();
		List<String> listaNombresNoTerminanEnVocal = new ArrayList<String>();
		System.out.println("Inicia programa");
		while(in.hasNext()){
			lista.add(in.next());
		}
		in.close();
		System.out.println(lista);
		
		//Con este bucle añadimos los nombres que empiezan por vocal a nuestra lista
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).toLowerCase().matches("^[a].*")) {
				listaNombresEmpiezanPorA.add(lista.get(i));
			}
		}
		System.out.println(listaNombresEmpiezanPorA);
		System.out.println(listaNombresEmpiezanPorA.size());
		
		//En este bucle añadimos los nombres que no terminan en vocal
		for (int i = 0; i < lista.size(); i++) {
			if (!(lista.get(i).toLowerCase().matches(".*[aeiouy]$"))) {
				listaNombresNoTerminanEnVocal.add(lista.get(i));
			}
		}
		System.out.println(listaNombresNoTerminanEnVocal);
		System.out.println(listaNombresNoTerminanEnVocal.size());

	}
}
