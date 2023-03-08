package a_echoTCP2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

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

			String choose = leerMensaje();
			leermenu(choose);

			break;

			
			
			
			
			
		case "2":
			//System.out.println("MENU 2 depositar dinero ");
			System.out.println("MENU 2 depositar dinero ");

			String cedulaP2 = fromNetwork.readLine();
			System.out.println("leido " + cedulaP2);
			
			
			
			/*
			 * SI EXISTE DEVUELVE TRUE
			 */
			if ( equals(cedulaP2)) {
				enviarMensaje("true");
				System.out.println(personas.containsKey(cedulaP2));
				System.out.println("Cliente  existe ");

				String saldoP2 = fromNetwork.readLine();
				System.out.println("leido " + saldoP2);
				Integer monto = Integer.parseInt(saldoP2);

				personas.put(cedulaP2, ++monto);

			} else {
				System.out.println("false");
				System.out.println("Cliente no existe");
				toNetwork.print("False");
				//System.out.println("nooo neas");

			}

			
			

			break;
			
			
			
			
			
			
			
			
			
		case "3":
			System.out.println("MENU 3 Retirar dinero ");
			
			

			String cedulaP3 = fromNetwork.readLine();
			System.out.println("leido " + cedulaP3);
			
			System.out.println(personas.get(cedulaP3));
			
			
			
			
			String chooseP3 = leerMensaje();

			leermenu(chooseP3);
			
			
			

			break;
		case "4":
			System.out.println("MENU 4 consultar saldo  ");
			
			
			


			String cedulaP4 = fromNetwork.readLine();
			System.out.println("leido " + cedulaP4);
			
			String mens =personas.get(cedulaP4).toString();
			
			toNetwork.println(mens);
			
			
			String chooseP4 = leerMensaje();

			leermenu(chooseP4);

			break;
		case "5":
			System.out.println("MENU 5 cargar ");

			break;

		default:
			break;
		}
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

}
