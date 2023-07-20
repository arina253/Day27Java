package one;

public class Day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Extrovert / Introvert
		// loud / calm

		// Human
		// Properties - age , height , color age
		// Method - walk() , talk()

		// Vehicle
		// Properties - model , color , regNo
		// Methods - start() , stop()

		// Bank -
		// Properties - accNo , branch ,bal
		// Methods - deposit() , withdrawl()

		// int a = 10 ---- -12, 12, 0

		// String ---- properties and methods

		// How to define string?
		
		//Program 1

		String name = "Arina";
		System.out.println(name);

		// 0 1 2 3 4 5 6----------index
		// C h i n m a y----------character
		
		
		// String is collection of characters
		// String stores the value by index

		// charAt();to retrieve a specific character from a string.
		
		// Syntax:- charAt(int index)
		
		//The indexing starts at 0, so the first character of the string is at index 0, the second character is at index 1, and so on.
		//The method returns the character at the specified index as a result.
		
		
		//Program 2 with charAt()

		char fourthChar = name.charAt(4);     //retrieves the character at index 4
		System.out.println(fourthChar);
		

		// length()
		// action- count total number of characters
		// return integer value representing the number of characters in the string.
		
		//Program 3 with length(),count total number of char and return in int
		

		// 0 1 2 3 4 5 6 7 8
		// D e s h p a n d e

		String lastName = "Deshpande";
		int totalChar = lastName.length();
		System.out.println(totalChar);
		

		//The indexing of characters in a string starts from 0 and goes up to length() - 1.
		//length-1 is always the last index
		

		// Program 4

		String fatherName = "shirish";
		int totalC = fatherName.length();
		System.out.println(totalC);

		for (int i = 0; i < totalC; i++) {
			System.out.println(i);
		}

		// i --- 0
		// i --- 1
		// i --- 2
		// i --- 3
		// i --- 4
		// i -- 5
		// i --- 6
		

		// Program 5

		String city = "pune";

		// 0 1 2 3
		// p u n e

		for (int i = 0; i < city.length(); i++) {
			System.out.println(i);

		}

		for (int i = 0; i < city.length(); i++) {
			System.out.println(city.charAt(i));
		}

		
		// Program 6
		// Print every char in reverse order

		for (int i = city.length() - 1; i >= 0; i--) {
			System.out.println(i);
		}

		for (int i = city.length() - 1; i >= 0; i--) {
			System.out.println(city.charAt(i));
		}

		// i ---- 3
		// i -----2
		// i -----1
		// i -----0
		

		// Program 7: .toUpperCase()

		String city2 = "kathmandu";
		String upperCaseString = city2.toUpperCase();        //THERE SHOULD BE NO SPACE, ie.city2.toUpperCase()
		System.out.println(upperCaseString);
		

		// Program 8: .toLowerCase()

		String city3 = "wAShington";
		String lowercaseString = city3.toLowerCase();
		System.out.println(lowercaseString);

	}
}
