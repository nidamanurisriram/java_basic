//In java object class is presented in java.lang package and it is super class of all classes.

//Object class has default methods that are used perform various kind of operation for an object.

//Since object class super class of all classes, each object has access to use the default methods of object class.

// toString()                               : provides string format for the object data.

// equals(Object o)                         : compares two object has identical data or not.

// clone()                                  : creates a copy of an object.

// hashCode()                               : return address memory of an object in the hash code format.

// getClass()		                        : return an object class related information.

// finalize()                               : used while performing garbage collection for an object.

// wait()                                   : to provide wait time for another thread execution.

// wait(long milliseconds)                  : to provide wait time for another thread execution.

// wait(long milliseconds, int nanoseconds) : to provide wait time for another thread execution.

package inBuiltFeature;

class Student {
	
	int id = 4;
	
	String name = "Sriram Nidamanuri";
	
	String branch = "CSE";
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id +" "+name+" "+branch;
	}
	
}

public class ObjectClassDemo implements Cloneable{
	
	int id;
	
	String name;
	
	public ObjectClassDemo (int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		ObjectClassDemo o1 = (ObjectClassDemo) obj;
		
		// this is referred to the object which is calling equals method
		
		// o1 object is referred to the object which being compared in equals method
		
		return this.id == o1.id && this.name.equals(o1.name);
	}
	
	private static Student student = new Student();
	
	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
			
		System.out.println(student); 
		
		System.out.println("toString() method returns text content of an object");
		
		System.out.println(student.toString());
		
		System.out.println("Hashcode is an unique value that is assigned to object and used for comparison of two objects");
		
		System.out.println("SInce has code is random unique hash number that is assigned to an object some times two objects with different text content in it might have same hash codes in this comparison will not work as expected so while comparison of two objects using hash code equals method is also recommended.");
		
		String s1 = "Hi";
		
		String s2 = "Hello";
		
		System.out.println("String s1 hash code is " + s1.hashCode());
		
		System.out.println("String s2 hash code is " + s2.hashCode());
		
		ObjectClassDemo o1 = new ObjectClassDemo(1, "Object Class");
		
		ObjectClassDemo o2 = new ObjectClassDemo(1, "Object Class");
		
		System.out.println("Object o1 and o2 share the same text content and comparing the object using hash code");
		
		System.out.println("Object o1 hash code is " + o1.hashCode());
		
		System.out.println("Object o2 hash code is " + o2.hashCode());
		
		System.out.println("As object o1 and o2 share same text context data but while comparing using hash code of their object result is appears as not equal");
		
		System.out.println("Equals method provide context level comparison for two objects. WHile comparing two objects by overriding equals method has to do comparison");
		
		System.out.println("Object o1 text content is equals to object o2 is " + o1.equals(o2));
		
		System.out.println("Clone method creates copy of an object and while cloning an object the respective class has to implement clonable interface and throws clone not supported exception");
		
		ObjectClassDemo o3 = (ObjectClassDemo) o1.clone();
		
		System.out.println("Object o3 id is " + o3.id);
		
		System.out.println("Object o3 name is " + o3.name);
		
		System.out.println("Get class method return the class information of an object");
		
		System.out.println("Get class method return class data type as result so data has to be stored in Class data type");
		
		Class classInfo = o1.getClass();
		
		System.out.println("O1 class information is " + classInfo);
		
		System.out.println("Finalize method will be invoked during the garbage collection");
		
		o1 = null;
		
		System.gc(); // garbage collection method is called and finalize method will be executed along with it.
		
		try {
			System.out.println("Object o1 id value after garbage collection " + o1.id);
			
			System.out.println("Object o2 name value after garbage collection " + o2.name);	
		}
		
		catch (NullPointerException e) {
			System.out.println("Object o1 is null");
		}
		
		System.out.println("Wait method will make stop execution of a particular resource in synchronization until the resource called using notify or notify all methods");
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method is called");
		super.finalize();
	}
}
