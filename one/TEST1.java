package one;

public class TEST1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// QUESTION 1: WRITE A FUNCTION FOR ADDITION OF TWO NUMBERS

		// METHOD 1
		System.out.println(10 + 20);

        // METHOD 2
		//CALLING FUNCTION
		int A = ADD(2, 4);
		System.out.println(A);
		System.out.println(A + 10);

		// QUESTION 2: DEFINE TWO VARIABLES AND PERFORM ARITHMETIC OPERATION

		int a = 4;
		int b = 6;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		// QUESTION 3:DEFINE THREE VARIABLES AND PRINT GREATEST VARIABLE OUT OF THREE

		int x = 10;
		int y = 20;
		int z = 30;

		if (x > y && x > z) {
			System.out.println("x is greater");
		} else if (y > x && y > z) {
			System.out.println("y is greater");
		} else {
			System.out.println("z is greater");
		}

		// QUESTION 4: WRITE A PROGRAM FOR SWITCH CASE (CASE FOR CITY AND RESPECTIVE
		// STATE)

		String city = "Newroad";
		switch (city) {
		case "Sanepa":
			System.out.println("Lalitpur");
			break;
		case "Newroad":
			System.out.println("Kathmandu");
			break;
		case "Taumadhi":
			System.out.println("Bhaktapur");
		default:
			System.out.println("Not listed");

		}

	}

	// QUESTION 1:WRITING FUNCTION FOR ADDITION OF TWO NUMBERS
	
	public static int ADD(int x, int y) {
		return x + y;

	}
}

//COMMENTS:

//default to be aligned
//Press CTRL+SHIFT+F for formatting
