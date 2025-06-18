// Binary search is an algorithm is used to check whether an element is present in the data or not.

// Binary search is used to search sorted data to find an element is presented in the data or not.

// Binary search follows the mechanism of separating the whole data into three categories low medium high.

// All the low elements are behind the medium elements and all the high elements are after the medium element.

// First the element will be checked with the medium and later low and high elements data. If the searching element is not present in the data it will return -1. 

package algorithm;

import java.util.Scanner;

public class BinarySearchDemo {
	
	public static int binarySearch(int sampleData[], int searchElement) {
		
		int length = sampleData.length;
		
		int low = 0;
		
		int high = length -1;
		
		int mid = low + (high - low) /2;
		
		if(sampleData[mid] == searchElement) {
			return mid;
		}
		
		else if(sampleData[mid] > searchElement) {
			
			for(int i = low; i< mid; i++) {
				if(sampleData[i] == searchElement) {
					return i;
				}
			}
			
		}
		
		else if (sampleData[mid] < searchElement) {
			for(int i = mid+1; i<=high; i++) {
				if(sampleData[i] == searchElement) {
					return i;
				}
			}
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		int sampleData[] = {40, 41, 44, 46, 51, 54};
		
		System.out.println("Enter an element to search");
		
		Scanner sc = new Scanner(System.in);
		
		int searchElement = sc.nextInt();
		
		int result = binarySearch(sampleData, searchElement);
		
		if(result == -1) {
			System.out.println("The element " + searchElement + " is not presented in the given data.");
		}
		else {
			System.out.println("The element " + searchElement + " is presented in the given data at index " + result);
		}
	}

}
