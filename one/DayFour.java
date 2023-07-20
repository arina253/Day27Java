package one;

public class DayFour {

	public static void main(String[] args) {
		
		//CALLING THE FUNCTION WITHOUT PARAMETER
		
        Add();
        Add();
        Add();
        Add();
        Add();
        
        //CALLING THE ADDB() FUNCTION 
        ADDB(12,6);
        ADDB(10,5);
        ADDB(10,10);
        
        //CALLING THE ADDC()FUNCTION
        
        int sum=AddC(12,5);
        System.out.println(sum); 
        System.out.println(sum+sum); 
        System.out.println(sum-7); 
        System.out.println(sum*0.10); 
        
         
        

	}
	
	//WRITING A FUNCTION WITHOUT PARAMETER AND WITHOUT RETURN TYPE
	
	public static void Add() {
		System.out.println(9+9);         //we will get the same result again and again
	}
	
	//WRITING A FUNCTION WITH PARAMETER AND WITHOUT RETURN TYPE
	
	public static void ADDB(int x,int y) {       //we can pass multiple values to parameters
		System.out.println();
	}
	
	//WRITING A FUNCTION WITH PARAMETER AND WITH RETURN TYPE
	
	// $100 dollar----- given------store------reuse
	//$100 dollar shown
	
	
	public static int AddC(int x,int y) {  //to return integer value
		System.out.println(x+y);
		return x+y;
		
	

}
	
}
