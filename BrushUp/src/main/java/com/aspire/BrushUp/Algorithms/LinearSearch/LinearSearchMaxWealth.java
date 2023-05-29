package com.aspire.BrushUp.Algorithms.LinearSearch;

/*
 * 
 *[[1,2,3] - 6
 * [3,4,5] - 12
 * [6,7,8]] - 21
 * 
 * 
 * o/p = The maximum is 21
 * 
 * 
 */



public class LinearSearchMaxWealth {
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{3,4,5,6},
				{7,8,9,10},
				
		
		};
		
		int answer =linearSearchWithTraditionalLoop(arr);
		System.out.println(answer);
	}
	
	
	public static int linearSearchWithTraditionalLoop(int [][] arr) {
		
		int maxArray = 0;
		
		for(int row = 0 ; row < arr.length ; row++) {
			
			int rowSum = 0;
			for(int col = 0; col < arr[row].length ; col++) {
				
				 rowSum = rowSum + arr[row][col];
			
				if(rowSum > maxArray) {
					maxArray = rowSum;
				}	
			}	
		}
		return maxArray;
		
	}
	
	public static int linearSearch(int [][] arr) {
		
		int ans = 0;
		
		for(int[] ints : arr) {
			int sum = 0;
			
			for(int col:ints) {
				sum = sum+ col;
				
			}
			
			if(sum > ans) {
				ans = sum;
			}
			
			
		}
		
		return ans;
		
		
	}
}
