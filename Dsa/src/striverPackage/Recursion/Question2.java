package striverPackage.Recursion;

public class Question2 {
	public static void main(String[] args) {
		recursion2(3);
	}
	static void recursion2(int n) {
		if(n<1) {
			return;
		}
		System.out.println("Hari KrishnaS");
		recursion2(n-1);
	}

}
