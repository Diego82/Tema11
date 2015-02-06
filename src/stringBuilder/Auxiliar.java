package stringBuilder;

public class Auxiliar {
	//Para que devuelva true el metodo debe cumplir las siguientes caracteristicas
	//Tener al menos un caracter en mayuscula
	//Tener al menos un caracter en minuscula
	//Tener un caracter numerico
	//Tener al menos un caracter no alfanumerico
	//Tener al menos 8 letras
	public static boolean requisitos(String aux[], int i){
		return aux[i].length()>8 && aux[i].matches(".*[a-z]+.*") &&
				aux[i].matches(".*[A-Z]+.*") &&  aux[i].matches(".*[0-9]+.*") &&
				aux[i].matches(".*[\\W]+.*");
	}
}
