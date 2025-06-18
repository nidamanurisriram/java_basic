// Data type represents the type of data that is going to be stored in a variable.

// In Java there two types of data types 1. Primitive 2. Non Primitive

// Primitive data type denotes the type and size of a data. int, double, char, boolean.

// int - denotes the numbers. ex : int num = 11;

// double - denotes the decimal numbers. ex double decimal = 1.1;

// char - denotes a single character. ex char ch = 'a' or '1' or '#';

// boolean - denotes true or false value. ex boolean status = true or false.

// Non Primitive data types are used to store data in form class to perform data operations on stored data.

// String - denotes a collection of characters. ex String name = "Sriram Nidamanuri";

// Syntax - datatype variableName = value; 

// in the memory some size will be allocated to the variable name and within that size value will be stored. 

// Non Primitive data types are called reference types because they refer to objects. String Collections -> [ refer Data Structures ] are part of the Non primitive datatypes. 

package fundamental;

public class DataTypesDemo {
	
	public DataTypesDemo() {
		
	}
	
	public static void main(String[] args) {
		
		DataTypesDemo dataTypes = new DataTypesDemo();
		
		dataTypes.printPrimitiveDataTypes();
		
		DataTypesDemo.printNonPrimitiveDataTypes();
		
		System.out.println("String value through return type is : "+DataTypesDemo.printNonPrimitiveDataTypesUsingReturnType());
				
	}
	
	
	public void printPrimitiveDataTypes() {
		
		int number = 123;
		
		double decimal = 12.3;
		
		char character = 'a';
		
		boolean status = true;
		
		System.out.println("Integer value is : " + number);
		
		System.out.println("Decimal value is : " + decimal);
		
		System.out.println("Character value is : " + character);
		
		System.out.println("Boolean value is : " + status);
	}
	
	public static void printNonPrimitiveDataTypes() {
		
		String name = "Sriram Nidamanuri";
		
		System.out.println("String value is : "+ name);
		
	}

	public static String printNonPrimitiveDataTypesUsingReturnType() {
		
		String name = "Sriram Nidamanuri";
		
		return name;
		
	}

}
