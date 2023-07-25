package two;

import java.util.Arrays;

public class PracticeWeek3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CONTENT( Day 11-Day 16)

		// .toUpperCase();
		// .toLowerCase();
		// chaining
		// .substring(start index,end index(not included);
		// .startsWith();
		// .endsWith();
		// .replaceFirst();
		// .replaceAll();
		// .replace();
		// .concat();
		// .contains();
		// .equals();
		// .equalsIgnoreCase();
		// .trim();
		// Array
		// Looping through array-for loop, while loop, for each loop
		// Multi dimensional array[][]
		// User defined datatype
		// User defined datatype-constructor

//***********************************************************************************************************//		

		// List of some commonly used methods that do not take any arguments:

		// toCharArray() - Converts a string to a character array.
		// toUpperCase() - Converts all characters in a string to uppercase.
		// toLowerCase() - Converts all characters in a string to lowercase.
		// trim() - Removes leading and trailing whitespace from a string.
		// length() - Returns the length of an array or the number of characters in a
		// string.

//*************************************************************************************************************//		

		// Practice Program 1

		// Print Kathmandu in uppercase

		String city = "Kathmandu";
		System.out.println(city.toUpperCase());

		// Practice Program 2

		// Print KATHMANDU in lowercase

		String city1 = "KATHMANDU";
		System.out.println(city1.toLowerCase());

		// Practice Program 3

		// Convert string "Kathmandu"to uppercase and then to lowercase and find the
		// total number of characters in it

		String city3 = "Kathmandu";
		System.out.println(city3.toUpperCase().toLowerCase().length());

		// Practice Program 4

		// Print only mandu from the string "Kathmandu"

		String city4 = "Kathmandu";
		System.out.println(city4.substring(4)); // *Substring stores the value by index

		// Practice Program 5

		// Print only athm in the string "Kathmandu"

		System.out.println(city4.substring(1, 5));

		// Practice Program 7

		// Check if the string "Kathmandu" starts with a

		System.out.println(city4.startsWith("a"));
		System.out.println(city4.startsWith("K"));
		System.out.println(city4.startsWith("k"));

		// Practice Program 8

		// Check if the string "Kathmandu" ends with t

		System.out.println(city4.endsWith("t"));

		// Practice Program 9

		// In the string "I am eating pizza,chicken and salad and pizza is my
		// favourite", change it to
		// "I am eating momo,chicken and salad and pizza is my favourite"

		String food = "I am eating pizza,chicken and salad and pizza is my favourite";
		String food1 = food.replaceFirst("pizza","momo");          //*"pizza","momo"
		System.out.println(food1);
		
		//Using replace()
		
		System.out.println(food1.replace("pizza","momo"));
		
/*replaceFirst() replaces only the first occurrence based on a regular expression, while replace() replaces
  all occurrences of a target substring without using regular expressions*/
		
		
		//Practice Program 10
		
		//In the above string food,replace pizza with momo
		
		System.out.println(food.replaceAll("pizza", "momo"));
		
		
		//Practice Program 11
		
		//In the above string food,replace "a" to "z" and replace "my" to "our"
		
		System.out.println(food1.replace("a","z"));
		System.out.println(food1.replace("my", "our"));
		
		
		//Practice Program 12
		
		//Print "Welcome to Nepal using concat
		//Print "WELCOME TO NEPAL" using concat
		
		String country = "Nepal";
		String text = "Welcome to ";
		System.out.println(text.concat(country));
		
		System.out.println(text.toUpperCase().concat(country.toUpperCase()));
		
		
		//Practice Program 13
		
		//Check if the string food contains salad
		
		System.out.println(food.contains("salad"));
		
		
		//Practice Program 14
		
		//Check if the string s1 and string s2 are equal
		
		String s1 = "god";
		String s2 = "GOD";
		System.out.println(s1.equals(s2));
		
		
		//Practice Program 15
		
		System.out.println(s2.equalsIgnoreCase(s1));
		
		//Other Method
		
		boolean s3 = s2.equalsIgnoreCase(s1);
		System.out.println(s3);
		
		
		//Practice Program 16
		
		//Print "I love dancing and singing" without leading and trailing space
		
		String text1 = " I love dancing and singing ";
		System.out.println(text1.length());
		System.out.println(text1.trim());
		
		String text2 = "I love dancing and singing";
		System.out.println(text2.length());
		
		
		//Practice Program 17
		
		// Print every element in the integer array score
		
		//Method1
		
		int []score = {10,20,30,40,50};
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		
		//Method 2
			
			int j = 0;
			while (j < score.length) {
			System.out.println(score[j]);
			j++;
			}
			
			//Method 3
			
			for (int marks:score) {
				System.out.println(marks);
			}
			
			
			//Practice Program 18
			
			//Print every element in the string array animals
			
			//Method 1
			
			String []animals = {"cow","dog","horse","goat","elephant"};
			for (String aaa:animals) {
				System.out.println(aaa);
			}
			
			//Method 2
			
			for (int a = 0; a < animals.length; a++) {
				System.out.println(animals[a]);
				
			}
			
			
			//Practice Program 19
			
			/*Print every element in the array numbers
			{1,2,3,4},{5,6,7,8},{9,10,11,12}*/
			
			//Create a program with multi dimension or 2 dimension
			
			//Method 1
			
			int [][] numbers = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };
			for (int k = 0; k < numbers.length; k++) 
			{
				int []numbers1 = numbers[k];      //moving towards small array
				
				
				
			for (int l = 0; l < numbers1.length; l++) 
			{
				
				System.out.println(numbers1[l]);
					
					}
			System.out.println(Arrays.toString(numbers1));
				
				}
			
			//Method 2
			
			for (int [] num :numbers){
				for ( int num1 : num) {
					System.out.println(num1);
				}
			}
			
			
			
			
			//Practice Program 20
			
			Animals dog = new Animals (20,"Jackey");
			
			System.out.println(dog.lifespan);
			System.out.println(dog.name);
			dog.move();
			dog.sound ();
			
			Animals cat = new Animals (10,"Tomy");
			System.out.println(cat.lifespan);
			System.out.println(cat.name);
			cat.move();
			cat.sound();
			
			String s = dog.sound();
			System.out.println(s);
			
					
					
					
					
			}
			
			
			
			
			
		
	}


 class Animals{
	 int lifespan;
	 String name;
	 
	 
	 public Animals(int lifespan,String name) {
		 this.lifespan = lifespan;
		 this.name = name;
	 }
	 
	 public void move() {
		 System.out.println("Animals can move freely");
	 }
		 
		 public String sound() {
			 return "Dogs can produce sound";
		 }
		 
	 }
	 
	 
	 
	 
	 
 
	
	


