/**
 * 
 */
package disclista;

/**
 * @author DAVD
 *
 */
public class main {

	public static void main(String[] args) {
		int cantidadSlots = 8;
	//	int elementoslista[] = new int[cantidadSlots];
	//System.out.println(obtenerCardinalxNum(5, 0));
		
		//agregar sub grupos
	System.out.println(combinatoriamax(5));
	crearArray(5);

	}

	static public int cantidadnum(int elementoslista[]) {
		int cantidad = 0;
		for (int i = 0; i < elementoslista.length; i++) {
			if (elementoslista[i] != 0) {
				cantidad++;
			}
		}

		return cantidad;
	}

	static public int obtenerCardinalxNum(int valor, int iteracion) {
		if (0 < valor) {
			System.out.println(valor);
			return valor * obtenerCardinalxNum(valor - 1, iteracion + 1);

		}
		return 1;

	}
	
	static public double combinatoriamax(int exponente) {
		
		return Math.pow(2, exponente);
	}
	
	
	static void crearArray(int cantidad0) {
		
		String elementoslista[] = new String[8];
		elementoslista[0]="s";
		elementoslista[1]="8";
		elementoslista[2]="s";
		elementoslista[3]="9";
		elementoslista[4]="s";
		elementoslista[5]="5";
		elementoslista[6]="g";
		elementoslista[7]="E";
		System.out.print("(");
		for (int i = 0; i < elementoslista.length; i++) {
			System.out.print(","+elementoslista[i]);
		}
		System.out.print(")");

	}

}
