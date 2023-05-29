package com.mvc.collection.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo1 {
	public static void main(String[] args) {
		
		Set<Integer> integerSet = new HashSet();
		
		integerSet.add(2);
		integerSet.add(3);
		integerSet.add(4);
		integerSet.add(5);
		integerSet.add(6);
		
		Set<String> stringSet = new HashSet<String>();
		stringSet.add("Hi");
		stringSet.add("Hello");
		stringSet.add("Hi");
		
		
//		System.out.println(stringSet);
		
		Person person = new Person(1, "Hk");
		Person person2 = new Person(2, "Dharshini");
		Person persone = new Person(1, "Hk");
		
		
		Set<Person> finalset = new HashSet<Person>();
		
//		System.out.println(finalset.add(persone));
		finalset.add(person2);
		finalset.add(person);
		
//		System.out.println(finalset);
		
		
		Integer i1 = 24;
		Integer i2 = 24;
		
		
		
//		System.out.println(i1.equals(i2));
		
		
		/*To check the hash Code of the following*/
		
		 System.out.println(new String("Ea").hashCode());
		 System.out.println(new String("FB").hashCode());
		 
		 
		 HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		 
		 hashmap.put("Hello", 32);
		
		
	
	}

}
