// Insertion sort is about traverse each element of an array and placing the element in an appropriate order.

// Insertion will check an element of an array all its previous elements and place the element in an appropriate order.

package algorithm;

import java.util.Random;

public class InsertionSortDemo {
	
	public static void insertionSort(int arr[]) {
		
		for(int i=1; i<arr.length; i++) {
			for(int j = i; j>0; j--) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int randomNumbers[] = new int[7];
		
		for(int i=0; i<randomNumbers.length; i++) {
			randomNumbers[i] = random.nextInt(100);
		}
		
		System.out.println("Array before sort..");
		
		for(Object randomNumber : randomNumbers) {
			System.out.println(randomNumber);
		}
		
		System.out.println("Array after sort..");
		
		insertionSort(randomNumbers);
		
	}

}
