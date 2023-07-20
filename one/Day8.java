package one;

public class Day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Print 1 to 5

		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		//loops-  Used to repeatedly execute a block of code until a certain condition is met.D
		
		//loops-for loop & while loop
		
		//for loop
	//SYNTAX: for (initialization; condition check; increment/decrement){
		//statement to be executed}
		
		/*STEPS
		 * 1) Initialization
		 * 2)Condition check
		 * 3)If condition is true, then print
		 * 4)Check increment/decrement values
		 * 5)Again,condition check
		 * 6)Print
		 * 7)Condition check will continue until the condition is false and it will break the loop*/
		 
		
		
	

		// Program 1

		for (int i = 1; i <= 5; i++) {       // 2 // 3 // 4 // 5 // 6
			System.out.println(i);
		}

		// Program 2

		// Print hello 3 times

		for (int i = 1; i <= 3; i++) {  // 2 // 3 // 4
			System.out.println("hello");
		}

        // Program 3

		for (int i = 1; i <= 5; i++) {      // 2 // 3 // 4 // 5 // 6
			System.out.println(i);
		}

		// Program 4

		for (int i = 5; i >= 1; i--) { 
			System.out.println(i);
		}

		// Program 5

		for (int i = 2; i <= 20; i = i + 2) {
			System.out.println(i);
		}

		// Program 6

		for (int i = 3; i >= 1; i--) {
			System.out.println(i);
		}

		// Program 7
		// for loop with break----------------------------if  break condition is before print statement
		//Once break encounteer, it will come out of loop.

		for (int i = 1; i < 4; i++) {
			if (i == 2) {
				break;
			}
			System.out.println(i);
		}

		// Program 8
		// for loop with break--------------------------if break condition is after print statement

		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			if (i == 4) {
				break;
			}
		}

		// Program 9
		// for loop with break

		
		for (int i = 5; i >= 1; i--) {
			if (i == 4) {
				break;
			}
			System.out.println(i);

		}
		

		// Program 10
		// for loop with break

		
		for (int i = 50; i >= 5; i = i - 5) {
			System.out.println(i);
			if (i == 30) {
				break;
			}
		}

		
		// Program 11
		// continue statement with for
		// continue even though the condition is true for "if" statement (* will not print output)  and stop once the condition check is false.
		// When continue statement is executed, it will not print anything below it, it directly goes to the next iteration.

		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue;                            // since we continue at 3, it will not print 3 and output is 1,2,4,5
			}
			System.out.println(i);
		}

		// Program 12
		// continue statement with for


		for (int i = 5; i >= 1; i--) {
			if (i == 2) {
				continue;
			}
			System.out.println(i);
		}
		
		
	}
}
