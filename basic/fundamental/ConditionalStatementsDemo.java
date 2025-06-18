// In java conditional statements are used to execute some part of code upon checking a condition.

// If the condition given to the conditional statement returns true then the code will be executed. 

// In java there are four conditional statements 1. if 2. if else 3. else if 4. switch.

// Note that a condition always returns a boolean output. If output of condition is true code in the conditional statement is executed.

// 1. if

// if(condition) { ..... }

// 2. if else

/* if(condition) {
 * ......    //code will be executed if the above condition is true.
 * }
 * else {
 * ......   //code will be executed if the if condition output is false.
 * }
 */

// 3. else if

/* if(condition) {
 * ..... // code will be executed if condition boolean outcome is true.
 * }
 * else if(condition) {
 * ..... // code will be executed if if condition output is false and current else if statement is true.
 * }
 * else if(condition) {
 * ..... // code will be executed if above conditions output is false and current else if statement is true.
 * }
 * else {
 * ..... // If all if and else if statements are false the else condition will be executed.
 * } 
 */

// 4. switch

// A data will be provided in the switch statement and cases will be written for it.

// If a case data matches with the switch statement data then the case data will be executed.

// If no case matches the switch statement data then default stament will be executed.

/* switch(data) {
 * 
 * case data_1 : statement 1; break; // will be executed if data and data_1 matches.
 * 
 * case data_2 : statement 2; break; // will be executed if data and data_2 matches.
 * 
 * case data_3 : statement 3: break; // will be executed if data and data_3 matches.
 * 
 * default   : statement default; // // // will be executed if no data matches.
 * 
 */

// Note if no break statement is used for case statement then after executing matching case statement all the below code statements also will be executed from the matching case statement of witch condition until break.

package fundamental;

import java.util.Scanner;

public class ConditionalStatementsDemo {
	
	public static void main(String[] args) {
		
		if(true) {
			System.out.println("If condition is executing boolean value in if condition is true.");
		}
		
		if(false) {
			System.out.println("If condition is not executed coz boolean value in if condition is false.");
		}
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter number a : ");
		
		int a = scanner.nextInt();
		
		System.out.print("Please enter number b : ");
		
		int b = scanner.nextInt();
		
		if(a<b) {
			System.out.println("Value of 'a' " + a + " is less than value of 'b' " + b + ".");
		}
		else {
			System.out.println("Value of 'a' " + a + " is greater than value of 'b' " + b + ".");
		}
		
		System.out.print("Please enter marks : ");
		
		int marks = scanner.nextInt();
		
		if(marks<45) {
			System.out.println("Fails grade.");
		}
		else if (marks<=60 && marks>45) {
			System.out.println("C grade.");
		}
		
		else if (marks<=80 && marks>60) {
			System.out.println("B grade.");
		}
		else if (marks>80 && marks<=100) {
			System.out.println("A grade.");
		}
		else if (marks>100) {
			System.err.println("Invalid input.");
		}
		else {
			System.err.println("Invalid input.");
		}
		
		System.out.print("Please enter number of a week : ");
		
		int number = scanner.nextInt();
		
		switch(number) {
		
		case (1): System.out.println("Monday"); break;
		
		case (2): System.out.println("Tuesday"); break;
		
		case (3): System.out.println("Wednesday"); break;
		
		case (4): System.out.println("Thursday"); break;
		
		case (5): System.out.println("Friday"); break;
		
		case (6): System.out.println("saturday"); break;
		
		case (7): System.out.println("Sunday"); break;
		
		default : System.err.println("Invalid input...");
		
		}
		
	}

}
