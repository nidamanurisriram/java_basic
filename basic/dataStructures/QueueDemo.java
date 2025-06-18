// Queue is data structure store the data elements in first in first out (fifo) order.

// LinkedList and PriorityQueue classes extends Queue interface and data will be stored using these class objects. 

package dataStructures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		
		Queue<String> gadgets = new LinkedList<String>();
		
		System.out.println("Adding data elements to queue");
		
		gadgets.add("Mobile");
		gadgets.add("Computer");
		gadgets.add("Television");
		
		System.out.println("Printing data elements of a queue using enhanced for loop");
		
		for(Object gadget : gadgets) {
			System.out.println(gadget);
		}
		
		System.out.println("Printing data elements of a queue using iterator and while loop");
		
		Iterator<String> iterator = gadgets.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Printing data elements of queue using forEach method and lambda expression");
		
		gadgets.forEach(gadget -> System.out.println(gadget));
		
		System.out.println("To retrieve the head element");
		
		System.out.println(gadgets.peek());
		
		System.out.println("Remove data elements in queue");
		
		gadgets.poll(); // To remove the head element
		
		gadgets.remove(); // Remove single element
		
		Iterator<String> iterator1 = gadgets.iterator();
		
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
	}

}
