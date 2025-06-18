// Foreach method is used to internal traverse through collection and perform required operations.

// Foreach method belongs to iterable and its argument consumer is a functional it can implemented using the lambdas.

// In consumer take a single argument in accept method and process the data. The data of consumer is processed by foreach method.

// General implementation of foreach method takes implementing its consumer method and passing the object as argument to the for each method.

// After receiving the data foreach method has internal enhanced for loop which process data one by one and perform the desired operation.

// Since consumer is a functional interface it can be implemented using the lambda expression.

// Syntax : collectionObject.forEach(referenceVariable -> --implementation logic);

// Ex: collectionObject.forEach(referenceVariable -> system.out.println(referenceVariable));

package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<String> seasons = new ArrayList<String>();
		
		seasons.add("Spring");
		seasons.add("Summer");
		seasons.add("Monsoon");
		seasons.add("Autumn");
		seasons.add("Pre winter");
		seasons.add("Full winter");
		
		System.out.println("Traditional implementation of the for each method");
		
		Consumer<String> cons = new Consumer<String>() {

			@Override
			public void accept(String season) {
				// TODO Auto-generated method stub
				System.out.println(season);
			}
			
		};
		
		seasons.forEach(cons);
		
		System.out.println("Implementation of foreach method using the lambda expression");
		
		seasons.forEach(season -> System.out.println(season));
		
	}
	
}
