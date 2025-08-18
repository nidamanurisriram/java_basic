//Method reference (::) shortens lambda expression implementation of functional interface

package java8;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceDemo {
	
	public static void main(String[] args) {
		
		List<String> numbers = new ArrayList<String>();
		
		numbers.add("10");
		numbers.add("20");
		numbers.add("30");
		numbers.add("40");
		numbers.add("50");
		
		System.out.print("For each         : ");
		
		numbers.forEach((number) -> System.out.print(number));
		
		System.out.println("");
		
		System.out.print("Method Reference : ");
		
		numbers.forEach(System.out::print);
		
	}

}
