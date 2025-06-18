// Java follows certain naming standards while naming members of a program.

// A program consists project library package class blocks constructor variable method.

// Project and library follows a certaing naming format.

// Custom Format -- Naming convetion is free style name can include all alphabets numbers special characters and last letter of project name cannot be a 'space'.

// 1. Project -- Custom Format. 

// 2. Library -- Custom Format.

// Remaining program members follows camel or pascal casing name convetion that contains a set of rules while naming.

// Standard rules

// 1. Name has to start with alphabets.

// 2. Name cannot end with space as its last letter.

// 3. Name can contain numbers but cannot be first letter of name.

// 4. Name can contain only single special character '$' and other special characters are not allowed and first letter cannot be a special character.

// Following above rules two standard naming format rules follows in general while naming members of program.

// Camel casing -- first letter of first word in whole name starts with small letter and later all the words first letter will be capital.

// Example -- if a program member has to name as "First Program" in camel casing format then naming convention of member is : "firstProgram".

// 3. Package -- camel casing.

// 6. Blocks -- [ blocks don't contain a name they are just 'static' or 'non - static' in name ].

// 7. Variables -- camel casing.

// 8. Methods -- camel casing.

// Pascal casting -- first letter of first word in whole name starts with capital letter and all the words first letter will be capital.

// Example -- if a program member has to name as "First Program" in pascal casing format then naming convention of member is : "FirstProgram". 

// 4. Class -- pascal scaling.

// 5. Constructors -- pascal casing.

// Java is a case sensitive programming language. Naming format must follow the case sensitive standards while doing the programming. 


package fundamental;

public class NamingConventionDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Project -- Name can contain alphabets numbers special characters last name cannot be space.");
		System.out.println("Library -- Name can contain alphabets numbers special characters last name cannot be space.");
		System.out.println("Package -- Name can contain alphabets numbers only one special characters '$' cannot contains spacees and first letter of first word in name is small and alphabet and next words is capital letter -- camel casing.");
		System.out.println("Class -- Name can contain alphabets numbers only one special characters '$' cannot contains spacees and first letter of first word in name is capital and alphabet and next words is capital letter -- pascal casing.");
		System.out.println("Constructors -- Name can contain alphabets numbers only one special characters '$' cannot contains spacees and first letter of first word in name is capital and alphabet and next words is capital letter -- pascal casing.");
		System.out.println("Blocks -- Just contains static or non static [ no access modifier is mentioned ].");
		System.out.println("Variables -- Name can contain alphabets numbers only one special characters '$' cannot contains spacees and first letter of first word in name is small and alphabet and next words is capital letter -- camel casing.");
		System.out.println("Methods -- Name can contain alphabets numbers only one special characters '$' cannot contains spacees and first letter of first word in name is small and alphabet and next words is capital letter -- camel casing.");
		
	}

}
