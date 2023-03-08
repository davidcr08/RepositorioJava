package a_echoTCP2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JFileChooser;

public class EchoTCPServer {

	public static final int PORT = 3400;
	private ServerSocket listener;
	private Socket serverSideSocket;
	private PrintWriter toNetwork;
	private BufferedReader fromNetwork;
	private 		HashMap<String, Integer> personas = new HashMap<>();


	public EchoTCPServer() {
		System.out.println("Echo TCP server is running on port: " + PORT);
	}

	public void init() throws Exception {
		listener = new ServerSocket(PORT);
		while (true) {
			serverSideSocket = listener.accept();
			createStreams(serverSideSocket);
			protocol(serverSideSocket);
		}
	}

	public void protocol(Socket socket) throws Exception {

		
		personas.put("001", 15000);
		toNetwork.println("--Conectado a la red del banco---");
	//	System.out.println(fromNetwork.readLine());
	String choose = leerMensaje();
	leermenu(choose);
		
	}

		
	private void createStreams(Socket socket) throws Exception {
		toNetwork = new PrintWriter(socket.getOutputStream(), true);
		fromNetwork = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	}

	public static void main(String args[]) throws Exception {
		EchoTCPServer es = new EchoTCPServer();
		es.init();
	}
	
	
	public void leermenu(String menu ) throws Exception {
		//String navegador = fromNetwork.readLine().toString();
		switch (menu) {
		case "1":
			System.out.println("MENU 1 crear cuentas ");
			System.out.println("MENU--> Crear cuenta");
			// String cedula=leerMensaje();

			String cedula = fromNetwork.readLine();
			System.out.println("cedula " + cedula);

			String saldo = fromNetwork.readLine();
			System.out.println("leido " + saldo);
			int i = Integer.parseInt(saldo);
			personas.put(cedula, i);
			System.out.println("Agregado con exito");

			
			
			
			System.out.println("nueva iteracion del menu");
			String choose = leerMensaje();
			leermenu(choose);

			
			
			
			break;

			
			
			
			
			
		case "2":
			//System.out.println("MENU 2 depositar dinero ");
			System.out.println("MENU 2 depositar dinero ");

			String cedulaP2 = fromNetwork.readLine();
			System.out.println("leido cc " + cedulaP2);
			
			
			
			/*
			 * SI EXISTE DEVUELVE TRUE
			 */
			if ( personas.containsKey(cedulaP2)) {
				enviarMensaje("0");
				
				System.out.println("Cliente  existe ");

				String saldoP2 = fromNetwork.readLine();
				
				int saldoReal= Integer.parseInt(saldoP2);
				System.out.println("leido " + saldoP2);
				personas.put(cedulaP2, personas.get(cedulaP2) + saldoReal);

				

			} else {
				System.out.println("false");
				System.out.println("Cliente no existe");
				toNetwork.print("False");
				//System.out.println("nooo neas");

			}

			
			System.out.println("nueva iteracion del menu");
			String choose2 = leerMensaje();
			leermenu(choose2);

			break;
			
			
			
			
			

			
			
			
		case "3":
			System.out.println("MENU 3 Retirar dinero   \n");

			String cedulaP3 = fromNetwork.readLine();
			System.out.println("leido cedulaP3: " + cedulaP3);

			
			
			String Vretiro = fromNetwork.readLine();
			System.out.println(" \n leido Vretiro: " + Vretiro);
			int VREALretiro = Integer.parseInt(Vretiro);

			
			System.out.println("Persona data I: " + personas.get(cedulaP3));
			 
			

			// personas.get(cedulaP3)
			if ( personas.containsKey(cedulaP3)) {

				enviarMensaje("0");
				
				if (Integer.parseInt(Vretiro)< personas.get(cedulaP3)) {
					System.out.println("--Retiro posible--");
					enviarMensaje("0");
					personas.put(cedulaP3, personas.get(cedulaP3) - VREALretiro);
					
					System.out.println("Persona data II: " + personas.get(cedulaP3));
					 
				}
				
				

			} else {
				toNetwork.println("Accion no valida");
			}

			
			System.out.println(personas.get(cedulaP3));

			// vuelve a menu

		//	String chooseP3 = leerMensaje();

			//leermenu(chooseP3);
			
			
			System.out.println("nueva iteracion del menu");
			String choose3 = leerMensaje();
			leermenu(choose3);

			break;
		case "4":
			System.out.println("MENU 4 consultar saldo  ");

			String cedulaP4 = fromNetwork.readLine();
			System.out.println("leido " + cedulaP4);

			 Integer cdeulaIn= Integer.parseInt(cedulaP4);
			
			
			//String mens;
			 //mens = personas.get(cedulaP4);

			toNetwork.println(personas.get(cedulaP4));

			//String chooseP4 = leerMensaje();

			//leermenu(chooseP4);

			
			System.out.println("nueva iteracion del menu");
			String choose4 = leerMensaje();
			leermenu(choose4);
			
			break;
		case "5":
			System.out.println("MENU 5 cargar txt ");

			String direString;
			direString=fromNetwork.readLine() ;
			
			
				
		        // Crear un objeto JFileChooser
		        JFileChooser chooser = new JFileChooser();

		   
		        // Mostrar la ruta del archivo
		        if (direString != null) {
		            
		        	//invocacion
		        	leerArchivotxt(direString);
		        	
		        } else {
		            System.out.println("No se seleccion� ning�n archivo.");
		        }
				
				
			}

			
			
			
			
			
			

			String choose5 = leerMensaje();
			leermenu(choose5);
			
		

		
	}

	
	
	

