package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
	
	public static void main(String[] args) throws IOException {
		
		try {
			
			FileWriter writer = new FileWriter("C:\\Users\\nidam\\Documents\\demo.txt");
			
			writer.write("File handling operation write");
			
			writer.close();
			
			System.out.println("Successfully written");
			
		}
		
		catch(IOException ie) {
			
			System.out.println("An error has occured");
			
			ie.printStackTrace();
			
		}
		
		
	}

}
