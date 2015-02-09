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
		String listaPalabrasConstitucion = "";
		Scanner in = new Scanner(new File("constitucion.txt"));
		int posicion = 0;

		//Aqui recogemos todas las palabras de la constitucion
		while(in.hasNext()){
			String aux = in.next();
			//Añade a la lista las palabras que no tienen signos de puntuacion
			if (!(aux.matches(".*[\\p{Punct}]$")||aux.matches("^[\\p{Punct}].*")))
				listaConstitucion.add(aux);
			//Añade a la lista las palabras que tienen signos de puntuacion al final
			if (aux.matches(".*[\\p{Punct}]$"))
				listaConstitucion.add(aux.substring(0, aux.length()-1));
			//Añade a la lista las palabras que tienen signos de puntuacion al principio
			if (aux.matches("^[\\p{Punct}].*"))
				listaConstitucion.add(aux.substring(1, aux.length()));
			listaPalabrasConstitucion+= listaConstitucion.get(posicion)+" ";
			posicion++;
			
		}
		in.close();
		//Imprimimos el numero de palabras que tiene la constitucion
		//System.out.println("Palabras que tiene la constitucion: "+listaConstitucion);
		System.out.println(listaPalabrasConstitucion);
		//Ahora guardamos 500 palabras aleatoriamente en nuestro StringBuilder 
		for (int i = 0; i < 500; i++) {
			int aleatorio = (int) (Math.random()*listaConstitucion.size());
			lista500palabras.append(listaConstitucion.get(aleatorio)+" ");
		}
		System.out.println("Lista de palabras aleatorias: "+lista500palabras);
		System.out.println("Numero de palabras que tiene la constitucion: "+UtilidadesString.numeroDePalabras(listaPalabrasConstitucion));
		System.out.println("Numero de preposiciones: "+UtilidadesString.numeroDePreposiciones(listaPalabrasConstitucion));
		System.out.println("Numero de articulos determinados: "+UtilidadesString.numeroDeArticulosDeterminados(listaPalabrasConstitucion));
		System.out.println("Numero de articulos indeterminados: "+UtilidadesString.numeroDeArticulosIndeterminados(listaPalabrasConstitucion));
		System.out.println("Frase escrita en mayuscula: "+UtilidadesString.devolverMayuscula(100, 150, listaPalabrasConstitucion));
	}
}
