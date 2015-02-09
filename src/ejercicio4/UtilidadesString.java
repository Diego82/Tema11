package ejercicio4;

public class UtilidadesString {
	public static final String[] PREPOSICIONES = { "a", "ante", "bajo", "cabe", "con", "contra", "de", "desde", "en", "entre", "hacia", "hasta", "para", "por", "según", "sin", "sobre", "tras" };
	public static final String[] ARTICULOS_DETERMINADOS = { "el", "la", "los", "las" };
	public static final String[] ARTICULOS_INDETERMINADOS = { "un", "una", "unos", "unas" };

	//Metodos
	
	public static int numeroDePalabras(String frase){
		String[] array = frase.split(" ");
		return array.length;
	}
	
	public static int numeroDePreposiciones(String frase){
		int contador = 0;
		String[] array = frase.split(" ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < PREPOSICIONES.length; j++) {
				if (array[i].equalsIgnoreCase(PREPOSICIONES[j])) 
					contador++;
			}
		}
		return contador;
	}
	
	public static int numeroDeArticulosDeterminados(String frase){
		int contador = 0;
		String[] array = frase.split(" ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < ARTICULOS_DETERMINADOS.length; j++) {
				if (array[i].equalsIgnoreCase(ARTICULOS_DETERMINADOS[j])) 
					contador++;
			}
		}
		return contador;
	}
	
	public static int numeroDeArticulosIndeterminados(String frase){
		int contador = 0;
		String[] array = frase.split(" ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < ARTICULOS_INDETERMINADOS.length; j++) {
				if (array[i].equalsIgnoreCase(ARTICULOS_INDETERMINADOS[j])) 
					contador++;
			}
		}
		return contador;
	}
	public static String devolverMayuscula(int inicio, int fin, String frase){
		return new StringBuilder(frase.substring(inicio, fin).toUpperCase()).toString();
	}
	
	
	
	
	
	
}
