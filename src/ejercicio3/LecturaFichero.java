package ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LecturaFichero {

	public static void main(String[] args)throws FileNotFoundException {
		
		List<String> lista = new ArrayList<String>();
		List<String> listaNombresEmpiezanPorA = new ArrayList<String>();
		List<String> listaNombresNoTerminanEnVocal = new ArrayList<String>();
		List<String> listaNombresMasCortos = new ArrayList<String>();
		List<String> listaNombresMasLargos = new ArrayList<String>();
		List<String> listaNombresEmpiezanPor2LetrasArgs = new ArrayList<String>();
		int contador = 0;
		int tamanoMenor = Integer.MAX_VALUE;
		int tamanoMayor = Integer.MIN_VALUE;
		
		//Recogemos los nombres del archivo mediante esta lista
		Scanner in = new Scanner(new File("nombres_mujer.txt"));
		
		//Recogemos los nombres de la mediante el comando cat
		//Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			lista.add(in.next());

			//Con este bucle añadimos los nombres que empiezan por vocal a nuestra lista
			if (lista.get(contador).matches("^[a].*"))
				listaNombresEmpiezanPorA.add(lista.get(contador));

			//En este bucle añadimos los nombres que no terminan en vocal
			if (!(lista.get(contador).matches(".*[aeiouy]$")))
				listaNombresNoTerminanEnVocal.add(lista.get(contador));
			
			//Hayamos la longitud del nombre mas largo y mas corto
			//Mas corto
			if (tamanoMenor>lista.get(contador).length())
				tamanoMenor = lista.get(contador).length();
			//Mas largo
			if (tamanoMayor<lista.get(contador).length())
				tamanoMayor = lista.get(contador).length();
			contador++;
		}
		in.close();
		System.out.println("Listado de nombres de mujeres:\n"+lista);
		System.out.println("Número de nombres:"+lista.size());
		
		if (args.length == 0) {
			System.out.println("Lista de nombres que empiezan por a:\n"+listaNombresEmpiezanPorA);
			System.out.println("Numero de nombres: "+listaNombresEmpiezanPorA.size());
			System.out.println("Lista de nombres que no terminan en vocal:\n"+listaNombresNoTerminanEnVocal);
			System.out.println("Numero de nombres:\n"+listaNombresNoTerminanEnVocal.size());
			
			//Ahora vamos a hacer una lista con los nombres mas cortos y mas largos.
			for (int i = 0; i < lista.size(); i++) {
				if (tamanoMenor==lista.get(i).length()) {
					listaNombresMasCortos.add(lista.get(i));
				}
				if (tamanoMayor==lista.get(i).length()) {
					listaNombresMasLargos.add(lista.get(i));
				}
			}
			//Imprimimos los valores de los nombres mas largos y mas cortos
			System.out.println("El nombre mas corto tiene "+tamanoMenor+" letras");
			System.out.println("El nombre mas largo tiene "+tamanoMayor+" letras");
			//Imprimimos los nombres mas largos y mas cortos
			System.out.println("Listado con los nombres mas cortos:\n"+listaNombresMasCortos);
			System.out.println("Listado con los nombres mas largos:\n"+listaNombresMasLargos);
		}
		
		//Si se encuentra un argumento en la linea de comandos el programa entra aqui
		else {
			String argumento = args[0];
			boolean existe = false;
			//Recorremos la lista para ver si encontramos este nombre en nuestra lista
			for (int i = 0; i < lista.size(); i++) {
				//Si lo encontramos entrara en este if y nos dira que el nombre introducido coincide
				if (lista.get(i).equalsIgnoreCase(argumento)) {
					System.out.println("El nombre introducido: "+argumento+", coincide con uno de la lista");
					existe = true;
					break;
				}
			}
			//Si no aparece creara una nueva lista con todos los nombres
			//que coincidan con las dos primeras letras de este
			if (!existe){
				//Si el argumento recogido solo tiene una letra entra en este if
				if (argumento.length()<2) {
					System.out.println("No existe ningun nombre que se llame "+argumento);
					StringBuilder aux = new StringBuilder(argumento);
					//Recorremos la lista asignando los nombres que empiezan por esta letra a la nueva lista 
					for (int j = 0; j < lista.size(); j++) {
						if (lista.get(j).startsWith(aux.toString()))
							listaNombresEmpiezanPor2LetrasArgs.add(lista.get(j));
					}
					System.out.println("Los nombres que empiezan por "+aux+" son los siguientes: "+listaNombresEmpiezanPor2LetrasArgs);
				}
				
				//Si el argumento recogido tiene 2 letras entramos en este else
				else {
					//Primero creamos un nuevo String con las 2 primeras letras del nombre introducido
					StringBuilder aux = new StringBuilder();
					for (int j = 0; j < 2; j++)
						aux.append(argumento.charAt(j));
					
					//Recorremos la lista asignando los nombres que empiezan por las dos primeras letras a la nueva lista
					for (int j = 0; j < lista.size(); j++) {
						if (lista.get(j).startsWith(aux.toString()))
							listaNombresEmpiezanPor2LetrasArgs.add(lista.get(j));
					}
					System.out.println("Los nombres que coinciden con el nombre que has introducido son los siguientes:\n"+listaNombresEmpiezanPor2LetrasArgs);
				}
			}			
		}
	}
}
