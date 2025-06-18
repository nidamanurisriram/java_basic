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
		
		System.out.println("Length of the collection is : "+ random.size());
				
		System.out.println("Printing each element of the collection using converting it to array and for loop.");
		
		Object randomArray[] = random.toArray();
		
		for(int i=0; i<randomArray.length; i++) {
			System.out.println("Element at index number "+ i +" : "+ randomArray[i]);
		}
		
		System.out.println("printing each element of the collection using converting it to array and enhanced for loop.");
		
		int i = 1;
		
		for(Object subject : randomArray) {
			System.out.println("Element " + i + " value is " + subject);
			i++;
		}
		
		System.out.println("Printing all the elements of the collection");
		
		System.out.println("Random collection data is : " + random);
		
		System.out.println("Collection to store homgeneous data elements using generic concept");
		
		Collection<String> subjects = new ArrayList<String>();
		
		subjects.add("C");
		subjects.add("C#");
		subjects.add("C++");
		subjects.add("Java");
		subjects.add("Python");
		
		
		System.out.println("Length of the collection is : "+ subjects.size());
		
		System.out.println("Printing each element of the collection using converting it to array and for loop.");
		
		Object subjectsArray[] = subjects.toArray();
		
		for(int i1=0; i1<subjectsArray.length; i1++) {
			System.out.println("Element at index number "+ i1 +" : "+ subjectsArray[i1]);
		}
		
		System.out.println("Printing each element of the collection using enhanced for loop.");
		
		int i1 = 1;
		
		for(Object subject : subjects) {
			System.out.println("Element " + i1 + " value is " + subject);
			i1++;
		}
		
		System.out.println("Printing all the elements of the collection");
		
		System.out.println("Subjects collection data is : " + subjects);
		
		System.out.println("Collection interface in built methods to perform data operation on collection object are.");
		
		System.out.println("Methods to add the elements");
		
		System.out.println("Method to add a single element is collectionObject.add(data)" );
		
		Collection<String> fruit = new ArrayList<>();
		
		fruit.add("Apple");
		
		Collection<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Grape");
		fruits.add("Orange");
		fruits.add("Banana");
		
		System.out.println("All the elemental data in the collection fruit object is " + fruits);
		
		System.out.println("To add multiple elements data into a collection object method is Collections.addAll(data)");
		
		Collection<String> fruitList = new ArrayList<>();
		
		Boolean status = Collections.addAll(fruitList, "Apple", "Grape", "Orange", "Banana");
		
		System.out.println("Is data added into fruitList object " + status);
		
		System.out.println("Fruit list collection object data is " + fruitList);
		
		System.out.println("Methods to find elements length");
		
		System.out.println("Number of elements in the fruitList object is " + fruitList.size());
		
		System.out.println("Methods to copy the elements");
		
		System.out.println("--");
		
		System.out.println("Methods to sort the elements");
		
		System.out.println("--");
		
		System.out.println("Methods to search the elements");
		
		System.out.println("--");
		
		System.out.println("Methods to delete the elements");
		
		System.out.println("Method to delete single element from collection is collectionObject.remove(data)");
		
		fruits.remove("Apple");
		
		System.out.println("Fruits collection object after removing apple in it " + fruits);
		
		System.out.println("Method to delete list of objects from a collection is collectionObject.removeAll(collection object)");
		
		fruitList.removeAll(fruit);
		
		System.out.println("Fruit list object data after removing similar fruits object data in it " + fruitList);
		
		Collection<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		
		System.out.println("Numbers object before deleting elements in it " + numbers);
	
		System.out.println("Method to delete all elements of a collection is collectionObject.clear()" );
		
		numbers.clear();
		
		System.out.println("Numbers object after deleting all the elements in it " + numbers);
	
		System.out.println("Methods to iterate the elements");
		
		System.out.println("To store each element of a collection for iteration the method is collectionObject.iterator()");
		
		System.out.println("To check that iterator collection object has next element in it iteratorObject.hasNext()");
		
		System.out.println("To return the value of an element index one by one the method is iteratorObject.next()");
		
		Collection<String> student = new ArrayList<String>();
		
		student.add("Sriram");
		student.add("Manoj");
		student.add("Pavan");
		student.add("Rishitosh");
		
		Iterator<String> iterator = student.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}

	}

}
