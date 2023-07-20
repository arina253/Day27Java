package one;

public class RevisionString {

	public static void main(String[] args) {

		String firstName = "Arina";

		// String stores the value by index

		// 0 1 2 3 4
		// A r i n a

		// charAt()

		// Program 1

		System.out.println(firstName.charAt(4));
		System.out.println(firstName.charAt(0));
		
		

		// Program 2

		// Print every character of string using for loop, while loop,forEach loop

		// 2a- for loop

		for (int i = 0; i < firstName.length(); i++) {
			// System.out.println(i);
			System.out.println(firstName.charAt(i));

		}
		

		// 2b-while loop

		int i = 0;
		while (i < firstName.length()) {
			// System.out.println(i);
			System.out.println(firstName.charAt(i));
			i++;
		}
		
	

		// 2c- for each loop

		// .toCharArray- to convert a string into an array of characters.

		for (char cc : firstName.toCharArray()) { // "ram"=============>{"r","a","m"}
			System.out.println(cc);
		}
		
		

		// Program 3

		String city = "Texas";

		System.out.println(city.toUpperCase());
		
		

		// Program 4

		System.out.println(city.toLowerCase());
		
		

		// Program 5

		String city1 = " Arlington "; // leading and trailing space

		System.out.println(city1.length());
		System.out.println(city1.trim());

		String city2 = city1.trim();
		System.out.println(city2.length());
		
		

		// Program 6

		System.out.println(city1.startsWith("")); // Output=====>True (count space as well)
		
		

		// Program 7

		String city3 = "Pokhara";
		boolean cc = city3.endsWith("a");
		System.out.println(cc);
		
		

		// Program 8

		String lang = "I am learning English language and English language is great";

		System.out.println(lang.replace("language", "lang"));

		System.out.println(lang.replaceAll("language", "lang"));

		System.out.println(lang.replaceFirst("language", "lang"));

		System.out.println(lang.replace("a", "*"));

		System.out.println(lang.replaceAll("a", "*"));
		
		

		// Program 9

		String firstNameN = "Arina ";
		String lastNameL = "Joshi";

		String fullName = firstNameN.concat(lastNameL);

		System.out.println(fullName);
		
		

		// Program 10

		String state = "texas";
		String state1 = "Texas";
		String state2 = "TExas";

		boolean s = state.equals(state2);
		System.out.println(s);
		
		
		// Program 11

		boolean s1 = state1.equalsIgnoreCase(state2);
		System.out.println(s1);
		
		

		// Program 12

		System.out.println(state.contains("x"));
		System.out.println(state2.contains("xas"));
		
		

		// Program 13

		// split()-used to split a string into an array of substrings based on a specified delimiter.

		String mmm = "I am learning java";

		String[] aaa = mmm.split(" ");

		// Printing each part of the split string

		for (String bbb : aaa) {
			System.out.println(bbb);
		}
		
		
		
		//Program 14
		
		String flower = "jasmine";
		String reverse = "";
		
		for (i = 0; i < flower.length(); i ++) {
			reverse = flower.charAt(i) + reverse;
		}
			System.out.println(reverse);
		
		
		
		//Program 15
		
		String reverse1 = "";
		
		for (int j = flower.length()-1; j >= 0;j --) {
			reverse1 =  reverse1 + flower.charAt(j) ;
		}
			System.out.println(reverse1);
			
			
		
			
			
		}

	}


