// String is a data type used to store collection of characters in one variable.

// Syntax : String stringVariable = "data";

// Syntax : String stringVariable = new String("data");

// String is immutable in nature. String data is stored in string constant pool area and a variable is referenced to the data. 

// If data operations performed to string variable data then existing data won't be affected. A new data with respect to relative operation will be generated.

// The new generated data has to be stored in a new variable and existing variable data won't be affected this phenomenon makes string is immutable data in nature.

package fundamental;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String name = "Sriram Nidamanuri";
		
		System.out.println("Printing the name : " + name);
		
		name.concat("Hi ");
		
		System.out.println("Printing variable after concart : " + name);
		
		String newName = name.concat(" Hi.");
		
		System.out.println("Storing data operation result in new variable and printing it : " + newName);
		
		System.out.println("Storing the data in a string object");
		
		String statement = new String("An independent service has its own worth");
		
		System.out.println("Printing the string object data : " + statement);
		
		System.out.println("String class has default methods to perform various kind of data operations on the string object");
		
		System.out.println("To get the number of characters that presented in a string : stringVariable.length()");
		
		int count = name.length();
		
		System.out.println("Total characters present in the string name is " + count);
		
		System.out.println("To get a character at a particular index number is : stringVariable.charAt(indexNumber)");
		
		char ch = name.charAt(0);
		
		System.out.println("Character at 0 th index value is : " + ch);
		
		System.out.println("To split words in a string based on particular string input : stringVariable.split(String data)");
		
		String sentense = "Dog is an animal";
		
		String words[] = sentense.split(" ");
		
		System.out.println("All words in the string seperated using space( ) as string data are");
		
		for(Object word : words) {
			System.out.println(word + " ");
		}
		
		System.out.println("To form a new sub string from a particular index number of a string : stringVariable.substring(indexNumber)");
		
		String nameSubstring = name.substring(4);
		
		System.out.println("Name string value from index number 4 is " + nameSubstring);
		
		System.out.println("To get a sub string from a particular index number to another index number in a string : stringVariable.substring(indexNumber1, ( indexNumber2 + 1 ))");
		
		String nameSubstring1 = name.substring(4, 7);
		
		System.out.println("Substring of name from index number 4 to 6 is : " + nameSubstring1);
		
		System.out.println("To join one string with another string form a new joint string : stringVariable.concat(String data)");
		
		String firstName = "Sriram";
		
		String lastName = "Nidamanuri";
		
		String fullName = firstName.concat(lastName);
		
		System.out.println("The full name of candidate is constructued using string concat method " + fullName);
		
		System.out.println("To find index number of a particular string on its string occurance : stringVariable.indexOf(String Data)");
		
		System.out.println("Note if the input parameter string is not exists on the string then the method will return -1 value");
		
		int indexNumber1 = name.indexOf("Sriram");
		
		int indexNumber2 = name.indexOf("Machanath");
		
		System.out.println("Index number at first occurance Sriram in the name string is " + indexNumber1);
		
		System.out.println("Index number of a string data that is not presented in the name string is " + indexNumber2);
		
		System.out.println("To get the last occurance index of a specified string is : stringVariable.lastIndexOf(String Data)");
		
		int indexNumber3 = name.lastIndexOf("i");
		
		System.out.println("The last occurance index of string data in the name string is " + indexNumber3);
		
		System.out.println("To compare one string data with another string data : stringVariable.equals(String data)");
		
		System.out.println("If we use == to compare to strings then hash codes of the strings will be compared irrespective of the data to compare two string data equals method used");
		
		String word1 = "ABC";
		
		String word2 = "ABC";
		
		Boolean status = word1.equals(word2);
		
		System.out.println("String data in word1 is equal to string data in word2 is " + status);
		
		System.out.println("To compare one string data with another string irrespective of the case sensitive : stringVariable.equalsIgoneCase(String Data)");
		
		String word3 = "AbC";
		
		String word4 = "ABC";
		
		System.out.println("String data in word 3 is equal to string data in word4 is " + word3.equalsIgnoreCase(word4));
		
		System.out.println("To covert all the characters of a string to lower case : stringVariable.toLowerCase()");
		
		String nameLowerCase = name.toLowerCase();
		
		System.out.println("Name after converting to lower case using to lower case method " + nameLowerCase);
		
		System.out.println("To convert all the characters of a string to upper case : stringVariable.toUpperCase()");

		String nameUpperCase = name.toUpperCase();
		
		System.out.println("Name after converting to upper case using to upper case method " + nameUpperCase);
		
		System.out.println("To remove the spaces of a string at the start and end : stringVariable.trim()");
		
		String message = " Hi All ";
		
		System.out.println("String data after removing the spaces on start and end " + message);
		
		System.out.println("To replace single character with another character : stringVariable.replace('old char', 'new char')");
		
		String colour = "Brown";
		
		String newColour = colour.replace('B', 'G');
		
		System.out.println("String old colur before replacing character " + colour + " and string new colur after replacing character " + newColour);
		
		System.out.println("To check a particular string data present in the given string and it returns a boolean value : stringVariable.contains(String data)");
		
		String s1 = "Hello";
		
		Boolean isPresent = s1.contains("ll");
		
		System.out.println("Result of string data ll present in the string s1 is " + isPresent);
		
		System.out.println("To convert all the characters of a string to array data : stringVariable.toCharArray()");
		
		char charArrays[] = name.toCharArray();
		
		System.out.println("All characters that presented in the name string in array format is");
		
		for(char charArray : charArrays) {
			System.out.print(charArray+" ");
		}
		
	}

}
