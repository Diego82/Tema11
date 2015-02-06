package diapositivas;

import java.util.Scanner;

//Ejercicio de practica 1
public class Practica1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer con Scanner una linea completa
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce una frase:");
		String frase = new String(in.nextLine());
		in.close();
		System.out.println(frase);
		
		//Indicar si la linea tiene algun numero
		System.out.println("Contiene algun numero? "+frase.matches(".*[0-9]+.*"));
		
		//Indicar cuantas palabras contienen numero
		System.out.println("cuantos palabras contienen numeros en la frase?");
		int contador = 0;
		String[] array = frase.split(" ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(i+") "+array[i]);
			if (array[i].matches(".*[0-9]+.*")){
				contador++;
			}
		}
		System.out.println("Palabras que contienen numero:"+contador);
		
		//Indica cuantos numeros hay en esta frase
		contador = 0;
		for (int i = 0; i < frase.length(); i++) {
			if (Character.isDigit(frase.charAt(i))) {
				contador++;
			}
		}
		System.out.println("La frase contiene "+contador+" numeros");
		
		
		//Indicar cuantas palabras empiezan por vocal
		contador = 0;
		String aux = null;
		for (int i = 0; i < array.length; i++) {
			aux = array[i].toLowerCase();
			if (aux.startsWith("a")||aux.startsWith("e")
				||aux.startsWith("i")||aux.startsWith("o")
				||aux.startsWith("u")) {
				contador++;
			}
		}
		System.out.println("el numero de palabras que empieza por vocal es:"+contador);
		//misma operacion usando expresiones regulares
		contador = 0;
		System.out.println("Utilizacion con las expresiones regulares ");
		for (int i = 0; i < array.length; i++) {
			if (array[i].matches("[aeiouAEIOU].*")){
			contador++;
			}
		}
		System.out.println("el numero de palabras que empieza por vocal es:"+contador);
	}
}
