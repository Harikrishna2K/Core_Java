package com.aspire.BrushUp.Algorithms.BinarySearch.PractiseQuestions;

public class CeilingQuestion {
	public static void main(String[] args) {
		int nums[] = {2,3,4,5,7,8,9,10};
		int target = 6;
		
		int answer = getTheCeilingQuestion(nums, target);
		System.out.println(answer);
		
	}
	
	public static int getTheCeilingQuestion(int nums[], int target) {
		int start = 0;
		int end = nums.length -1;
		
		
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
		
		return start;
		
	}

}
