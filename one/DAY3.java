package one;

public class DAY3 {

	public static void main(String[] args) {
		System.out.println("Arithmetic operations");

		// ARITHMETIC OPERATIONS
		// ADDITION - +
		// SUBTRACTION - -
		// MULTIPLICATION - *
		// DIVISION - /
		// MODULUS - %

		int x = 10;
		int y = 5;

		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

		int a = 8;
		int b = 4;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		// 10 pair------50 lines

		// CALLING THE CALCULATOR FUNCTION

		Calculator(9, 3);
		Calculator(8, 4);
		Calculator(50, 6);

	}

	public static void Calculator(int x, int y) {
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

	}

}
