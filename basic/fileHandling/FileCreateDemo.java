package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\nidam\\Documents\\demo.txt");
		
		try {
		
		if(file.createNewFile()) {
			System.out.println("File created : " + file.getName());
		}
		
		else {
			System.out.println("File already exists");
		}
		
		}
		
		catch(IOException ie) {
			System.out.println("An error occured");
			ie.printStackTrace();
		}
		
	}

}
