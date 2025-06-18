// Bubble sort works comparing and swapping the adjacent elements.

// In an array an elements is compared to its next and will be swapped according ascending or descending order.

// After one iteration the last element of the array will be contains minimum or maximum element according to ascending or descending sort.

// Later the iteration performed until the last element - 1 of the previous sort and the elements will be swapped according to ascending or descending order. 

package algorithm;

public class BubbleSortDemo {
	
	public static void main(String[] args) {
		
		int randomNumbers[] = {51, 16, 10, 11, 14, 54};
		
		int length = randomNumbers.length;
		
		System.out.print("Array of elements before sort : ");
		
		for(Object randomNumber : randomNumbers) {
			System.out.print(randomNumber + " ");
		}
		
		for(int i=0; i<length; i++) {
			for(int j=1; j<length-i; j++) {
				if(randomNumbers[j-1] > randomNumbers[j]) {
					int temp = randomNumbers[j];
					randomNumbers[j] = randomNumbers[j-1];
					randomNumbers[j-1] = temp;
				}
			}
		}
		
		System.out.print("\n" + "Array of elements after sort : ");
		
		for(Object randomNumber : randomNumbers) {
			System.out.print(randomNumber+ " ");
		}
		
	}

}
