package fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReadDemo {
	
	public static void main(String[] args) throws IOException {
		
		try {
			
			File file = new File("C:\\Users\\nidam\\Documents\\demo.txt");
			
			Scanner sc = new Scanner(file);
			
			while(sc.hasNext()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
			
			sc.close();
			
		}
		
		catch(IOException ie) {
			System.out.println("An error has occured");
			ie.printStackTrace();
		}
		
	}

}
