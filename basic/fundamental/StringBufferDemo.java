// String Buffer is used to store string data.

// String Buffer data will be stored in heap area.

// Syntax : StringBuffer stringBuffer = new StringBuffer("String Data");

// String Buffer is mutable in nature ( data operations will be applied to same variable ).

// String Buffer is synchronized and thread safe in nature and can be used in multi thread programming.

package fundamental;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		StringBuffer stringBuffer = new StringBuffer("Sriram Nidmanuri");
		
		System.out.println("Printing string buffer variable data : " + stringBuffer);
		
		stringBuffer.reverse();
		
		System.out.println("Printing the same variable after a data operation : " + stringBuffer);
		
	}

}
