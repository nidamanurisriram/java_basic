// Set is a data structure to store the elements and not allow duplicate values.

// Set is an interface and it is implemented by hashset and treeset classes etc.

// Hashset is used to store the data it not allows duplicate values and allow null.

// Treeset is used to store the data and maintain ascending order and not allow duplicates and nulls.

package dataStructures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class HashSetDemo {
	
	public void hashSetDemo() {
		
		Set<Character> alphabets = new HashSet<Character>();
		
		alphabets.add('a');
		alphabets.add('b');
		alphabets.add('c');
		alphabets.add('d');
		alphabets.add('e');
		alphabets.add('f');
		
		System.out.println("Printing all the hashset elements using the enhanced for loop");
		
		for(Character alphabet : alphabets) {
			System.out.println(alphabet);
		}
		
		System.out.println("Printing all the hashset elements using the iterator and while loop");
		
		Iterator<Character> iterator = alphabets.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Printing all the set elements using the forEach method and lambda expression");
		
		alphabets.forEach(c -> System.out.println(c));
	}
	
}

class TreeSetDemo {
	
	public void treeSetDemo() {
		
		Set<Integer> randomNumbers = new TreeSet<Integer>();
		
		randomNumbers.add(41);
		randomNumbers.add(16);
		randomNumbers.add(14);
		randomNumbers.add(46);
		randomNumbers.add(54);
		randomNumbers.add(64);
		
		System.out.println("Printing all the treeset elemenets using the enhanced for loop");
		
		for(Integer randomNumber : randomNumbers) {
			System.out.println(randomNumber);
		}
		
		System.out.println("Printing all the treeset elements using the lambda expression");
		
		randomNumbers.forEach(n -> System.out.println(n));
	}
	
}

public class SetDemo {
	
	public static void main(String[] args) {
		
		HashSetDemo hashSetDemo = new HashSetDemo();
		
		hashSetDemo.hashSetDemo();
		
		TreeSetDemo treeSetDemo = new TreeSetDemo();
		
		treeSetDemo.treeSetDemo();
		
	}

}
