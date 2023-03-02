/**
 * 
 */
package bancoLAB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;


/**
 * @author David
 * 
 *         servicio crear cuenta 
 *         hacer  deposito 
 *         retirar 
 *         consultar saldo
 *
 */
public class SVBanco {

	public static final int PORT = 3400;
	private ServerSocket listener;
	private Socket serverSideSocket;
	private static PrintWriter toNetwork;
	private static BufferedReader fromNetwork;
	static HashMap<Integer, String> listaClientes = new HashMap<Integer, String>();
	
	/*
	 * Parala lista convertitlo a hashmap
	 */
    
	

	public SVBanco(HashMap  listaClientes ) {
		System.out.println("Echo TCP server is running on port: " + PORT);
	}

	public void init() throws Exception {
		listener = new ServerSocket(PORT);
		while (true) {
			serverSideSocket = listener.accept();
			createStreams(serverSideSocket);
			protocol(listaClientes);
		}
	}

	
	
	
	public void protocol( HashMap listaClientes) throws Exception {
		String message = fromNetwork.readLine();
		System.out.println("[Server] From client: "+ message);
		//String answer = message;
	//	toNetwork.println(menuInicio());
		
		String desicionMENU = fromNetwork.toString();
		desimenu();
	}



	private void createStreams(Socket socket) throws Exception {
		toNetwork = new PrintWriter(socket.getOutputStream(), true);
		fromNetwork = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	}

	public static void main(String args[]) throws Exception {
		
		SVBanco es = new SVBanco(listaClientes);
		es.init();
	}

///////////////////////////////////////DEPOSITAR/////////////////////////////////////////////////////////////////////////	
	
	
	
	/*
	 * confirma si el deposito a sido hecha con exito 
	 */
	public static boolean Depositar(String nombreUSER, double valorCOnsingnacion, CuentaCLiente lista[]) {

		if (clienteExiste(nombreUSER, lista)) {
			double nuevoSaldo = lista[idCLiente(nombreUSER, lista)].getSaldo();
			nuevoSaldo = nuevoSaldo + valorCOnsingnacion;
			lista[idCLiente(nombreUSER, lista)].setSaldo(nuevoSaldo);
			return true;
		}

		return false;
	}

	
	
	/*
	 * 
	 * Confirma la existencia del cliente
	 * PENDIENTE CONVERSION A MIN Y SIN ESPACIOS 
	 */
	static public boolean clienteExiste(String nombreCOMUNICACION, CuentaCLiente lista[]) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].getNombre() == nombreCOMUNICACION) {
				return true;
			}

		}
		return false;
	}
	
	

	/*
	 * Devuelve la posicion del cliente en el array  
	 */
	static public int idCLiente(String nombreCOMUNICACION, CuentaCLiente lista[]) {
		int id = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].getNombre() == nombreCOMUNICACION) {
				id = i;
			}

		}
		return id;
	}

	
//////////////////////////////////////////////////////////menus////////////////////////////////////////////////////////////	
	static public void desimenu()  throws Exception  {
	
		String desiso=fromNetwork.readLine();
	
	switch (desiso) {
	case "1": {SVSolicitarCrearCuenta(null);
		
		
	}
	default:
		System.out.println("Sale desicionMenu");
		
		//throw new IllegalArgumentException("Unexpected value: " + desiso);
	}

		
	}

	
	
//////////////////////////////////////////////////////////RETIRAR////////////////////////////////////////////////////////////	
	/*
	 * Se reutiliza idCLiente y cliente existente 
	 * 
	 * ++ dinero suficiente
	 */
	
	
	static boolean saldoSuficiente(String nombreCOMUNICACION, CuentaCLiente lista[]) {
	
		
		return false;
	}
	
	///////////////////////////////////CrearCliente///////////////////////////////////////////////////////////

	static void SVSolicitarCrearCuenta(HashMap<Integer, String> ListaPersonas) throws Exception {

		String cedula =fromNetwork.readLine();
		ListaPersonas.put(ListaPersonas.size()+1,cedula.toString());
		System.out.println("Cuenta creada "+ cedula);
		System.out.println(ListaPersonas.toString());
		desimenu();
	}
}
