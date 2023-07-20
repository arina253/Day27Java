package one;

public class Day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1) Loop:for
		 
		 //for(intialization ; conditionCheck ; increment/decrement) {
		 //statements to be executed
	     //}
 
         //2) Loop:while
         
            //Initialization;
            //while(condition){
		    //statements to be executed;
		    //increment or decrement;
		    //}
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		

		// Program 1
		// Print 1 to 3

	int t1 = 1;
	while (t1 <= 3) {
		System.out.println(t1);
		t1++;
		}
	

		// Program 2
		// Print 1 to 5

		int t2 = 1;
		while (t2 <= 5) {
			System.out.println(t2);
			t2++;
		}
		

		// Program 3
		// Print table for 5

		int t3 = 5;
		while (t3 <= 50) {
			System.out.println(t3);
			t3 = t3 + 5;

		}
		

		// Program 4
		// Print reverse table of 3

		int t4 = 30;
		while (t4 >= 3) {
			System.out.println(t4);
			t4 = t4 - 3;
		}
		

		// Program 5
		// Print hello 3 times

		int t5 = 1;
		while (t5 <= 3) {
			System.out.println("hello");
			t5++;
		}
		

		// Program 6
		// Print table of 7 from reverse and break at 35

		int t6 = 70;
		while (t6 >= 7) {
			System.out.println(t6);
			if (t6 == 35) {
				break;
			}
			t6 = t6 - 7;
		}
		

		// Program 7
		// Print 1 to 10 and skip number 5

		int t7 = 1;
		while (t7 <= 10) {
			if (t7 == 5) {
				t7++;                                    
				continue;
			}
			System.out.println(t7);
			t7++;
		}

//////////////////////////////////////////////////////////////////////////////////////////////////		
		
		//Practice Program 1
		//Compare Program 7 and Practice Program 1
		
		int t8 = 1;
		while (t8 <= 10) {
		if (t8 == 5) {
			t8++;     
				continue;
			}
			System.out.println(t8);             //1,2,3,4,6,7,8,9,10
			t8 = t8+1;
			}
		
		
		// Practice Program 2
		//Print 1 to 100 and skip 95 and 80
		
		 int p2 = 1;
		 while (p2 <= 100) {
			 if (p2 == 90) {
				 p2++;
				 continue;
				  }
			 if (p2 == 80) {
				 p2++;
				 continue;
			 }
			 System.out.println(p2);
			 p2++; 
		 }
		 
	}
}
		 
		
	

