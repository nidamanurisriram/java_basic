// String Buffer is used to store string data.

// String Buffer data will be stored in heap area.

// Syntax : StringBuffer stringBuffer = new StringBuffer("String Data");

// String Buffer is mutable in nature ( data operations will be applied to same variable )

// String Buffer provides various pre defined method to perform data operations

// append() is used to add text to the existing variable data

// insert() is used to add text to the existing variable data at particular position

// delete() is used to delete text data in variable from particular index to another index position 

// String Buffer is synchronized and thread safe in nature and can be used in multi thread programming.

package fundamental;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		StringBuffer stringBuffer = new StringBuffer("Sriram Nidamanuri");
		
		System.out.println("Printing string buffer variable data : " + stringBuffer);
		
		stringBuffer.delete(7, 17);
		
		System.out.println("Printing the data after delete  " + stringBuffer);
		
		stringBuffer.insert(7, "Nidamanuri");
		
		System.out.println("Printing the data after insert  " + stringBuffer);
		
		stringBuffer.append(" Hi");
		
		System.out.println("Printing the data after append  " + stringBuffer);
				
		stringBuffer.reverse();
		
		System.out.println("Printing the data after reverse " + stringBuffer);
		
	}

}
