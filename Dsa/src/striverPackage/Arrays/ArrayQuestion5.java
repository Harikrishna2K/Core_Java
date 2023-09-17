package striverPackage.Arrays;

import java.util.ArrayList;

/*
 * 
 * Remove duplicates from sorted array.
 * 
 * */

public class ArrayQuestion5 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int n = arr.size();
		arr.add(1);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(3);
		arr.add(4);
		
		System.out.println(arr);
		int answer = removeDuplicates(arr, n);
		System.out.println(answer);
		
	}
	
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		ArrayList<Integer> finalList = new ArrayList<>();
		
		for(int i=0; i<n; i++){

			int currentElement = arr.get(i);
			if(!finalList.contains(currentElement)){
				finalList.add(currentElement);
			}
		}
		System.out.println(finalList);
		arr.addAll(finalList);
		int length = finalList.size();
		return length;
		
		
	}

}
