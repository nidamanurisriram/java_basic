// Map is a data structure to store the data elements in key value pair

// Using map data cannot be fetched direct it can be traversed using keys

// HashMap, LinkedHashMap and TreeMap implements the Map interface. Map cannot allow to contain duplicate keys but allow to have duplicate values.

package dataStructures;

import java.util.*;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Map<Integer, String> products = new HashMap<Integer, String>();
		
		products.put(1, "Telephone");
		products.put(2, "Mobile");
		products.put(3, "Laptop");
		products.put(4, "Computer");
		products.put(5, "Television");
		
		System.out.println(products);
		
		System.out.println("Traverse through all key elements using keySet()");
		
		for(Object key : products.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("Traverse through all data elements of a Map using keys");
		
		for(Object key : products.keySet()) {
			System.out.println(products.get(key));
		}
		
		System.out.println("Printing both key and value data elements of a Hash Map");
		
		for(Object key : products.keySet()) {
			System.out.println("Key "+ key + " data element is " + products.get(key) );
		}
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.putAll(products);
		
		System.out.println("HashMap data elements       : " + hm);
		
		LinkedHashMap<Integer, String> lh = new LinkedHashMap<Integer, String>();
		
		lh.putAll(products);
		
		System.out.println("LinkedHashMap data elements : " + lh);
		
		SortedMap<Integer, String> sm = new TreeMap<Integer, String>();
		
		sm.putAll(products);
		
		System.out.println("SortedMap data elements     : " + sm);
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
	
		ht.putAll(products);
		
		System.out.println("HashTable data elements     : " + ht);
		
	}

}
