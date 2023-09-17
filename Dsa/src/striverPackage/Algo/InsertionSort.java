package striverPackage.Algo;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {5,4,1,3,2};
		int n = 5;
		insertion(arr, n);
		System.out.println(Arrays.toString(arr));
	}
	
	static void insertion(int[] arr, int n) {
		for(int i =0; i<=n-2; i++) {
			for(int j = i+1 ; j>0; j--) {
				if(arr[j] < arr[j-1]) {
					swap(arr,j,j-1);
				}else {
					break;
				}
			}
		}
	}

	private static void swap(int[] arr, int first, int second) {
		// TODO Auto-generated method stub
		
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
		
	}

}
