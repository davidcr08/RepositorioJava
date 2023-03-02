package a_echoTCP2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoTCPServer {

	public static final int PORT = 3400;
	private ServerSocket listener;
	private Socket serverSideSocket;
	private PrintWriter toNetwork;
	private BufferedReader fromNetwork;

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
		leermenu();
		

		
	}

		
	private void createStreams(Socket socket) throws Exception {
		toNetwork = new PrintWriter(socket.getOutputStream(), true);
		fromNetwork = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	}

	public static void main(String args[]) throws Exception {
		EchoTCPServer es = new EchoTCPServer();
		es.init();
	}
	
	public void leermenu() throws Exception {
		String navegador = fromNetwork.readLine();
		switch (navegador) {
		case "1":
			System.out.println("MENU 1 crear cuentas ");
			toNetwork.println("Opcion1");

			break;

		case "2":
			System.out.println("MENU 1 crear cuentas ");

			break;
		case "3":
			System.out.println("MENU 1 crear cuentas ");

			break;
		case "4":
			System.out.println("MENU 1 crear cuentas ");

			break;
		case "5":
			System.out.println("MENU 1 crear cuentas ");

			break;

		default:
			break;
		}
	}

}
