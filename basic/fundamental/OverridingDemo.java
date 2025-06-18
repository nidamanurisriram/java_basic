// Sub class implementing super class method with affecting the method signature is overriding.

// Abstract classes will be having constructor but interfaces cannot be having constructors.

// Abstract class can be having a constructor but not allowed to create instances or objects of it.

// A can inherit single class but it can inherit multiple number of interfaces since interface having no constructor.

// If super classes abstract method name is same and while overriding in subclass both methods having same name referred to single method and it belongs instance or object of subclass. 

package fundamental;

interface Functional{
	void addition();
}

interface Functional1{
	void subtraction();
}

abstract class FunctionalClass{
	
	abstract void addition();
}

public class OverridingDemo extends FunctionalClass implements Functional , Functional1 {

	@Override
	public void addition() {
		// TODO Auto-generated method stub
		int a = 10;
		
		int b = 101;
		
		int c = a + b;
		
		System.out.println("Override addition method result of a and b is : " + c);
		
	}

	@Override
	public void subtraction() {
		// TODO Auto-generated method stub
		int a = 10;
		
		int b = 101;
		
		int c = a - b;
		
		System.out.println("Override subtraction method result of a and b is : " + c);
	}
	
	public static void main(String[] args) {
		
		OverridingDemo overridingDemo = new OverridingDemo();
		
		overridingDemo.addition();
		
		overridingDemo.subtraction();
		
	}

}
