/**
 * 
 */
package parcialII;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * @author David CLavijo
 *
 */
public class main {

	/**
	 * 1)programa que por medio de una clase géenerica con atributos T y U
	 * 
	 * 
	 * 2)un programa con una lista enlazada dobleque permita agregar datos enteros , hasta que se le agrege un número negativo
	 * informar si algun dato se repite y cuantas veces  
	 * 
	 * 
	 */
	public static void main(String[] args) {
	
		ArrayList<generica<String,String>>  lista= new ArrayList<>();
		
		generica<String, String> miObjeto = new generica<String, String>("uno", "otro"); 
		generica<String, String> miObjetoDos = new generica<String, String>("dos", "otrodos"); 
		 
		lista.add(miObjeto);
		lista.add(miObjetoDos);
		
		System.out.println("Punto 1)programa que por medio de una clase géenerica con atributos T y U");
		System.out.println();
		
		System.out.println(lista.toString());
		System.out.println();
		
		System.out.println("Punto 2):un programa con una lista enlazada dobleque permita agregar datos enteros , hasta que se le agrege un número negativo\r\n"
				+ "	  informar si algun dato se repite y cuantas veces  ");
		
		
		doble listaenlazada= new doble(0, null);
		
		
		
		int valor=0;
		String aux= "0";
	do {
		aux=obtenerDato("Ingrese un numero");
		valor=Integer.parseInt(aux);
		if (valor>0) {
			
			listaenlazada.adicionarDato(valor);
		}
	} while (valor>0);
	
	
	
		System.out.println();
		System.out.println(listaenlazada.mostrarLista());
		
	
	}
	

	 private static String obtenerDato(String mensaje){
	        return JOptionPane.showInputDialog(null, mensaje);
	    }
	
}
