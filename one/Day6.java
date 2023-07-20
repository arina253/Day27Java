package one;

public class Day6 {

	public static void main(String[] args) {

		// CONDITIONAL STATEMENTS
		// one input and multiple outcomes

		// EG: numT > 0 && numT <= 5 --------> 10 % discount
		// numT > 5 && numT <= 10 --------> 20 % discount
		// numT > 10 --------> 30 % discount

//if
		/*
		 * if(condition) { system.out.println(statements to be executed); }
		 */

//if else
		/*
		 * if(condition) { system.out.println(statements to be executed); } 
		 * 
		 * else if
		 * (condition){ system.out.println(statements to be executed); } 
		 * else{
		 * system.out.println(statements to be executed); }
		 */

// if
		/*
		 * this will check all the given condition even if the first condition is true
		 * or false and give many output.
		 */

// if else
		/*
		 * this will check the condition only upto the if clause where it holds true and
		 * give only one output for the given condition.
		 */

		/*******************************************************************/

		// Program 1

		int numT = 7;

		if (numT > 0 && numT <= 5) {
			System.out.println("10%discount");
		}
		if (numT > 5 && numT <= 10) {
			System.out.println("20%discount");
		}
		if (numT > 10 && numT <= 25) {
			System.out.println("30%discount");
		}

		// Program 2

		int numTa = 20;

		if (numTa > 0 && numTa <= 5) {
			System.out.println("10%discount");
		} else if (numTa > 5 && numTa <= 10) {
			System.out.println("20%discount");
		} else if (numTa > 10) {
			System.out.println("30%discount");
		} else {
			System.out.println("incorrect input");
		}

		// Program 3

		int marks = 100;

		if (marks > 90) {
			System.out.println("Grade A");
		}
		if (marks > 50) {
			System.out.println("Grade B");
		}
		if (marks > 30) {
			System.out.println("Grade C");
		}

		// Program 4

		int marksB = 60;

		if (marksB > 90) {
			System.out.println(" Grade A");
		} else if (marksB > 50) {
			System.out.println("Grade B");
		} else if (marksB > 30) {
			System.out.println("Grade C");
		} else {
			System.out.println("Fail try again");
		}

		// Program 5

		int a = 15;
		int b = 10;

		if (a > b) {
			System.out.println(" a is greater");
		} else if (b < a) {
			System.out.println("b is greater");
		}

		// Program 6

		int x = 20;
		int y = 30;
		int z = 40;

		if (x > y && x > z) {
			System.out.println("x is greater");
		} else if (y > x && y > z) {
			System.out.println("y is greater");
		} else {
			System.out.println("z is greater");
		}

	}
}
