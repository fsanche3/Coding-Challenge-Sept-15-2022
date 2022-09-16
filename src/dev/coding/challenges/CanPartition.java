package dev.coding.challenges;

public class CanPartition {
	/*	CanPartition:
	 * 
	 * Write a function that returns true if you can partition an array into one element and the rest, such that this element is equal to the product of all other elements excluding itself.

	Examples:
	canPartition([2, 8, 4, 1]) ➞ true
	// 8 = 2 x 4 x 1
	canPartition([-1, -10, 1, -2, 20]) ➞ false
	canPartition([-1, -20, 5, -1, -2, 2]) ➞ true
	 */
	
	
	public static void main(String[] args) {

	int arr1[] = {-1, -20, 5, -1 , -2, 2};
	System.out.println(canPartition(arr1));

	}
	
	static boolean canPartition(int[] arr) {
	
		int product = 1; 

		for (int i = 0; i < arr.length; i++) {
			  product *= arr[i]; 
		  }
		
		  
		  for (int j = 0; j < arr.length; j++) {
			  if (product/arr[j] == arr[j]) {
				  
				  return true; 
			  }
		  }
		  
		  return false; 
	}
	
	
	

}
