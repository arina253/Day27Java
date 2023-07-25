package one;

public class Day13array {

	public static void main(String[] args) {
		
		
//***********************************************************************************************************//		
		
		
		//ARRAY
		
		// to store a fixed-size sequence of elements of the same type. 
		//Array stores the value by index.
		
		// Declare an array of integers
		//int[] numbers;

		// Declare an array of strings
		//String[] names;
		
		// Initialize an array of integers with a size of 5
		//int[] numbers = new int[5];

		// Initialize an array of strings with specific values
		//String[] names = { "Alice", "Bob", "Charlie" };
		
		
//**********************************************************************************************************//		


		
		//Program 1
		
		//Method 1- type [] name of array = new type [length of array]
		           //specifying the length of array
		
		//With integers-Print every integer element in the array
		
		
		int []numbers = new int[5];
		numbers[0] = 11;
		numbers[1] = 22;
		numbers[2] = 33;
		numbers[3] = 44;
		numbers[4] = 55;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		//With Strings-Print every string element in the array
		
        String [] games =  new String [4];
		
		games [0] = "chess";
		games [1] = "ludo";
		games [2] = "badminton";
		games [3] = "football";
		
		System.out.println(games[0]);
		System.out.println(games[1]);
		System.out.println(games[2]);
		System.out.println(games[3]);
		
		
		
		//Method2 - defining the value of the array
		
		//With integers- Print every integer element in the array
		
		int [] numbers2 = {111,222,333,444,555};
		System.out.println(numbers2[0]);
		System.out.println(numbers2[1]);
		System.out.println(numbers2[2]);
		System.out.println(numbers2[3]);
		System.out.println(numbers2[4]);
		
		//With String-Print every string element in the array
		
		String []games1 = {"chess","ludo","badminton","football"};
		
		System.out.println(games1[0]);
		System.out.println(games1[1]);
		System.out.println(games1[2]);
		System.out.println(games1[3]);
		
		
		//Program 2- Print every string element in the array name cities
		
		String [] cities = new String [5];
		cities[0] = "pune";
		cities[1] = "mumbai";
		cities[2] = "hyderabad";
		cities[3] = "delhi";
		cities[4] = "mysore";
		
		System.out.println(cities[0]);     //We can access individual elements of an array using the index,
		                                   // which starts at 0
		
		
		//looping through array
		//Arrays have a length property that represents the number of elements in the array
		
		
		//Program 3-Print every integer element in the array name mks
		
		int mks []= {100,200,300,400,500,600,700};   //can also be written as,
		                                            //int [] mks = {100,200,300,400,500,600,700}
		                                           // []can be before or after the name of array.
		  
		
		//while loop
		int t1 = 0;
		while ( t1 < mks.length) {
			System.out.println(mks[t1]);
			t1 = t1 + 1;
		}
		
		//Print every integer element in the array name mks in reverse manner
		int t2 = mks.length-1;
		while (t2 >= 0) {
			System.out.println(mks[t2]);
			t2--;
		}
		
		
		//for loop
		//Print every integer element in the array name marks1
		
		int [] marks1 = {99,100,111,67,88,100};
		
		for (int  t=0; t < marks1.length; t++) {
		System.out.println(marks1[t]);
		}
		
		//Print every string element in the array name marks1 in reverse way
		
		
		for (int t = marks1.length-1; t >= 0; t--) {
			System.out.println(marks1[t]);
		}
		
		
		
		// Program 4 (for each loop)
		
		//for-each loop :  particularly useful when we want to iterate over all elements in a collection
		//sequentially and don't need to access the index or perform complex iteration logic
		
		//Print each string element in the array name fruits using for each loop
		
		String [] fruits = {"banana","apple","mango","pear"};
		
		for (String a: fruits) {
			System.out.println(a);
			
		}
		
		//Define integer array and print all the elements using for each loop
		
		int [] num = {1,2,3,4,10,20,30};
		for (int n: num) {
			System.out.println(n);
		}
		
		
		//Define string array and print all the elements in it using for each loop.
		
		//Example 1
		
		String []language = {"nepali","english","french","hindi","urdu"};
		for (String speech:language) {                   // S should be capital in String and take care of colon:
			System.out.println(speech);
			
		}
		
		//Example 2
		
		String [] games2 = {"chess","ludo","badminton","football"};
		
		for (String play : games2) {
			System.out.println(play);
		}


		}
		
		
		
		}


