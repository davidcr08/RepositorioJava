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
	 public static void main (String[] args)
	    {
			boolean x = comparasoloLetras("sdfsdf");
			decide(x);
			// System.out.println(comparasoloLetrasRECONTRAHPTA("sdfsdf", 0));
			boolean Y = comparasoloLetras("zcfsdgx1dg3dgf8");
			decide(Y);

		}

		// si no una letra minùscula que está entre a y z, ni entre una letra
		// mayuscula(A y Z), ni equivale a un espacio
		// ||(c>='A'&&c<='Z')|| c ==' '

		public static boolean comparasoloLetras(String cadena) {
			for (int i = 0; i < cadena.length(); i++) {
				char c = cadena.charAt(i);

				if (((c >= '1' && c <= '9'))) {
					return false;
				}
			}
			return true;
		}

		public static boolean comparasoloLetrasRECONTRAHPTA(String cadeString, int position) {

			char c = cadeString.charAt(position);
			if (((c >= '1' && c <= '9'))) {
				return false;
			} else {
				if (position > cadeString.length() - 1) {

					comparasoloLetrasRECONTRAHPTA(cadeString, position);
				}
				return true;
			}

		}

		static void decide(boolean d) {
			if (d == true) {
				System.out.println("La cadena no contiene números");
			} else
				System.out.println("La cadena contiene números");
		}

	}
