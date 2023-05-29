package com.aspire.BrushUp.Arrays;

import java.util.HashMap;

public class Demo1 {
	public static void main(String[] args) {
		int[] nums = {23,45,6,7,9,2};
		int target = 9;
		
		 getTheIndex(nums,target);
	
	}
	
	public static int[] getTheIndex(int[] nums, int target) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i =0 ; i<nums.length; i++) {
			
			int complement = target-nums[i];
			
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement),i};
			}
			map.put(nums[i], i);
		}
		return null;
	
	}

}
