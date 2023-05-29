package com.aspire.BrushUp.Algorithms.LinearSearch;

//Return the string element which is found based on the target in the array

public class LinearSearchStrings {

	public static void main(String[] args) {
		String[] str = {"Hey", "Hi", "Dharshini" , "Devi", "Hk"};
		String target = "Hk";
		
		String answer = LinearSearch(str, target);
		
		System.out.println(answer);
		
		
	}
	
	
	public static String LinearSearch(String[] str, String target) {
		
		if(str.length == 0) {
			return "The element is not present";
		}
		
		for(String string :str) {
			if(string.contains(target)) {
				return string.toLowerCase();
			}
		}

		return "Not present ";
	}
}
