// Final is a keyword used to declare member of a program will be having single implementation and cannot be inherited.

// Syntax : final class className { } or final dataType variableName = value; or final returnType methodName(){ // implementation }.

// Final access modifier modifies properties when its declared members of a program.

// Class -- if a class declared as final it is not permitted for inheritance.

// Constructor -- final access modifier cannot be permitted for constructor.

// Variable -- if a variable declared as final then it must be initialized cannot be reassigned with another value it will be shared same value across the program.

// Method -- if a method declared as final then it must be implemented while declaration and cannot be overridden or cannot have another implementation and shared same implementation across the program. 

package fundamental;

public class FinalDemo {
	
	final String sentense = "I am final field.";
	
	public FinalDemo() {
		
	}
	
	public final void talk() {
		System.out.println("I am final method.");
	}
	
	
	public static void main(String[] args) {
		
		FinalDemo finalDemo = new FinalDemo();
		
		System.out.println(finalDemo.sentense);
		
		finalDemo.talk();
	
	}

}
