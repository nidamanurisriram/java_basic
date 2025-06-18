// A single program member having same name with multiple implementations is referred to polymorphism.

// In java polymorphism is of two types 1. Compile time polymorphism 2. Run time polymorphism.

// Compile time polymorphism A single program member performing multiple implementations is referred to compile time polymorphism.

// Overloading is the example for compile time polymorphism while compilation only the overloaded program member will be having different implementations.

// Overriding is the example for run time polymorphism in this case the implementation of a single program member will be changed by its inherited class and identified at run time.


package oops;

class OverloadingExample {

	public void sum() {
		
		int a = 4;
		
		int b = 6;
		
		int c = a+b;
		
		System.out.println("Addition of two numbers " + a + " and " + b + " is " + c + ".");
		
	}
	
	public void sum(int a, int b) {
		
		int c = a+b;
		
		System.out.println("Addition of two numbers " + a + " and " + b + " is " + c + ".");
		
	}
	
	// Same name and different implementation is referred to overloading. Overloading can be achieved through different parameters in method signature.
	
}

class OverridingExample1 {
	
	public void addition() {
		
		int a = 4;
		
		int b = 6;
		
		int c = a + b;
		
		System.out.println("Addition of two numbers " + a + " and " + b + " is " + c + ".");
		
	}
	
}

class OverridingExample2 extends OverridingExample1 {
	
	@Override
	public void addition() {
		// TODO Auto-generated method stub
		int a = 5;
		
		int b = 6;
		
		int c = a+b;
		
		System.out.println("Addition of two numbers " + a + " and " + b + " is " + c + ".");
		
	}
	
	// Method signature has to be same and own implementation from the inherited class is referred to as overriding. Inheritance is must for overriding method syntax must be same method declaration in super class and sub class can have its own implementation.
	
}


public class PolymorphismDemo {
	
	
	public static void main(String[] args) {
		
		System.out.println("Compile time polymorphism...");
		
		OverloadingExample overloadingExample = new OverloadingExample();
		
		overloadingExample.sum();
		
		overloadingExample.sum(0, 1);
		
		System.out.println("Run time polymorphism...");
		
		OverridingExample1 overridingExample1 = new OverridingExample1();
		
		overridingExample1.addition();
		
		OverridingExample1 overridingExample2 = new OverridingExample2();
		
		overridingExample2.addition();
		
		OverridingExample2 overridingExample22 = new OverridingExample2();
		
		overridingExample22.addition();
		
		
	}

}
