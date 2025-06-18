// In java exception is referred to run time error.

// If an operation is not able to perform at the time of execution it is referred to exception or run time error.

// Exceptions are of two types 1. Checked Exception 2. UnChecked Exception.

// Checked exceptions are identified at the time of compilation that causes potential interruption of program execution these exceptions has to be handled using throws statement.

// Unchecked exceptions is a piece of code that causes program execution interruption. These exceptions has to be noted before execution and do exception handling manually using try catch or exception handling procedures. 

package fundamental;

public class ExceptionDemo {
	
	public void checkedException() {
		System.out.println("Exceptions that can be identified by the compiler that may causes execution interruption are checked exceptions.");
	}
	
	public void uncheckedException() {
		System.out.println("Exceptions that cannot be identified by the compiler but the piece of code causes the execution interrption at run time are referred to unchecked exceptions.");
	}
	
	public static void main(String[] args) {
		
		ExceptionDemo exceptionDemo = new ExceptionDemo();
		
		exceptionDemo.checkedException();
		
		exceptionDemo.uncheckedException();
		
	}

}
