package parcialII;

public class generica <T,U>{
    private T nombre;
    
    private U paginas;

    
    
    
    
    
    
	public generica(T nombre, U paginas) {
		super();
		this.nombre = nombre;
	
		this.paginas = paginas;
		
	}
	public T getNombre() {
		return nombre;
	}
	public void setNombre(T nombre) {
		this.nombre = nombre;
	}

	public U getPaginas() {
		return paginas;
	}
	public void setPaginas(U paginas) {
		this.paginas = paginas;
	}
	@Override
	public String toString() {
		return "generica [nombre=" + nombre + ", paginas=" + paginas + "]";
	}
	
    
    

}
