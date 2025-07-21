// Casting one data type to another data type or casting one object to another object is type casting.

// Converting one data type another data type is data type casting.

// Data type casting is of two types 1. Widening Casting 2. Narrowing Casting.

// In widening casting data type conversion happens automatically. Declared data type can be converted to other data types automatically.

// In narrowing casting data type conversion happens manually. Declared data type is converted to other data types manually using casting statements.

// Syntax for manual data type casting : dataType variable = (dataType) data;

// Incremental order of important data types is byte -> short -> char -> int -> long -> float -> double.

// Short data types data can be stored in bigger data types automatically it widening casting and bigger data types data value is out of of range for short data types so the data has to be casted into suitable data type so the short data type variable can store the data.

// In java based on inheritance child class constructor can be casted to parent class object because it consists of parent class properties and sub class implementation will applied to the parent class object. This phenomenon is referred to as upcasting.

// Upcasting syntax : ParentClassName parentClassNameReferenceVariable = new ChildClassName();

// Upcasting is used to access child non static class program members through parent class object. 

// If parent and child classes both sharing same program members then after upcasting these program members of parent class will have the child class proerties   

// Casting this parent class object to child class to get the child class properties is referred to as downcasting. To perform downcasting upcasting is manadatory and upcasted object has to be casted to child class for downcasting

// Downcasting syntax : ChildClassName childClassNameReferenceVariable = (ChildClassName) parentClassReferenceVariable;

// Downcasting is used to get the all the child class properties to its object from the upcasted parent class object.

package fundamental;

class First {
	
	public void print() {
		System.out.println("First class method");
	}
	
}

class Second extends First {
	
	@Override
	public void print() {
		System.out.println("Second class method");
	}
	
}


public class TypeCastingDemo {
		
	public void wideningCasting() {
		
		char ch = 'A';
		
		int cno =  ch;
		
		System.out.println("Character input data " + ch);
		
		System.out.println("Character to Integer converted data " + cno);
		
		int number = 10;
		
		double decimal = number;
		
		System.out.println("Integer input data " + number);
		
		System.out.println("Integer to double converted data " + decimal);
		
	}
	
	public void narrowingCasting() {
		
		int no = 75;
		
		char ch = (char) no;
		
		System.out.println("Integer input data " + no);
		
		System.out.println("Integer to charavter converted data " + ch);
		
		double decimal = 10.14;
		
		int number = (int) decimal;
		
		System.out.println("Double input data " + decimal);
		
		System.out.println("Double to integer converted data " + number);
		
	}
	
	public void stringConversion() {
		
		String sno = "123";
		
		int number = Integer.parseInt(sno);  // converting string to primitive
		
		System.out.println("String input data " + sno);
		
		System.out.println("String to integer converted data " + number);
		
		boolean result = false; 
		
		String status = String.valueOf(result); // converting primitive to string		
		
		System.out.println("Boolean input data " + result);
		
		System.out.println("Boolean to string converted data " + status);
	}
	
	public static void main(String[] args) {
		
		TypeCastingDemo typeCastingDemo = new TypeCastingDemo();
		
		typeCastingDemo.wideningCasting();
		
		typeCastingDemo.narrowingCasting();
		
		typeCastingDemo.stringConversion();
		
		System.out.println("Upcasting and Downcasting example");
		
		First first = new First();
		
		System.out.print("Parent class print method output: " );
		
		first.print();
		
		First first1 = new Second();   // Casting child class constructor to parent class object - upcasting.
		
		System.out.print("Parent class print method output after upcastinhg: " );
		
		first1.print();
		
		Second second = (Second) first1; // Converting parent class object to child class object - Doowncasting.
		
		System.out.print("Child class print method output after downcasting: ");
		
		second.print();
				
	}

}
