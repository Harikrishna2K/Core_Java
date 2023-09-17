package recursion;

public class Question7 {
	public static void main(String[] args) {
//		reverseAnumber(1322);
//		System.out.println(sum);
		
		
		//System.out.println(rev2(1323));
		
		int answer = reverseTheNumbers(13232);
		System.out.println(answer);
		
	}
	
	//This is the 1st method
	static int sum = 0;
	
	
	
	static int reverseAnumber(int n) {
		//int sum = 0;
		
		if(n == 0) {
			return n; 
		
		}
		
		int remainder = n % 10;
		sum = sum *10 + remainder;
		return (n/10);
	
		
	}
	
	
	//This is the second recursive method//
	
	static int rev2(int n) {
		
		int digits = (int)(Math.log10(n))+ 1;
		return helper(n, digits);
		
	}


	private static int helper(int n, int digits) {
		
		if(n%10 == n) {
			return n;
		}
		
		int remainder = n%10;
		
		//ask doubt to bejju !
		
		return (remainder * (int)(Math.pow(10,digits-1))+ helper(n/10, digits-1));
		
		
	}
	
	
	/**
	 * This is the alternative method of the reversing numbers
	 */
	
	 static int reverseTheNumbers(int n) {
		int sum = 0;
		
		while(n != 0) {
			
			int digits = n%10;
			sum = sum *10 + digits;
			n = n/10;
			
		}
		
		return sum;
	}

}
