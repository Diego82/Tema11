package ejercicio2;


public class ClaveSegura {
	//Atributo de la clcase
	private String clave;

	/**
	 * Constructor
	 * @param recibe un String con la palabra clave que queremos que forme
	 */
	public ClaveSegura(String clave) {
		this.clave = clave;
	}

	/**
	 * @return devuelve el valor de la clave
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * @param Carga la clave que queremos asignar
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}
	/**
	 * 
	 * @return Retorna si cumple los requisitos
	 */
	public boolean requisitos(){
		return tieneMin8Digitos()&&tieneLetraMinuscula()&&tieneLetraMayuscula()
				&&tieneNumero()&&tieneCaracterNoAlfaNumerico();
	}
	/**
	 * 
	 * @return Si tiene o no al menos 8 caracteres
	 */
	//
	private boolean tieneMin8Digitos(){
		return this.clave.length()>7;
	}
	/**
	 * 
	 * @return Si tiene o no al menos una letra en minuscula.
	 */
	private boolean tieneLetraMinuscula(){
		return this.clave.matches(".*[a-z].*");
	}
	/**
	 * 
	 * @return Si tiene o no al menos una letra en mayuscula.
	 */
	private boolean tieneLetraMayuscula(){
		return this.clave.matches(".*[A-Z].*");
	}
	/**
	 * 
	 * @return Si tiene al menos un numero.
	 */
	private boolean tieneNumero(){
		return this.clave.matches(".*[0-9].*");
	}
	/**
	 * 
	 * @return Si tiene al menos un carater no alfanumerico.
	 */
	private boolean tieneCaracterNoAlfaNumerico(){
		return this.clave.matches(".*[\\W].*");
	}
}
