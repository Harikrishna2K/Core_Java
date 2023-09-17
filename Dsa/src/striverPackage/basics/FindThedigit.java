package striverPackage.basics;

import java.util.Scanner;

/**
 * 
 * @param args
 * 
 * The Question is if we have an input of 123456789
 * I should get the odd number as total count like = 1+3+5+7+9 = 25
 * I should get the even number as total count like = 2+4+6+8 = 20
 */

public class FindThedigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		number(n);
	}
	
	public static void number(int n) {
		int oddsum = 0, evensum = 0 ;
		
		while(n>0) {
			
	
			int digits = n%10;
			
			if(digits%2 == 0) {
				evensum = evensum + digits;
			}
			else {
				oddsum = oddsum + digits;
			}
			n/=10;
			
			
		}
		
		System.out.println("The even sum is: "+ evensum);
		System.out.println("The odd sum is: " + oddsum);
		
	}

}
