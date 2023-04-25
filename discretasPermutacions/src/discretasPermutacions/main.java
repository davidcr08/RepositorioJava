/**
 * 
 */
package discretasPermutacions;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author lenovo
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	    ArrayList<String> ListaUno = new ArrayList<>();
	    ListaUno.add("A");
	    ListaUno.add("B");
	    ListaUno.add("C");
	    ListaUno.add("D");
	    ArrayList<String> ListaDos = new ArrayList<>();
	    ListaDos.add("Campeon");
	    ListaDos.add("Subcampeon");
	    

		
		System.out.println(permutar(4, 2));
		
		 mostraPermutaciones(ListaUno, ListaDos);
	}

	
	
	public static double permutar(int N, int r) {
		double permutacio=0;
		
		permutacio=(valorDiferenciual(N))/valorDiferenciual(N-r);
		
		
		return  permutacio;
	}
	
	
	
	public static int valorDiferenciual(int valor) {
		
		int nuevo = 0;
		if (valor > 0) {

			nuevo = valor * valorDiferenciual(valor - 1);

		}else {
			 return 1;
		}
		
		return nuevo;
	}
	
	
	
	public static void mostraPermutaciones(ArrayList< String> listaUno , ArrayList< String> listaDos) {
	
		for (int i = 0; i < listaUno.size(); i++) {
			for (int j = 0; j <listaDos.size(); j++) {
			 
				if(i==j) {
					
				}else {
					System.out.print(listaUno.get(i)+" "+ listaDos.get(j));
					
				}
				
			}
			System.out.println("  ");
			
		}
		
	}
	
}
