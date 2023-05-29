package com.aspire.BrushUp.Algorithms.LinearSearch;

public class PractiseDemo3 {
	
	public static void main(String[] args) {
		
		int arr[] = {34,56,78,90,32,12,34,56};
		int target = 90;
		int answer = linearSearch(arr, target);
		System.out.println(answer);
	}
	
	public static int linearSearch(int arr[], int target) {
		for(int i = 0; i<arr.length; i++) {
			int element = arr[i];
			if(target == element) {
				return i;
			}
		}
		return -1;
	}

}
