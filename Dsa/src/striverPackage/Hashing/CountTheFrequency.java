package striverPackage.Hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountTheFrequency {
	public static void main(String[] args) {
		int arr[] = {12,13,12,25,20};
		int n = arr.length;
		countTheFrequency(arr, n);
		
		
	}
	
	static void countTheFrequency(int[] arr, int n) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (Integer t : arr) {
	        if (map.containsKey(t)) {
	            map.put(t, map.get(t) + 1);
	        } else {
	            map.put(t, 1);
	        }
	    }
		

		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
