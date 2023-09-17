package striverPackage.Algo;

import java.util.Arrays;

/***
 * 
 * @author haris
 *This the example for algo which is bubble sorting.
 */

public class Algo2 {
	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1};
		int n = 5;
		
		bubbleSort(arr, n);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void bubbleSort(int[] arr, int n) {
		for(int i=0; i< arr.length;i++) {
			for(int j = 1; j < arr.length-i; j++) {
				//Here we go till arr.length- i, because we dont want to go to the last 
				//element of every loops there. 
				
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
				}
			}
		}
	}

	private static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
		
	}

}
