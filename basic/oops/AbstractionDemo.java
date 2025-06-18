// Abstraction means hiding the core information and showing essential information.

// In java abstraction can be achieved in two ways 1. abstract class 2. interface.

// Steps to achieve abstraction

// 1. Create an abstract class or interface.

// 2. Declare the abstract methods in abstract class or interface.

// 3. Create implementation classes and inherit these abstract classes or interface.

// 4. Provide the implementation for the abstract methods of inherited abstract class or interface.

// 5. Use these classes to access the abstract class or interface methods implementation to achieve abstraction. 

// Abstract classes can have implementation methods in it and constructor for it so using interface we can achieve 100 percent abstraction.

package oops;

abstract class Animals {
		
	abstract void sound();
	
}

interface Cars {
	
	void price();
	
}

class Cat extends Animals {
	
	@Override
	public void sound() {
		System.out.println("Cat speak : Meow Meow.");
	}
	
}

class Dog extends Animals {
	
	@Override
	public void sound() {
		System.out.println("Dog speak : Bow Bow.");
	}
	
}

class Tata implements Cars {
	
	@Override
	public void price() {
		System.out.println("Tata car basic model price is : 100000.");
	}
	
}

public class AbstractionDemo {
	
	public static void main(String[] args) {
		
		Cat cat = new Cat(); 
		
		Dog dog = new Dog();
		
		// Animal base class information is hidden and its abstract methods are used through implementation classes.
		
		cat.sound();
		
		dog.sound();
		
		Tata tata = new Tata();
		
		// Car base interface information is hidden and its abstract methods are used through implementation classes.
		
		tata.price();
		
	}
	
}
