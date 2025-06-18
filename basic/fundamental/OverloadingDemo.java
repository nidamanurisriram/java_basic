// Multiple program members having same name but different parameters is overloading.

// If two methods having same signature and having different parameters it is method overloading.

// If two constructors having same signature and having different parameters it is constructor overloading. 

package fundamental;

public class OverloadingDemo {
	
	public OverloadingDemo() {
		System.out.println("Constructor 1");
	}
	
	public OverloadingDemo(String sentense) {
		System.out.println(sentense);
	}
	
	public void addition() {
		int a = 10;
		int b = 101;
		System.out.println("Addition of two numbers a and b is : " + (a+b));
	}
	
	public void addition(int a, int b) {
		System.out.println("Addition of two numbers a and b is : " + (a+b));
	}
	
	public int addition(int a, int b, int c) {
		return a + b + c;
	}
	
	public static void main(String[] args) {
		
		OverloadingDemo overloadingDemo = new OverloadingDemo();
		
		OverloadingDemo overloadingDemo1 = new OverloadingDemo("Constructor 2");
		
		overloadingDemo.addition();
		
		overloadingDemo.addition(10, 101);
		
		System.out.println("Addition of three variables a and b and c is : " + overloadingDemo1.addition(10, 101, 1011));
	}

}
