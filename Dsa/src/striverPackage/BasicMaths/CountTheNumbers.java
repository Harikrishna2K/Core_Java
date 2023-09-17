package striverPackage.BasicMaths;
/***
 * 
 * @author haris
 *
 *Count the individual numbers of a given integer
 *
 */

public class CountTheNumbers {
	public static void main(String[] args) {
		System.out.println(countTheDigits(123456));
		System.out.println(countTheDigits2(123456));
	}
	
	static int countTheDigits(int n) {
		
		int sumofDigits = 0;
		
		if(n == 0) {
			sumofDigits = 1;
		}
		else {
			int temp = n;
			while(temp !=0) {
				temp = temp/10;
				sumofDigits ++;
			}
		}
		
		
		
		
		return sumofDigits;
	}
	
	/****
	 * 
	 * @param n
	 * @return
	 * 
	 * Another method to solve this question , change to string and find the length/
	 */
	static int countTheDigits2(int n) {
		String change = Integer.toString(n);
		return change.length();
	}

}
