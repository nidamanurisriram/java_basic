// Default means pre defined or in built that means already developed.

// Default program members are used to certain desired functionalities according to requirements. 

// Default or inbuilt libraries : Predefined libraries contains jar files which includes packages classes in it.

// Default or inbuilt packages  : Predefined packages contains classes in it and used to assess using import statement.

// Default or inbuilt classes   : Predefined classes contains predefined methods in it and these classes are imported to access the methods in it. 

// Default or inbuilt methods   : Predefined methods contains certain functionalities and these predefined methods are used to perform the desired requirement functionalities.

package fundamental;

public class DefaultMembersDemo {
	
	
	public void defaultLibraries() {
		System.out.println("Contains jar files and provides environment for programming.");
	}
	
	public void defaultPackages() {
		System.out.println("Contains default classes in it accessed using import statement.");
	}
	
	public void defaultClasses() {
		System.out.println("Contains default methods in it accessed using import packaging statement.");
	}
	
	public void defaultMethods() {
		System.out.println("Default methods contains certain functionalities are used to perform those functionalities.");
	}
	
	public static void main(String[] args) {
		
		DefaultMembersDemo defaultMembersDemo = new DefaultMembersDemo();
		
		defaultMembersDemo.defaultLibraries();
		
		defaultMembersDemo.defaultPackages();
		
		defaultMembersDemo.defaultClasses();
		
		defaultMembersDemo.defaultMethods();
		
	}

}
