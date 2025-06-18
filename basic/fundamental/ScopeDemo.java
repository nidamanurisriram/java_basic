// Scope defines a program unit boundaries.

// Syntax : { ... }

// Members of a scope are accessible with in the scope.   

// Scope of a program unit start with '{' open flower bracket.

// Scope of a program unit with with '}' closed flower bracket.

package fundamental;

import java.util.Scanner;

public class ScopeDemo {
	
	String data = "Non static member belongs to class scope.";
	
	public ScopeDemo() {
		System.out.println("Constructor belongs to class scope.");
	}
	
	public void data() {
		System.out.println("Non static method belongs to class scope.");
	}
	
	public static void main(String[] args) {
		
		ScopeDemo scopeDemo = new ScopeDemo();
		
		Scanner scanner = new Scanner(System.in);
		
		String data = "Local variable belongs to method scope";
		
		System.out.println(data);
		
		System.out.print("Please enter a number : ");
		
		if(scanner.nextInt()<4) {
			String data1 = "Local variable belongs to if condition statement scope";
			System.out.println(data1);
		}
		
		for(int i =1; i<=1; i++) {
			i = i+1;
			System.out.println("Local variable belongs to for loop statement scope " + i);
		}
		
	}

}
