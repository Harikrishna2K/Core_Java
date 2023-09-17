package striverPackage.BasicMaths;
/*
 * Reversed Number
 * 
 * */

public class ReverseTheNumber {
	public static void main(String[] args) {
		System.out.println(reversedNumber(12345678));
	}
	static int reversedNumber(int n) {
		int reversedNo = 0;
		
		while(n>0) {
			int digits = n%10;
			reversedNo = reversedNo*10 + digits;
			n=n/10;
		}
		return reversedNo;
	}

}
