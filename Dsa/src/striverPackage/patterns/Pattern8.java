package striverPackage.patterns;
/*
 * striver pattern 8
 * 
 * */

public class Pattern8 {
	public static void main(String[] args) {
		pattern8(5);
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
