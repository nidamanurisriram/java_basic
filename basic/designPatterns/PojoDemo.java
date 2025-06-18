// Pojo in java is plain old java object. A class has to be independent by it self to be referred pojo.

// A class is referred to pojo if no extra dependencies like inheritance, annotations etc are added to the class. 

package designPatterns;

public class PojoDemo {
	
	int a = 1234;
	
	static double b = 101.4;
	
	public static void main(String[] args) {
		
		PojoDemo pojoDemo = new PojoDemo();
		
		System.out.println("Instance variable of pojo demo class data is " + pojoDemo.a);
		
		System.out.println("Static variable of pojo demo class data is " + b);
		
		System.out.println("Since the class has no extra dependencies in it this class is referred to Pojo class.");
		
	}

}
