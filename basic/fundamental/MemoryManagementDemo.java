// In java there are two memory units 1. Stack 2. Heap

// All static members of a class are stored in static pool area in heap memory.

// All the non static members of a class are stored within the objects of heap memory.

// new keyword allocates memory for an object and constructor of class loads all non static members to object.

// After compilation source code will be converted to byte code. 

// Later class loader loads all the code of main method class into heap area.

// Code execution commence from main method and execute code line by line in a sequential manner at stack area.

// Non static members of heap area are executed through it's instance or object.

// To make empty or destroy an object assign its value to null. 

// When an object value is assigned to null all the non static members of a class in that object will be destroyed.

// After execution of an object jvm compiler will do garbage collection -> destroying the object using finalize() method.

package fundamental;

public class MemoryManagementDemo {
	
	public MemoryManagementDemo() {
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("An object value is assigned to null so i was called to destroy the object");
	}
	
	public void message() {            // First Method Non Static Will be Stored in Heap Area.
		System.out.println("First Message");
	}
	
	public static String message(String message) {  // Second Method
		return message;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Compilation starts from the main method and execute code line by line");
		
		MemoryManagementDemo managementDemo = new MemoryManagementDemo();
		
		String message = MemoryManagementDemo.message("Second Message"); // Calling Second Method First 
		
		System.out.println("Second Method In Class Called First In Main Method : " + message);
		
		System.out.print("First Method In Class Called Second In Main Method : ");
		  
		managementDemo.message(); // Calling First Method Second.
		
		managementDemo = null;
		
		System.gc();
		
		System.out.println("Calling the object after destroying ");
		
		managementDemo.message();
		
	}

}
