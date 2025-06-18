// variables are used to store the data in it.

// Syntax : accessModifier dataType variableName = data;

// If a variable declared globally it is referred to field.

// Syntax : 
//   class className { 
//	   [optional] accessModifier dataType variableNmae = data; --> field
//	   public static void main(String[] args) { } 
//	   }

// Default values of variables

// Fields

// Fields can be used even without initializing since fields will be having default values.

// int -- 0.

// double -- 0.0.

// char -- [blank].

// boolean -- false.

// String -- null.

// Local variables

// Local variables are not having default values they must be initialized before usage or else compilation error will be thrown.

// Field access : 

// static fields are accessible using by referencing it to class name. Syntax : className.field;

// non static fields are accessible using by referencing it to instance or object name. className.field;

// If a variable declared within member closed brackets it is referred to parameter.

// Syntax : 
//   class className { 
//	   dataType variableNmae = data; --> field
//     public className(dataType variableName) { --> constructor parameters
//     this.variableName = variableName; --> this a keyword that denotes a member belongs to instance or object of a class.
// }
// 	   public void message(dataType variableName) { --> method parameters
//     variableName = data; 
// }
//	   public static void main(String[] args) { } 
//	   }

// If an variable declared within a member scope of a class it is referred to local variable.

// Syntax : 
//   class className { 
//	   dataType variableNmae = data; --> field
//     public className(dataType variableName) { --> constructor parameters
//     this.variableName = variableName; --> this a keyword that denotes a member belongs to instance or object of a class.
// }
// 	   public void message(dataType variableName) { --> method parameters
//     variableName = data; 
// }
//	   public static void main(String[] args) { 
//	   dataType variableName = data; --> variable.
//     if(boolean condition) {
//      dataType variableName = data; --> varable.
//	   }
// }

// If a field and variable shares same name then to make compile differentiate

// Static fields are referenced to class name. 

// Syntax : 
//   class className { 
//	   static String message;
//	   public static void main(String[] args) { 
//	   String message = "Hi";  --> Local variable.
//	   className.message = "Hello";  --> Calling static field which shares same variable name within scope and to differentiate it from local variable it is referenced using class name. 
// }

// Non static fields are referenced to object or instance name.

//Syntax : 
//   class className { 
//	   String message;
//	   public static void main(String[] args) { 
//	   String message = "Hi";  --> Local variable.
// 	   className objectName = new className();
//	   object.message = "Hello";  --> Calling non static field which shares same variable name within scope and to differentiate it from local variable it is referenced using instance or object name. 
// }

// Note : Fields and local variables / parameters can share same name but parameters and local variables of a scope cannot share same name because they belong to same member scope and variable name cannot be same which are declared in same member scope.

package fundamental;

public class VariablesDemo {
	
	static int i1;
	
	static double d1;
	
	static char c1;
	
	static boolean b1;
	
	static String s1;
	
	int number;
	
	static double decimal;
	
	static char ch;
	
	boolean status;
	
	String message;
	
	public VariablesDemo() {
		
	}
	
	public VariablesDemo(String message) {
		this.message = message;
	}
	
	public static int add(int a) {
		int b = 5;
		return a+b;
	}
	
	public static void main(String[] args) {
		
		int number = 101; // Local variable
		
		VariablesDemo.ch = 'a';
		
		VariablesDemo variablesDemo = new VariablesDemo();
		
		variablesDemo.number = 123; // Non static field
		
		VariablesDemo variablesDemo1 = new VariablesDemo("Hi");
		
		double decimal = 0.1; // Local variable
		
		VariablesDemo.decimal = 1.1; // Static field
		
		boolean status = true;
		
		System.out.println("Default value of integer field : " + i1 + "\n" 
							+ "Default value of decimal field : " + d1 + "\n" 
							+ "Default value of character field : " + c1 + "\n" 
							+ "Default value of boolean field : " + b1 + "\n" 
							+ "Default value of String field : " + s1 );
		
		System.out.println("Printing static field data : " + ch);
		
		System.out.println("Printing non static field data : " + variablesDemo.number);
		
		System.out.println("Printing same variable name local variable value : "+ number);
		
		System.out.println("Printing same variable name non static field value : "+ variablesDemo.number);
		
		System.out.println("Printing same variable name local variable value : "+ decimal);
		
		System.out.println("Printing same variable name static field value : "+ VariablesDemo.decimal);

		
		System.out.println("Printing field data assigned using constructor parameters : " + variablesDemo1.message);
		
		System.out.println("Printing variablesDemo object add method using method parameters : " + variablesDemo.add(10));

		// each constructor consists it's own non static members of a class.

		System.out.println("Printing variablesDemo1 object add method using method parameters : " + variablesDemo1.add(11)); 
		
		System.out.println("Printing variable data that is defined within main method scope : " + status + " is boolean value.");
	
		}

}
