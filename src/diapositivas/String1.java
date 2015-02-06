package diapositivas;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hola Mundo";
		String s2 = "Hola Mundo";
		String s3 = new String ("Hola Mundo");
		String s4 = new String(new char[]{'H','o','l','a',' ','M','u','n','d','o'});
		//Usamos el comparador ==
		//con esto comparamos referencias
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s3 == s4);
		//Usamos el metodo equals()
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s3.equals(s4));
		//Usamos el metodo compareTo()
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s3.compareTo(s4));
		System.out.println(s1.compareTo(s2.toUpperCase()));
		System.out.println(s2);
		//Y ahora que??
		s2.toUpperCase();
		System.out.println(s2);
		//Si quiero cambiarlo tendria que hacer lo siguiente
		String s2b = s2.toUpperCase();
		System.out.println(s2b);	//El nuevo String si estara en mayuscula
		System.out.println(s1.startsWith("H"));
		System.out.println(s1.startsWith("Hola  "));
		System.out.println(s1.endsWith("mundo  "));
		System.out.println(s1.endsWith("mundo  ".trim()));
		//Comprobamos los metodos length, concat y chartAt
		System.out.println("Comprobamos los metodos length, concat y chartAt");
		System.out.println(s1.length()); //nos devuelve la longitud del String
		System.out.println(s1.concat(" ").concat("aqui estamos")); // concatena las cadenas. Es mas util es operador +
		for (int i = 0; i < s1.length(); i++) {
			System.out.print(s1.charAt(i)+" ");
		}
		System.out.println();
		//Aqui le damos la vuelta
		for (int i = s1.length()-1; i >= 0; i--) {
			System.out.print(s1.charAt(i));
			
		}
		System.out.println();
		String nuevaPalabra = new String();
		for (int i = 0; i < s1.length(); i++) {
		
			if (s1.charAt(i) == ' '){
				nuevaPalabra = s1.substring(i+1);
			}
		}
		System.out.println(nuevaPalabra);
		
		//comprobamos el metodo replace
		System.out.println(s1.replace('o','O'));
		System.out.println(s1);
		System.out.println(s1.replace("Hola","Que feo que eres"));
		System.out.println(s1.replaceAll("[aeiou]","*")); //Cambia todas las letras que encuentra de la secuencia que le pasamos
		System.out.println(s1.replaceFirst("[aeiou]","*")); //Cambia la primera letra que encuentra de toda la secuencia
		String[] array = s1.split(" ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(i+") "+array[i]);
		}
		
	}
}
