// Non static or instance keyword applied to members of class.

// Members of a class -- blocks variables [ no access modifiers for local variables ] methods.

// If no access modifier is mentioned to a member of class it is referred to non static or instance.

// Non static members loaded into constructors by default using constructor can create objects.

// Each object contains its individual constructor so its individual all non static members of a class.

// Non static or instance members of a class can be accessed through by referencing it to instance or object name.

package fundamental;

public class NonStaticDemo {
	
	String sentense = "I am non static field";
	
	public NonStaticDemo() {
		
	}
	
	{
		System.out.println("I am non static block.");
	}
	
	public String talk() {
		return "Hi I am Sriram Nidmanuri.";
	}
	
	public static void main(String[] args) {
		
		NonStaticDemo nonStaticDemo = new NonStaticDemo();
		
		System.out.println("Printing non static field : " + nonStaticDemo.sentense);
		
		System.out.println("Printing non static method : " + nonStaticDemo.talk());
		
	}

}
