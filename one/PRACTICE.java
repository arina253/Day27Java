package one;

public class PRACTICE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// QUESTION 4: WRITE A PROGRAM FOR SWITCH CASE (CASE FOR CITY AND RESPECTIVE
		// STATE)

		String city = "Newroad";
		switch (city) {
		case "Newroad":
			System.out.println("Kathmandu");
		case "kupondole":
			System.out.println("Lalitpur");
		case "Taumadhi":
			System.out.println("Bhaktapur");
		default:
			System.out.println("Not listed");
		}

		/*
		 * The break statements are used to exit the switch-case statement after the
		 * corresponding case is executed. It prevents fall-through behavior where
		 * execution continues to the next case.
		 */

		String city1 = "Newroad";
		switch (city1) {
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
		
		// QUESTION 1: WRITE A FUNCTION FOR ADDITION OF TWO NUMBERS
		
		System.out.println(10 + 15);        //METHOD1
		
		int add = sum (6,10);               // METHOD2
		System.out.println(add);
		System.out.println(add + 10);
		
		
		// QUESTION 2: DEFINE TWO VARIABLES AND PERFORM ARITHMETIC OPERATION
		
		int x = 10;
		int y = 40;
		int z = 30;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		
		// QUESTION 3:DEFINE THREE VARIABLES AND PRINT GREATEST VARIABLE OUT OF THREE
		
		if (x > y && x > z) {
			System.out.println("x is greater");
		}
		else if (y >x && y > z) {
				System.out.println("y is greater");
		}
		else {
			System.out.println("z is greater");	}
		
		
//Write a Java program that takes a word as input from the user and prints the word in reverse order.
		
		String name = "buddha";
		String reverse = "";
		
		for (int i = 0; i <= name.length()-1; i++) {
			reverse =  name.charAt(i) + reverse;               //b + ""-------b
			System.out.println(reverse); // u + b-------FFFFF
		
//You are given a two-dimensional array representing a matrix of integers. 
//Write a Java program that prints  all the elements in the matrix.
		
		int[][] matrix = {
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9}
			};

		for (int k = 0; k < matrix.length; k++) {
			 int [] matrix1 = matrix[k];
			 for (int j = 0; j < matrix1.length; j++) {
				 System.out.println(matrix1[j]);
				 }
		}
		
		
/*Write a Java program that uses a for loop to calculate the sum of the first N natural numbers, 
		where N is provided by the user.*/
		
		
		//Asked question-Print 11 in the given array
		
		int [][]numbers = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		int values = numbers[2][2];
		
System.out.println(values); 
		}
	}


/*Create a Rectangle object using one of the available constructors. The rectangle should have a length of 10 and a width of 5. Print the area of the rectangle.

Options:

A) Using a constructor with no parameters
B) Using a constructor with length and width parameters
C) Using a constructor with only a length parameter
D) Using a constructor with only a width parameter*/
			 
			 
		
		
	
	
			
		
	
	

//Writing a function for the addition of two numbers

	public static int sum(int a, int b) {
		return a + b;
	}

	
	
	/*Create a Rectangle object using one of the available constructors. The rectangle should have a length of 10 and a width of 5. Print the area of the rectangle.

	Options:

	A) Using a constructor with no parameters
	B) Using a constructor with length and width parameters
	C) Using a constructor with only a length parameter
	D) Using a constructor with only a width parameter*/
				 

	 Diagram rectangle = new Diagram ();
	 Diagram rectangle = new Diagram (10);
	 Diagram rectangle = new Diagram (10,20);
	 
	rectangle.length;
	
}

	
	
	
		
		
		
 class Diagram{
int length;
int width;
			
			
			
	public  Diagram() {
		System.out.println("Default constuctor is called");
	}
	
		
		public Diagram (int length) {
			this.length = length;
		}
		
		public Diagram (int length, int width) {
		this.width = width;	
		}
		
		public int area (int a, int b) {
			return a*b;
			
		}
		int area = this.length * this.width;
		
		}
			
	
			
		



