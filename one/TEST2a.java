package one;

public class TEST2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Question 1- Write a function which add two numbers and return a integer (with parameter)
		
		int Add=sum(10, 20);
		System.out.println(Add);
		System.out.println(Add + 10);
		
		
		
		//Question 2-Write a program to reverse the string
		
		String city = "Kathmandu";
				String reverse = "";
				
				for ( int i = city.length()-1; i >= 0; i --) {
					
				reverse =  reverse + city.charAt(i);
				}
				System.out.println(reverse);
				
				
	//Question 3- Write a program to define multidimensional array of integer and loop using for each
				
				int [][]age = {
						{2,3,4},
						{5,6,7},
						{8,9,10}
				};
				
				for (int[]age1:age) {
					for (int age2:age1) {
						System.out.println(age2);
					}
				}
				
				
				//Question 4-Define a string array and loop using while loop
				
				
				String []name = {"Buddha","Sita","Ram","Laxman","Laxmi"};
				
				int j = 0;
				while (j < name.length) {
					System.out.println(name[j]);
					j++;
					
				}
				
				
				//Question 5-Define a class vehicle with two property color and type and one method start()
				//and create object using constructor
				
				
				//Answer in other file named Test2a
				Vehicle toyota = new  Vehicle ("red","camry");
				Vehicle nissan = new   Vehicle ("white","xxx");
				
				System.out.println(toyota.color);
				System.out.println(toyota.type);
				
				System.out.println(nissan.color);
				System.out.println(nissan.type);
				
				
				String start = "Car can start automatically";
				System.out.println(start);
				
	}			
					
//Question 1-Writing a function for the addition of two numbers

public static int sum(int a, int b) {              //Written outside the main method and within the public 
	                                                //class TESTII
	return a+b;
}
}



//Question 5 - Class ---------------------------Written outside the public class TESTII

class Vehicle {               //class names should start with an uppercase letter.
String color;
String type;

public Vehicle (String color,String type) {
	this.color = color;
	this.type = type;
	}

public String start() {
	return "Car can start automatically";
	
}
 }



/*Writing a function for the addition of two numbers is outside the main method and within the public class 
 * TESTII
 * Defining a class vehicle with two property color and type and one method start() is outside the public 
 * class TESTII*/
				
 









