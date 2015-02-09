package ejercicio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Programa que recoge todas las palabras que hay en la constitucion
 * @author Diego Jesús Torres Peinado
 * @version 1.0
 */

public class TestConstitucion {

	public static void main(String[] args) throws FileNotFoundException {
		//Declaracion de los ArrayList
		List<String> listaConstitucion = new ArrayList<String>();
		StringBuilder lista500palabras = new StringBuilder();
		Scanner in = new Scanner(new File("constitucion.txt"));

		//Aqui recogemos todas las palabras de la constitucion
		while(in.hasNext()){
			listaConstitucion.add(in.next());
		}
		in.close();
		
		//Imprimimos el numero de palabras que tiene la constitucion
		System.out.println("Numero de palabras que tiene la constitucion: "+listaConstitucion.size());
		System.out.println("Palabras que tiene la constitucion: "+listaConstitucion);
		
		//En este bucle quitamos los signos de puntuacion a las palabras
		//y las añadimos a la lista
		for (int i = 0; i < listaConstitucion.size(); i++) {
			if (listaConstitucion.get(i).matches(".*[\\p{Punct}]$")) {				
				String aux = listaConstitucion.get(i).substring(0, (listaConstitucion.get(i).length()-1));
				listaConstitucion.remove(i);
				listaConstitucion.add(i, aux);
			}
			if (listaConstitucion.get(i).matches("^[\\p{Punct}].*")) {
				StringBuilder aux = new StringBuilder(listaConstitucion.get(i));
				listaConstitucion.add(aux.deleteCharAt(0).toString());
			}
		}
/*
		//En este otro eliminamos las palabras que estaban con los signos de puntuacion
		//y que previamente hemos eliminado en el bucle anterior
		for (int i = 0; i < listaConstitucion.size(); i++) {
			if (listaConstitucion.get(i).matches(".*[.,:;\")-]$")) {				
				listaConstitucion.remove(i);
			}
			if (listaConstitucion.get(i).matches("^[.,:;\")-].*")) {
				listaConstitucion.remove(i);
				
			}
		}*/

		System.out.println("Numero de palabras que tiene la constitucion despues del cambio: "+listaConstitucion.size());
		System.out.println("Palabras que tiene la constitucion despues de limpiar signos: "+listaConstitucion);
		
		//Ahora guardamos 500 palabras aleatoriamente en nuestro StringBuilder 
		for (int i = 0; i < 500; i++) {
			int aleatorio = (int) (Math.random()*listaConstitucion.size());
			lista500palabras.append(listaConstitucion.get(aleatorio)+" ");
		}
		System.out.println(lista500palabras);
		
		
	}
}
