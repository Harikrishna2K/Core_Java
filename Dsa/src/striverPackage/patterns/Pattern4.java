package striverPackage.patterns;
//12345
//1234
//123
//12
//1

public class Pattern4 {

	public static void main(String[] args) {
		pattern(5);
	}
	static void pattern(int n) {
		for(int row = 1; row<=n ; row++) {
			for(int col = 1; col <= n+1-row; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
}
