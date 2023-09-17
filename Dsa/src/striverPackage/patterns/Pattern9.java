package striverPackage.patterns;

public class Pattern9 {
	public static void main(String[] args) {
		getThepatern9(5);
	}
	static void getThepatern9(int n) {
		for(int row=0; row<=2*n-1; row++) {
			
			int stars = row;
			if(row>n) {
				stars = 2*n-row;
			}
			for(int col= 0; col<=stars; col++) {
				System.out.print("*-");
			}
			System.out.println();
		}
		
	}

}
