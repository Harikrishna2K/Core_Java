package com.aspire.BrushUp.Algorithms.LinearSearch;

//Find the number of values in the range //

public class LinearSearch3 {
	public static void main(String[] args) {
		
		int[] arr = {23,34,5,6,7,8,9,10};
		
		int target = 23;
		
		
		int answer = linearSearch(arr, target);
//		System.out.println(answer);
		
		int start = 3;
		int end = 10;
		
		int finalanswer = LinearSearchInRange(arr, target, start , end);
		System.out.println(finalanswer);
		
	}
	
	public static int linearSearch(int[] arr, int target) {
		
		if(arr.length == 0) {
			return 0;
		}
		
		for(int i = 0; i < arr.length ; i++) {
			if(i>=3 || i<=7) {
				
				int element = arr[i];
				
				if(element == target) {
					return element;
				}
			}
		}
		return -1;
	}
	
	
	//another approach for this question//
	
	public static int LinearSearchInRange(int arr[], int target, int start , int end) {
		
		if(arr.length == 0) {
			return 0;
		}
		
		for(int i = start; i < end; i++) {
			
			int element = arr[i];
			if(element == target) {
				return element;
			}
				
			
		}
		return -1;
		
	}
	
	

}
