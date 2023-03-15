/**
 * 
 */
package estruPrepar;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author lenovo
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		// linked hasmap declaracion

		LinkedHashMap<Integer, String> mmgvoFunciopnal = new LinkedHashMap<Integer, String>();

		//tree map 
		Map<String, Integer> treeMap = new TreeMap<>();
		
		
		//Hashmap
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

		
	        // Adding elements to the tree map
	        treeMap.put("A", 1);
	        treeMap.put("C", 3);
	        treeMap.put("B", 2);
	 
	        // Getting values from the tree map
	        int valueA = treeMap.get("A");
	        System.out.println("Value of A: " + valueA);
	 
	        // Removing elements from the tree map
	        treeMap.remove("B");
	 
	        // Iterating over the elements of the tree map
	        for (String key : treeMap.keySet()) {
	            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
	        }

	}
	/*
	 * 
get(key): Este método devuelve el valor correspondiente a la clave especificada.

remove(key): Este método elimina la entrada correspondiente a la clave especificada.

containsKey(key): Este método devuelve true si el TreeMap contiene la clave especificada.

containsValue(value): Este método devuelve true si el TreeMap contiene el valor especificado.

size(): Este método devuelve el número de pares clave-valor en el TreeMap.

keySet(): Este método devuelve un conjunto de todas las claves en el TreeMap.

values(): Este método devuelve una colección de todos los valores en el TreeMap.

entrySet(): Este método devuelve un conjunto de todos los pares clave-valor en el TreeMap.

firstKey(): Este método devuelve la primera clave en el TreeMap.

lastKey(): Este método devuelve la última clave en el TreeMap.

ceilingKey(key): Este método devuelve la clave más pequeña que es mayor o igual a la clave especificada.

floorKey(key): Este método devuelve la clave más grande que es menor o igual a la clave especificada.

higherKey(key): Este método devuelve la clave más pequeña que es mayor que la clave especificada.

lowerKey(key): Este método devuelve la clave más grande que es menor que la clave especificada.

	 */
	
	


}
