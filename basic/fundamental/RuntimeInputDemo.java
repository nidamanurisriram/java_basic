// The input given to the program at the run or execution time is referred to runtime input.

// Using predefined scanner class user can provide run time input to the code.

// Importing scanner class and and using its pre defined methods user can provide run time input.

package fundamental;

import java.util.*;

public class RuntimeInputDemo {
	
	public void numberRunTimeInput() {
		System.out.print("Please enter a number : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("Runtime input number : " + number);
	}
	
	public void decimalRunTimeInput() {
		System.out.print("Please eneter a decimal : ");
		Scanner scanner = new Scanner(System.in);
		double decimal = scanner.nextDouble();
		System.out.println("Runtime input decimal : " + decimal);
	}
	
	public void charRunTimeInput() {
		System.out.print("Please enter a character : ");
		Scanner scanner = new Scanner(System.in);
		char character = scanner.next().charAt(0);
		System.out.println("Runtime input character : " + character);
	}
	
	public void booleanRunTimeInput() {
		System.out.print("Please enter a boolean : ");
		Scanner scanner = new Scanner(System.in);
		boolean status = scanner.nextBoolean();
		System.out.println("Runtime input boolean : " + status);
	}
	
	public void stringRunTimeInput() {
		System.out.print("Please enter a single word string : ");
		Scanner scanner1 = new Scanner(System.in);
		String str1 = scanner1.next();
		System.out.println("Runtime input string : " + str1);
		System.out.print("Please enter a sentense(single or multiple word) string : ");
		Scanner scanner2 = new Scanner(System.in);
		String str2 = scanner2.nextLine();
		System.out.print("Runtime input string : " + str2);
	}
	
	public static void main(String [] args) {
		
		RuntimeInputDemo runtimeInputDemo = new RuntimeInputDemo();
		
		runtimeInputDemo.numberRunTimeInput();
		
		runtimeInputDemo.decimalRunTimeInput();
		
		runtimeInputDemo.charRunTimeInput();
		
		runtimeInputDemo.booleanRunTimeInput();

		runtimeInputDemo.stringRunTimeInput();
		
	}

}
