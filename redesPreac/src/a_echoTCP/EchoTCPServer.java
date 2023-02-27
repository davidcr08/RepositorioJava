package a_echoTCP;
import java.util.HashMap;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoTCPServer {

	public static final int PORT = 3400;
	private ServerSocket listener;
	private Socket serverSideSocket;
	private static PrintWriter toNetwork;
	private static BufferedReader fromNetwork;

	public static void main(String args[]) throws Exception {
		HashMap<String, Integer> ListaPersonas = new HashMap<>();
		
		EchoTCPServer es = new EchoTCPServer(  ListaPersonas);
		es.init( ListaPersonas);
	}

	
	
	public EchoTCPServer( HashMap ListaPersonas) {
		System.out.println("Servidor operativo, puerto: " + PORT);
	}

	

	public void init( HashMap ListaPersonas) throws Exception {
		listener = new ServerSocket(PORT);
		while (true) {
			serverSideSocket = listener.accept();
			createStreams(serverSideSocket);
			protocol(serverSideSocket, ListaPersonas );
		}
	}
	
	
	
	
	public void protocol(Socket socket, HashMap  ListaPersonas ) throws Exception {
		String message = fromNetwork.readLine();
		System.out.println("[Server] From client: " + message);
		String answer = message;
		toNetwork.println(answer);

		String choose = enviarRECIBIRYleermmsg(menuInicio());

		toNetwork.println("sv: " + choose);

		if (choose.equals("1".toString())) {
			SVSolicitarCrearCuenta( ListaPersonas);

		}

	}

	
	public static void logearusuarioSV(HashMap<String, Integer> ListaPersonas) {
		toNetwork.println("Ingrese la cedula:");

		
	}
	
	static void SVSolicitarCrearCuenta(HashMap<String, Integer> ListaPersonas) throws Exception {

		toNetwork.println("Ingrese la cedula:");
		String cedula = fromNetwork.readLine().toString();
		toNetwork.println("La cedula ingresada es :" + cedula);
		toNetwork.println(ListaPersonas.containsKey(cedula));

		if (ListaPersonas.containsKey(cedula)) {
			toNetwork.println("false");
			toNetwork.wait(500);
			toNetwork.println(menuInicio());

		} else {

			ListaPersonas.put(cedula, 0);
			toNetwork.println("Se ha añadido la persona");
			enviarRECIBIRYleermmsg(menuUSUARIOS());

		}

		
	}
	
	static String enviarRECIBIRYleermmsg(String mensaje)  throws Exception
	{
		toNetwork.println(mensaje);
		String recepcion= fromNetwork.readLine();
		
		return  recepcion ;

	}
	
	
	
	static public String menuInicio() {

		String mensaString = ("NO sea sapo  Ingrese la opciones 	 1 Crear cuenta.   2.Ingresar. ");

		return mensaString;
	}

	
	
	static public String menuUSUARIOS() {

		String mensa2 = ("SV  Ingrese la opciones 	1 Retirar.   2.Depositar.   3 Consultar. 4.Carga automatica ");

		return mensa2;
	}
	
	
	
	private void createStreams(Socket socket) throws Exception {
		toNetwork = new PrintWriter(socket.getOutputStream(), true);
		fromNetwork = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	}

}
