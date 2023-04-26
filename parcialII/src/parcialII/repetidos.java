package parcialII;


public class repetidos {

	  private int lenght;
	    private nodo primerNodo;
		public int getLenght() {
			return lenght;
		}
		public void setLenght(int lenght) {
			this.lenght = lenght;
		}
		public nodo getPrimerNodo() {
			return primerNodo;
		}
		public void setPrimerNodo(nodo primerNodo) {
			this.primerNodo = primerNodo;
		}
		public repetidos(int lenght, nodo primerNodo) {
			super();
			this.lenght = lenght;
			this.primerNodo = primerNodo;
		}


	    public String adicionarDato(int valor){
	        nodo nuevoNodo = new nodo(valor, primerNodo, primerNodo);
	        if(this.primerNodo!=null)
	        {
		    	if(this.primerNodo.getSiguiente() == null){
		            nuevoNodo.setSiguiente(this.primerNodo);
		            this.primerNodo.setSiguiente(nuevoNodo);
		        }else{
		            nuevoNodo.setSiguiente(this.primerNodo.getSiguiente());
		            this.primerNodo.setSiguiente(nuevoNodo);
		        }
	        }else{
	            nuevoNodo.setSiguiente(this.primerNodo);
	            this.primerNodo = nuevoNodo;
	        }
	        return "Elemento agregado";
	    }
	    
	    
	    
	    private boolean validarListaVacia(){
	        return primerNodo == null;
	    }
	    
	    public String mostrarLista(){
	        if(validarListaVacia()){
	            return "La lista esta vacia";
	        }else{
	            String mensaje = "";
	            int i = 0; 
	            nodo nodoActual = this.primerNodo;
	            do{
	                mensaje += "Valor en posicion " + i + ": " + nodoActual.getValor() + "\n"; 
	                i += 1;
	                nodoActual = nodoActual.getSiguiente();
	            }while(nodoActual != this.primerNodo && nodoActual != null);
	            return mensaje;
	        }
	    }
	    
	    
}
