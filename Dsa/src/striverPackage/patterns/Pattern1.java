package striverPackage.patterns;

import java.util.Scanner;

/**
 *  The question is      
 *  *
    **
    ***
    ****
    *****
 * 
 *
 */
public class Pattern1 {
	public static void main(String[] args) {
		
				
		pattern1(4);
	}
	
	static void pattern1(int n) {

		for(int row=1; row<=n ; row++) {
			for(int col = 1 ; col<=row; col++) {
				System.out.print("* ");
			}
			//After completing of the row for the next row add a new line
			System.out.println();
		}
		
		
	}

}
