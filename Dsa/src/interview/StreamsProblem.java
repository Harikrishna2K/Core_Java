package interview;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 
 * @author haris
 *
 *[1,2,3,10,30,1000,20] -> [1,10,1000,2,20,3,30] using java 8
 *
 *
 *
 *
 */

public class StreamsProblem {
	public static void main(String[] args) {
		int[] arr = {1,2,3,10,30,1000,20};
		
		//1st method
		int[] sortedArray = Arrays.stream(arr)
				.boxed()
				 .sorted((a,b) -> {
					 
					 if(a%2 == 0 & b%2 != 0) {
						 return -1;
					 }else if (a % 2 !=0  & b%2 == 0) {
						return 1; //will return odd numbers
					}
					 
					 return a-b; //compare normally
			
				 })
				 //convert the stream to int again
				 
				 .mapToInt(Integer::intValue).toArray();
		
		
		//2nd method
		
		int[] finalsortedArray = Arrays.stream(arr)
				.boxed()
				.sorted((a,b) -> Integer.compare(a%2, b%2))
				.mapToInt(Integer::intValue).toArray();
		
		
		System.out.println(Arrays.toString(sortedArray));
		System.out.println(Arrays.toString(finalsortedArray));
	}

}
