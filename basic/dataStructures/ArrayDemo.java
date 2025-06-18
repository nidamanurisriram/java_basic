// Arrays is kind of data structure to store multiple data elements in a single variable.

// Arrays are fixed in size and homogeneous in nature. 

// Syntax : DataType variableName[] = {data 1, data 2, data 3, data 4,......, data n};

// Example : int numbers[] = {1, 2, 3, 4, ......... , n};

// Syntax : DataType variableName[] = new DataType[length];

// Example : String weekDays = new String[7];

// Adding data to array variable - variableName[indexNumber] = data;

// Length of an array is last index + 1 cause indexing starts from zero.

// Array store the elements in the index format and first element of index start from 0.  

package dataStructures;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Storing elements in an array");
		
		int numbers[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.println("Printing each element of array using for loop");
		
		for(int i =0; i<=numbers.length -1; i++) {
			System.out.println("Element at index " + i + " is " + numbers[i]);
		}
		
		System.out.println("Printing each element of array using enhanced for loop");
		
		int n1 = 0;
		
		for(int number : numbers ) {
			System.out.println("Element at index " + n1 + " is " + number);
			n1++;
		}
		
		System.out.println("Stroring elements in an array using fixed length");
		
		String weekDays[] = new String[7];
		
		weekDays[0] = "Monday";
		
		weekDays[1] = "Tuesday";
		
		weekDays[2] = "Wednesday";
		
		weekDays[3] = "Thursday";
		
		weekDays[4] = "Friday";
		
		weekDays[5] = "Saturday";
		
		weekDays[6] = "Sunday";
		
		System.out.println("Array has two important default methods to perform data operations");
		
		System.out.println("To find the length of an array : arrayVariable.length");
		
		System.out.println("Length of the elements presented in the weekdays array " + weekDays.length);
		
		System.out.println("To get particular element of an array at a particullar index : arrayVariable[IndexNumber] ");
		
		System.out.println("Element that is presented at the 4 th index of weekdays array " + weekDays[4]);
		
		System.out.println("Printing each element of array using for loop");
		
		for(int i = 0; i<= weekDays.length - 1; i++) {
			System.out.println("Element at index " + i + " is " + weekDays[i]);
		}
		
		System.out.println("Printing each element of an array using enhanced for loop");
		
		int n2 = 0;
		
		for(String weekDay : weekDays) {
			System.out.println("Element at index " + n2 + " is " + weekDay);
			n2++;
		}
		
	}

}
