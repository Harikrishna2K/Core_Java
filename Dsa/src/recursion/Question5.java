package recursion;

/**
 * 
 * @author haris
 *Write the java code to print the sum of digits
 */

public class Question5 {
	
	public static void main(String[] args) {
		//System.out.println(sumOfDigits(1321));
		
		alternativeMethod(1323);
	}
	
	static int sumOfDigits(int n) {
		if(n == 0) {
			return n;
		}
		
		int reminder = n%10;
		
		return reminder + sumOfDigits(n/10);
	}
	
	static void alternativeMethod(int n) {
		if(n<=0) {
			System.out.println("The number is invalid");
		}
		else{
			System.out.println("The numbers are !" + alternative2(n));
			
		}
	}
	
	static int alternative2(int n) {
		
		int sum = 0;
		
		while(n > 0) {
			
			sum = sum+ n%10;
			n = n/10;
		}
		return sum;
	}
	

}
