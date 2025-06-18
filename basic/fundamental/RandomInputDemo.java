// To give random input to a variable random input concept is used [ ex : otp ].

// Random class in util package has the methods to generate random value.

// Random integer decimal and boolean values can be generated using Random class.

// Import random class create object call default methods using object reference and store value.

package fundamental;

import java.util.*;

public class RandomInputDemo {
	
	private static Random random;
	
	public void randomInt() {
		System.out.println("Random integer value : " + random.nextInt(10000));
	}
	
	public void randomDouble() {
		System.out.println("Random double value : " + random.nextDouble());
	}
	
	public void randomBoolean() {
		System.out.println("Random boolean value : " + random.nextBoolean());
	}
		
	public static void main(String[] args) {
		
		RandomInputDemo randomInputDemo = new RandomInputDemo();
		
		random = new Random();
		
		randomInputDemo.randomInt();
		
		randomInputDemo.randomDouble();
		
		randomInputDemo.randomBoolean();
		
	}

}
