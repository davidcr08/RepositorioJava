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
		protocol(clientSideSocket);
		clientSideSocket.close();
	}

	public void protocol(Socket socket) throws Exception {

		System.out.print("Bienvenido:");
		System.out.println(MostrarMenu());
	//	String fromUser = SCANNER.nextLine();
	//	toNetwork.println(fromUser);
		
		String fromServer = fromNetwork.readLine();
		System.out.println(fromServer);
		
		Desicion();
		

		
		
		
		
	}

	private void createStreams(Socket socket) throws Exception {
		toNetwork = new PrintWriter(socket.getOutputStream(), true);
		fromNetwork = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	}

	public static void main(String args[]) throws Exception {
		usuario ec = new usuario();
		ec.init();
	}
	
	static public void Desicion() throws Exception {
	
		System.out.println("Escoge una opcion ");
		String responsu = SCANNER.nextLine();
		toNetwork.println(responsu);
		System.out.println("F fiuuu");
	}
	
	static public void crearCuenta() throws Exception {

	}
	
	
	
	static public String MostrarMenu() {
		String mensaString = ("SV  Ingrese la opciones 	\n"
				+ " 1.Crear cuenta  \n"
				+ " 2.Depositar dinero \n"
				+ " 3.Retirar dinero  \n"
				+ " 4.Consultar saldo \n"
				+ " 5.Cargar registros \n"
				+ " 6.Menu principal");

		return mensaString;
	}
	
	
	
	
	
	
public static String leerNumeroXred(Socket socket) throws Exception {
	
	String numero = fromNetwork.toString();

	return numero;
	
}

public static void crearCuenta(Socket socket) throws Exception{
	
	System.out.println(" Crear cuenta ");
	System.out.println("Ingresa un número de cedula que deseas agregar");
	String cedula = SCANNER.nextLine();
	toNetwork.println(cedula);
	//envía la cedula  si existe es true
	
	String bandera=fromNetwork.readLine();
	System.out.println(fromNetwork.readLine());

	if(bandera=="false") {
		System.out.println("Cuenta ya existente");
		/////menu y leer opcion
		
	}else {
		System.out.println("Cuenta creada");
		// imprimir registro

	}
	
	
	
	
}



}
