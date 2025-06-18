// Block is a type of method and independent piece of code declared with in a scope.

// Static blocks will be executed first before execution of main method in sequential manner.

// Non static blocks will be executed automatically whenever an instance or object is created in main method.

package fundamental;

public class BlockDemo {

	static {
		System.out.println("Printing Static Block Message First Time");
	}
	
	{
		System.out.println("Printing Non Static Block Message");
	}
	
	static {
		System.out.println("Printing Static Block Message Second Time");
	}
	
	public static void main(String[] args) {
		
		BlockDemo blockDemo1 = new BlockDemo();
		
		System.out.println("I am first printing statement in main method ...");
		
		BlockDemo blockDemo2 = new BlockDemo();
		
	}
	
}
