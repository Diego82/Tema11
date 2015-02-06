package ejercicio2;

public class TestClaveSegura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String caracteres = "aAbBcCdDeEfFgGhHiIjJkK0123456789¿?()=@.:,;!¡&{}lLmMnNoOpPqQrRsStTuUvVwWxXyYzZ0123456789¿?()=@.:,;!¡&{}";
		StringBuilder clave = new StringBuilder();
		ClaveSegura claveSegura = new ClaveSegura(null);
		ClaveSegura aux = new ClaveSegura(null);
		int contador = 0;
		//Aqui asignamos la clave
		while (true) {
			int longitudClave = (int) (Math.random()*20);
			for (int i = 0; i < longitudClave; i++) {
				int pos = (int) (Math.random()*caracteres.length());
				clave.append(caracteres.charAt(pos));	
			}
			aux.setClave(clave.toString());
			
			if (aux.requisitos()) {
				break;
			}
			contador++;
		}
		claveSegura.setClave(clave.toString());
		System.out.println("Clave segura generada es: "+claveSegura.getClave());
		System.out.println("contador: "+contador);
	}

}
