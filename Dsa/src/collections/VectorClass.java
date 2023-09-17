package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorClass {
	public static void main(String[] args) throws InterruptedException {
		int size = 100000;
		//arrayListPerfomance(size);
		//vectorPerfomance(size);
		
		
		vectorThreading(size);
		arraylistThreading(size);
	}
	
	static void arrayListPerfomance(int size) {
		
		
		long start = System.currentTimeMillis(); //to calculate the start time of arraylist
		
		List<Integer> arraylist = new ArrayList<>();
		for(int i=0; i<size;i++) {
			arraylist.add(i);
		
		}
		
		long end = System.currentTimeMillis(); // to calculate the end time of arraylist class
		
		System.out.println("The time taken by arraylist is : " + (end-start) + "M/S");
	}
	
	static void vectorPerfomance(int size) {
		
		long start = System.currentTimeMillis();
		
		List<Integer> vector = new Vector<Integer>();
		
		for(int i=0; i<size; i++) {
			vector.add(i);
		}
		
		long end = System.currentTimeMillis(); //to calculate the end time of the vector
		System.out.println("The time taken by the vector class is: "+ (end - start) + "M/S");
	
	
	}
	
	
	/***
	 * Let us check the same process in a multithreaded environment
	 * 
	 * Here we are gonna create two threads and add elements to it and check the 
	 * timings of both arraylist and vector.
	 * @throws InterruptedException 
	 */

	static void arraylistThreading(int size) throws InterruptedException {
		
		long start = System.currentTimeMillis();
		List<Integer> arrays = new ArrayList<Integer>();
		//First thread 
		Thread t1 = new Thread(()->{
			for(int i =0; i<=size; i++) {
				arrays.add(i);
			}
		});
		
		//second thread 
				Thread t2 = new Thread(()->{
					for(int i =0; i<=size; i++) {
						arrays.add(i);
					}
				});
				
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		long end = System.currentTimeMillis();
		System.out.println("The time taken by the arraylist in MT Environment is" + (end-start)+ "M/s");
		
	}
	
	static void vectorThreading(int size) throws InterruptedException {
		
		long start = System.currentTimeMillis();
		List<Integer> vector = new Vector();
		//First thread 
		Thread t1 = new Thread(()->{
			for(int i =0; i<=size; i++) {
				vector.add(i);
			}
		});
		
		//second thread 
				Thread t2 = new Thread(()->{
					for(int i =0; i<=size; i++) {
						vector.add(i);
					}
				});
				
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		long end = System.currentTimeMillis();
		System.out.println("The time taken by the vector in MT environment is" + (end-start)+ "M/s");
		
		
	}
}
