// Manual created exceptions are custom exceptions

// Handling custom exceptions is custom exception handling

// Custom exceptions are created using a class and by extending exception class

// In custom exception class constructor use string arguments to define exception message

// Using the throw new keywords this custom exception can be thrown in the try catch block

package exceptionHandling;

import java.util.Scanner;

class AgeNotValidException extends Exception {
	
	public AgeNotValidException(String errorMessage) {
		super(errorMessage);
	}
	
}

public class CustomExceptionDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the age : ");
		
		int age = sc.nextInt();
		
		try {
			
			if(age>18) {
				System.out.println("Age is valid");
			}
			
			else {
				throw new AgeNotValidException("Age is not valid");
			}
				
		}
		
		catch (AgeNotValidException ae) {
			System.out.println("Exception is : " + ae.getMessage());
		}
		
	}
	
}
