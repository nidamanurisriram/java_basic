//Exception is a logical error that interpts program execution in the runtime

//Exception handling is a process of handling the exceptions not to interrupt program exceution

//Exception that can be identified by compiler are checked exceptions and occurs at runtime are unchecked exceptions

//Checked exceptions are handled by throwing exception name using throws statement in the method statement

//Unchecked excetions are handled using try catch and finally block statements

//Exception occurance code will be surrounded in try block and exception handling logic implemented in catch block

//If exception occurs in the try block then execution of try block will be stopped and catch block is executed

//Finally block is used to execute a code piece irrespective of exception occurance and handling in try catch block 

package exceptionHandling;

public class ExceptionHandlingDemo {
	
	public static void main(String[] args) {
		
		try {
		
		int a = 10;
		
		int b = 0;
		
		int c = a/b;
		
		System.out.println("Divison result " + c);
		
		}
		
		catch(Exception e) {
			System.out.println("Exception occured: " + e);
		}
		
		finally {
			System.out.println("Finally block statement");
		}
	}
				
}
