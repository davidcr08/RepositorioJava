import java.util.Iterator;

/**
 * 
 */

/**
 * @author lenovo
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		int elementU[] = new int[10];
		for (int i = 1; i < elementU.length; i++) {
			elementU[i] = i * 2;
			System.out.print(elementU[i] +" ");

		}
		System.out.println();
		
		int elementA[] = new int[7];
		System.out.print("A: ");

		for (int i = 1; i < elementA.length; i++) {
			elementA[i] = i * 3;
			System.out.print(elementA[i]+" ");

		}
		
System.out.println();
		
		int elementB[] = new int[6];
		System.out.print("B: ");
		for (int i = 1; i < elementB.length; i++) {
			elementB[i] = i * 4;
			System.out.print(elementB[i]+" ");

		}System.out.println();
		
		
		completmento(elementA, elementU, "a");
		
		


	}

	
	
	
	
	public static void completmento(int A[],int B[],String nombreA) {
		
		int cantidadrepetidos=0;
		
		int AUX[] = new int[B.length];
		String universal[] = new String[B.length];
		
		for (int i = 0; i < universal.length; i++) {
			
			int x=Integer.parseUnsignedInt(B[i]);
			//	universal[i]=x. ;
				 //Integer.parseInt(B[j])
				
		}
		
		for (int i = 0; i < universal.length; i++) {
			
		}
		
		for (int i = 1; i < A.length; i++) {

			for (int j = 0; j < B.length; j++) {
				if(A[i]==B[j]) {
					System.out.print(A[i] +"+"+ B[j]+"%  ");
					System.out.println("Iguales  "+ A[i]);
					AUX[i]= A[i];
					System.out.println(	AUX[i]+" ");
					cantidadrepetidos++;
				}
			}
			// AUX[0]= null;
		}
		
		for (int i = 0; i < AUX.length; i++) {
			for (int j = 0; j < universal.length; j++) {
				if(AUX[i]==Integer.parseInt(universal[j]) ) {
					universal[j]=null;
				}
				
			}
			
		}
		for (int i = 0; i < universal.length; i++) {
			System.out.println(universal[i]);
		}
		
		System.out.println("La cantidad de repetidos es:"+ cantidadrepetidos);
	
	}
}
