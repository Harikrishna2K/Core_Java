package com.aspire.BrushUp.Algorithms.LinearSearch;

import java.util.Arrays;

public class LinearSearch2Darrays {
	public static void main(String[] args) {
	
		int[][] arr = {
				
						{1,2,3,4,5,6},
				       {6,9,10,23,34},
				       {10,23,45,6,7,89,90}
		};
		int target = 23;
		
		int[] answer = LinearSearch(arr, target);
		System.out.println(Arrays.toString(answer));
	}
	
	
	public static int[] LinearSearch(int [][] arr , int target) {
		
		for(int row = 0 ; row<arr.length ; row++) {
			for(int col = 0; col<arr[row].length ; col++) {
				if(arr[row][col] == target) {
					return new int[] {row ,col};
				}
			}
		}
		return new int[] {-1, -1};
	}
	
	

}
