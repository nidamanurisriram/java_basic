// Casting one data type to another data type or casting one object to another object is casting.

// Converting one data type another data type is data type casting.

// Data type casting is of two types 1. Widening Casting 2. Narrowing Casting.

// In widening casting data type conversion happens automatically. Declared data type can be converted to other data types automatically.

// In narrowing casting data type conversion happens manually. Declared data type is converted to other data types manually using casting statements.

// Syntax for manual data type casting : dataType variable = (dataType) data;

// Incremental order of important data types is byte -> short -> char -> int -> long -> float -> double.

// Short data types data can be stored in bigger data types automatically it widening casting and bigger data types data value is out of of range for short data types so the data has to be casted into suitable data type so the short data type variable can store the data.

// In java based on inheritance child class constructor can be casted to parent class object because it consists of parent class properties and sub class implementation will applied to the parent class object. This phenomenon is referred to as upcasting.

// Upcasting syntax : ParentClassName parentClassNameReferenceVariable = new ChildClassName();

// Upcasting is used to access parent class program members with child class implementation.

// This parent class reference variable will be consisting its program members from the child class constructor. Casting this parent class object to child class to get the child class properties is referred to as downcasting. To perform downcasting upcasting is manadatory and upcasted object has to be casted to child class for downcasting.

// Downcasting syntax : ChildClassName childClassNameReferenceVariable = (ChildClassName) parentClassReferenceVariable;

// Downcasting is used to get the all the child class properties from the upcasted parent class object.

package fundamental;


class First {
	
	public void print() {
		System.out.println("First class method.");
	}
	
}

class Second extends First {
	
	@Override
	public void print() {
		System.out.println("Second class method.");
	}
	
	public String print(String print) {
		return print;
	}
	
}


public class TypeCastingDemo {
	
	
	public void wideningCasting() {
		
		int number = 10;
		
		double decimal = number;
		
		System.out.println("Small data type value can be stored direct into large data types : " + decimal);
		
	}
	
	public void narrowingCasting() {
		
		double decimal = 10.01;
		
		int number = (int) decimal;
		
		System.out.println("To save large data types data into small data types the data has to be casted into storing data type : " + number);
	}
	
	public static void main(String[] args) {
		
		TypeCastingDemo typeCastingDemo = new TypeCastingDemo();
		
		typeCastingDemo.wideningCasting();
		
		typeCastingDemo.narrowingCasting();
		
		System.out.println("Upcasting and Downcasting example");
		
		First first = new First();
		
		first.print();
		
		First first1 = new Second();   // Casting child class constructor to parent class object - upcasting.
		
		first1.print();
		
		Second second = (Second) first1; // Converting parent class object to child class object - Doowncasting.
		
		second.print();
		
		System.out.println(second.print("Second class overloaded print method."));
		
	}

}
