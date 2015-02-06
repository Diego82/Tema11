package ejercicio3;

import java.util.Scanner;

public class LecturaFichero {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String texto = in.next();
		StringBuilder lista = new StringBuilder();
		int contador = 0;
		System.out.println("Inicia programa");
		while(true){
			lista.append(in.next());
			contador++;
			if(contador>10){
				break;
			}
		}
		in.close();
		System.out.println(lista);

	}

}
