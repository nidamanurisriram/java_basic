// Execution of a java program has two phases 1. compilation 2. interpretation.

// When a java program is executed "Javac compiler" convert the java source code .java file into byte code .class file.

// If code has any syntactical errors compilation errors will occur. 

// Compilation error occurs if code violates the java predefined rules for coding.

// Converting the source code to byte code is compilation. 

// Later "JVM" Java Virtual Machine provides environment for converting the byte code to machine learning code.

// Class loader scans the byte and loads the main method class and imported classes into a memory.

// Later Bytecode verifier checks the code is executable or not.

// Later JIT [Just In Time] Compiler converts the byte code into machine learning language which can be understandable by computer. 

// "JRE" Java Runtime Environment provides libraries for JVM so it can load verify execute and provide runtime environment. 

// Since JVM configuration will be there in all softwares and hardwares java is platform independent language byte code can be run on any device. 

// JVM provides run time environment using libraries set of JRE to run the byte code. JDK is used to run code and programming.  

// JDK is combination of JRE and development tools. JRE is a combination of 1. JVM 2. Library set. Development tools includes 1. Debugger 2. Javac compiler 3. JavaDoc.


package fundamental;

public class ExecutionDemo {
	
	public void compilation() {
		System.out.println("Compile java source code .java file to byte code .class file");
	}
	
	public void interpretation() {
		System.out.println("Convert the .class file byte code to machine learning code and execute.");
	}
	
	public static void main(String[] args) {
		
		ExecutionDemo executionDemo = new ExecutionDemo();
		
		executionDemo.compilation();
		
		executionDemo.interpretation();
		
	}

}
