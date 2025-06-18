// In java object is blue print of class.

// An object is created using new keyword and a class constructor.

// new keyword allocates the memory for the object.

// Class constructor will load the all instance or non static members into the object.

// If a class inherits another class then sub class instances can be created super class constructor and load its all instance or non static members.

// If a class inherits another class then super class cannot create objects using sub class constructor and load its all instance or non static members.

// super class can create objects by using sub class constructors because super class will be having its instance or object members in sub class but sub class cannot create instances or objects using super class constructor because there are no instance or non static members of sub class in super class.

package fundamental;

class InstanceDemo1 {
	
	public void method1() {
		System.out.println("Instace Demo 1 class method.");
	}
	
}

class InstanceDemo2 extends InstanceDemo1{
	
	public void method2() {
		System.out.println("Instance Demo 2 class method.");
	}
	
}

public class ObjectDemo {
	
	public static void main(String[] args) {
		
		InstanceDemo1 instanceDemo1 = new InstanceDemo1();
		
		instanceDemo1.method1();
		
		InstanceDemo1 instanceDemo2 = new InstanceDemo2();
		
		instanceDemo2.method1();
		
		InstanceDemo2 instanceDemo3 = new InstanceDemo2();
		
		instanceDemo3.method2();
		
	}

}
