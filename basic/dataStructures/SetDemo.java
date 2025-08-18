// Set is a data structure to store the elements and not allow duplicate values.

// Set is an interface and it is implemented by hashset and treeset classes etc.

// Hashset is used to store the data it not allows duplicate values and allow null.

// Treeset is used to store the data and maintain ascending order and not allow duplicates and nulls.

package dataStructures;

import java.util.*;

public class SetDemo {
	
	public static void main(String[] args) {
		
		Set<Character> alphabets = new HashSet<Character>();
		
		alphabets.add('a');
		alphabets.add('b');
		alphabets.add('c');
		alphabets.add('d');
		alphabets.add('e');
		
		System.out.println(alphabets);
		
		System.out.print("Iterator : ");
		
		Iterator<Character> iterator = alphabets.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		System.out.print("\n");
		
		System.out.print("For each : ");
		
		alphabets.forEach((alphabet) -> System.out.print(alphabet + " "));
		
		System.out.println("");
		
		HashSet<Character> hs = new HashSet<Character>();
		
		hs.addAll(alphabets);
		
		System.out.println("HashSet data elements       : " + hs);
		
		LinkedHashSet<Character> lh = new LinkedHashSet<Character>();
		
		lh.addAll(alphabets);
		
		System.out.println("LinkedHashSet data elements : " + lh);
		
		SortedSet<Character> ss = new TreeSet<Character>();
		
		ss.addAll(alphabets);
		
		System.out.println("SortedSet data elements     : " + ss);
		
		TreeSet<Character> ts = new TreeSet<Character>();
		
		System.out.println("TreeSet data elements       : " + ts);
		
		ts.addAll(alphabets);
		
	}

}
