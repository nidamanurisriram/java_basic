//Exceptions are handled using try catch block or using throws in method signature not to interrupt program execution 

//Throw keyword is used to throw an exception in the method body using new 

//Throws keyword is used to throw one or more exceptions in the method signature

//Throwable is super class of all exception classes used to perform generic exception handling

package exceptionHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class InvalidAgeException extends Throwable {
	
	public InvalidAgeException(String messsage) {
		super(messsage);
	}
	
}

public class ExceptionThrowDemo {
	
	public static String message = null;
	
	public static void message() {
		
		try {
		
		if(message==null) {
			throw new NullPointerException("Input is null");
		}
		
		else {
			System.out.println(message);
		}
			
		}
		
		catch(Exception e) {
			System.out.println("Exception occured "+ e);
		}
		
	}
	
	public static void readFile() throws IOException {
		
		try {
			
			File file = new File("C:\\Users\\nidam\\Documents\\basic.txt");
			
			Scanner sc = new Scanner(file);
			
			while(sc.hasNext()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
			
			sc.close();
			
		}
		
		catch(IOException ie) {
			ie.printStackTrace();
		}
		
	}
	
	public static void validateAge() {
		
		try {
			
		int age = 17;
		
		if(age < 18) {
			throw new InvalidAgeException("Not eligible to vote");
		}
		
		else {
			System.out.println("Eligible to vote");
		}
		
		}
		
		catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
	message();
	
	readFile();
	
	validateAge();
	
	}

}
