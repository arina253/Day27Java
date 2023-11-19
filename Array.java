package two;

public class Array {

	public static void main(String[] args) {

		// Array- to store similar datatype values in a array variable
		// lowest bound/lowest index = 0
		// upper bound/upper index = n-1 (n is the size of array)
		// Size/length of array: System.out.println(arrayName.length);
		// one dimensional array/two dimensional array

		// Disadvantages of array
		// Array size is fixed----static array----To overcome this problem---we use
		// Collections---ArrayList,HashMap
		// Array stores only similar datatypes----To overcome this problem----we use
		// Object array

		// One dimensional array
		// PROGRAM 1-ARRAY OF INTEGERS

		int[] numbers = new int[3];
		numbers[0] = 11;
		numbers[1] = 12;
		numbers[2] = 13;

		int[] numbers1 = { 11, 12, 13 };
		System.out.println(numbers1); // [I@75a1cd57
		System.out.println(numbers1[0]);

		// ArrayIndexOutOfBoundException
		// System.out.println(numbers1[3]); //Index 3 out of bounds for length 3

		// For printing all the values of array,use for loop

		// for loop
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			System.out.println(numbers.length); // size/length of array.

		}

		// while loop

		int j = 0;
		while (j < numbers.length) {
			System.out.println(numbers[j]);
			j++;
		}

		// for each

		for (int num : numbers) {
			System.out.println(num);
		}

		// PROGRAM 2- Array of string

		String[] names = new String[3]; // **The "names" array is correctly defined with a length of 3,
		names[0] = "Ram"; // and three elements are assigned to it
		names[1] = "Sam";
		names[2] = "Hari";

		String[] names1 = { "Ram", "Sam", "Hari" };

		// for loop

		for (int i = 0; i < names1.length; i++) {
			System.out.println(names1[i]);
		}

		// while loop

		int i = 0;
		while (i < names.length) {
			System.out.println(names[i]);
			i++;
		}

		// for each

		for (String NAME : names) {
			System.out.println(NAME);
		}
		
		//PROGRAM3: OBJECT ARRAY
		//Object is a class.Object array is used to store different data types values
		
		Object obj[] = new Object[4];
		obj[0]="Arina";
		obj[1]= 35;
		obj[2]="Kathmandu";
		obj[3]="Engineer";
		
		System.out.println(obj[3]);
		

//*************************************************************************//

		// MULTIDIMENSIONAL ARRAY

		// PROGRAM 1

		String country[][] = {

				{ "Nepal", "India" }, // first array
				{ "Japan", "America" }, // second array
				{ "France", "Norway" } // third array

		};

//System.out.println(country[0];---------country of 0=first array
		// system.out.println(country[1]----------country of 1= second array
		// ystem.out.println(country[2];----------country of 2= third array

		// for loop

		for (int m = 0; m < country.length; m++) {
			String nation[] = country[m];
			for (int n = 0; n < nation.length; n++) {
				System.out.println(nation[n]);
			}
		}

		// Program 2

		// while loop

		int a = 0;
		while (a < country.length) {
			String nation2[] = country[a];
			int b = 0;
			while (b < nation2.length) {
				System.out.println(nation2[b]);
				b++;
			}
			a++;
		}

		// Program 3

		// for each loop

		for (String[] aaa : country) {
			for (String bbb : aaa) {
				System.out.println(bbb);
			}

		}

		/******************************************************************************/

		//Naveen(Part 4,5)
		
    //int quantity[][]= new int[3][4];

		int quantity[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		// To find out the number of rows and columns

		System.out.println(quantity.length); // 3
		System.out.println(quantity[0].length); // 4

		// For printing all the values of 2D array- Use 2 for loop
		// row =0 , col = 0 to 3
		// row =1,col = 0 to 3
		// row =2, col = 0 to 3
		for (int row = 0; row < quantity.length; row++) {

			for (int column = 0; column < quantity[0].length; column++) {
				System.out.println(quantity[row][column]);

			}
		}

	}

}
