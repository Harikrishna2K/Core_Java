package com.aspire.BrushUp.Algorithms.LinearSearch;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[] = {23,45,67,8,9,90,10};
		int target = 467;
		int result = LinearSearch(arr,target);
		System.out.println(result);
	}
	
	public static int LinearSearch(int arr[] , int target) {
		if(arr.length == 0) {
			return 0;
		}
		
		for(int index = 0 ; index<arr.length ; index++) {
			
			int element = arr[index];
			if(element == target) {
				
				return index;
			}
		}
		return -1;
		
	}

}
