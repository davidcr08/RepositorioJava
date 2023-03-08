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

	
	//////////////////////////////////////////////////////////////////////PROTOCOLO CIEGO DE NUER 
	public void protocol(Socket socket) throws Exception {
		System.out.println(fromNetwork.readLine());
		
		mostrarMenu();
		consultarsaldo();

		// String MensajeUsuario = SCANNER.nextLine();

	}

	private void createStreams(Socket socket) throws Exception {
		toNetwork = new PrintWriter(socket.getOutputStream(), true);
		fromNetwork = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	}

	public static void main(String args[]) throws Exception {
		EchoTCPCliente ec = new EchoTCPCliente();
		ec.init();
	}
	
	

	public static  void enviarMensaje (String mensaje) throws  Exception
	{
		toNetwork.println(mensaje);
		System.out.println("Enviado: " + mensaje);

	}
	
	public  String leerMensaje () throws  Exception
	{
		String texto=fromNetwork.readLine();
		System.out.println("leido:" + texto);
		return texto;

	}

	public static void mostrarMenu() throws Exception {
		System.out.println("---Menu principal--- \n" + "1 Crear cuenta \n" + "2 Depositar dinero \n" 
				+ "3 Retirar dinero \n" + "4 consultar saldo" + "5 cargar texto");
		
		System.out.println("Escoge un opcion");
		String Desicion = SCANNER.nextLine();
	
		enviarMensaje(Desicion);
		
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void creaCuenta()  throws Exception
	{
		System.out.println("Ingrese la cedula:");
		String cc = SCANNER.nextLine();

		System.out.println();
		enviarMensaje(cc);
		System.out.println("Ingrese saldo:");
		String saldo = SCANNER.nextLine();

		enviarMensaje(saldo);
		System.out.println("Volveras al menu");
		mostrarMenu();

	}
	
	
	
	
	public static void consignar()  throws Exception {
		System.out.println("Ingrese el número de cedula: ");
		String ced = SCANNER.nextLine();
		enviarMensaje(ced);
		String existe = fromNetwork.readLine();
		System.out.println(existe);
		
		if (existe.equals("true")) {
			
			System.out.println(fromNetwork.readLine());
			System.out.println("Ingrese el saldo a consignar: ");
			String valor = SCANNER.nextLine();
			toNetwork.println(valor);


			System.out.println("Volveras al menu");
			
			mostrarMenu();
			
			
		}if (existe.equals("False")) {
			System.out.println(fromNetwork.readLine());

			System.out.println(existe.equals("true"));

			System.out.println("Volveras al menu");
			mostrarMenu();
			
		}
		
		
		
	
		System.out.println("Volveras al menu");
		
		
		mostrarMenu();
	}
	
	
	public static void retirar()  throws Exception {
		System.out.println("Ingrese el número de cedula: ");
		String ced = SCANNER.nextLine();
		enviarMensaje(ced);
		
		System.out.println("Ingrese la cantidad a retirar: ");
		String retiro = SCANNER.nextLine();
		enviarMensaje(retiro);
		
		String autorizacio;
		autorizacio=fromNetwork.readLine();
		System.out.println( autorizacio);
		
		
		if (autorizacio=="true") {
			
			System.out.println(fromNetwork.readLine());
			System.out.println("Ingrese el saldo a consignar: ");
			String valor = SCANNER.nextLine();
			toNetwork.println(valor);


			System.out.println("Volveras al menu");
			
			mostrarMenu();
			
			
		}if (autorizacio=="False") {
			System.out.println(fromNetwork.readLine());

			
			System.out.println("Volveras al menu");
			mostrarMenu();
			
		}
		
	}
	
	
	public void consultarsaldo()throws Exception {
		System.out.println("Ingrese el número de cedula: ");
		String ced = SCANNER.nextLine();
		enviarMensaje(ced);
		System.out.println("El saldo es: " +fromNetwork.readLine());

	}
	
}
