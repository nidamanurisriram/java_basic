// Binding member variables with method functions is referred to as encapsulation.

// Encapsulation ensures to prevent illegal access or corruption of variables and data. 

// Steps for achieving encapsulation is

// 1. Creating private variables.

// 2. Creating setters and getters for them.

// Assigning and accessing of private data variables in other classes is done through their binded setters and getters methods or using constructor data can be assigned to private variables in other classes but accessing data is through getter methods.

package oops;

class Student {
	
	private int id;
	
	private String name;
	
	private String batch;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}
	
	public Student() {
		
	}
	
	public Student(int id, String name, String batch) {
		this.id=id;
		this.name=name;
		this.batch=batch;
	}

}

public class EncapsulationDemo {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		
		System.out.println("Assigning data to variables using their binded setter methods.");
		
		student.setId(10);
		
		student.setName("Sriram Nidamanuri");
		
		student.setBatch("Full Stack Java Development");
		
		System.out.println("Accessing data of variables using their binded getter methods.");
		
		System.out.println("Student id is : " + student.getId());
		
		System.out.println("Student name is : " + student.getName());
		
		System.out.println("Student batch is : " + student.getBatch());
		
		System.out.println("Assigning data to variables using the constructor.");
		
		Student student1 = new Student(11, "Sriram Nidamanuri", "Full Stack Java Development");
		
		System.out.println("Accessing data of variables using the binded getter methods.");
		
		System.out.println("Student id is : " + student1.getId());
		
		System.out.println("Student name is : " + student1.getName());
		
		System.out.println("Student batch is : " + student1.getBatch());
	}
	
}
