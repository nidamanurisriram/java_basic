// Linear Search algorithm is a searching algorithm used to linear search of element in a whole data. 

package algorithm;

import java.util.Random;
import java.util.Scanner;

public class LinearSeachDemo {
	
	public int linearSearch(int arr[], int n) {
		
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == n) {
				return i;
			}
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int arr[] = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = random.nextInt(100);
		}
		
		System.out.println("Array data is..");
		
		for(Object arr1 : arr) {
			System.out.println(arr1);
		}
		
		System.out.println("Enter an element to search");
		
		Scanner sc = new Scanner(System.in);
		
		int searchElement = sc.nextInt();
		
		LinearSeachDemo searchDemo = new LinearSeachDemo();
		
		int result = searchDemo.linearSearch(arr, searchElement);
		
		if(result == -1) {
			System.out.println("Given element " + searchElement + " is not found in the array");
		}
		
		else {
			System.out.println("Given element " + searchElement + " is found at the " + result + " index posiotion of array");
		}
		
	}

}
