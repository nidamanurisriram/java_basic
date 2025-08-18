// In java collection is a framework is used to store the data in dynamical procedure. Collection provides dynamical memory allocation to store the data.

// Collection framework is extended by three interfaces which sub classes that provides various data storing mechanisms in a dynamical procedure. 

// Hierarchy of collection interface - Iterable -> Collection -> 1. List --> a. ArrayList --> b. LinkedList --> c. Vector -> 2. Queue -> a. Deque -> ArrayDeque --> b. PriorityQueue -> 3. Set --> a. HashSet -> LinkedHashSet -> b. SortedSet -> NavigableSet -> TreeSet.  

// Hierarchy of map interface - Map --> 1. HashTable --> 2. HashMap -> a. LinkedHashMap -> 3. SortedMap -> a. NavigableMap --> TreeMap.

// Collection stores multiple data type elements. To make it store particular data type elements generic concept is used.

// Generics make the collection object to store particular data type elements. Syntax : Collection<DataType> referenceVariableName = new ArrayList();

// Iterator is an inbuit class that provides features to iterate through elements of collection. Syntax : Iterator<Generic> iterator = collectionObject.iterator();

// Since collection is an interface we cannot create objects using the collection constructor so to create objects for collection list, queue, set interface classes constructor will be used. 

package dataStructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Collecton to store heterogeneous data elements");
		
		Collection random = new ArrayList();
		
		random.add(1);
		random.add(1.01);
		random.add('c');
		random.add(false);
		random.add("Sriram Nidamanuri");
		
		System.out.println(random);
		
		System.out.print("Iterator : " );
		
		Iterator iterator = random.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		System.out.print("\n");
		
		System.out.print("For each : ");
		
		random.forEach((data) -> System.out.print(data + " "));
		
		System.out.println("");
		
		System.out.println("Collection to store homgeneous data elements using generic concept");
		
		Collection<String> products = new ArrayList<String>();
		
		products.add("Telephone");
		products.add("Mobile");
		products.add("Laptop");
		products.add("Computer");
		products.add("Television");
		
		System.out.println(products);
		
		System.out.print("Iterator : ");
		
		iterator = products.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		System.out.print("\n");
		
		System.out.print("For each : ");
		
		products.forEach((product) -> System.out.print(product + " "));
		
	}

}
