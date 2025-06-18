// If a class is allowed create single object of it then the class is referred to as singleton class

// Singleton classes are used by other classes and allowed to create single object of it

// There are three steps included in creation of singleton class

// 1. Create a private static variable of class and initiate with null value

// 2. Create a private constructor of class

// 3. create a static method to check state of object is null or not if the object is null create object else object creation not allowed.

// Since once an object is initialized after checking null condition creation of other objects will not be allowed in this design pattern and the class is referred to singleton class.

package designPatterns;

class SingleTonTest {

	private static SingleTonTest singleTonTest = null;

	private SingleTonTest() {
		System.out.println("Hi");
	}
	
	public static SingleTonTest createInstance() {
		
		if(singleTonTest == null) {
			singleTonTest = new SingleTonTest();
		}
		
		return singleTonTest;
		
	}
	
//	private static SingleTonTest singleTonTest = null;
//	
//	private SingleTonTest() {
//		System.out.println("Hi");
//	}
//	
//	public static SingleTonTest createInstance() {
//		
//		if(singleTonTest == null) {
//			singleTonTest = new SingleTonTest();
//		}
//		
//		return singleTonTest;
//	}

}

public class SingleTonClassDemo {

		
	public static void main(String[] args) {
		
		SingleTonTest singleTonTest = SingleTonTest.createInstance();
		
		SingleTonTest singleTonTest2 = SingleTonTest.createInstance();
		
		System.out.println("Since the singleton class object is initialized after checking null condtion another object singleTonTest2 is not created.");
		
	}
}
