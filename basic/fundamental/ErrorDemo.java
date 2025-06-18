// Error is referred to piece of code that interrupts the execution process.

// Errors are two types 1. Compile time errors 2. Run time errors.

// 1. Compilation time errors

// If a piece of code that causes compilation interruption at the time of execution then it is referred to compilation time error.

// Compilation time errors occurs due incorrect syntactical coding of the program.

// 2. Run time errors [ exception ].

// If a piece of code that causes execution interruption at the time of execution then it is referred to run time error or exception.

// Run time errors or exceptions occurs due to a certain operation is not able to perform by the JVM compiler and it causes execution interruption to avoid it exception handling has to be performed.

package fundamental;

public class ErrorDemo {

	
	public void compileTimeError() {
		System.out.println("Incorrect program syntax causes interruption in compilation referred to error.");
	}
	
	public void runTimeError() {
		System.out.println("An operation not able to perform at execution or run time causes execution interruption is referred to run time error or exception.");
	}
	
	public static void main(String[] args) {
		
		ErrorDemo errorDemo = new ErrorDemo();
		
		errorDemo.compileTimeError();
		
		errorDemo.runTimeError();
		
	}
	
}
