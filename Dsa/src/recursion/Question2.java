package recursion;


/**
 * 
 * @author haris
 *Print the numbers from the order 1 to n using recursion
 */
public class Question2 {

	public static void main(String[] args) {
		//recursion(10);
		alternativeMethod(10);
	}
	
	static void recursion(int n) {
		if(n == 0) {
			//System.out.println(1);
			
			return ;
		}
		
		recursion(n-1);
		System.out.println(n);
	}
	
	/*
	 * This is the alternative method
	 * */
	
	private static void alternativeMethod(int n) {
//		for(int i = 0 ; i<=n ; i++) {
//			System.out.println(i);
//		}
		int i = 0;
		do {
			System.out.println(i);
			i++;
		}while(i<=n);
	}
}
