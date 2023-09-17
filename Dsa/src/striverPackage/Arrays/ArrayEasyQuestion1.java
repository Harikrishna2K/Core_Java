package striverPackage.Arrays;

import java.util.Arrays;

/**
 * 
 * @author haris
 *Find the largest number in an array.
 */



public class ArrayEasyQuestion1 {
	public static void main(String[] args) {
		int[] arr = {3,4,5,9,21};
		int n = arr.length;
		
		//largestArry(arr, n);
		System.out.println(sort(arr));
		
	}
//	static void largestArry(int[] arr, int n) {
//		if(n == 0) {
//			throw new IllegalArgumentException("Array is not done");
//		}
//		int max = arr[0];
//		int maxIndex = 0;
//		
//		for(int i = 0; i<n; i++) {
//			if(arr[i]> max) {
//				max = arr[i];
//				maxIndex = i;
//			}
//		}
//		System.out.println("The largest element " + max + " is present on index"+ maxIndex );
//		
//	}
//	
	//another method using sorting
	
	static int sort(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length -1];
		
	}

}
