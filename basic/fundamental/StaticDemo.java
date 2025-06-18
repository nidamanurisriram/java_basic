// static is a keyword that can be implied to members of a class.

// Members of a class -- blocks variables [ no access modifiers for local variables ] methods.

// Static members cannot be shared through inheritance they will be constant and static keyword can be applied to blocks variables methods.

// If a class member is declared as static then it will be loaded to static pool area in memory and can be accessible by using reference to class name. 

package fundamental;

public class StaticDemo {
	
	public StaticDemo() {
		
	}
	
	static {
		System.out.println("I am static block");
	}
	
	public static String sentense = "I am static field";
	
	public static String talk() {
		return "Hi I am Sriram Nidamanuri";
	}
	
	public static void main(String[] args) {
		
		String sentense = StaticDemo.sentense;
		
		System.out.println("Printing static field : " + sentense);
		
		System.out.println("Printing static method : " + StaticDemo.talk());
		
	}

}
