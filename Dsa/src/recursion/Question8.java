package recursion;


/*
 * Write the palindrome of the function using recursion
 * 
 * */
public class Question8 {
	
	public static void main(String[] args) {
//		reverse(12321);
//		System.out.println(isPalindrome(sum,12321));
		int reversed = palindrome2(12321);
		System.out.println(isPali(reversed, 12321));
		
	}
	
	
	//static int sum = 0;
	
	
//	static void reverse(int n) {
//		if(n %10 == n) {
//			sum= sum*10+n;
//			return;
//		}
//		
//		int remainder = n%10;
//		sum = sum*10 + remainder;
//		reverse(n/10);
//		
//	}
//	
//	static boolean isPalindrome(int rev, int n) {
//		return (n == rev);
//	}
	
	
	/**
	 * This is the alternative method for palindrome
	 */
	
	public static int palindrome2(int n) {
		int reversed = 0;
		while(n != 0){
			int digits = n%10;
			reversed = reversed *10 + digits;
			n = n/10;
		}
		
		return reversed;
	}
	
	public static boolean isPali(int reversed , int n) {
		return (n == reversed);
	}

}
