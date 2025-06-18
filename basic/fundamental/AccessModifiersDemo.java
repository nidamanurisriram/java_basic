// Access modifier is a keyword that defines access limit of the member to it is specified.

// Access modifiers can be applied to all members [ variables blocks constructors methods ] of class.

// In java important access modifiers are 1. public 2. default [ no access modifier specified ] 3. protected 4. private set to usage access limits of a class member.

// Public 

// Class -- If a class is declared public it is accessible direct with in same package and using import statement in other packages.

// Constructor -- If a constructor is declared public then it is accessible direct within same package and using import statement in other packages.

// Variable -- If a field is declared public it is accessible direct in same package and using import statement in other packages through object [ non static ] or class [ static ].  

// Method -- If a method is declared public it is accessible direct in same package and using import statement in other packages through object [ non static ] or class [ static ].  

// Default [ no access modifier is specified ]

// Class -- If a class declared default [ no access modifier specified ] it is accessible direct with same package and not accessible in other packages.  

// Constructor -- If a constructor declared default [ no access modifier specified ] it is accessible direct with same package and not accessible in other packages.   

// Variable -- If a field declared default [ no access modifier specified ] it is accessible direct with same package and not accessible in other packages through objects [ non static ] or class [ static ].  

// Method -- If a method declared default [ no access modifier specified ] it is accessible direct with same package and not accessible in other packages through objects [ non static ] or class [ static ].  

// Protected 

// Class -- Protected access modifier is not allowed to declare for class.

// Constructor -- If a constructor declared protected then it is direct accessible in same package and not accessible in other packages.

// Variable -- If a field is declared protected then it is accessible direct in same package and accessible through getters and setters in other packages.

// Method -- If a method is declared protected then it is accessible direct in same package and accessible through getters and setters in other packages.

// Private

// Class -- Private access modifier is not allowed to declare for class.

// Constructor -- If a constructor declared private then it is accessible direct in same class and not accessible in other classes of same package or in another packages.

// Variable -- If a field is declared private then it is accessble direct in same class and accessible through getters and setters for other classes in same package or in other packages.

// Method -- If a method is declared private then it is accessble direct in same class and accessible through getters and setters for other classes in same package or in other packages.

// In java important access modifiers are 1. final 2. abstract 3. static set to access properties limits of a class member.

// Final

// Class -- If a class is declared final then the class is not inheritable and creating objects mechanism will be same with respect to public default protected private as mentioned above.

// Constructor -- Final keyword is not permitted for constructor.

// Variable -- If a field is declared final then has to be initialize direct or through constructor if the field is non static before usage otherwise compilation error will be thrown.

// Method -- Final keyword is not permitted for a method if is abstract

// abstract

// Class -- Abstract keyword used for a class to create abstract methods. Creating abstract methods not permitted by not declaring the class as abstract. If a class is declared abstract then it is inheritable by subclasses by implementing its abstract methods and creating objects is not permitted.

// Constructor -- Abstract access modifier is not permitted for constructor. 

// Variable -- Abstract access modifier is not permitted to declare for a field.

// Method -- If a method declared as abstract then implementation for that method is not allowed and class has to declared as abstract or it has to be a interface. The abstract method implementation can be done by its sub class if sub class don't implement abstract method of its super class then it has to declared abstract. 

// static

// Class -- Static keyword is not permitted to declare for a class.

// Constructor -- Static keyword is not permitted to declared for a constructor.

// Variable -- If a field declared as static then it is not accessible through objects and accessible through class reference and share same value within the declared class.

// Method -- If a method declared as static then it is not accessible through objects and accessible through class reference and cannot be overridden in other classes it will be having the same implementation where it is declared.

// Permitted access modifiers for members of a program.

// Class -- public default abstract final.

// Constructor -- public default protected private [constructors load all non static members by default since it cannot be declared abstract and a constructor is essential for inheritance since it cannot be declared final ].

// Variable -- public default protected private final static [ variable must consist a value since it cannot be declared abstract ].

// Method -- public default protected private final abstract static.

package fundamental;

public class AccessModifiersDemo {
	
	public String sentence;
	
	private AccessModifiersDemo() {
		
	}
	
	public static void walk() {
		System.out.println("Walk 5km a day");
	}
	
	public static void main (String[] args) {
		
		AccessModifiersDemo accessModifiersDemo = new AccessModifiersDemo();
		
		accessModifiersDemo.walk();
		
	}

}
