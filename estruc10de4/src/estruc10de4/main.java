/**
 * 
 */
package estruc10de4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lenovo
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String Desicion="0";
		Desicion=leerNumConsola("Ingrese un número: ");
		ArrayList<libro<T, U, V>> nombreArrayList = new ArrayList<String>();

		
		
		switch (Desicion) {
		case "1":
			System.out.println("Cargar datos");
			
			break;

		case "2":
			System.out.println("Consulta general");
		
			break;
		case "3":
		System.out.println("Consulta precios al publico ");
			
			break;
		case "4":
			System.out.println("Salir");
			
		
		}
	}

	
	
	
	
	static String leerNumConsola(String mensaje) {
		System.out.println(mensaje);
		String nombre;
		Scanner teclado = new Scanner(System.in);
		nombre = teclado.nextLine();
		System.err.println(nombre);
		return nombre;
	}
	
	
	
	
	
}

