/**
 * 
 */
package discretas20n030;

import java.util.Iterator;

/**
 * @author DAVID CL
 *
 */
public class main {

	/**
	 * por que a los judios no les gusta el miercoles de ceniza que depronto les
	 * sale algun familiar Proteus @param args
	 */

	public static void main(String[] args) {
			int elementosA[] = new int[5];
			System.out.print("A= ");
			for (int i = 0; i < elementosA.length; i++) {
				elementosA[i]=i+1;
				System.out.print(elementosA[i]+" ");
			}
			System.out.println();
			System.out.print("B= ");
			int elementosB[] = new int[6];
			for (int i = 0; i <  elementosB.length; i++) {
				 elementosB[i]=i+3;
				System.out.print(elementosB[i]+" ");
			}
			
			System.out.println();
			System.out.print("C= ");
			int elementosC[] = new int[3];
			for (int i = 0; i <  elementosC.length; i++) {
				elementosC[i]=i+7;
				System.out.print(elementosC[i] + " ");
			}
			
			System.out.println();
			System.out.print("U= ");
			int elementosU[] = new int[10];
			for (int i = 0; i <  elementosU.length; i++) {
				elementosU[i]=i+1;
				System.out.print(elementosU[i] + " ");
			}
			
			
			union(elementosA, elementosB,"A","B");
			interseccion(elementosA, elementosB,"A","B");
			union(elementosB, elementosC,"B","C");
			union(elementosA, elementosC,"A","C");
			interseccion(elementosA, elementosC,"A","C");
			System.out.println();
			diferenciaSimetrica(elementosA, elementosC,"A","C");
			System.out.println();
			System.out.println("<--LEYES DE MORGAN-->");
			System.out.println();
			completmento(elementosA, elementosU, null);

			


			


	}

	static void union(int[] A, int[] B,String nombreA,String nombreB) {
		System.out.println();
		
		

		int elementosAUB[] = new int[A.length + B.length];
		//System.out.println("El tamaño del arreglo es: " + elementosAUB.length);
		for (int i = 0; i < A.length; i++) {

			elementosAUB[i] = A[i];

		}

		for (int j = 0; j < B.length; j++) {

			elementosAUB[j + A.length] = B[j];

		}
		
		System.out.print(nombreA+"N"+nombreB+": ");
		for (int i = 0; i < elementosAUB.length; i++) {
			System.out.print("--");
			System.out.print(elementosAUB[i] );
		}
	}

	
	
	
	
	
	public static void interseccion(int[] A, int[] B,String nombreA,String nombreB) {
		System.out.println();
		
		System.out.print(nombreA+"U"+nombreB+": ");

		int cantidadRepetidos=0;
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if(A[i]==B[j])
				{
					cantidadRepetidos++;
				}
			}
			
		}
		
		
		
		//System.out.println(cantidadRepetidos);
	
		
	
		
		for (int i = 0; i < A.length; i++) {
		//	System.out.print(A[i]+" A ");

			for (int j = 0; j < B.length; j++) {
			//	System.out.print(B[j] + " B ");
				if (A[i] == B[j]) {

					//listaRepetidos[g] = A[i];
					System.out.print("--");
					 System.out.print(""+A[i]);
					
					// System.out.print(listaRepetidos[g]);
				}
				
				
			//	System.out.println();
			}
		}
			
		
		
		
	//	for (int i = 0; i < listaRepetidos.length; i++) {
		//	System.out.print("-- ");
		//	System.out.print(listaRepetidos[i]);
		//}

	}
	
	
	public static void diferenciaSimetrica(int[] A, int[] B,String nombreA,String nombreB) {
		
		System.out.print(nombreA+" Æ "+nombreB+": ");
		
		int elementosAUB[] = new int[A.length + B.length];
		
		for (int i = 0; i < A.length; i++) {

			elementosAUB[i] = A[i];

		}

		for (int j = 0; j < B.length; j++) {

			elementosAUB[j + A.length] = B[j];

		}

		for (int i = 0; i < elementosAUB.length; i++) {
			System.out.print(elementosAUB[i] + " ");
		}

	
		

	}
	
	
	
	///////////////////////////////////LEYES DE MORGAN	///////////////////////////////////
	
	//COMPLEMENTO= LO QUE LE FALTA AL CONJUNTO PARA SER EL CONJUNTO UNIVERSAL
	
	
	public static void completmento(int A[],int UNIVERSAL[],String nombreA) {
	
		int cantidadrepetidos=0;
		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < UNIVERSAL.length; j++) {
				if(A[i]==UNIVERSAL[j]) {
					System.out.print(A[i] +"+"+ UNIVERSAL[j]+"%  ");
					System.out.println("Iguales");
					cantidadrepetidos++;
				}
			}
		}
		System.out.println("La cantidad de repetidos es:"+ cantidadrepetidos);
	
	}
	
	
	
	
}
