// Enum is a special class that contains constants linke unchangable final variables

// Syntax : enum ClassName { // constant variables }

// It is used to fetch the constant data into the enum class object by calling through enum class 

// Syntax : enumClass variable = enumClass.Constant; 

package fundamental;

enum Week {
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
}

public class EnumDemo {
	
	public static void main(String[] args) {
		Week day = Week.Monday;
		System.out.println("Day 1 is " + day);
	}

}
