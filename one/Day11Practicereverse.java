package one;

public class Day11Practicereverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Print kathmandu in reverse

		// METHOD 1

		String city = "kathmandu";

		// 0 1 2 3 4 5 6 7 8
		// k a t h m a n d u

		String reverse = "";

		for (int i = city.length() - 1; i >= 0; i--) {
			reverse = reverse + city.charAt(i);
			System.out.println(reverse);

		}

		// METHOD 2

		String city1 = "kathmandu";
		String reverse1 = "";

		for (int i = 8; i >= 0; i--) {
			reverse1 = reverse1 + city1.charAt(i);
			System.out.println(reverse1);
		}

		// METHOD 3

		String city2 = "kathmandu";
		String reverse2 = "";

		for (int i = 0; i < city2.length(); i++) {
			reverse2 = city2.charAt(i) + reverse2;
			System.out.println(reverse2); // By moving the System.out.println(reverse2) statement inside the for loop,
											// the reversed string will be printed step by step.

		}

		// METHOD 4

		String city4 = "kathmandu";
		String reverse4 = "";

		for (int i = 0; i < city2.length(); i++) {
			reverse4 = city4.charAt(i) + reverse4;
		}
		System.out.println(reverse4); // By moving the System.out.println(reverse2) statement outside the for loop,
										// the reversed string will be printed only once, in a single line.

	}

}
