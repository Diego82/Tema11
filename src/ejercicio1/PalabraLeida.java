package ejercicio1;

public class PalabraLeida {
	//Atributo
	private String valor;
	/**
	 * @param valor
	 */
	public PalabraLeida(String valor) {
		this.valor = valor;
	}
	/**
	 * 
	 * @return devuelve la longitud de la palabra introducida
	 */
	public int numeroDeLetras(){
		return this.valor.length();
	}
	
	public boolean empiezaPorVocal(){
		return this.valor.toLowerCase().matches("^[aeiouáéíóú].*");
	}
	
	public boolean acabaEnVocal(){
		return this.valor.toLowerCase().matches(".*[aeiouáéíóú]$");
	}
	
	public int numeroDeVocales(){
		int contador = 0;
		char[] string = this.valor.toLowerCase().toCharArray();
		for (int i = 0; i < string.length; i++) {
			if(string[i]=='a'||string[i]=='e'||string[i]=='i'||string[i]=='o'||string[i]=='u'){
				contador++;
			}
		}
		return contador;
	}
	
	public boolean contieneH(){
		return this.valor.toLowerCase().contains("h");
	}
	
	public boolean esUnPalindromo(){
		return new StringBuilder(this.valor).reverse().toString().equalsIgnoreCase(this.valor);	
	}
	
	public boolean esIgual(String palabra){
		return this.valor.toLowerCase().equalsIgnoreCase(palabra);
	}
}
