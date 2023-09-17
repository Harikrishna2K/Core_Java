package recursion;

/**
 * 
 * @author haris
 *
 *Print the numbers which prints from n to 1 in the reverse order using recursion
 */

public class Question1 {
	public static void main(String[] args) {
		//getTheRecursive(5);
		
		alternativeMethod(5);
	}
	
	/*This is the recursive Method*/
	
	public static void getTheRecursive(int n) {
		if(n == 0) {
			return;
		}
		
		System.out.println(n);
		
		getTheRecursive(n-1);
	}
	
	
	/*This is the Alternative Method */
	public static void alternativeMethod(int n) {
		
//		for(int i = n; i >= 1; i--) {
//			System.out.println(i);
//		}
		int i = n;
		
//		while(i >= 1) {
//			System.out.println(i);
//			i--;
//		}
		
		do {
			System.out.println(i);
			i--;
		}while(i >= 1) ;
		
		
	}
	
	

}
