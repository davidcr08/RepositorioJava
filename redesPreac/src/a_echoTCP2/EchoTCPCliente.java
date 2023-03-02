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

	
	//////////////////////////////////////////////////////////////////////PROTOCOLO CIEGO DE NUER 
	public void protocol(Socket socket) throws Exception {
		System.out.println(fromNetwork.readLine());
		
		
		//String MensajeUsuario = SCANNER.nextLine();

		


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
