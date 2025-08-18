//Iterator is used to traverse collection object data elements in java

//Iterator next() method returns collection object data element from the starting index

//Iterator hasNext() is used to check whether collection object has a next data element from the starting index

package dataStructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		//Traverse elements using for loop
		
		int length = numbers.size();
		
		System.out.print("For loop : ");
		
		for(int i=0; i<=length-1; i++) {
			System.out.print(numbers.get(i) + " ");
		}
		
		System.out.println("");
		
		//Traverse elements using iterator
		
		Iterator<Integer> iterator = numbers.iterator();
		
		System.out.print("Iterator : ");
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		
	}

}
