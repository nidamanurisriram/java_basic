// Inheritance refers to one class inheriting the non static members of an other class.

// The class which perform inheritance refer to the subclass and the inherited class refer to super class.

// An interface is allowed to inherit another interface only.

// A class is allowed to inherit both class and interfaces. 

// "extends" and "implements" are the keywords used to perform the inheritance.

// A class inherits another class using "extends" keyword.

// A class inherits another interface using "implements" keyword.

// An interface inherits another interface using "extends" keyword.

// a. class inherits another class

// Syntax : class subclass_name extends superclass_name

// b. class inherits another interface

// Syntax : class subclass_name implements interface_name

// c. class inherits multiple interfaces

// Syntax : class subclass_name implements interface_name_1, interface_name_2, ... , interface_name_n

// d. class inherits both class and interface

// Syntax : class subclass_name extends superclass_name implements interface_name

// e. class inherits both class and multiple interfaces

// Syntax : class subclass_name extends superclass_name implements interface_name_1, interface_name_2, ... , interface_name_n

// f. interface inheriting another interface

// Syntax : interface subinterface_name extends superinterface_name

// g. interface inheriting multiple interfaces

// Syntax : interface subinterface_name extends superinterface_name_1, superinterface_name_2, ... , superinterface_name_n.

// Types of inheritances in java

// 1. Single Inheritance -- one class inherits another class. 

// 2. Multilevel Inheritance -- one class is inherited by a subclass and that subclass is super class to another class.

// 3. Hierarchical Inheritance -- one class is inherited by multiple subclasses.

// 4. Multiple Inheritance -- Single class inherits multiples classes [ not allowed in java due to diamond problem ].

// In java when one class inherits an another class its constructor will be called in its default constructor automatically. Since one constructor call inside a constructor is allowed in java, a class cannot inherit multiple classes and its called diamond problem in java. Since interfaces don't have constructors for it a class can inherit multiple interfaces.

package oops;

interface TeamOne {
	
	void oneTeam();
	
}

interface GroupOne {
	
	void oneGroup();
	
}

interface GroupTeam extends GroupOne {
	
	//interface inherits another interface
	
}

class TeamTwo implements TeamOne{
	
	// class inherit interface
	
	@Override
	public void oneTeam() {
		// TODO Auto-generated method stub
		System.out.println("One team did work till 50 percent of current project.");
	}
	
	public void twoTeam() {
		System.out.println("Two team resume the work and progress another 25 percent.");
	}
	
}

class TeamThree extends TeamTwo{
	
	// class inherit another class
	
	public void threeTeam() {
		System.out.println("Team three resume the work and progress another 25 percent to complete the project.");
	}
	
}

class TeamGroup implements GroupTeam {

	@Override
	public void oneGroup() {
		// TODO Auto-generated method stub
		System.out.println("Group one forms a team to work on a single project.");
	}
	
	
	
}

public class InheritanceDemo {
	
	public static void main(String[] args) {
		
		
		TeamThree teamThree = new TeamThree();
		
		teamThree.oneTeam();
		
		teamThree.twoTeam();
		
		teamThree.threeTeam();
		
		TeamGroup teamGroup = new TeamGroup();
		
		teamGroup.oneGroup();
	
		
	}

}
