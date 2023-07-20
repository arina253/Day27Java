package one;

public class Day14Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Practice Program 1

		// Multiple of 20

		for (int i = 20; i <= 200; i = i + 20) {
			System.out.println(i);
		}

		// Practice Program 2

		// Multiple of 20 in reverse

		for (int i = 200; i >= 20; i = i - 20) {
			System.out.println(i);
		}

		// Practice Program 3

		// Print "Happy" 20 times

		for (int i = 1; i <= 20; i++) {
			System.out.println("Happy");
		}
		
//*************************************************************************************************************//
		
		//Practice Program-Multidimensional Array
		
		//Using for loop
		
		int [][] age1 = new int [3][5];
		
		int [][] age2 = {
				{5,10,15,20,25},
				{30,35,40,45,50},
				{55,60,65,70,75}
		};
		
		for (int i = 0; i < age2.length; i++) {
	    int[] age = age2[i];
	    for (int i1 = 0; i1 < age.length; i1++) {
	        System.out.println(age[i1]);
	    }
	}
		
		//Using while loop
		
		int r1 = 0;
		while (r1 < age2.length) {
			
			int []age = age2[r1];
			
			int c1 = 0;
			while (c1 < age.length ) {
			System.out.println(age[c1]);
			c1++;
			}
			r1++;
		}
		
		//Using for each loop
		
		for (int[]row : age2) {
				for ( int column:row) {
					System.out.println(column);
	}
	
}
	}
}

