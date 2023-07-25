package one;

public class Day12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//METHODS
		
		//.toUpperCase();
		
		//Program 1
		
		String city1 = "goa";
		String uc = city1.toUpperCase();
		System.out.println(uc);
		System.out.println("Welcome".toUpperCase()+uc);
		
		
		//.toLowerCase();
		
		
		//Program 2
		
		String city2 = "Kathmandu";
		String lc = city2.toLowerCase();
		System.out.println(lc);
		
		
		//.length();
		
		
		//Program 3
		
		String city3 = "Newroad";
		int len = city3.length();
		System.out.println(len);
		
		
		//chaining
		//to perform multiple operations on a string in a single line, by invoking methods successively on the
		//resulting objects.
		
		
		//Program 4
		
		String city4 = "Chandigarh";
		int con = city4.toUpperCase().toLowerCase().length();
		System.out.println(con);
		
		
		//Program 5
		
		String city5 = "Texas";
		char c = city5.charAt(city5.length()-1);
		System.out.println(c);
		
		
		//substring();
		
		
		//Program 6
		
		String city6 = "Jaipur";
		String s1 = city6.substring(3);
		System.out.println(s1);
		
		String s2 = city6.substring(1,3);
		System.out.println(s2);
		
		
		//startsWith();
		
		//Program 7
		
		String city7 = "chandrapur";
		boolean s3 = city7.startsWith("c");
		System.out.println(s3);
		
		
		//endsWith();
		
		//Program 8
		
		String city8 = "hyderabad";
		boolean s4 = city8.endsWith("abad");
		System.out.println(s4);
		
		
		//split()------come back later on after array
		
		//Program 9
		
		String city9 = "I am learning java";
		String [] s5 = city9.split(" ");
		String []s6 = city9.split("a");
		
		
		//replaceFirst();
		//- to replace only the first occurrence of a specific character or substring in a string
		
		
		//Program 10
		String city10 = "I am learning python and python is a good language";
		String s7 = city10.replaceFirst("python","java");
		System.out.println(s7);
		
		
		
		//replaceAll();
		//-to replace all occurrences of a specific character or substring in a string
		
		
		//Program 11
		String s8 = city10.replaceAll("python","java");
		System.out.println(s8);
		
		
		//replace();
		//to replace specific characters or substrings within a string.
		
		
		//Program 12
		
		String s9 = city10.replace("I","w");
		System.out.println(s9);
		
		
		//concat();
		//-concatenates the two strings together without adding any additional characters or spaces.
		
		
		//Program 13
		
		String city11 = "Kathmandu";
		String city12 = "Welcome to";   
		String city12a = "Welcome to ";
		String s10 = city12.concat(city11);  
		String s10a = city12a.concat(city11);
		System.out.println(s10);    // Since there is no space after "to" in city12 string,
		                            //Output:Welcome toKathmandu
	     
		System.out.println(s10a);   //By adding a space after "to" in the city12a string,the output will now be
		                            //:Welcome to Kathmandu
		
		
		
		//contains();
		//to check if a string contains a specified sequence of characters. 
	   //It returns a boolean value indicating whether the sequence is found within the string or not.
				
		
		//Program 14
		
		String city13 = "I am learning java in Kathmandu";
		boolean s11 = city13.contains("learning");
		System.out.println(s11);
		
		
		//Program 15
		
		boolean s12 = city13.contains("texas");
		System.out.println(s12);
		
		
		//equals();
		//to compare the contents of two strings and determine if they are equal.
		//returns a boolean value indicating whether the two strings have the same characters in the same order.
		
		
		//Program 16
		
		String city14 = "Texas";
		String city15 = "TExas";
		boolean s13 = city14.equals(city15);
		System.out.println(s13);
		
		
		//equalsIgnoreCase();
		//it performs a case-insensitive comparison between two strings. 
		//returns a boolean value indicating whether the two strings are equal, ignoring differences in case.
		
		
		//Program 17
		
		boolean s14 = city14.equalsIgnoreCase(city15);
		System.out.println(s14);
		
		
		//trim()- to remove leading and trailing whitespace from a string. 
		         //It returns a new string with the leading and trailing whitespace removed.
		        //trim() method only removes spaces, tabs, and newline characters from the beginning and end of the 
		       //string. It does not remove spaces within the string itself. 
		
		      //For removing spaces within the string, you can use other string manipulation methods like
		     // replaceAll() or replace().
		
		
		//Program 18
		
		String city16 = " I am learning computer ";
		System.out.println(city16.length());
		String s15 = city16.trim();
		System.out.println(s15);
		System.out.println(s15.length());
		
		
		//contains();
		
		//Program 19
		
		String city17 = "I am learning English";
		String city20 = "ENGLISH";
		boolean s16 = city17.toUpperCase().contains(city20);
		System.out.println(s16);
		
		//Program 20
		
		boolean s17 = city17.contains(city20);
		System.out.println(s17);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
