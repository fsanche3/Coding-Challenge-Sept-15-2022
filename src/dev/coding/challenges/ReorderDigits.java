package dev.coding.challenges;

import java.util.Arrays;

public class ReorderDigits {
	/*
	 * Reorder digits
	 *
	 * a) Create a function that reorders the digits of each numerical element in an
	 * array based on ascending (asc) or descending (desc) order.
	 * 
	 * Examples: reorderDigits([515, 341, 98, 44, 211], "asc") ➞ [155, 134, 89, 44,
	 * 112]
	 * 
	 * reorderDigits([515, 341, 98, 44, 211], "desc") ➞ [551, 431, 98, 44, 211]
	 * 
	 * reorderDigits([63251, 78221], "asc") ➞ [12356, 12278]
	 * 
	 * reorderDigits([63251, 78221], "desc") ➞ [65321, 87221]
	 * 
	 * reorderDigits([1, 2, 3, 4], "asc") ➞ [1, 2, 3, 4]
	 * 
	 * reorderDigits([1, 2, 3, 4], "desc") ➞ [1, 2, 3, 4]
	 */
	public static void main(String[] args) {

		int[] arr = {515, 341, 98, 44, 211 };
		int[] arr1 = reOrderElements(arr, "desc");

		for (int a : arr1) {
			System.out.println(a);
		}

	}

	static int[] reOrderElements(int[] arr, String ascOrDesc) {
		
		
		for (int i = 0; i < arr.length; i++) {
			
			char[] number = String.valueOf(arr[i]).toCharArray();
			Arrays.sort(number);
			char[] descTemp = new char[number.length];

				if(ascOrDesc.equalsIgnoreCase("asc")) {
					
					arr[i] = Integer.parseInt(String.valueOf(number));
					
				} else if (ascOrDesc.equalsIgnoreCase("desc")) {
					
					int count = 0;
					
					for(int j = number.length -1; j >= 0; count++,j--) {
						descTemp[count] = number[j];
					}
					count = 0;
					arr[i] = Integer.parseInt(String.valueOf(descTemp).strip());
				}
				
			}
			
		
		return arr;
	}

}
