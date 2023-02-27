package testhashmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		HashMap<Integer, String> listaClientes = new HashMap<Integer, String>();
		
		listaClientes.put(01, "Hercho");
		listaClientes.put(02, "Fercho");
		//System.out.println(listaClientes.get(02));System.out.println(menuInicio());
		agregarUsuario(listaClientes);
		agregarUsuario(listaClientes);
		
		
	}

	
	 static public String menuInicio() {
		 String mensaString=("Ingrese la opcions 	\n 1.Crear cuenta.  \n 2.Ingresar. ");
	 
		 
		 return  mensaString;
	 }

		public static void agregarUsuario(HashMap listaClientes) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Ya tenemos el "lector"
			System.out.println("Ingrese un nombre: ");
			String nombre = br.readLine();

			listaClientes.put(listaClientes.size()+1,nombre);
			
			
			/*for (int j = 1; j < listaClientes.size()+1; j++) {
				
				System.out.print(listaClientes.get(j)+" ");
				System.out.println(listaClientes.toString());
			}
		*/		//tenemos 
			System.out.println(listaClientes.toString());
			System.out.println();
		}}
