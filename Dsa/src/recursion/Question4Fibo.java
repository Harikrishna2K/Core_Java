package recursion;

public class Question4Fibo {
	public static void main(String[] args) {
		
		int n = 5;
		
//		for(int i = 0; i<=n ; i++) {
//			System.out.println(fibo(i));
//		}
//		
		
		fiboAlternativeMethod(5);
	}
	
	static int fibo(int n) {
		
		if(n == 0 || n == 1) {
			return n;
		}
		return fibo(n-1)+ fibo(n-2);
	}
	
	/*This approach is from iterative method*/
	//0112358111930

	static int fiboAlternativeMethod(int n) {
		
		int n1 = 0, n2 = 1;
		int sum = 0;
		
		for(int i = 0 ; i<= n ; i++) {
			System.out.println(n1 + " ");
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			
			
		}
		return sum;
		
		
		
		
		
	}
}
