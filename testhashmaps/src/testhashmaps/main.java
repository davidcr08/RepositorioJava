package testhashmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class main {
	public static HashMap<Integer, String> listaClientes= new HashMap<Integer, String>();

	private static final Scanner SCANNER = new Scanner(System.in);
	public static void main(String[] args) throws IOException {

		
		
		// declaracion HashMap
		/*
		 * 
		 */
		listaClientes.put(01, "Hercho");
		listaClientes.put(02, "Fercho");
		listaClientes.put(03, "Adolfo");
		listaClientes.put(04, "Guderian");
		System.out.println("Consulta -->"+listaClientes.keySet()+"  tamaño "+ listaClientes.size());

		// System.out.println(listaClientes.get(02));
		//System.out.println(menuInicio());
		// agregarUsuario(listaClientes);

		listaClientes.put(02, "nuevos"+"letras");
		
	//	listaClientes.remove("Adolfo");
	//	System.out.println(listaClientes.toString());
	//	System.out.println("Prinera iteracion-->"+listaClientes.keySet()+"  tamaño "+ listaClientes.size());

		/*
		 * Keyset devuelve un array para recorrer las posiciones 
		 */
		
		
		
	//	System.out.println("actualizado--> "+listaClientes.keySet()+"  tamaño "+ listaClientes.size());

		//System.out.println(menuInicio());

		
		
	//	borrarUsuario();
		menuInicio();
		
	}

	
	static public void menuInicio()throws IOException {
		String mensaString = ("Ingrese la opcions 	\n 1.Crear cuenta.  \n 2.Borrar usuario. \n 3.Estadisticas  ");

		
		System.out.println(mensaString);
		String Desicion = SCANNER.nextLine();

		switch (Desicion) {
		case "1":
			System.out.println("Agregar Usuario");
			agregarUsuario();
			break;

		case "2":
			System.out.println("Borrar usuario");
			borrarUsuario();
			break;
		case "3":
			System.out.println("Estadisticas");
			estadisticas();
			
			menuInicio();
			break;
			
			

		}
			
	}

	public static void agregarUsuario() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Ya tenemos el "lector"
		System.out.println("Ingrese un nombre: ");
		String nombre = br.readLine();

		listaClientes.put(listaClientes.size() + 1, nombre);

		/*
		 * for (int j = 1; j < listaClientes.size()+1; j++) {
		 * 
		 * System.out.print(listaClientes.get(j)+" ");
		 * System.out.println(listaClientes.toString()); }
		 */ // tenemos
		System.out.println(listaClientes.toString());
		System.out.println();
		System.out.println("■--Volveras al menu--■"+ "\n");
		menuInicio();
	}
	
	
	
	public static void borrarUsuario() throws IOException {
		System.out.println("Ingrese el nombre del ususario a borrar: ");
		String nombreAborrar = SCANNER.nextLine();
		
		System.out.println("INFO sana" +listaClientes.get(nombreAborrar).toString());
		listaClientes.remove(nombreAborrar);
		System.out.println("INFO " +listaClientes.get(nombreAborrar));
		
		menuInicio();
	}
	
	
	
	public static void estadisticas() throws IOException {
		System.out.println("Consulta -->"+listaClientes.keySet()+"  tamaño "+ listaClientes.size());

	}
}
