package striverPackage.Arrays;

import java.util.Arrays;

public class ArraysEasyQuestion2 {
	public static void main(String[] args) {
		int[] arr = {36,52,12,0,25};
		sort(arr);
//		int answer = secondSmallestArray(arr);
//		int answer2 = secondLargestArray(arr);
//		System.out.println(answer);
//		System.out.println(answer2);
//		
	}
	static void sort(int arr[]) {
		Arrays.sort(arr);
		System.out.println("The second smallest element in the array is : "+ arr[arr.length-4]);
		System.out.println("The second Largest element in the array is : "+ arr[arr.length-2]);
	}
	
	//another method
//	static int secondSmallestArray(int[] arr) {
//		
//		int smallest = Integer.MAX_VALUE;
//		int secondSmallest = Integer.MAX_VALUE;
//		for(int i = 0; i<arr.length; i++) {
//			if(arr[i]<smallest) {
//				secondSmallest = smallest;
//				smallest = arr[i];
//			}
//			else if(arr[i]< secondSmallest && arr[i]!= smallest) {
//				secondSmallest = smallest;
//			}
//		}
//		return secondSmallest;
//	}
//	
//	static int secondLargestArray(int[] arr) {
//		int largest = Integer.MIN_VALUE;
//		int secondLargest = Integer.MIN_VALUE;
//		
//		for(int i =0; i<arr.length; i++) {
//			if(arr[i]>largest) {
//				secondLargest = largest;
//				largest = arr[i];
//			}
//			else if(arr[i]>secondLargest && arr[i] != largest) {
//				secondLargest = largest;
//			}
//		}
//		return secondLargest;
//	}
}
