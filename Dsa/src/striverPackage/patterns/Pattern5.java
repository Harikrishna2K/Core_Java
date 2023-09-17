package striverPackage.patterns;
/*
    *                                 *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
 * 
 * 
 * */

public class Pattern5 {
	public static void main(String[] args) {
		pattern5(5);
	}
	static void pattern5(int n) {
		for(int row = 1 ; row <=2*n-1 ; row ++) {
			/*this int stars = row is to make sure the stars are printing
			 * in the same number of the rows*/
			int stars = row;
			
			/*This if condition is because, after we cross the n row, the
			 * stars should reduce the count so we use this logic*/
			if(row > n) {
				stars = 2*n-row;
			}
			for(int col = 1; col<= stars ; col++) {
				System.out.print("*-");
			}
			System.out.println();
		}
	}

}
