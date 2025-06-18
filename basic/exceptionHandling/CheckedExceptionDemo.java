// Exception that can be checked during the compilation time are checked exceptions

// Checked exceptions can be handled by using throws keyword in the method signature and by using try catch block

package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {
	
	public static void main(String[] args) throws FileNotFoundException  {
		
		FileInputStream fis = null;
		
		try {
		
			fis = new FileInputStream("c:\\users\\nidam\\demo.txt");
		
		}
		
		catch(FileNotFoundException fe) {
			
			System.out.println("File is not found " + fe.getMessage());
			
		}
			
		
	}

}
