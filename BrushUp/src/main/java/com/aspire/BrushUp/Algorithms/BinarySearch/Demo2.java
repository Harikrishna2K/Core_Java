package com.aspire.BrushUp.Algorithms.BinarySearch;

public class Demo2 {
	public static void main(String[] args) {
		
		int[] nums = {34,23,21,56,78,90,21};
		int target = 90;
		
		int answer = BinarySearch(nums, target);
		System.out.println(answer);
	}
	
	public static int BinarySearch(int[] nums , int target) {
		int start = 0;
		int end = nums.length - 1;
		
			while(start <= end) {
				
				int mid = start + (end - start)/2;
			
				
				if(target > nums[mid]) {
					
					start = mid + 1;
					
				}
				
				else if(target < nums[mid]) {
					end = mid - 1;
				}
				else {
					return mid;
				}
				
			}
			return -1;
			
			
	}

}
