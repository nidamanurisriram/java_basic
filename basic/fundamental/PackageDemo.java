// Packages consists collection of classes in it.

// Packages are of two types 1. Predefined 2. Custom.

// Predefined packages consists in pre defined libraries and are accessible by using import statements.

// Import statement syntax : import packageName.className;

// Import statement is defined under package declaration statement.

// Custom packages consists of custom classes and its methods in it.

// As like predefined packages custom packages are accessible by using import statement in the same manner.

// Custom package is the first statement of a program. It is declared before class and import statements.

// Syntax : package packageName.

package fundamental;

import java.util.Random;
import java.util.Scanner;

/* package -- Custom Package */ 
/* import -- Predefined Package */

public class PackageDemo {
	
	public static void main(String[] args) {
	
		Random random = new Random();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Random boolean value is : " + random.nextBoolean());
		
		System.out.print("Enter a string value : ");
		
		String sentence = scanner.nextLine();
		
		System.out.println("Entered sentence statement is : " + sentence);
		
	}

}
