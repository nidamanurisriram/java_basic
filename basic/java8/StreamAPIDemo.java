// StreamAPI is used to traverse through a collection object data elements and process the data

// Stream has multiple methods to process the data after fetching data elements into a stream such like sorted, filter, forEach etc.

package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamAPIDemo {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		Random random = new Random(); 
		
		for(int i = 1; i<=5; i++) {
			numbers.add(random.nextInt(100));
		}
		
		System.out.println("Printing all list elements " + numbers);
		
		System.out.println("Fetching all the list data into stream object");
		
		Stream<Integer> data = numbers.stream();
		
		System.out.println("Printing all stream elements " + data.toList());
		
		System.out.println("Find even numbers of a sorted list and add value 10");
		
		numbers.stream().sorted().filter(n -> n%2==0).forEach(n -> System.out.println(n+10));
		
	}

}
 