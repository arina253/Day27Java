package two;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PROGRAM 1-ARRAY OF INTEGERS
		
		int []numbers = new int [3];
		numbers[0] = 11;
		numbers [1] = 12;
		numbers [2] = 13;
		
		int []numbers1 = {11,12,13};
		
		//for loop
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		//while loop
		
		int j = 0;
		while (j < numbers.length) {
			System.out.println(numbers[j]);
			j++;
		}
		
		//for each
		
		for ( int num : numbers) {
			System.out.println(num);
		}
		
		//PROGRAM 2- Array of string
		
		String[]names = new String[3];           //**The "names" array is correctly defined with a length of 3, 
		names[0] = "Ram";                        // and three elements are assigned to it
		names[1] = "Sam";
		names[2] = "Hari";
		
		String [] names1 = {"Ram","Sam","Hari"};
		
		//for loop
		
		for (int i = 0; i < names1.length; i++) {
			System.out.println(names1[i]);
		}
		
		//while loop
		
		int i = 0;
		while (i < names.length) {
			System.out.println(names[i]);
			i++;
		}
		
		//for each
		
		for (String NAME:names) {
			System.out.println(NAME);
			}
		
//*************************************************************************//
		
		
		//MULTIDIMENSIONAL ARRAY
		
		//PROGRAM 1
		
		String country [][] = {
				
				{"Nepal","India"},           //first array
				{"Japan","America"},        //second array
				{"France","Norway"}        //third array
				
				};
		
		
//System.out.println(country[0];---------country of 0=first array
	//system.out.println(country[1]----------country of 1= second array
	//ystem.out.println(country[2];----------country of 2= third array
		
		
		//for loop
		
		for ( int m = 0; m < country.length; m++) {
		String nation[]	=country[m];
		for (int n = 0; n < nation.length; n++) {
			System.out.println(nation[n]);
			}
		}
		
		
		//Program 2
		
		//while loop
		

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
		
		
		//Program 3
		
		//for each loop
		
		for (String[]aaa : country) {
			for (String bbb : aaa) {
				System.out.println(bbb);
			}
			
		}
			
			
		}
				

	}


