// Arithmetic Operators

// Used to perform arithmetic operations for numbers.

// +  ( addition )  used to perform the addition ( a + b ).

// -  ( subtraction ) used to perform subtraction ( a - b ).    

// *  ( multiplication) used to perform multiplication ( a * b ).

// /  ( division ) used to perform devision and get the quotient value ( a / b ). 

// %  ( division ) used to perform division and get the remainder value ( a % b ).

// 8/2 = 4 ( 4 is quotient ).

// 8%2 = 0 ( 0 is remainder ).

// ++ ( increment ) used to perform increment value to 1 for numbers ( a ++ or ++ a ).

// -- ( decrement ) used to perform decrement value to 1 for numbers ( a -- or -- a ). 

// Assignment Operators

// Used to assign value or data to variable. 

// = ( equals ) assign a value to variable ( dataType variable = data; ). 

// += ( equals addition ) simplified addition statement ( x += 5 -> x = x + 5 ).

// -= ( equals subtraction ) simplified subtraction statement ( x -= 5 -> x = x - 5 ).

// *= ( equals multiplication ) simplified multiplication statement ( x*=5 -> x = x * 5 ).

// /= ( equals division ) simplified division statement ( x/=5 -> x = x / 5 ).

// %= ( equals division ) simplified division statement ( x%=5 -> x = x % 5 ).

// Comparison Operators

// Used to compare two statements and return a boolean statement.

// < ( less than ) number a is less than number b ( a < b ).

// > ( greater than ) number a is greater than number b ( a > b ).

// <= ( less than or equals ) number a is less or equals to number b ( a <= b ). 

// >= ( greater than or equals ) number a is great or equals to number b ( a >= b).

// == ( equals to ) number a and number are equals or two statements are same and equals ( a == b or st1 == st2 ).

// != ( not equals to ) number a and number b are not equal or two statements are not equal ( a != b or st1 != st2 ).

// Logical Operators

// Compare conditional boolean statements return boolean value.

// && ( and ) returns true if both conditional statements are true.

// || ( or ) returns true if at least one of both conditional statements are true. 

// !  ( not ) returns opposite boolean value that returns a conditional boolean statement result.

// Concatenation operator

// +  ( concatenation ) any dataType + String = String. 

// + is used between any dataType and a string to form a string ("a" (string) + 1 (integer) = a1 (string) ).  

// Ternary Operator

// variable = (condition) ? (expression 1 : true) : (expression 2 : false).

// It validates a condition and if the condition is true then returns expression 1 as output and if the condition is false return expression 2 as output.

// After validating the condition based on its boolean result it returns expression 1 as result or expression 2 and the result value will be stored in variable result is one of both expression so the variable data type must match with the expression data. 

package fundamental;

public class OperatorsDemo {

	public static void arithmeticOperators() {
	
		int a = 11;
		
		int b = 101;
		
		System.out.println("Addition of two numbers is : " + (a + b));
		
		System.out.println("Subtraction of two numbers is : + " + (a - b));
		
		System.out.println("Multiplication of two numbers is : " + (a * b));
		
		System.out.println("Division two numbers to get quotient value : " + (a / b));
		
		System.out.println("Division of two numbers to get remainder value : " + (a % b));
		
		System.out.println("Pre incrementation of a number value to one : " + (++a));
		
		System.out.println("Pre decrementation of a number value to one : " + (--b));
		
		System.out.println("Post incrementation of a number value to one : " + (a++));
		
		System.out.println("Post decrementation of a number value to one : " + (b++));
		
	}
	
	public static void assignmentOperators() {
		
		int a = 11;
		
		int b = 101;
		
		int c = b;
		
		System.out.println("While assignment equals (=) is used left side is variable and right is data : " + "\n"
							+ "Value of a is : " + a +"\n"
							+ "Value of b is : " + b +"\n"
							+ "Value of c is : "+ c +".");
		
		System.out.println("Equals addition : " + (a+=b));
		
		System.out.println("Equals subtraction : " + (a-=b));
		
		System.out.println("Equals multiplication : " + (a*=b));
		
		System.out.println("Equals division to get quotient value : " + (a/=b));
		
		System.out.println("Equals division to get remainder value : " + (a%=b));
		
	}
	
	public static void comparisonOperators() {
		
		int a = 11;
		
		int b = 101;
		
		System.out.println("a value " + a + " is less than b value : " + b + (a<b));
		
		System.out.println("a value " + a + " is great than b value : " + b + (a>b));
		
		System.out.println("a value " + a + " is less or equals to b value : " + b + (a<=b));
		
		System.out.println("a value " + a + " is great or equals to b value : " + b + (a>=b));
		
		System.out.println("a value " + a + " is not equals to b value : " + b + (a!=b));
		
		System.out.println("a value " + a + " is equals to b value : " + b + (a==b));
		
	}
	
	public static void logicalOperators() {
		
		int a = 11;
		
		int b = 101;
		
		int c = 1011;
		
		System.out.println("A is less than b and b is less than c : " + ((a<b) && (b<c)));
		
		System.out.println("A is greater than b or c is greater than b : " + ((a>b) || (c>b)));
		
		System.out.println("A is not greater than b : " + !(a>b));
		
	}
	
	public static void concatinationOperator() {
		
		int number = 11;
		
		double decimal = 1.01;
		
		char ch = 'a';
		
		boolean status = true;
		
		String sentense1 = "String 1 ";
		
		String sentense2 = "String 2 ";
		
		System.out.println("Concatination integer and string to form a string : " + (number + sentense1));
		
		System.out.println("Concatination decimal and string to form a string : " + (decimal + sentense1));
		
		System.out.println("Concatination character and string to form a string : " + (ch + sentense1));
		
		System.out.println("Concatination boolean value and string to form a string : " + (status + sentense1));
		
		System.out.println("Concatination of a string with an another string to form a string : " + (sentense1 + sentense2));
		
	}
	
	public static void ternaryOperator() {
		
		int a = 11;
		
		int b = 101;
		
		String expression1 = "Expression 1";
		
		String expression2 = "Expression 2";
		
		String result = (a < b) ? expression1 : expression2 ;
		
		System.out.println("Ternary operation result is : " + result);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Arthmetic operations result ");
		
		OperatorsDemo.arithmeticOperators();
		
		System.out.println("Assignment operations result ");
		
		OperatorsDemo.assignmentOperators();
		
		System.out.println("Comparison operations result ");
		
		OperatorsDemo.comparisonOperators();
		
		System.out.println("Logical operations result ");
		
		OperatorsDemo.logicalOperators();
		
		System.out.println("Concatination operations result ");
		
		OperatorsDemo.concatinationOperator();
		
		System.out.println("Ternary operations result ");
		
		OperatorsDemo.ternaryOperator();
		
	}
	
}
