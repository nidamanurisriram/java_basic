// Lambda expressions are used to implement functional interface methods

// An interface contains single method is referred to functional interface

// -> is denoted as lambda expression

// Functional interface implemntation through lambda expression syntax : FunctionalInterface referenceVariable = (matchingArguments) -> { -- implementation logic };

package java8;

interface Dog {
	void speak();
}

interface Addition {
	void sum(int a, int b);
}

public class LambdaExpressionsDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Functional interface method with no parameters implementation through lambda expression");
		
		Dog dog = () -> {System.out.println("Bow Bow");};
		
		dog.speak();
		
		System.out.println("Functional interface method including parameters implementation through lambda expression");
		
		Addition addition = (int a, int b) -> { System.out.println(a+b);};
		
		addition.sum(4, 6);
		
	}

}
