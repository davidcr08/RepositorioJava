package a_echoTCP2;

import java.util.HashMap;

public class ads {


	// HashMap<Integer, String> hash = new HashMap<>();
	//
	// hash.put(111, "mar");
	// hash.put(222, "Juan");
	// hash.put(123, "Ana");
	//
	// HashMap<Integer, Integer> hash2 = new HashMap<>();
	//
	// hash2.put(111, 50000);
	// hash2.put(222, 200000);
	// hash2.put(123, 100000);
	//
	// System.out.println(hash);
	// System.out.println(hash.get(111) + " " + hash2.get(111));

	HashMap<String, Double> personas = new HashMap<>();

	Scanner entrada = new Scanner(System.in);
	boolean salir = false;
	int opcion;


	while (!salir) {
		System.out.println("Bienvenido");
		System.out.println("\n1. Crear persona");
		System.out.println("2. Ingresar");
		System.out.println("3. Salir");

		try {

			System.out.println("Escribe el número de una de las opciones");
			opcion = entrada.nextInt();
			String cedula;
			double dinero;
			double dineroActual;

			switch (opcion) {

			case 1:

				System.out.println("Has seleccionado la opcion 1");
				System.out.println("Por favor ingrese la cedeula de la persona: ");
				Scanner entradaCedula = new Scanner(System.in);
				cedula = entradaCedula.next();

				if (personas.containsKey(cedula)) {
					System.out.println("Ya existe la persona");

				}else{

					personas.put(cedula, 0.0);
					System.out.println("Se ha añadido la persona");
				}

				break;
			case 2:

				System.out.println("Has seleccionado la opcion 2");
				System.out.println("Escriba el numero de cedula");
				cedula = entrada.next();

				if (personas.containsKey(cedula)) {

					System.out.println("Introduce una cantidad");
					dinero = entrada.nextInt();

					if (dinero > 0 ) {

						dineroActual = personas.get(cedula);
						personas.put(cedula, dineroActual + dinero);

						// System.out.println("Acumulado: " );

					}else{

						System.out.println("No se puede añadir dinero negativo");
					}

				}else{

					personas.put(cedula, 0.0);
					System.out.println("Se ha añadido la persona");
				}

				break;

			case 3:
				salir = true;
				break;

			default:
				System.out.println("Solo numros entre 1 y 3");
			}

		} catch (InputMismatchException e) {
			System.out.println("Debes ingresar un numero");
			entrada.next();
		}
	}

}
}
