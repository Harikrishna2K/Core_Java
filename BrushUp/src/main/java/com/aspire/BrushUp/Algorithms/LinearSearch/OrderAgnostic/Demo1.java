package com.aspire.BrushUp.Algorithms.LinearSearch.OrderAgnostic;

public class Demo1 {
	public static void main(String[] args) {
		
		int nums[] = {-8,-9,23,45,67,90,100};
		int target = 67;
		int answer = oabs(nums, target);
		
		System.out.println(answer);
	}
	
	static int oabs(int nums[], int target) {
		
		int start = 0;
		int end = nums.length - 1;
		
		boolean asc = nums[start] < nums[end];
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(nums[mid] == target) {
				return mid;
			}
			if(asc) {
				
				if(target > nums[mid]) {	
					start = mid + 1;
					
				}
				
				else if(target < nums[mid]) {
					end = mid - 1;
				}
			}
			else {
				
				if(target < nums[mid]) {
					start = mid + 1;
					
				}
				
				else if(target > nums[mid]) {
					end = mid - 1;
				}
			}
		}
		return -1;
	
	}

}
