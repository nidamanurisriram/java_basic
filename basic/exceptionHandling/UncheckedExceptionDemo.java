// Exception that are ocuured during the execution of the program are unchecked exceptions

// Unchecked exceptions are handled using the try catch block

// Exception occurance logic is defined in the try block and exception handling logic is defined in catch block

package exceptionHandling;

import java.util.Scanner;

public class UncheckedExceptionDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter value a ");
			
			int a = sc.nextInt();
			
			System.out.println("Enter value b ");
			
			int b = sc.nextInt();
			
			int c = a%b;
			
			System.out.println("The division result is " + c);
			
		}
		
		catch (ArithmeticException ae) {
			
			System.out.println("Exception occured " + ae.getMessage());
			
		}
		
		
	}

}
