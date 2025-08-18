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

public class ListDemo {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		System.out.println(numbers);
		
		System.out.print("For loop : ");
		
		int length = numbers.size();
		
		for(int i=0; i<=length-1; i++) {
			System.out.print(numbers.get(i) + " ");
		}
		
		System.out.print("\n");
		
		System.out.print("Iterator : ");
		
		Iterator<Integer> iterator = numbers.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		System.out.print("\n");
		
		System.out.print("For each : ");
		
		numbers.forEach((number) -> System.out.print(number + " "));
		
		System.out.println("");
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.addAll(numbers);
		
		System.out.println("ArrayList data elements  : " + al);
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.addAll(numbers);
		
		System.out.println("LinkedList data elements : " + ll);
		
		Vector<Integer> ve = new Vector<Integer>();
		
		ve.addAll(numbers);
		
		System.out.println("Vector data elements     : " +ve);
		
		Stack<Integer> st = new Stack<Integer>();
		
		st.addAll(numbers);
		
		System.out.println("Stack data elements      : " + st);
		
		
	}

}
