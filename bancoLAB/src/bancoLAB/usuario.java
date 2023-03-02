package bancoLAB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class usuario {


	private static final Scanner SCANNER = new Scanner(System.in);
	public static final String SERVER = "localhost";
	public static final int PORT = 3400;
	private static PrintWriter toNetwork;
	private static BufferedReader fromNetwork;
	private Socket clientSideSocket;

	public usuario() {
	System.out.println("Echo TCP client is running ...");
	}

	   //Dirección IPv4. . . . . . . . . . . . . . : 192.168.1.8   192.168.1.8x
	
	public void init() throws Exception {
		clientSideSocket = new Socket(SERVER, PORT);
		createStreams(clientSideSocket);
		protocol();
		clientSideSocket.close();
	}

	public void protocol() throws Exception {

		System.out.print("Bienvenido:");
		MostrarMenu( );
		// String fromUser = SCANNER.nextLine();
		// toNetwork.println(fromUser);
		
	

		
		
		
		
	}

	private void createStreams(Socket socket) throws Exception {
		toNetwork = new PrintWriter(socket.getOutputStream(), true);
		fromNetwork = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	}

	public static void main(String args[]) throws Exception {
		usuario ec = new usuario();
		ec.init();
	}
	
	
	
	
	
	
	
	static public void MostrarMenu()throws Exception {
		String mensaString = ("SV  Ingrese la opciones 	\n"
				+ " 1.Crear cuenta  \n"
				+ " 2.Depositar dinero \n"
				+ " 3.Retirar dinero  \n"
				+ " 4.Consultar saldo \n"
				+ " 5.Cargar registros \n"
				+ " 6.Menu principal \n"
		        + "Ingresa una opcion: ");
		
		System.out.println(mensaString);
		String pcion = SCANNER.nextLine();
		toNetwork.println(pcion);
		
		
		switch (pcion) {
		case "1": {
			crearCuenta( );
			
			
		}
		default:
			System.out.println("END");
			//throw new IllegalArgumentException("Unexpected value: " + pcion);
		}
		
		
	}
	
	
	
	
	
	
	public static void crearCuenta() throws Exception {

		System.out.println(" Crear cuenta ");
		System.out.println("Ingresa un número de cedula que deseas agregar");
		String cedula = SCANNER.nextLine();
		toNetwork.println(cedula);
		System.out.println(fromNetwork.readLine());
		System.out.println("GG");
		MostrarMenu();
	}
	
	
	
	



}
