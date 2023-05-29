package com.aspire.BrushUp.Algorithms.LinearSearch;

public class LinearSearchDemo5 {
	public static void main(String[] args) {
		
		int nums[] = {45,673,892,901,123,342,15};
		int answer = FindTheoutput(nums);
		System.out.println(answer);
		
	}
	
	public static int findTheIndividualCount(int num) {
		int count = 0;
		
		while(num > 0) {
			
			count ++;
			num = num/10;
			
		}
		
		return count;
	}
	
	public static boolean EvenDigits(int num) {
		
		int digits = findTheIndividualCount(num);
		return digits%2 == 0;
	
	}
	
	public static int FindTheoutput(int[] nums) {
		
		int count = 0;
		
		for(int num : nums) {
			if(EvenDigits(num)) {
				count ++;
			}
		}
		
		return count;
	}
	
}
