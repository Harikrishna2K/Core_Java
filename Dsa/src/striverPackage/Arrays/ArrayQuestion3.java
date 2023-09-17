package striverPackage.Arrays;

import java.util.Arrays;

/**
 * 
 * To check whether the array is sorted or not.
 * 
 * 
 * */
public class ArrayQuestion3 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,8,5,6,8,9};
		int n = arr.length;
		String answer = sortedArrayOrNot(arr, n);
		System.out.println(Arrays.toString(arr));
		System.out.println(answer);
	}
	
	static String sortedArrayOrNot(int[] arr, int n) {
		for(int i=1 ; i<= n-1; i++) {
			if(arr[i]>arr[i+1]) {
				return " Nope not Sorted bro";
			}
		}
		
			return "Sorted bro";
	}

}
