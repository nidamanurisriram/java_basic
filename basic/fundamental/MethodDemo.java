// Method is a block of code that performs a certain function.

// Syntax : accessMofier returnType methodName(no/required parameters) { }

// Parameter : methodName(dataType variable);

// Argument : value passed to the parameter.

// If a method return type declared as void then no return statement required.

// If a method return type declared as primitive/non primitive data types then return statement is required and it has to be last in the method statement.

// If a method declared as abstract the implementation for that method is not permitted. If a method declared as final the method cannot be override by inheritance and it will be having single implementation through out the program.

// If a method declared as static then the method will be stored in string pool area and accessed by using class reference. If a method declared as non static [ no access modifier is specified ] then it will be stored in constructor object and accessible using object reference.

package fundamental;

abstract class AbstractMethod {
	public abstract String rest();
}

public class MethodDemo extends AbstractMethod {
	
	public void wake() {   
		System.out.println("Please wake at 6'o clock."); 
	}			
	
	public static void ready() { 
		System.out.println("Prepare good for the day.");
	}
	
	public final String work() { 
		return "Do the required functionalities 10 hours.";
	}

	@Override
	public String rest() {  
		// TODO Auto-generated method stub
		return "Please take rest at 10'o clock.";
	}
	
	public static void main(String[] args) {
		
		MethodDemo methodDemo = new MethodDemo();
		
		methodDemo.wake(); //Non static no return type method.
		
		MethodDemo.ready(); // Static method.
		
		System.out.println(methodDemo.work()); // Final return type method.
		
		System.out.println(methodDemo.rest()); // Implemented abstract method with return type.
		
	}
	
	
}
