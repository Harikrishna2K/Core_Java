package striverPackage.Algo;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = {6,5,4,3,2,1};
		int n = 6;
		//selectionsort(arr, n);
		selectionSortUsingMax(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
//	static void selectionsort(int arr[], int n) {
//		
//		for(int i =0; i<=n-2; i++) {
//			int min = i;
//			
//			for(int j = i; j<=n-1; j++) {
//				if(arr[j]<arr[min]) {
//					min = j;
//				}
//			}
//			swap(arr,  i, min);
//			
//		}
//	
//		
//	}
//
//	private static void swap(int[] arr, int i, int min) {
//		int temp = arr[min];
//		arr[min] = arr[i];
//		arr[i] = temp;
//		
//	}
//	
//	
	/*
	 * Selection Sort using method 2 finding the max and swapping it
	 * 
	 * */
	
	static void selectionSortUsingMax(int[] arr) {
		
		for(int i = 0; i< arr.length; i++) {
			int last = arr.length -i-1;
			int maxIndex = getMaxIndex(arr, 0, last);
			swapMax(arr,maxIndex, last);
		}
	}

	private static void swapMax(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
		
	}

	private static int getMaxIndex(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		
		int max = start;
		for(int i = start; i<= end; i++) {
			if(arr[max]< arr[i]) {
				max = i;
			}
		}
		
		
		return max;
	}

}
