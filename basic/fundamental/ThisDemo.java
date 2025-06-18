// This keyword specifies a member of a class belongs to the instance or object itself.

// This keyword can be applied to instance or non static members of class.

// Since static members doesn't belongs to instance or object they cannot be referenced to this.

// When an instance or object is created it will load all the instance or non static members of class.

// Instance or non static members of the class belongs to the instance or object.

// If a local variable of the instance or object shares same name as the non static member of a class then to differentiate non static member of class which belongs to the object from local variable this keyword is referenced to the instance or non static member.

// If this keyword is referenced to a non static member of a class then it will be referred as the loaded non static member into the object.

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// this(matching arguments) is used in constructor chaining.

// To call a constructor in another constructor this() is used.

// this(matching arguments) has to be the first statement in the constructor if its called.

// Multiple this() statements are not allowed to declare in a constructor. Single this statement is permitted.

// If a constructor has parameters then the constructor called with matching arguments.

// Example : public ThisDemo(int a, int b) { }

// To call above constructor in another constructor need to used this(10, 40) matching this statement.

// Note : within a constructor only one another constructor can be called that means only single this() or this(arguments) is allowed.


package fundamental;

public class ThisDemo {
	
	int number;
	
	public ThisDemo() {
		this.wish();
		System.out.println("I am empty constructor");
	}
	
	public ThisDemo(int number) {
		System.out.println("Same variable name as non static field and referencing this keyword  to a variable make it non static and another one as local variable.");
		this.number = number;
		System.out.println("The local variable assigned value to instance field and they are seperated using this reference to a variable and given value for the instance field is : " + this.number);
	}
	
	public ThisDemo(String sentense) {
		System.out.println(sentense);
	}
	
	public ThisDemo(String name, String wish) {
		this("I am calling the constructor having single parameter");
		System.out.println("Hello " + name + " " + wish);
	}
	
	public void wish() {
		System.out.println("Hello !!");
	}
	
	public static void main(String[] args) {
		
		ThisDemo thisDemo = new ThisDemo();
		
		ThisDemo thisDemo1 = new ThisDemo(123);
		
		ThisDemo thisDemo2 = new ThisDemo("I am a constructor having single parameter");
		
		ThisDemo thisDemo3 = new ThisDemo("Sriram Nidamnuri", "How are you");
		
	}

}
