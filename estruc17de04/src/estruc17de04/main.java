/**
 * 
 */
package estruc17de04;

/**
 * @author lenovo
 *
 */



public class main {
	public class listasEnlazadas {

		private nodo primero;
		private int tamano;

		public void verifiaLista() {
			if (primero == null) {
				System.out.println("No hay datos en la lista");
			} else {
				System.out.println("La lista contiene datos");
			}
		}

		public void adicionarNodo(int dato) {
			nodo nuevo = new nodo(dato);
			nuevo.siguiente = primero;
			primero = nuevo;
			tamano++;
		}

		public int tamano() {
			return tamano;
		}

		public void listar() {
			nodo actual = primero;
			while (actual != null) {
				System.out.print("[" + actual.dato + "]-->");
				actual = actual.siguiente;
			}
		}

		public static void main(String[] args) {
			// TODO code application logic here
			listasEnlazadas lista = new listasEnlazadas();
			// lista.verifiaLista();
			lista.verifiaLista();
			lista.adicionarNodo(10);
			lista.adicionarNodo(20);
			lista.adicionarNodo(30);
			lista.listar();
			lista.verifiaLista();
			System.out.println("\n" + "Tamaño   " + lista.tamano());

		}
	}
}



