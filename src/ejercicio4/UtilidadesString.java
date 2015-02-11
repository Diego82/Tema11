package ejercicio4;

public class UtilidadesString {
	/**
	 * Constantes del metodo
	 */
	public static final String[] PREPOSICIONES = { "a", "ante", "bajo", "cabe", "con", "contra", "de", "desde", "durante", "en", "entre", "hacia", "hasta", "para", "por", "según", "sin", "so", "sobre", "tras" };
	public static final String[] ARTICULOS_DETERMINADOS = { "el", "la", "los", "las" };
	public static final String[] ARTICULOS_INDETERMINADOS = { "un", "una", "unos", "unas" };

	//Metodos
	/**
	 * 
	 * @param frase
	 * @return numero de palabras que contiene el texto
	 */
	
	public static int numeroDePalabras(String frase){
		return frase.split(" ").length;
	}
	/**
	 * 
	 * @param Recibe el texto de la constitucion en un String
	 * @return retorna el numero de preposiciones que se encuentran en este texto
	 */
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
	/**
	 * 
	 * @param Recibe el texto de la constitucion en un String
	 * @return retorna el numero de articulos determinados que se encuentran en el texto
	 */
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
	/**
	 * 
	 * @param Recibe el texto de la constitucion en un String
	 * @return retorna el numero de articulos indeterminados que se encuentran en el texto
	 */
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
		return frase.substring(inicio, fin).toUpperCase();
	}
}
