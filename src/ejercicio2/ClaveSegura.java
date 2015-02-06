package ejercicio2;

public class ClaveSegura {
	private String clave;

	/**
	 * @param clave
	 */
	public ClaveSegura(String clave) {
		this.clave = clave;
	}

	/**
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * @param clave the clave to set
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
