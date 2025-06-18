// Java project consists predefined libraries and source code to run programs.

// Predefined libraries are there to provide inbuilt functions and are accessible by importing respective classes.

// Source code of project includes packages and classes in it.

// Libraries is collection of packages in it. Predefined libraries includes predefined packages and classes in it to assess members of it.

// Custom code of a project lies in source code that includes of custom defined packages and custom classes in the packages.

// To perform certain functionalities like taking run time input generating random numbers collections to store data requires inbuilt classes and its methods.

// A code of a class in projects executes from main method class and it loads all the used classes in main method.

// Project -> source code -> packages -> class is the project structure.

// Class -> package [optional] -> import statement [optional] -> class -> fields -> constructor -> blocks -> methods is the structure of a class.

package fundamental;

import java.util.Scanner;

public class ProjectDemo {
	
	String name = "Sriram Nidamanuri";   // field
	
	static {
		System.out.println("Hi Bro!!"); // block
	}
	
	public ProjectDemo() {   // constructor
		
	}
	
	public static void main(String[] args) {    // method
		
		Scanner scanner = new Scanner(System.in);
		
		ProjectDemo projectDemo = new ProjectDemo();   // object
		
		System.out.print("Enter a number : ");
		
		int number = scanner.nextInt();  // local variable
		
		System.out.println("Local variable number is : " + number);
		
		System.out.println("Field name is : " + projectDemo.name);
		
	}

}
