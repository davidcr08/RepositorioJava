/**
 * 
 */
package parcialII;


/**
 * @author lenovo
 *
 * enteros , hasta que se le agrege un número negativo
	 * informar si algun dato
 */
public class nodo {
	  private int valor;
	    private nodo siguiente;
	    private nodo anterior;
		public nodo(int valor, nodo siguiente, nodo anterior) {
			super();
			this.valor = valor;
			this.siguiente = siguiente;
			this.anterior = anterior;
		}
		public int getValor() {
			return valor;
		}
		public void setValor(int valor) {
			this.valor = valor;
		}
		public nodo getSiguiente() {
			return siguiente;
		}
		public void setSiguiente(nodo siguiente) {
			this.siguiente = siguiente;
		}
		public nodo getAnterior() {
			return anterior;
		}
		public void setAnterior(nodo anterior) {
			this.anterior = anterior;
		}
	    
	    
	    
	    
	    
}
