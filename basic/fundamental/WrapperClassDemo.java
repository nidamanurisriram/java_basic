// Wrapper classes are classes of primitive data types.

// Primitive data types and their wrapper classes list is mentioned below.

/*
 * byte    -    Byte
 * short   -    Short
 * int     -    Integer
 * long    -    Long
 * float   -    Float
 * double  -    Double
 * char    -    Character
 * boolean -    Boolean
 */

// Using wrapper classes objects can be created for the respective data types.

// Since primitive data types not allowed to create objctes and some features like collections only allow non primitive data types as generic and to make java full fledged object oriented programming language wrapper classes are introduced.

// Converting the primitive data type data to its wrapper class data type data is auto boxing and converting the wrapper class data type data to its primitive data type data is unboxing.

// Auto boxing syntax :

/*
 * primitiveDataType variable = data;
 * 
 * WrapperClassDataType referenceVariable = new WrapperClassDataType(variable);
 * 
 */

// Un boxing syntax :

/*
 * WrapperClassDataType referenceVariable1 = data;
 * 
 * 
 * WrapperClassDataType referenceVariable2 = new WrapperClassDataType(data);
 * 
 * 
 * primitiveDataType variable = wrapperClassReferenceVariable.valueOf(wrapperClassReferenceVariable);
 * 
 */

// valueOf() method

// valueOf() method is used to convert one data type data to another data type data.

// Syntax : dataType variable = objectReferenceVariable.valueOf(data);

// The in the valueOf() method will be converted to the dataType and object reference variable which is calling the valueOf method has to be the same data type that data is going to be stored or else it has to casted to the stored data type.

package fundamental;

public class WrapperClassDemo {
	
	
	public static void main(String[] args) {
		
		System.out.println("Primitive Data Type and their wrapper classes list is : ");
		
		System.out.println( "byte    - Byte"      + "\n" +
							"short   - Short"     + "\n" +
							"int     - Integer"   + "\n" +
							"long    - Long"      + "\n" +
							"float   - Float"     + "\n" +
							"double  - Double"    + "\n" +
							"char    - Character" + "\n" +
							"boolean - Boolean");
		
		System.out.println("Wrapper classes ");
		
		Integer number1 = 10;
		
		Integer number2 = new Integer(10);
		
		System.out.println("Wrapper class integer value is : " + number1);
		
		System.out.println("Wrapper class integer value assigned through object is : " + number2);
		
		System.out.println("Auto Boxing - Converting a primitive data type data to wrapper class data type data.");
		
		int i1 = 10;
		
		Integer j1 = new Integer(i1);  // Converting the primitive data type data to wrapper class data type data.
		
		System.out.println("Primitive int value is : " + i1);
		
		System.out.println("Wrapper class Integer value is : " + j1);
		
		System.out.println("Un Boxing - Converting the wrapper class data type data to primitive data type data.");
		
		Integer i2 = new Integer(50);
		
		int j2 = i2.valueOf(i2);
		
		String value = String.valueOf(i2);
		
		System.out.println("Wrapper class value is : " + i2);
		
		System.out.println("Converted primitive int value is : " + j2);
		
		System.out.println("Converted integer value to String is : " + value);
		
	}

}
