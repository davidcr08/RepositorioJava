/**
 * 
 */
package a_echoTCP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Dcr
 *
 */
public class EchoTCPCliente {

	private static final Scanner SCANNER = new Scanner(System.in);
	public static final String SERVER = "localhost";
	public static final int PORT = 3400;
	private static PrintWriter toNetwork;
	private static BufferedReader fromNetwork;
	private Socket clientSideSocket;

	public EchoTCPCliente() {
	System.out.println("Echo TCP client is running ...");
	}

	public void init() throws Exception {
		clientSideSocket = new Socket(SERVER, PORT);
		createStreams(clientSideSocket);
		protocol(clientSideSocket);
		clientSideSocket.close();
	}

	
	
	
	
	public void protocol(Socket socket) throws Exception {
		System.out.print("Ingrese un mensaje: ");
		String NombreSecion = SCANNER.nextLine();

		toNetwork.println(NombreSecion);

		String fromServer = fromNetwork.readLine();
		System.out.println("[Client] From server: " + fromServer);

		String nuevo = fromNetwork.readLine();
		System.out.println(nuevo + " algo ");
		String primeraSelec = SCANNER.nextLine();
		toNetwork.println(primeraSelec);
		System.out.println(fromNetwork.readLine());
		if (primeraSelec.equals("1".toString())) {
			USERSolicitarCrearCuenta();
		}

	}
		
	
	public static void logearusuarioSV() {
		
		
	}

		
		
	public static void USERSolicitarCrearCuenta()	throws Exception
	{
		System.out.println("Has seleccionado Crear Cuenta: ");
		System.out.println(fromNetwork.readLine());
		String cedula = SCANNER.nextLine();
		toNetwork.println(cedula);
		System.out.println(fromNetwork.readLine());
		String bandera=fromNetwork.readLine();
		System.out.println(fromNetwork.readLine());
	
		if(bandera=="false") {
			System.out.println("Cuenta ya existente");
			System.out.println(fromNetwork.readLine());
			System.out.println(fromNetwork.readLine());
		}else {
			System.out.println(fromNetwork.readLine());
			System.out.println(fromNetwork.readLine());


		}

		
		
	}

	
	private void createStreams(Socket socket) throws Exception {
		toNetwork = new PrintWriter(socket.getOutputStream(), true);
		fromNetwork = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	}

	public static void main(String args[]) throws Exception {
		EchoTCPCliente ec = new EchoTCPCliente();
		ec.init();
	}
}
