/**
 * 
 */
package bancoLAB;

/**
 * @author David
 *
 */
public class CuentaCLiente {

	double saldo;
	String nombre;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "cuenta [saldo=" + saldo + ", nombre=" + nombre + "]";
	}
	
/*
 * si el valor a retirar es mayor al saldo
 * crear exception
 */
	
	

	
}
