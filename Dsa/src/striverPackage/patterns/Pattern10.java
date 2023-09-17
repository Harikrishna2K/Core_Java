package striverPackage.patterns;

/**
 * Striver pattern 9th question
 * @author haris
 *
 */

public class Pattern10 {
	public static void main(String[] args) {
		pattern7(5);
		pattern8(5);
	}
	static void pattern7(int n) {
		for(int row = 0; row < n; row++) {
			//to print the space
			for(int col = 0; col<n-row-1; col ++) {
				System.out.print("-");
			}
			//print the star
			for(int col= 0; col < 2*row +1 ; col++) {
				System.out.print("*");
			}
			//print the space
			for(int col=0 ; col < n-row-1; col++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}
	static void pattern8(int n) {
		for(int row = 0; row<n; row ++) {
			//to print the space 1
			for(int col =0; col<row ; col ++) {
				System.out.print("-");
			}
			//to print the star
			for(int col = 0; col< 2*n-(2*row +1) ; col++) {
				System.out.print("*");
			}
			
			//to print the space 2
			for(int col =0; col<row; col++) {
				System.out.print("-");
			}
			System.out.println();
			
		}
	}

}
