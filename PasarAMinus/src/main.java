/**
 * 
 */

/**
 * @author lenovo
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String texto = "HOLA Mundo";
		String resultado = eliminarMayusculas(texto);
		System.out.println(resultado); 
	}

	
	public static String eliminarMayusculas(String cadena) {
	    String resultado = "";
	    for (int i = 0; i < cadena.length(); i++) {
	        char caracter = cadena.charAt(i);
	        if (Character.isLowerCase(caracter)) {
	            resultado += caracter;
	        }
	    }
	    return resultado;
	}
}
