package one;

public class Day5 {

	public static void main(String[] args) {

		// Calling function without parameter and without return

		Sub();

		// Calling function with parameter and without return

		SubB(10, 6);
		SubB(10, 4);
		SubB(30, 20);

		// Calling function with parameter and with return

		int arina = SUBC(10, 20);
		System.out.println(arina);//  used 'arina' to store variable

		
		int a = SUBC(10, 20);
		System.out.println(a);
		System.out.println(a+10);// used 'a' to store variable.


		addD(arina, 10);

	}

	// Function without parameter and without return

	public static void Sub() {
		System.out.println(10 - 5);
	}

	// Function with parameter and without return type

	public static void SubB(int x, int y) {
		System.out.println(x - y);
	}

	// Function with parameter and with return type

	public static int SUBC(int x, int y) {
		return x - y;
	}

	public static void addD(int X, int Y) {
		System.out.println(X + Y);
		

	}
}
