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
		System.out.println("pre");
		arbolBin.preOrderTraversal();
		System.out.println();
		System.out.println("post");
		arbolBin.postOrderTraversal(arbolBin.getRoot());
		System.out.println();
		System.out.println("Inorden");
		arbolBin.inOrderTraversal(arbolBin.getRoot());
	}

}
