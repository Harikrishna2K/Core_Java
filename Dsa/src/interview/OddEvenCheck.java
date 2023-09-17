package interview;

/**
 * Find the odd or even without modulo operator
 * @author haris
 *
 */
public class OddEvenCheck {

	public static void main(String[] args) {
		
		int n = 3;
		
		/**
		 * To solve this we use this concept (n&1) == 0 //complement methods
		 */
		if((n&1) == 0) {
			System.out.println(n + "Is even ");
		}
		else {
			System.out.println(n + "Is odd");
		}
	}
}
