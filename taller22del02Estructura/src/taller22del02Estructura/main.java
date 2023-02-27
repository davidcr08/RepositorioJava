/**
 * 
 */
package taller22del02Estructura;

public class main {
	/**
	 * @author David Clavijo R
	 * juliand.cruzc@uqvirtual.edu.co

	 *
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		/**
		 * @author David Clavijo R
		 *  Punto 6
		 */

		 int[][] tabla = new int[4][4];
		 llenartabla(tabla);
		System.out.println(esSimetrica(tabla));

		// System.out.println(esSimetricaRECORSUVA(tabla, 0, 0));

	}
	
	
	
	
	
	
	
	
	

	public static boolean determinarSiEsCuadrada(int[][] tabla) {

		if (tabla.length == tabla[0].length) {
			return true;
		}

		return false;

	}
	
	
	
	static void llenartabla(int plantilla[][]) {

		for (int j = 1; j < plantilla[1].length; j++) {
			for (int i = 0; i < plantilla.length; i++) {
				plantilla[j][i] = (int) (Math.random() * (200 - 50 + 1) + 50);

				System.out.print("∩ " + j + " " + i + " : " + +plantilla[j][i]);
			}
			System.out.println();
		}
	}
	
	
	/*
	 * Determinar si una matriz es simetrica 
	 */
	public static boolean esSimetrica( int matriz[][] )
	{
	    for ( int fila=1; fila < matriz.length; fila++ )
	    {
	        for ( int columna=0; columna < fila; columna++ )
	        {
	            if ( matriz[fila][columna] != matriz[columna][fila] )
	            {
	                return false;
	            }
	        }
	    }
	    return true;
	}
	
	
	
	public static boolean esSimetricaRECORSUVA( int matriz[][],int fila,int columna )
	{
		if(fila<matriz.length) {
			if (columna< matriz[fila].length) {
				  if ( matriz[fila][columna] != matriz[columna][fila] )
		            {
		                return true;
		            }
				  if(fila==matriz.length-1)
				  {
					  fila=0;
				  }
				  esSimetricaRECORSUVA(matriz, fila+1, columna+1);
			}
			
		}
		return false;
		
	}
	
	

	
	
	/*static void inicializar(){
        System.out.println("Inicializando la matriz...\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Dimensión de la matriz: ");
        int dim = sc.nextInt();
        matriz = new int[dim][dim];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.printf("Introduce el valor fila %d - columna %d: ", (i+1), (j+1));
                matriz[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }*/
}
