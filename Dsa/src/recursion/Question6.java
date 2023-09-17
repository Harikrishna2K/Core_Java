package recursion;

public class Question6 {

	public static void main(String[] args) {
		//System.out.println(pod(1321));
		
		int answer = podal2(1321);
		System.out.println(answer);
	}
	
	
	static int pod(int n ) {
//		if(n%10 == n) {
//			return n;
//		}
		if(n == 0) {
			return n;
		}
		
		int rem = n%10;
		
		return rem * pod(n/10);
	}
	
	/*The product of digits in the alternative approach*/
	
	static void podal(int n) {
		if(n<=0) {
			System.out.println("Enter the number which is valid !");
		}
		
		else {
			System.out.println("The pod of the number is: ");
			podal2(n);
		}
		
		
	}

	/**
	 * 
	 * @param n
	 * @return
	 * 
	 * This is the alternative method of the problem /
	 */

	private static int podal2(int n) {
		
		int product = 1;
		
		while(n > 0) {
			//Extract the last digit
			int digit = n%10;
			
			
			//Add these digits with the exisiting product
			product = product*digit;
			
			//Remove the last digit from the number
			n= n/10;
		}
		return product;
	}
}
