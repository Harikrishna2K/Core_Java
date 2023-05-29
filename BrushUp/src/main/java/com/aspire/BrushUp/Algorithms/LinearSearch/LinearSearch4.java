package com.aspire.BrushUp.Algorithms.LinearSearch;

public class LinearSearch4 {
	public static void main(String[] args) {
		int arr[] = {3,4,5,6,7,8,9,10,11,12,13,14,15};
		int target = 14;
		
		int answer = LinearSearch(arr,target);
		System.out.println(answer);
	}
	
	//By searching using linear search
	
	public static int LinearSearch(int arr[], int target) {
		
		for(int i = 0 ; i<arr.length; i++) {
			int element = arr[i];
			
			if(element == target) {
				return i;
			}
		}
		return -1;
	}
}
