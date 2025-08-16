// String Builder data type is used to store the string data.

// String Builder stored data will be stored in the heap area.

// Syntax : StringBuilder stringBuilder = new StringBuilder("String Data");

// String Builder is mutable nature so data operations impact on stored variable.

// String Builder provides various pre defined method to perform data operations

// append() is used to add text to the existing variable data

// insert() is used to add text to the existing variable data at particular position

// delete() is used to delete text data in variable from particular index to another index position 

// String Builder is not synchronized and so not thread safe not applicable multi thread programming.

package fundamental;

public class StringBuilderDemo {
	
	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder("Sriram Nidamanuri");
		
		System.out.println("Printing original variable data : " + stringBuilder);
		
		stringBuilder.delete(7, 17);
		
		System.out.println("Printing the data after delete  " + stringBuilder);
		
		stringBuilder.insert(7, "Nidamanuri");
		
		System.out.println("Printing the data after insert  " + stringBuilder);
		
		stringBuilder.append(" Hi");
		
		System.out.println("Printing the data after append  " + stringBuilder);
				
		stringBuilder.reverse();
		
		System.out.println("Printing the data after reverse " + stringBuilder);
		
	}

}
