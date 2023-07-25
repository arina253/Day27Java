package one;

public class RevisionPartI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Program 1

		int a = 5;
		int b = 10;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		// Program 2

		int x = 3;
		int y = 4;

		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

		// Calling the function for Program 3

		Calculator(4, 5);
		Calculator(2, 4);
		Calculator(4, 8);

		// Calling the function for Program 4

		sum();
		sum();
		sum();

		// Calling the function for Program 5

		sumP(2, 4);
		sumP(4, 6);
		sumP(4, 8);

		// Calling the function for Program 6

		int d = divide(50, 5);
		System.out.println(d);
		System.out.println(d / 2);
		System.out.println(d - 5);
		System.out.println(d * 0.10);
		

//***********************************************************************************************************//		

		// COMPARISON OPERATOR

		// < , > , <= , >= , == ,!=

		// Program 7

		System.out.println(6 > 2);
		System.out.println(2 < 6);
		System.out.println(5 >= 4);
		System.out.println(4 <= 6);
		System.out.println(7 == 7);
		System.out.println(7 != 8);
		System.out.println(7 > 9);
		System.out.println(8 <= 2);

		// LOGICAL OPERATOR

		// AND - &&

		// true && true ==============> true
		// true && false =============> false
		// false && true =============> false
		// false && false ============> false

		// Program 8

		System.out.println(2 > 1 && 1 < 2);
		System.out.println(2 > 1 && 5 < 2);
		System.out.println(0 == 1 && 1 < 2);
		System.out.println(2 != 2 && 1 != 1);

		// OR - ||

		// true || true ==============> true
		// true || false =============> true
		// false || true =============> true
		// false || false ============> false

		// Program 9

		System.out.println(5 >= 2 || 2 < 1);
		System.out.println(5 == 5 || 2 != 2);
		System.out.println(5 <= 2 || 0 < 1);
		System.out.println(5 == 2 || 2 == 1);

		// NOT - !

		// true ======> false
		// false =====> true

		// Program 10

		System.out.println(2 != 2);
		System.out.println(!(2 == 2));
		

//**********************************************************************************************************//		

		// CONDITIONAL STATEMENT

		// Program 11

		int numT = 8;
		if (numT > 0 && numT <= 5) {
			System.out.println("10% discount");
		}
		if (numT > 5 && numT <= 10) {
			System.out.println("20% discount");
		}
		if (numT > 10) {
			System.out.println("30% discount");
		}

		// Program 12

		int numTa = -8;
		if (numTa > 0 && numTa <= 5) {
			System.out.println("10% discount");
		} else if (numTa > 5 && numTa <= 10) {
			System.out.println("20% discount");
		} else if (numTa > 10) {
			System.out.println("30% discount");
		} else {
			System.out.println("please have correct input");
		}

		// Program 13

		int marks = 55;

		if (marks > 90) {
			System.out.println("Grade A");
		}
		if (marks > 75) {
			System.out.println("Grade B");
		}
		if (marks > 60) {
			System.out.println("Grade C"); // No output is generated since condition(marks = 55) is not satisfied.
		}

		// Program 14

		int marks1 = 55;

		if (marks1 > 90) {
			System.out.println("Grade A");
		} else if (marks1 > 75) {
			System.out.println("Grade B");
		} else if (marks1 > 60) {
			System.out.println("Grade C");
		} else {
			System.out.println("Fail,please try again");
		}

		// Program 15

		int t = 10;
		int q = 20;

		if (t > q) {
			System.out.println("t is greater");
		} else {
			System.out.println("q is greater");
		}

		// Program 16

		int a1 = 5;
		int a2 = 10;
		int a3 = 15;

		if (a1 > a2 && a1 > a3) {
			System.out.println("a1 is greater");
		} else if (a2 > a1 && a2 > a3) {
			System.out.println("a2 is greater");
		} else {
			System.out.println("a3 is greater");
		}

		// Program 17

		// TERNARY OPERATOR

		int j = 60;
		int k = 300;

		String l = (j > k )? "j is greater" : "k is greater";
		System.out.println(l);
		
		int time = 20;
		String result = (time < 18)? "Good day." : "Good evening.";
		System.out.println(result); 
		

