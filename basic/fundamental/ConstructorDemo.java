//Constructor is a type of method which is used to create objects and assign values for non static members of a class.

//Object is created to get all non static members into it and accessing them using the object reference.

//Syntax - accessModifier ClassName();

//Constructor values can stored in class object and can be called using the class reference variable.

//ClassName className = new ClassName():  -- className is the object storing the ClassName() constructor data.

//new is the keyword that assigns new memory allocation.

//ClassName(); is the constructor part which will reside in that memory location.

//Note each constructor will have all the non static members like fields and methods of a class on it's own.

//Consider above example className(); as constructor of a class then it will be having all the non static members of that class.

//className reference variable is the object which is responsible to store the ClassName(); constructor data in it. As constructor contains non static members of a class.

//When constructor parameters or variables and non static fields shares same name, then to make compiler differentiate between them "this" keyword is referenced to a variable to consider it as non static field.

package fundamental;

class Student {
	
	int count;
	String stream;
	
	public Student() {
		
	}
	
	public Student(int count) {
		this.count=count;		
	}
	
	public Student(String stream) {
		this.stream=stream;
	}
	
	public Student(int count, String stream) {
		this.count=count;
		this.stream=stream;
	}
	
}

public class ConstructorDemo {
	
	public static void main(String[] args) {
	
		Student myStudent1 = new Student(10);
		
		Student myStudent2 = new Student("CSE");
		
		Student myStudent3 = new Student("ECE");
		
		Student myStudent4 = new Student(4,"CSE");
		
		Student myStudent5 = new Student(6,"ECE");
		
		System.out.println("Constructor 1 data : Total students are "+myStudent1.count+".");
		System.out.println("Constructor 2 data : Courses for enrollment are "+myStudent2.stream+" and "+myStudent3.stream+".");
		System.out.println("Constructor 3 data : Total "+myStudent4.count+" number of students enrolled in "+myStudent4.stream+".");
		System.out.println("Constructor 3 data : Total "+myStudent5.count+" number of students enrolled in "+myStudent5.stream+".");
		
	}
	
}
