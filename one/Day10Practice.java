package one;

public class Day10Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// PRACTICE PROGRAM 1

		// TO PRINT PUNE IN REVERSE ORDER: OUTPUT SHOULD BE ENUP

		String city = "PUNE";
		for (int i = city.length() - 1; i >= 0; i--) {
			System.out.print(city.charAt(i));            //This is the wrong approach to reverse a string.
		}

		// PRACTICE PROGRAM 2

		// TO PRINT PUNE IN REVERSE ORDER CHARACTERWISE :OUTPUT P-----U------N-----E IN DIFFERENT LINE
		
		String city2 = "PUNE";
		for (int i = city2.length() - 1; i >= 0; i--) {
			System.out.println(city2.charAt(i));
		}
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//PROGRAM 1
		//DEFINE A STRING AND PRINT IT BY STRING NAME
		
		String address = "Nepal";
		System.out.println(address);
		System.out.println("Nepal");
		
		
		//PROGRAM 2
		//PRINT THE CHARACTER 'l'              //N  e  p  a  l
		                                      // 0  1  2  3  4---------index starts from 0
		
		System.out.println(address.charAt(4));
		char fourthchar = address.charAt(4);
		System.out.println(fourthchar);
		
		
		//PROGRAM 3
		//PRINT TOTAL NUMBER OF CHARACTER IN STRING"NEPAL"
		
		System.out.println(address.length());
		int total = address.length();
	    System.out.println(total);
	    
	    
	    //PROGRAM 4
	    //PRINT NUMBER OF CHARACTER/LENGTH AND EVERY CHARACTER SEPARATELY
	    
	    System.out.println(address.length());
	    
	    for ( int i=0; i < 5; i++) {
	    	System.out.println(i);
	    	}
	    
	    for ( int i=0; i < 5; i++) {
	    System.out.println(address.charAt(i));
	    }
	    
	    
	    //PROGRAM 5
	    //PRINT EACH CHARACTER OF KATHMANDU SEPARATELY
	    
	    String ADDRESS1 = "KATHMANDU";
	    for ( int i = 0; i <9; i++) {
	    	System.out.println(ADDRESS1.charAt(i));
	    }
		
	    
		//PROGRAM 6 
	    //PRINT EACH CHARACTER OF KATHMANDU IN REVERSE WAY
	    
	    for (int i=ADDRESS1.length()-1; i >= 0; i--){
	    	System.out.println(ADDRESS1.charAt(i));
	    }
	    
	    for (int i = 8;i >= 0; i--) {
	    	System.out.println(ADDRESS1.charAt(i));
	    }
	    
	    
	    //PROGRAM 7
	    //UPPERCASE: CONVERT kathmandu to KATHMANDU
	    
	    String address2 = "kathmandu";
	    System.out.println(address2.toUpperCase());
	    
	    
	    //PROGRAM 8
	    //LOWERCASE: CONVERT KATHMANDU TO kathmandu
	    
	    String address3 = "KATHMANDU";
	    System.out.println(address3.toLowerCase());
	    
	    
	    		}
	    
	    
	    }


