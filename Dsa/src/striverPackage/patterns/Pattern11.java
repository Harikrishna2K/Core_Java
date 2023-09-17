package striverPackage.patterns;

/**
 * Striver pattern 11
 * @author haris
 *
 */
public class Pattern11 {
	public static void main(String[] args) {
		pattern11(5);
	}
	static void pattern11(int n) {
		for(int row = 0; row<=n ; row ++) {
			
			for(int col = 0; col<=row; col++) {
				if((row+col)%2 == 0) {
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
				
				
			}
			System.out.println();
		}
	}

}
