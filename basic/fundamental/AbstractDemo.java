// Abstract means empty or no implementation.

// Abstract keyword can applied to method. 

// If a method is declared abstract and must declare abstract for class name also.

// Abstract class can contain implementation methods.

// In interfaces abstract keyword is applied default for all methods.

// Abstract methods can implemented through its subclass method overriding.

// Static members of a class are loaded into static pool area and cannot be shared through inheritance.

// Since abstract methods need to be implementation through inheritance static methods cannot be declared abstract.

// If a class inherits an abstract class then it must implement all the abstract methods or has to declare abstract.

package fundamental;

abstract class A {
	
	abstract void learn();
	
	abstract void practice();
}

abstract class B extends A {  // declaring abstract since it is not implementing all the abstract methods of super class.
	
	void learn() {
		System.out.println("Learn the subject");
	}
	
}

class C extends B {
	
	void practice() {
		System.out.println("Practice the learned subject");
	}
	
}

public class AbstractDemo{
	
	public static void main(String[] args) {
		
		System.out.println("Abstact Methods Demo ... ");
		
		C c = new C();
		
		c.learn();
		
		c.practice();
		
	}

}
