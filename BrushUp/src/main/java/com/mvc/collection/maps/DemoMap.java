package com.mvc.collection.maps;

import java.util.HashMap;

public class DemoMap {
	public static void main(String[] args) {
		
		
//		Integer key1 = 10;
//		Integer key2 = 10;
//		Integer key3 = 10;
//		Integer key4 = 20;
//		
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
//		map.put(key1, "Harikrishna");
//		map.put(key2, "DharshiniDevi");
//		
//		
//		System.out.println(map.get(key1).hashCode());
//		System.out.println(map.get(key2));
//		System.out.println(map.get(key2));
//		
//		System.out.println(System.identityHashCode(key1));
//		
		Voter key1 = new Voter(1, "HK");
		Voter key2 = new Voter(1, "Dharshini");
		

		
		
		HashMap<Voter, Integer> mapnext = new HashMap<Voter, Integer>();
		mapnext.put(key1, 60);
		mapnext.put(key2, 20);
		
		//System.out.println(key1.hashCode());
//		System.out.println(key2.hashCode());
		
		System.out.println(mapnext.get(key1));
		System.out.println(mapnext.get(key2));
		
		
	}
	

}
