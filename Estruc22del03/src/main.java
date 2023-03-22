/**
 * 
 */

/**
 * @author lenovo
 *
 */
public class main {

	
	

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		//STRING
		micalss<String> clase1 = new micalss<String>("55","55", "Apache");
		System.out.println(clase1.toString()+" Datos :");
		System.out.println(clase1.getVar1());
		System.out.println(clase1.getVar2());
		System.out.println(clase1.getVar3());

		//INT
		intclase<Integer> numeros1 = new intclase<Integer>(88,55, 44);
	
		System.out.println(numeros1.toString()+" Datos :");
		System.out.println(numeros1.getVar1());
		System.out.println(numeros1.getVar2());
		System.out.println(numeros1.getVar3());

	}

}
