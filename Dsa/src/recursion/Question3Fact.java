package recursion;

/**
 * 
 * @author haris
 *Write a program to print the factorial in recursion /
 */

public class Question3Fact {
	
	public static void main(String[] args) {
		//System.out.println(factRecursion(4));
		Question3Fact q = new Question3Fact();
		int answer = q.alternativeMethod(6);
		System.out.println(answer);
	}
	
	
	/*This is the recursive approach*/
	
	static int factRecursion(int n) {
		if(n <= 1) {
			return n;
		}
		return (n) * factRecursion(n-1);
	}
	
	/*This is the iterative approach*/

	public int alternativeMethod(int n) {
		
		int fact = 1;
		if(n <= 1) {
			return n;
		}
		else {
			for(int i = 1; i<=n ; i++) {
				fact = fact*i;
				
			}
		}
		return fact;
		
		
	}
}
