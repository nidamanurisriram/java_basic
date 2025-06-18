// Class is a single unit template definition block that contains all the program part and used to create instances or objects.

// Syntax : accessModifier class className { }.

// Class holds static and non static members. Members refer to fields, variables, methods, constructors, blocks.

// Note : If a member attribute defined within a scope of methods constructors blocks then we refer them as variable.

// Note : if a member attribute declared globally ooutside scope of methods constructors blocks then we refer them as fields.  

// Using class one can create instances or objects of it and access it's fields and methods inside of class or somewhere.

// If fields or methods declared static then they are accessible referencing it to class name within class or outside the class.

// If fields or methods declared non static then they are accessible referencing it to instance within class or outside the class.

package fundamental;

public class ClassDemo {
	
	int num;
	
	public ClassDemo() {
		
	}
	
	public ClassDemo(int num) {
		this.num = num;
	}
	
	public void printing() {
		ClassDemo classDemo = new ClassDemo(0);
		System.out.println("Printing value that is assigned using constrcutor : " + classDemo.num);
	}
	
	public static int printing(int num) {
		ClassDemo classDemo = new ClassDemo();
		classDemo.num = num;
		return classDemo.num;
	}
	
	public static void main(String[] args) {
	
		ClassDemo classDemo = new ClassDemo();
		
		System.out.println("Print number non static method");
		
		classDemo.printing();
		
		System.out.println("Print number using static method");
		
		System.out.println("Printing value that is assigned using method parameter : " +ClassDemo.printing(1));
		
	}

}
