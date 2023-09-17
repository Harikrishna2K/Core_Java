package striverPackage.Arrays;

import java.util.Arrays;

public class MoveZerosTotheFront {
	public static void main(String[] args) {
		int[] arr = {1,2,3,0,5,6,0};
		System.out.println(Arrays.toString(arr));
		int[] answer =moveZeros(arr);
		
		System.out.println(Arrays.toString(answer));
		
		
		
	}
	
	static int[] moveZeros(int arr[]) {
		
		int nz = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == 0) {
				swap(arr, i, nz);
				nz++;
			}
			
		}
		return arr;
	}

	private static void swap(int[] arr, int i, int nz) {
		// TODO Auto-generated method stub
		
		int temp = arr[i];
		arr[i] = arr[nz];
		arr[nz] = temp;
		
	}

}
