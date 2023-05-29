package com.aspire.BrushUp.Algorithms.LinearSearch;

//[123,45,67,88,123] - ip

//op - [45,67,88] - 3(The count)

public class LinearSearchFindingTheDigits {
	public static void main(String[] args) {

		int[] nums = { 123, 45, 67, 88, 123 };

		int answer = getThecount(nums);
		System.out.println(answer);

	}
	
	
	/*
	 *From the array count we seprate the integer and we find the evenumber total count 
	 * 
	 * 
	 */

	public static int getThecount(int[] nums) {

		int count = 0;

		for (int num : nums) {
			if (findtheEvenNumbers(num)) {
				count++;
			}
		}
		return count;

	}
	
	
	/*
	 *To find the individual array count as even number  
	 * 
	 */
	public static boolean findtheEvenNumbers(int num) {

		int digits = countTheindividaulTerms(num);
		return digits % 2 == 0;

	}

	/*
	 * 
	 * To count the individual terms in the given array 
	 * 
	 * 
	 */
	public static int countTheindividaulTerms(int num) {

//		if (num == 0) {
//			return 0;
//		}
//		
		int count = 0;
		
		while(num > 0) {
			
			count ++;
			num = num / 10;
			
		}

		return count;
	}

}
