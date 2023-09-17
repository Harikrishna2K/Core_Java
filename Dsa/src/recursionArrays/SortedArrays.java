package recursionArrays;
/**
 * 
 * @author haris
 *Write a java program to check whether the array is sorted or not
 */

public class SortedArrays {
	public static void main(String[] args) {
//		int arr[] = {1,3,5,7,10, 8};
//		System.out.println(sortedArray(arr, 0));
		
		int[] sortedArray = {1,3,5,6,9,12,3};
	
		System.out.println("Is The Array sorted : " + isArray(sortedArray));
		//System.out.println("Is The Array unsorted : " + isArray(unsortedArray));
		
		
	}
	
	/**
	 * This is the recursive approach for sorted array
	 */
	public static boolean sortedArray(int arr[], int index) {
		
		if(index == arr.length - 1) {
			return true;
		}
		return arr[index] < arr[index + 1] && sortedArray(arr, index+1); 
	}
	
	/**
	 * This is the alterantive approach for the sorted array.
	 */
	
	//ASk doubt to bejju //
	
	static boolean isArray(int arr[]) {
		for(int i = 0; i<arr.length-1 ; i++) {
			if(arr[i] > arr[i+1] ) {
				return false;
			}
			
		}
		return true;
	}

}
