//An interface contains only one abstract method is referred to functional interface.

//A functional interface is denoted using the @FunctionalInterface annotation.

//Functional interfaces can implemented through lambda expressions which makes implementation of interface efficient. Supplier, Consumer, Predicate are examples of Functional Interface.

package java8;

@FunctionalInterface
interface Messenger {
	void message();
}


public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		Messenger messenger = () -> { System.out.println("Hi"); } ;
		
		messenger.message();
		
	}
	
}
