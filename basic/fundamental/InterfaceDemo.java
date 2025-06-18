// Interface is a template block used to achieve abstraction.

// Syntax : interface interfaceName { }

// In interface all the methods are abstract in nature.

// Java 8 introduces to have static and default methods in interfaces.

// An interface can be inherited by a class using implements keyword.

// Syntax : class className implements interfaceName { }.

// If a class inherits an interface it has to implement abstract methods.

// If a class don't implements the methods of an interface declare to abstract.

// For variables in interfaces static and final keywords are default.

// For methods in interfaces public and abstract are the default keywords.

// -------------------------------------------------------------------------------------------------------

// Interface method implementation

// Interface objects or instances cannot be initialized or created.

// Standard way of implementing interface is through sub class instances or objects.

// Another way of implementing interface methods is in it's own constructor.

// Syntax : Interface referenceVariable = new Interface() { method implementation };

// After following this implementation pattern using the instance or object reference variable calling the method.

package fundamental;

interface Intra {
	
	String name = "Sriram Nidamanuri";
	
	void talk();
	
	default void walk() {
		System.out.println("Please walk 5 km a day!");
	}
	
	static String practice() {
		return "Please learn career subject and practice!";
	}
	
	void rest();
	
}

public class InterfaceDemo implements Intra {

	@Override
	public void talk() {
		System.out.println("Hi I am " + Intra.name);
	}
	
	public static void main(String[] args) {
		
		InterfaceDemo interfaceDemo = new InterfaceDemo();
		
		interfaceDemo.talk();
		
		interfaceDemo.walk();
		
		System.out.println(Intra.practice());
		
		Intra intra = new Intra() {
			
			@Override
			public void talk() {
			System.out.println("Please speack in native language");	
			}
			
			public void rest() {
				System.out.println("Take rest of 10 hours a day.");
			}
			
		};
		
		intra.rest();
		
	}

	@Override
	public void rest() {
		// TODO Auto-generated method stub
		System.out.println("Take rest of 10 hours a day.");
	}

}
