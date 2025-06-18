// The input given to the program at the run or execution time is referred to runtime input.

// Using predefined scanner class user can provide run time input to the code.

// Importing scanner class and and using its pre defined methods user can provide run time input.

package fundamental;

import java.util.*;

public class RuntimeInputDemo {
	
	private static Scanner scanner;
	
	public void numberRunTimeInput() {
		System.out.print("Please enter a number : ");
		int number = scanner.nextInt();
		System.out.println("Runtime input number : " + number);
	}
	
	public void decimalRunTimeInput() {
		System.out.print("Please eneter a decimal : ");
		double decimal = scanner.nextDouble();
		System.out.println("Runtime input decimal : " + decimal);
	}
	
	public void charRunTimeInput() {
		System.out.print("Please enter a character : ");
		char character = scanner.next().charAt(0);
		System.out.println("Runtime input character : " + character);
	}
	
	public void booleanRunTimeInput() {
		System.out.print("Please enter a boolean : ");
		boolean status = scanner.nextBoolean();
		System.out.println("Runtime input boolean : " + status);
	}
	
	public void stringRunTimeInput() {
		System.out.print("Please enter a string : ");
		String str1 = scanner.next();
		String str2 = scanner.nextLine(); 
		System.out.println("Runtime input string : " + str1 + " " + str2);
	}
	
	public static void main(String [] args) {
		
		RuntimeInputDemo runtimeInputDemo = new RuntimeInputDemo();
		
		scanner = new Scanner(System.in);
		
		runtimeInputDemo.numberRunTimeInput();
		
		runtimeInputDemo.decimalRunTimeInput();
		
		runtimeInputDemo.charRunTimeInput();
		
		runtimeInputDemo.booleanRunTimeInput();

		runtimeInputDemo.stringRunTimeInput();
		
	}

}
