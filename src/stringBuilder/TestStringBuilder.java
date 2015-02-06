package stringBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//Creamos nuestro StringBuilder
		StringBuilder sBuilder = new StringBuilder();
		
		//Creamos una variable tipo String para recoger las palabras que introduzcamos con el Scanner
		String palabra = null;
		
		//Mediante elSystem.out.println("Introduce una palabra:"); bucle while(condicion) leemos las palabras que vamos introduciendo 
		System.out.println("Introduce una palabra:");
		while(true){
			
			palabra = in.next();
			if (palabra.equalsIgnoreCase("quit")) break;
			sBuilder.append(palabra+" ");
			
		}
		in.close();
		System.out.println(sBuilder);
		//Con este filtro eliminamos el ultimo espacio que añadimos
		if (sBuilder.length()>0) {
			sBuilder.deleteCharAt(sBuilder.length()-1);
		}
				
		//Le damos la vuelta al sBuilder con el metodo reverse()
		System.out.println("Le damos la vuelta al sBuilder");
		System.out.println(sBuilder.reverse());
		System.out.println(sBuilder);
		//Aqui convertimos el StringBuilder en un String
		String string=sBuilder.toString();
		//Ahora guardamos este String en un array separandolo con el metodo split()
		//de manera que quede cada palabra en un posicion diferente del array
		String[] array=string.split(" ");

		//Comprobamos contenido del array
		for (int i = 0; i < array.length; i++) {
			System.out.println(i+") "+array[i]);
		}
		
		//Hay que convertir a arraylist
		List<String> lista1=new ArrayList<String>();
		for (int i = 0; i < array.length; i++) {
			boolean condicion = Auxiliar.requisitos(array, i);
			System.out.println("En array["+i+"] la condicion es = "+condicion);
			if(condicion){
				System.out.println("Entra en el metodo");
				lista1.add(array[i]);
			}			
		}
		System.out.println("Imprimimos las contraseñas validas: ");
		System.out.println(lista1);
		
		/*Existe un metodo que convierte los array en List directamente
		List<String> lista2=Arrays.asList(array);
		System.out.println(lista2);*/
		
	}
}
