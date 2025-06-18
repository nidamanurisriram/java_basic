// Loop statements are used for iterative execution for a block of code statements.

// Loop statements that are used for iterative code execution is 1. for 2. enhanced for 3. while 4. do while.

// Code inside the loop statements will be executed till the given condition is true in the loop statement.

// 1. For loop

/*
 * for(initialization of a value; condition to check; increment/decrement) {
 * 		//block of code.
 * }
 */

// For loop code will be executed until the given condition value in the for loop returns true.

// 2. Enhanced for loop

// Enhanced for loop is used to traverse through arrays. Array value is stored into a variable and will initialized to enhanced for loop variable one by one.

/*
 * for(dataType variable : variable) {
 *     //block of code.
 * }
 */

// Array data type and the enhanced for loop variable data type has to match. Array data will be initialized one by one to the enhanced for loop variable. 

// 3. While loop

/*
 *  while(condition) {
 *      //block of code.
 *  }    
 */

// Code inside the while loop will be executed until the condition value returns true execution will be stopped once if the condition value returns false.

// 4. Do While loop

// Do while loop is used to execute a block of first irrespective of checking any conditions and after one execution the to make iterative executions while loop is used.

/*
 * do {
 *     //block of code.
 * }
 * while(condition); 
 */

// while statement must be declared in do while loop statement.

// After executing the do code if the while loop condition returns true the do code will be executed again and the execution of do code will be stopped once the while loop condition returns false.

package fundamental;

public class LoopingStatementsDemo {
	
	public void forLoopStatement() {
		System.out.println("Printing numbers from 1 to 10 using for loop ");
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	public void enhancedForLoopStatement() {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("Printing array data using enhanced for loop ");
		for(int number : numbers) {
			System.out.println(number);
		}
	}
	
	public void whileLoopStatement() {
		int i = 1;
		System.out.println("Printing numbers from 1 to 10 using while loop ");
		while(i<=10) {
			System.out.println(i);
			i++;
		}
	}
	
	public void doWhileLoopStatement() {
		int i =1;
		System.out.println("Printing numbers from 1 to 10 using do while loop ");
		do {
			System.out.println(i);
			i++;
		}
		while(i<=10);
		
	}
	
	public static void main(String[] args) {
		
		LoopingStatementsDemo loopingStatementsDemo = new LoopingStatementsDemo();
		
		loopingStatementsDemo.forLoopStatement();
		
		loopingStatementsDemo.enhancedForLoopStatement();
		
		loopingStatementsDemo.whileLoopStatement();
		
		loopingStatementsDemo.doWhileLoopStatement();
		
	}

}
