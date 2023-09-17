package striverPackage.basics;

import java.util.Scanner;

public class FindtheLastDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the last digit to be found: ");
		int answer = sc.nextInt();
		
		//System.out.println(lastDigit(answer));
		
		addmethod(answer);
		
	}
	
	/**
	 * 
	 * Passed first case , failed both cases
	 */
	public static void findthelastdigit(int n) {
		
		int digits = n%10;
		if(digits != -1) {
			digits = digits+1;
		}
		n = n*10+digits;
		
		System.out.println(n);
		
		
	}
	
	
		//Tried second method (Did not work)
		 static int lastDigit(int n) {
			 int digits = n%10;
			 if (digits == 9) {
		            n = n * 10 + (digits+1); // Append 10 to the input number
		        } 
			 else if(digits < 9) {
				 digits = digits + 1;
				 n = n*10 + digits;
			 }
			 else if(digits > 9) {
				 digits = digits + 1;
				 n = n*10 + 10 + digits;
			 }
			 return n;
			 
		 }
		 
		 //Tried third method (Did not work)
		 static void addmethod(int n) {
			 int lastDigit = n%10;
			 int output = n*10 + (lastDigit +1);
			 System.out.println(output);
		 }
		
		}
		
		
	