//*********************************************************************************************************//

		

		// switch case without break statement
		
		// Program 18

		String city = "Kathmandu";

		switch (city) {
		case "sanepa":
			System.out.println("Lalitpur");
		case "Lokanthali":
			System.out.println("Bhaktapur");
		case "Kathmandu":
			System.out.println("Kathmandu"); // switch case without break statement will print everything
		case "Nijgadh": // from where case matches
			System.out.println("Bara");
		default:
			System.out.println("Incorrect city");
		}

		// Program 19

		// switch case with break statement;

		String city1 = "Nijgadh";

		switch (city1) {
		case "sanepa":
			System.out.println("Lalitpur");
			break;
		case "Lokanthali":
			System.out.println("Bhaktapur");
			break;
		case "Kathmandu":
			System.out.println("Kathmandu");
			break; // switch case with break statement will match correct output
		case "Nijgadh": // only
			System.out.println("Bara");
			break;
		default:
			System.out.println("Incorrect city");
		}

		System.out.println("***************End*************");

		// Program 20

		String city2 = "Inaruwa";

		switch (city2) {
		case "sanepa":
		case "Gwarko":
			System.out.println("Lalitpur");
			break;
		case "Lokanthali":
		case "Taumadhi":
			System.out.println("Bhaktapur");
			break;
		case "Kathmandu":
		case "Yetkha":
			System.out.println("Kathmandu");
			break;
		case "Nijgadh":
		case "Inaruwa":
			System.out.println("Bara");
			break;
		default:
			System.out.println("Incorrect city");
		}

//**********************************************************************************************************//

		// Loops

		/*
		 * for loop for (initialization; condition check; increment/decrement){
		 * //statement to be executed }
		 */

		// Program 21

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		// Program 22

		for (int i1 = 5; i1 >= 1; i1--) {
			System.out.println(i1);
		}

		// Program 23

		for (int i = 5; i <= 50; i = i + 5) {
			System.out.println(i);
		}

		// Program 24

		for (int i = 50; i >= 5; i = i - 5) {
			System.out.println(i);
		}

		// for with break

		// Program 25

		for (int i = 50; i >= 5; i = i - 5) {
			if (i == 35) {
				break;
			}
			System.out.println(i);
		}

		// Program 26

		for (int i = 50; i >= 5; i = i - 5) {
			System.out.println(i);
			if (i == 35) {
				break;
			}
		}
		System.out.println("*******************end*************************");
			
			//for with continue

			// Program 27
			
			for (int m = 50; m >= 5; m = m-5) {
				if (m == 35) {
					continue;
				}
					System.out.println(m);                                              // Doesn't print 35
				}
			System.out.println("*************************end**************");
			
			
			// Program 27
			
						for (int m = 50; m >= 5; m = m-5) {
							System.out.println(m);                                            //35 is also printed
							if (m == 35) {
								continue;
							}
								
							}
						
						
				//while loop
						
				/*initialization
						while (condition ) {
							
							//statements
							
							//increment/decrement
						}*/
						
						
						//Program 28
						
						int t1 = 5;
						while (t1 >= 1) {
							System.out.println("love");
							t1--;
						}
						
						
						//Program 29
						
						int t2 = 5;
						while (t2 <=10) {
							System.out.println(t2);
							t2 = t2 +2;
						}
						
						
						//while with break
						
						//Program 30
						
						int z = 10;
						while (z <= 100) {
							if (z == 30) {
								break;
							}
							System.out.println(z);
							z = z+10;
						}
						
						//while with continue
						
						//Program 31
						
						int w = 10;
						while (w <= 100) {
							if (w == 30) { 
								w = w+10;             // Increment w before continuing to the next iteration
						        continue;            // Skip the remaining code and go to the next iteration
						    }
							System.out.println(w);   //Increment w after printing
							w = w+10;
								
							}
						
/*Explanation:
In this code, the while loop runs as long as w is less than or equal to 100. 
Inside the loop, it checks if w is equal to 30. 
If it is, the continue statement is executed, which skips the remaining code and goes directly to the next iteration of the loop.
If w is not equal to 30, the code proceeds to the System.out.println(w) statement, which prints the value of w. 
After that, w is incremented by 10 using the w = w + 10 statement, and the loop continues to the next iteration.*/
							
							
							
							
						}
						
						
//***********************************************************************************************************************************************//

	
	
	// Program 3

	// Writing the function

	public static void Calculator(int a, int b) {
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	}

	// Program 4

	// Writing the function without parameter

	public static void sum() {
		System.out.println(5 + 10);
	}

	// Program 5

	// Writing the function with parameter and without return type

	public static void sumP(int a, int b) {
		System.out.println(a * b);
	}

	// Program 6

	// Writing the function with parameter and with return type

	public static int divide(int a, int b) {
		return a / b;
	}

//*********************************************************************************************************//	

}