	public  void enviarMensaje (String mensaje) throws  Exception
	{
		toNetwork.println(mensaje);
		System.out.println("Enviado" + mensaje);

	}
	
	public  String leerMensaje () throws  Exception
	{
		String texto=fromNetwork.readLine();
		System.out.println("leido " + texto);
		return texto;

	}

	///////////////////////////////////////////////////////////////////////////////////////////
	public void crearCuenta() throws Exception {
		System.out.println("MENU--> Crear cuenta");
		// String cedula=leerMensaje();

		String cedula = fromNetwork.readLine();
		System.out.println("leido " + cedula);

		String saldo = fromNetwork.readLine();
		System.out.println("leido " + saldo);
		int i = Integer.parseInt(saldo);
		personas.put(cedula, i);
		System.out.println("Agregado con exito");

	}
	
	
	public void consiganarSaldo() throws Exception {
		System.out.println("MENU 2 depositar dinero ");

		String cedula = fromNetwork.readLine();
		System.out.println("leido " + cedula);
		
		/*
		 * SI EXISTE DEVUELVE TRUE
		 */
		if(personas.containsKey(cedula)==true) {
			toNetwork.print("true");
			System.out.println("Cliente  existe ");
			
			String saldo = fromNetwork.readLine();
			System.out.println("leido " + saldo);
			Integer monto= Integer.parseInt(saldo);
			
			personas.put(cedula, ++monto);
			
			
		}else {
			toNetwork.print("false");
			System.out.println("Cliente no existe ");

		}


	}

	
	private static void leerArchivotxt(String rutaArchivo) {
		
		//se crea el archivo a leer y la variable que almacenara su contenido
		File archivo = new File(rutaArchivo);
		ArrayList<String> lineas = new ArrayList<>();

		try {
			BufferedReader lector = new BufferedReader(new FileReader(archivo));
			String linea = lector.readLine();
			while (linea != null) {
				lineas.add(linea);
				linea = lector.readLine();
			}
			lector.close();
		} catch (IOException e) {
			System.out.println("Hubo un error al leer el archivo: " + e.getMessage());
		}
		

		// Mostrar las lineas almacenadas en el ArrayList
		for (String l : lineas) {
			System.out.println(l);
		}

		
		
	}
	
}
