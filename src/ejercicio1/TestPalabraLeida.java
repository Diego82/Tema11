package ejercicio1;

import java.util.Scanner;

public class TestPalabraLeida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pasamos nuestra palabra mediante el Scanner
		Scanner in = new Scanner(System.in);
		String palabra = in.next();		
		PalabraLeida s1 = new PalabraLeida(palabra);
		in.close();
		//Ahora comprobamos todos los metodos
		System.out.println("¿Empieza por vocal?"+s1.acabaEnVocal());
		System.out.println("¿Termina en vocal?"+s1.empiezaPorVocal());
		System.out.println("Numero de letras que contiene: "+s1.numeroDeLetras());
		System.out.println("Numero de vocales que contiene: "+s1.numeroDeVocales());
		System.out.println("¿Contiene la letra h? "+s1.contieneH());
		System.out.println("¿Es un palindromo? "+s1.esUnPalindromo());
		if (palabra.length()>0) {
			String aux = args[0];
			System.out.println("¿Esta palabra coincide con "+palabra+"? "+s1.esIgual(aux));
		}		
	}
}
