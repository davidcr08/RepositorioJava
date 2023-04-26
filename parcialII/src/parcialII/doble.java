package parcialII;

public class doble {

    private int lenght;
    private nodo primerNodo;
    
    
	public doble(int lenght, nodo primerNodo) {
		super();
		this.lenght = lenght;
		this.primerNodo = primerNodo;
	}
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


    private boolean validarListaVacia(){
        return primerNodo == null;
    }

    public String validarLista(){
        return validarListaVacia() ? "La lista esta vacia" : "La lista contiene elementos";
    }

    public String adicionarDato(int valor){
        nodo nuevoNodo = new nodo(valor, primerNodo, primerNodo);
        if(this.primerNodo!=null && this.primerNodo.getSiguiente() != null){
            nuevoNodo.setSiguiente(this.primerNodo.getSiguiente());
            nuevoNodo.setAnterior(this.primerNodo);
            this.primerNodo.setSiguiente(nuevoNodo);
        }else{
            nuevoNodo.setSiguiente(this.primerNodo);
            this.primerNodo = nuevoNodo;
        }
        return "Elemento agregado";
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
    
    
    
    public void recorrerListaRepetidos(){
        if(validarListaVacia()){
           System.out.println("Ninguno se repite");
        }else{
            String mensaje = "";
            int i = 0; 
            nodo nodoActual = this.primerNodo;
            do{
                mensaje += "Valor en posicion " + i + ": " + nodoActual.getValor() + "\n"; 
                i += 1;
                nodoActual = nodoActual.getSiguiente();
               
            }while(nodoActual != this.primerNodo && nodoActual != null);
        }
    }
    
    public void cantidadRepetidos() {
    	
    	int valor=0;
    	int cantidad=0;
    			
    	 if(validarListaVacia()){
            System.out.println("Lista vacia");
         }else{
             String mensaje = "";
             int i = 0; 
             nodo nodoActual = this.primerNodo;
             do{
            	 
            	 System.out.println( "Valor en posicion " + i + ": " + nodoActual.getValor() + "\n");
                 i += 1;
                 nodoActual = nodoActual.getSiguiente();
             }while(nodoActual != this.primerNodo && nodoActual != null);
        
            // System.out.println( "Valor en posicion " + i + ": " + nodoActual.getValor() + "\n");  
         }
    }
    
    
    public String buscarValor(int valor){
        if(validarListaVacia()){
            return "La lista esta vacia";
        }else{
            int i = 0; 
            nodo nodoActual = this.primerNodo;
            do{
                if(nodoActual.getValor() == valor){
                    return "El valor se encuentra en la posicion: " + i;
                }else{
                    i += 1;
                    nodoActual = nodoActual.getSiguiente();
                }
            }while(nodoActual != this.primerNodo && nodoActual != null);
            return "El valor no ha sido encontrado";
        }
    }
    
    

}
