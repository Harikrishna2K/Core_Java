package striverPackage.patterns;
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5

public class Pattern3 {
	public static void main(String[] args) {
		pattern3(5);
	}
	static void pattern3(int n) {
		for(int row = 1; row<=n; row ++) {
			for(int col = 1; col <=row; col ++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

}
