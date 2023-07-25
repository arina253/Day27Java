package one;

public class Day21aOverloading {
	public static void main(String[] args) {
		
		/*POLYMORHISM-occurs when we have many classes that are related to each other by inheritance.
		    1)OVERLOADING
		    2)OVERWRITING*/
		
		
		//OVERLOADING
		

	additionA(5,10);
	additionA(10,20,5);
	additionA(5,5,10,4);
		
		

	}

 

//OVERLOADING
//Same class,Same methodName but different signature/parameter

//Method 1
public static void additionA(int a, int b) {
	System.out.println(a + b);
	}

//Method 2
public static void additionA(int a,int b,int c) {
	System.out.println(a + b + c);
}

//Method 3
public static void additionA(int a,int b,int c,int d) {
	System.out.println(a + b + c + d);
}

}
