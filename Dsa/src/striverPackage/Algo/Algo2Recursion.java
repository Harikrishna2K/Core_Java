package striverPackage.Algo;

import java.util.Arrays;

public class Algo2Recursion {
	public static void main(String[] args) {
		int arr[] = {5,4,3,2,1};
		int n = arr.length;
		bubbleRecursion(arr, n);
		System.out.println(Arrays.toString(arr));
	}
	
	static void bubbleRecursion(int arr[], int n) {
		
		if(n==1) {
			return;
		}
		
		for(int j =0 ; j<=n-2;j++) {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		
		bubbleRecursion(arr, n-1);
		
	}

}
