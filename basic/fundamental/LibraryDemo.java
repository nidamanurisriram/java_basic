// Libraries in java includes packages in it. Packages consists of classes. 

// Classes consists program members in it variables constructors blocks methods in it.

// Libraries of two types 1. Predefined libraries 2. Custom libraries. 

// Predefined libraries consists of predefined packages and classes in it.

// These libraries are used to access the packages that contains predefined classes and its methods.

// Using import statement these library packages accessed in the classes. Syntax : import packageName.class;

// Importing statements are defined under the package name.

// Creating objects of these classes, predefined methods of these classes are accessible.

package fundamental;

import java.util.Random;
import java.util.Scanner;

public class LibraryDemo {
	
	public static void main(String[] args) {
		
		Random random = new Random(); // Random is predefined class that present in java util used to generate random values.
		
		Scanner scanner = new Scanner(System.in); // Scanner is a predefined class that present in java util used to take run time input data. 
		
		int number = random.nextInt(100);
		
		System.out.println("A random number is : " + number);
		
		System.out.print("Please enter a sentense : ");
		
		String sentence = scanner.nextLine();
		
		System.out.println("The entered sentense is : " + sentence);
		
	}

}
