package interview;

import java.util.Arrays;

/**
 * 
 * @author haris
 * 
 * Merge two sorted integer arrays into one array with time complexity of o(n) 
 * and resultant array should be in sorted fashion
 *
 */

public class ArrayProblem {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,3,5,7,9};
		int[] arr2 = {2,4,6,8,10};
		
		//we have to merge the array
		
		int[] mergedArray = new int[arr1.length + arr2.length];
		
		
		System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
		System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
		
		
		
		Arrays.sort(mergedArray);
		
		for(int num: mergedArray) {
			System.out.println(num + " ");
			
		}
		
	}

}
