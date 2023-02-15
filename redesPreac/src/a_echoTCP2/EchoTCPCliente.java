/**
 * 
 */
package a_echoTCP2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Dcr
 *
 */
public class EchoTCPCliente {

	private static final Scanner SCANNER = new Scanner(System.in);
	public static final String SERVER = "localhost";
	public static final int PORT = 3400;
	private PrintWriter toNetwork;
	private BufferedReader fromNetwork;
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
		System.out.print("Ingrese un su nombre : ");
		String MensajeUsuario = SCANNER.nextLine();

		toNetwork.println(MensajeUsuario);

		String fromServer = fromNetwork.readLine();
		System.out.println("[Client] From server: Hola " + fromServer);
		System.out.println(fromServer+ " deseas agregar una contrasena");
		String solicitudLogeo = SCANNER.nextLine();// si o no 


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
