// List is an interface used to store the data in a dynamically.

// List interface extends Collection and three classes 1. ArrayList 2. LinkedList 3. Vector implements List.

// Stack class extends vector class. 

// LinkedList extends Dequeue interface which is part of queue interface.

// In list interface the insertion order is preserved and duplicates and nulls are allowed while doing the data related operations and also list is prioritized upon these conditions.

// Since List is an interface objects cannot be created using its constructor because interfaces doesn't have constructors and instance fields. List objects will be created using the it's inherited classes ArrayList (or) LinkedList (or) Vector. 

// ArrayList

// ArrayList is a data structure which implements list interface. ArrayList is a dynamic array to store the elements and no size limit of storing data.

// ArrayList is less efficient in manipulating data compared to the LinkedList and is good for storing and access the data.

// ArrayList can contain the duplicate elements maintains the insertion order internally, since arraylist uses array to store data while manipulating (insert or delete) data the elements will be shifted inside memory and array will be reconstructed makes less efficient in data manipulation.

// LinkedList

// LinkedList is a data structure which implements list interface. LinkedList is a container to store the elements. When an element is added to a container another container will be created and has a link to the previous container.

// LinkedList is effiecient in manipulating data and is less efficient in storing and access the data compared to the ArrayList.

// LinkedList can contain the duplicate elements. Manipulating (insert or delete) of data is efficient using LinkedList because the insertion happens in node containers format. Each element is stored in a node and it contains a unique memory address location, insert or delete of an element in a node container has no effect on the other node containers or whole LinkedList makes LinkedList effient in data manipulation.


package dataStructures;

import java.util.*;

class ArrayListDemo {
	
	public ArrayListDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public void vehicles() {
		
		ArrayList<String> vehicles = new ArrayList<String>();
		
		vehicles.add("Bike");
		vehicles.add("Car");
		vehicles.add("Truck");
		
		System.out.println("Printing the all elements of array list");
		
		System.out.println(vehicles);
		
		System.out.println("Printing each element of array list using simple for loop");
		
		for(int i = 0; i<vehicles.size(); i++) {
			System.out.println(vehicles.get(i));
		}
		
		System.out.println("Printing each element of array list using simple for loop and converting it to array");
		
		Object[] vehicle = vehicles.toArray();
		
		for(int i = 0; i<vehicle.length; i++) {
			System.out.println(vehicle[i]);
		}
		
	}
	
}

class LinkedListDemo {
	
	public LinkedListDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public void fecilities() {
		
		LinkedList<String> facilities = new LinkedList<String>();
		
		facilities.add("Games");
		facilities.add("Music");
		facilities.add("Campign");
		
		System.out.println("Printing the all elements of linked list");
		
		System.out.println(facilities);
		
		System.out.println("Printing each element of linked list using simple for loop");
		
		for(int i = 0; i<facilities.size(); i++) {
			System.out.println(facilities.get(i));
		}
		
		System.out.println("Printing each element of linked list using simple for loop and converting it to array");
		
		Object[] facilitie = facilities.toArray();
		
		for(int i = 0; i<facilitie.length; i++) {
			System.out.println(facilitie[i]);
		}
		
	}
	
}

public class ListDemo {
	
	public static void main(String[] args) {
		
		List<String> hobbies = new ArrayList<String>();
		
		hobbies.add("Music");
		hobbies.add("Chess");
		hobbies.add("Cricket");
		
		System.out.println("Printing the all elements of a list");
		
		System.out.println(hobbies);
		
		System.out.println("Printing each element of the list using simple for loop");
		
		for(int i=0; i<hobbies.size(); i++) {
			System.out.println(hobbies.get(i));
		}
		
		System.out.println("Printing each element of the list by converting it to array and using for loop");
		
		Object hobbiesArray[] = hobbies.toArray();
		
		for(int i=0; i<hobbiesArray.length; i++) {
			System.out.println(hobbiesArray[i]);
		}
		
		System.out.println("Printing each element of the list using enhanced for loop");
		
		for(Object hobbie : hobbies) {
			System.out.println(hobbie);
		}
		
		System.out.println("Printing each element of the list using iterator and while loop");
		
		Iterator<String> iterator = hobbies.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Printing each element of the list using forEach method and lambda expression");
		
		hobbies.forEach(hobbie -> System.out.println(hobbie));
		
		System.out.println("\n" + "Array List Demo :");
		
		ArrayListDemo arrayListDemo = new ArrayListDemo();
		
		arrayListDemo.vehicles();
		
		System.out.println("\n" + "Linked List Demo :");
		
		LinkedListDemo linkedListDemo = new LinkedListDemo();
		
		linkedListDemo.fecilities();
		
	}

}
