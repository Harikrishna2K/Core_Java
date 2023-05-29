package com.aspire.BrushUp.Algorithms.LinearSearch;

import java.util.Scanner;

//To return the element of the given array which is found

public class LinearSearch2 {
	public static void main(String[] args) {
		int arr[] = {23,45,67,89,90,99};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the target to be found:  ");
		int target = sc.nextInt();
		
		System.out.println("The Target is present : "+target);
		
		
	}
	
	public static int LinearSearch(int arr[], int target) {
		
		
		if(arr.length == 0) {
			return 0;
		}
		
		for(int i = 0; i<arr.length ; i++) {
			
			int element = arr[i];
			
			if(element == target) {
				return element;
			}
			
		}
		return -1;
	}

}
