// String Builder data type is used to store the string data.

// String Builder stored data will be stored in the heap area.

// Syntax : StringBuilder stringBuilder = new StringBuilder("String Data");

// String Builder is mutable nature so data operations impact on stored variable.

// String Builder is not synchronized and so not thread safe not applicable multi thread programming.

package fundamental;

public class StringBuilderDemo {
	
	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder("Hello World!!");
		
		System.out.println("Printing original variable data : " + stringBuilder);
		
		stringBuilder.reverse();
		
		System.out.println("Printing the variable after performating a data operation in it : " + stringBuilder);
		
	}

}
