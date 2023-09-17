package striverPackage.Arrays;

import java.util.Arrays;

public class ArrayQuestionREmoveDuplicates {
	public static void main(String[] args) {
		
		int[] arr = {1,1,2,3,4,4,5,6,7};
		int n = arr.length;
		
		System.out.println(Arrays.toString(arr));
		
		int [] anotherArray = removeArray(arr);
		
		System.out.println(Arrays.toString(anotherArray));
		
	}
	
	static int[] removeArray(int[] arr) {
		int[] temp = new int[arr.length];
		
		int rd = 0;
		temp[rd] = arr[0];
		for(int i = 1; i<arr.length; i++) {
			
			if(temp[rd] != arr[i]) {
				rd++;
				temp[rd] = arr[i];
			}
		}
		int[] resultArray = Arrays.copyOf(temp, rd+1);
		return resultArray;
		
		
		
	}

}
