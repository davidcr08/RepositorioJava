/**
 * 
 */
package estruc10de4;

/**
 * @author lenovo
 *
 */

public class libro <T,U,V>{

	private T Nombre;
	private V autor;
	private U precioC;
	
	
	
	public libro(T Nombre, V autor, U precioC) {
		super();
		this.Nombre = Nombre;
		this.autor = autor;
		this.precioC = precioC;
	}



	public T getNombre() {
		return Nombre;
	}



	public void setNombre(T nombre) {
		Nombre = nombre;
	}



	public V getAutor() {
		return autor;
	}



	public void setAutor(V autor) {
		this.autor = autor;
	}



	public U getPrecioC() {
		return precioC;
	}



	public void setPrecioC(U precioC) {
		this.precioC = precioC;
	}
	
	
	
	
	
	
}

