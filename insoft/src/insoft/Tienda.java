/**
 * 
 */
package insoft;

/**
 * @author lenovo
 *
 */
public class Tienda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	//verificar factura
	public static void verificarFactura(factura facturaArevisar)
	{
		//confirma si existe cliente en BD
		listaclientes.containsKey(facturaArevisar.getcedula);
		
		if(tipoPedido==compraDetal)
		{
			if (costos.equal(costosDetal)) {
				
				System.out.println(" lista de costos correcta ");
			
		}else {
			System.out.println(" lista de costos incorrecta ");

		}
		
		if(tipoPedido==compraMayorista)
		{
	if (costos.equal(costosMayorista)) {
				
				System.out.println(" lista de costos correcta ");
			
		}
		}else {
			System.out.println(" lista de costos incorrecta ");

		}
		
	}
}
