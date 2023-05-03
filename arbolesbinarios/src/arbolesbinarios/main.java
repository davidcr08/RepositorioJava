/**
 * 
 */
package arbolesbinarios;

/**
 * @author lenovo
 *
 */
public class main {

	/**
	 *arbbol binario perfecto
	 *preorden 
	 *inorden= raiz revisa izq  mnuestra derecha y luego izq  para luego devolverse , posordem
	 */
	
	public static void main(String[] args) {
		binarytree arbolBin = new binarytree(null);
		for (int i = 0; i < 10; i++) {

			arbolBin.insert(i);
			
		}
		System.out.println(arbolBin.toString());
		arbolBin.preOrderTraversal();
		
	}

}
