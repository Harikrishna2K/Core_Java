package recursion;

import java.util.Scanner;

public class Question2A {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to be tested: ");
		int input = sc.nextInt();
		
		
		printNumbers(input);
		
		
		
	}
	public static void printNumbers(int n) {
		if(n <=0 ) {
			
			
			System.out.println(n);
			printNumbers(n+1);
		}
		
		
	}
	

}
