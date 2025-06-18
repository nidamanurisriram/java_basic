// In java super keyword is to reference the parent class constructor variables and method.

// Subclass can access the parent class instance members by referencing it using super keyword.

// Note : If a sub class inherits super class then if there is no super class constructor calling using super(matching arguments) then default super() will be called in sub class constructor. 

// If a subclass calls a super class method using super keyword then the method will be called and override inside the same method.

// If a subclass variable or method has to be called inside a constructor then it will be direct reference. 

// Syntax : super.superClassMember[ member is either variable or method ]; 

// super keyword cannot be called inside a method it can be called inside a constructor or class scope [ not inside class members scope ].

// while calling constructor of super class in subclass constructor the syntax is super(matching parameters) and it has to be the first statement in constructor.

// In constructor chaining super(matching arguments) has to be the first statement in a constructor and multiple super(matching arguments) statements are not permitted to declare inside a constructor.

package fundamental;

class A1 {
	
	int number;
	
	public A1() {
		System.out.println("Empty constructor.");
	}
	
	public A1(int number) {
		this.number = number;
		System.out.println("My value is passed from the sub class is : " + this.number);
	}
	
	public String wake() {
		return "Wake up at 6'o clock.";
	}
	
}

class B1 extends A1{
	
	public B1() {
		super();  // Accessing parent class constructor using super keyword.
	}
	
	public B1(int number) {	
		super(number);
		super.number = number;
		System.out.println("Calling super class variable : " + super.number);
		System.out.println("Calling super class method : " + super.wake());  // Accessing super class members by referencing it to super keyword.
	}
	
}

public class SuperDemo extends A1 {
	
	@Override
	public String wake() {
		return super.wake(); //super class method can be accessed using super reference but it has be used inside override method of its own.
		
	}
	
	public static void main(String[] args) {
		
		B1 b1 = new B1();
		
		B1 b2 = new B1(123);
		
		SuperDemo superDemo = new SuperDemo();
		
		System.out.println(superDemo.wake());
		
	}

}
