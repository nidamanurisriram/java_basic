// Queue is data structure store the data elements in first in first out (fifo) order.

// LinkedList and PriorityQueue classes extends Queue interface and data will be stored using these class objects. 

package dataStructures;

import java.util.*;

public class QueueDemo {
	
	public static void main(String[] args) {
		
		Queue<Integer> numbers = new PriorityQueue<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		System.out.println(numbers);
		
		System.out.print("Iterator : ");
		
		Iterator<Integer> iterator = numbers.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		System.out.print("\n");
		
		System.out.print("For each : ");
		
		numbers.forEach((number) -> System.out.print(number + " "));
		
		System.out.println("");
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.addAll(numbers);
		
		System.out.println("PriorityQueue data elements : " + pq);
		
		Deque<Integer> dq = new ArrayDeque<Integer>();
		
		dq.addAll(numbers);
		
		System.out.println("Deque data elements         : " + dq);
		
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		
		ad.addAll(numbers);
		
		System.out.println("ArrayDeque data elements    : " + ad);
		
	}

}
