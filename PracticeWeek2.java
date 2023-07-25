package two;

public class PracticeWeek2 {

	public static void main(String[] args) {

		// CONTENT (Day 8 to Day 10)

		// for loop
		// for loop with break statement
		// for loop with continue statement

		// while loop
		// while loop with break statement
		// while loop with continue statement

		// Datatype- Integer,String-properties and method
		// String-charAt();
		// String-length();
		// length-1 is always the last index
		// String-.to UpperCase();
		// String-.toLowerCase();
		// String-in reverse order characterwise
		// String-reverse
		// String-substring();

//////////////////////////////////////////////////////////////////////////////////////////////////////////////	

		
		// Practice Program 1
		// Print 1 to 5

		for (int i = 1; i <= 5; i++) { // 2 // 3 // 4 // 5 //6
			System.out.println(i); // 1 //2 //3 //4 //5

		}
		

		// Practice Program 2
		// Print god 5 times

		for (int i = 1; i <= 5; i++) {
			System.out.println("god");

		}
		

		// Practice Program 3
		// Print 5 to 1

		for (int i = 5; i >= 1; i--) { // 4 //3 //2 //1 //0
			System.out.println(i); // 5 //4 //3 //2 //1
		}

		// Practice Program 4
		// Print multiple of 5

		for (int i = 5; i <= 50; i = i + 5) { // 10 //15 //20 //25 //30 //35 //40 //45 //50
			System.out.println(i); // 5 //10 //15 //20 //25 //30 //35 //40 //45 //50

		}
		

		// Practice Program 5
		// Print multiple of 5 in reverse

		for (int i = 50; i >= 5; i = i - 5) { // 45 //40 //35 //30 //25 //20 //15 //10 //5
			System.out.println(i); // 50 //45 //40 //35 //30 //25 //20 //15 //10 //5

		}
		

		// Practice Program 6
		// Give the condition check for 1 to 10 but print only 1 to 5

		for (int i = 1; i <= 10; i++) { // 2 //3 //4 //5 //6
			if (i == 6) { // 1 //2 //3 //4 //5
				break;
			}
			System.out.println(i);
		}
		

		// Practice Program 7
		// In the reverse table of 50,skip 40 & the numbers beyond 40

		for (int i = 50; i >= 5; i = i - 5) { // 45 //40
			if (i == 40) { // 50 //45
				break;
			}
			System.out.println(i);
		}
		

		// Practice Program 8
		// Skip number 5 in printing 1 to 10

		for (int i = 1; i <= 10; i++) { // 2 //3 //4 //5 //6 //7 //8 //9 //10 //11
			if (i == 5) { // 1 //2 //3 //4 //6 //7 //8 //9 //10
				continue;
			}
			System.out.println(i);

		}
		

		// Practice Program 9
		// In the reverse table of 5,skip 40 and print all other numbers

		for (int i = 50; i >= 5; i = i - 5) { // 45 //40 //35 //30 //25 //20 //15 //10 //5 //0
			if (i == 40) { // 50 //45 //35 //30 //25 //20 //15 //10 //10 //5
				continue;
			}
			System.out.println(i);
		} 
		
		
		//Practice Program 10
		//Print 1 to 10
		
		int t1 = 1;
		while (t1 <= 10) {
			System.out.println(t1);
			t1++;
		}
		
		
		//Practice Program 11
		//Print hello 10 times
		
		int t2 = 1;
		while (t2 <=10) {
			System.out.println("hello");
			t2 = t2 + 1;
		}
		
		
		//Practice Program 12
		//Print reverse table of 10
		
		 int t3 = 100;
		while (t3 >= 10) {
			System.out.println(t3);
			t3 = t3 - 10;
		}
		
		
		//Practice Program 12
		//Print table of 7 and break at 35
		
		int t4 = 7;
		while (t4 <= 70) {
			if (t4 == 35) {
				break;
			}
			System.out.println(t4);                 //7 //14 //21 //28
			t4 = t4 + 7;
		}
		
		
		//Practice Program 13
		//Print table of 7 and break at 35 but print 35 also.
		
		int t4a = 7;
		while (t4a <= 70) {
			System.out.println(t4a);             //7 //14// 21 //28 //35
			if (t4a == 35) {
				break;
			}
			t4a = t4a+7;
		}
		
		
		//Practice Program 14
		//Print 10 to 100 but skip 15 only
		
		int t5 = 10;
		while (t5 <= 100) {
			if (t5 == 15) {
				t5++;
				continue;                     //If it is, the continue statement is executed, which skips the 
				                              //remaining code in the loop body and goes to the next iteration
			}
			System.out.println(t5);             //10 //11 //12 //13// 14// 16// 17
			t5++;
		}
		
		
		//Practice Program 15
		//Print multiple of 10 and skip 30 & 50
		
		int t6 = 10;
		while (t6 <= 100) {
			if (t6 == 30) {
				t6 = t6 + 10;               // take care of this step
				continue;
			}
			if (t6 == 50) {
				t6 = t6 + 10;
				continue;
			}
			System.out.println(t6);           //10 //20 //40 //60 //70 //80 //90 //100
			t6 = t6 +10;
		}
		
		
		//Practice Program 16
		//Print Arina
		
		String name = "Arina";
		System.out.println(name);
		System.out.println("Arina");
		
		
		
		//Practice Program 17
		// Print only i of Arina/ third character of Arina
		
		char thirdc = name.charAt(2);                //A  //r  //i  //n  //a
		System.out.println(name.charAt(2));          //0    1     2    3   4--------index
		System.out.println(thirdc);
		
		
		
		//Program 18
		//Print the length/total character of ARINA
		
		int len = name.length();
		System.out.println(len);
		
		
		//Practice Program 19
		//Print each character of ARINA
		
		for (int i = 0; i < 5; i++) {
			char ec = name.charAt(i);
			System.out.println(ec);
		}
		
		
		//Alternative method
		
		for (int i = 0; i <= name.length()-1; i++) {
			System.out.println(name.charAt(i));
		}
		
		
		//Practice Program 20
		//Print each character of Arina in reverse way
		
		for ( int i = name.length()-1; i >=0; i--) {
			System.out.println(name.charAt(i));
		}
		
		
		//Practice Program 21
		//Print Arina as anirA
		
		String reverse = "";
		for ( int i = name.length()-1; i >= 0; i--){
			reverse = reverse + name.charAt(i);
		}
			System.out.println(reverse);
			
			
			//Alternative method
			
			String reverse1 = "";
			
			for (int i = 0; i <= name.length()-1; i++) {
				reverse1 =  reverse1 + name.charAt(i); 
			}                                                  
				System.out.println(reverse);   //output as anirA  
				
				// Note:
				//Output as step by step as shown below if the closing braces of "for" is outside 
				//the print statement
			                                                   
				//""+A=A  
				//A+r=rA
				//rA+i=irA
                //irA+n=nirA
				
				String rev = "";
				
				for (int i = 0; i <= name.length()-1; i++) {
					rev =  name.charAt(i) + reverse; 
				                                                  
					System.out.println(rev); 
				}
			}
			
		}
		
		
		
		
		
		
		

	


