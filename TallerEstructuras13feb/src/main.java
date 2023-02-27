import java.util.Iterator;

/**
 * 
 */

/**
 * @author Davidcr
 * 
 *
 */
public class main {

	public static void main(String[] args) {

		// System.out.println(sumarnaturales(5));
		// System.out.println(sumarnaturalesHastaN(9));
         int plantilla[][] =new int[5][5];
		// inicializarIDbuses(plantilla);
		// llenartabla(plantilla);
		// pordiaBusMasPasajeros(3, plantilla);
		// Punto 1 desdeNhasta1(8);
		// sumarnaturalesHastaNRecursiva(45, 0);
		// lecturaypotnecia(2,4,0);
	     //  inicializarCuarto(5);
		inicializarIDbusesRecursiva(plantilla, 0);

	}
///////////////////////////////PUNTOS///////////////////////////////////////////////////////////////////////////////////
	/*
	 * Punto 1 Construya una función para sumar los números naturales hasta N de
	 * forma recursiva. EL dato N pasará como parámetro.
	 */

	static public int sumarnaturalesHastaN(int valorARecibir) {

		int valorsuma = 0;

		for (int i = 0; i < valorARecibir; i++) {
			valorsuma = valorsuma + i;
		}

		return valorsuma;
	}

	int valorDelaSuma = 0;

	static public void sumarnaturalesHastaNRecursiva(int valorARecibir, int valorDelaSuma) {

		if (valorDelaSuma < valorARecibir) {
			System.out.println("-->" + valorDelaSuma);
			valorDelaSuma = valorDelaSuma + valorDelaSuma + 1;

			sumarnaturalesHastaNRecursiva(valorARecibir, valorDelaSuma);

		} else {
			System.out.println("Es :" + valorARecibir);

		}

	}

	public int suma(int mayor) {
		return sumaP(mayor, 0, 0);
	}

	private int sumaP(int mayor, int suma, int numero) {
		if (numero < mayor) {
			suma += numero;
			return sumaP(mayor, suma, numero + 1);
		} else {
			return suma;
		}
	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////	

	/*
	 * Punto 2 Crear una función que imprima los dígitos desde N hasta 1. Se debe
	 * pasar como parámetro el número N
	 */

	static public void desdeNhasta1(int valorDado) {

		if (valorDado > 1) {
			System.out.println("-->" + valorDado);
			desdeNhasta1(valorDado - 1);
		} else {
			System.out.println("Es 1");
		}

	}

///////////////////////////////////////////////BUCEFALOS//////////////////////////////////////////////////////////

	/*
	 * Punto buses
	 */

	// 5x5
//	fila 0 codifo del bus  fila 1 cantidad pasajeros   fila 2 cantidad pasajeros día 2 

	static void inicializarIDbuses(int plantilla[][]) {
		for (int i = 0; i < plantilla.length; i++) {
			plantilla[i][1] = i + 10;
			System.out.print("ID: " + plantilla[i][1] + " ");

		}
		System.out.println();
	}

	static void llenartabla(int plantilla[][]) {

		for (int j = 1; j < plantilla[1].length; j++) {
			for (int i = 0; i < plantilla.length; i++) {
				plantilla[j][i] = (int) (Math.random() * (200 - 50 + 1) + 50);

				System.out.print("  Casilla: " + j + " " + i + " =" + +plantilla[j][i]);
			}
			System.out.println();
		}
	}

	// fila desde la 1 hasta la limite
	static int cantidadmax = 0;
	static int cantidadmaxBusID = 0;
	static int contador = 0;

	static void pordiaBusMasPasajeros(int dia, int plantilla[][]) {
		if (dia > 1 && dia < 5) {
			for (int i = 0; i < plantilla.length; i++) {
				if (plantilla[dia][i] > cantidadmax) {
					cantidadmax = plantilla[dia][i];
					cantidadmaxBusID = plantilla[0][i];
				}
			}
		}
		System.out.println();
		System.out.println("El mayor valor es: " + cantidadmax + " Del día: " + dia);
		System.out.println("Del bus con la id: " + cantidadmaxBusID);
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	/*
	 * 3. Cre un metodo que lea un número y luego lea la pontencia a la cual desea
	 * elevarla e imprima el resultado
	 */

	public static int lecturaypotnecia(int numero, int potencia, int contador) {
		if (contador <= potencia) {
			System.out.println(numero);
			numero = numero * numero;

			return lecturaypotnecia(numero, potencia--, contador++);
		} else {

			return 1;
		}

	}

	/*
	 * 4. Cree un método que permita recorrer y mostrar un array ingresado
	 * 
	 * 
	 */

	public static void inicializarCuarto(int tamaArreglo) {
		int arreglo[] = new int[5];
		arreglo[0] = 5;
		arreglo[1] = 8;
		arreglo[2] = 4;
		arreglo[3] = 6;
		arreglo[4] = 9;
		recorrerArregloRecur(arreglo, 0);
		encontrarMayorRecursuiva(0, 0, arreglo);
		encontrarMenorRecursuiva(0, 99, arreglo);
	}

	public static void recorrerArregloRecur(int arreglo[], int contador) {
		if (arreglo.length > contador) {
			System.out.print(" --<" + arreglo[contador] + ">--");
			recorrerArregloRecur(arreglo, contador + 1);
		}
	}

	/*
	 * 4. Cree un método que permita encontrar el mayor y el menor número de un
	 * arreglo de forma recursiva
	 */
	public static void encontrarMayorRecursuiva(int contador, int mayor, int arreglo[]) {
		if (arreglo.length > contador) {
			if (arreglo[contador] > mayor) {
				mayor = arreglo[contador];
			}
			encontrarMayorRecursuiva(contador + 1, mayor, arreglo);
		}

		if (4 == contador) {
			contador++;
			System.out.println();
			System.out.println("El mayor es: " + mayor);
		}
	}

	public static void encontrarMenorRecursuiva(int contador, int menor, int arreglo[]) {
		if (arreglo.length > contador) {
			if (arreglo[contador] < menor) {
				menor = arreglo[contador];
			}
			encontrarMenorRecursuiva(contador + 1, menor, arreglo);
		}

		if (arreglo.length == contador) {
			contador++;
			System.out.println();
			System.out.println("El menor es: " + menor);
		}

	}

	/*
	 * 5. Reescriba el programa de matrices usando recursividad para las búsquedas
	 * de los buses
	 */

	static void inicializarIDbusesRecursiva(int plantilla[][], int contador) {

		if (contador < plantilla[0].length) {
			plantilla[0][contador] = contador + 10;
			System.out.print("- " + plantilla[0][contador] + " -");
			inicializarIDbusesRecursiva(plantilla, contador + 1);
		} else {

			System.out.println();
		}
	}
	
	static void llenartablaRecursiva(int plantilla[][],int contadorX,int contadorY)
	{
		if(plantilla[contadorX].length>contadorX) {
			
		}

		
	}
	
	// plantilla[j][i] = (int) (Math.random() * (200 - 50 + 1) + 50);
    //	System.out.println();
	// System.out.print(" Casilla: " + j + " " + i + " =" + +plantilla[j][i]);
	
}