package one;

public class Day11 {

	public static void main(String[] args) {

		// Program 1-REVERSE (METHOD1)
		// REVERSE OF "Siddhartha"

		String firstname = "Siddhartha";
		String rev = "";

		for (int i = 0; i < firstname.length(); i++) {
			rev = firstname.charAt(i) + rev;
			//System.out.println(i);
			//System.out.println(firstname.charAt(i));

			System.out.println(rev);
		}

		// Program 2-REVERSE (METHOD2)
	    // REVERSE OF "Bara"

		String city = "Bara";
		String rev1 = "";

		for (int i = city.length() - 1; i >= 0; i--) {
			rev1 = rev1 + city.charAt(i);
		}
		System.out.println(rev1);

		////////////////////////////////////////////////////////////////////////////////////////////////////

		// Program 1
		//PRINT "Pune" IN UPPERCASE
		//PRINT "Welcome Pune" IN UPPERCASE

		String city1 = "Pune";
		String uc = city1.toUpperCase();
		System.out.println(uc);
		System.out.println(city1.toUpperCase());
		System.out.println("Welcome".toUpperCase());
		System.out.println("Welcome".toUpperCase() + uc);

		// Program 2
		//PRINT "Pokhara" IN LOWERCASE

		String city2 = "Pokhara";
		String lc = city2.toLowerCase();
		System.out.println(lc);

		// Program 3
		//PRINT LENGTH OF "Lalitpur"

		String city3 = "Lalitpur";
		int len = city3.length();
		System.out.println(len);

		// Program 4
		// Chaining
		//PRINT UPPERCASE,LOWERCASE,LENGTH OF "Bhaktapur"

		String city4 = "Bhaktapur";
		int chain = city4.toUpperCase().toLowerCase().length();
		System.out.println(chain);

		// Program 5
		//PRINT CHARACTER "s" in "Texas"

		String city5 = "Texas";
		char c = city5.charAt(city5.length() - 1);
		System.out.println(c);

		// substring()
		//Syntax: String.substring(int startIndex, int endIndex)

		// substring (startindex,endindex(not inclusive);
		
		// Program 6
		// 6I) PRINT "pur" IN "Jaipur"------only startindex present

		String city6 = "Jaipur";
		String s1 = city6.substring(3);
		System.out.println(s1);
		
		//6 II) PRINT SECOND AND THIRD CHARACTER IN "Jaipur"-----startindex and endindex present

		String s2 = city6.substring(1, 3);
		System.out.println(s2);

	}

}
