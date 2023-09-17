package striverPackage.patterns;
/*
 * 
 * Striver pattern question must do question number 7
 * 
 * 
 * 
 * 
 * 
 * 
 * */

public class Pattern7 {
	public static void main(String[] args) {
		//pattern7(5);
		pattern7with1indexing(5);
	}
	static void pattern7(int n) {
		for(int row = 0; row <= n; row++) {
			//to print the space
			for(int col = 0; col<=n-row-1; col ++) {
				System.out.print("-");
			}
			//print the star
			for(int col= 0; col <= 2*row +1 ; col++) {
				System.out.print("*");
			}
			//print the space
			for(int col=0 ; col <= n-row-1; col++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}
	static void pattern7with1indexing(int n) {
		for(int row = 1; row<=n; row++) {
				for(int col = 1; col<=n-row; col++) {
					System.out.print("-");
					
				}
				//to print the star
				for(int col = 1; col<=2*row -1; col++) {
					System.out.print("*");
				}
				//to print the space
				for(int col =1 ; col<=n-row; col++) {
					System.out.print("-");
				}
				System.out.println();
		}
	}

}
