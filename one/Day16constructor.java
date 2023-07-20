package one;

import one.PRACTICE.Book;

public class Day16constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//USER DEFINED DATATYPE
		
		//Creating a object arina
		
		//CONSTRUCTOR:Setting the class properties at the time of creating a object.
		//Constructors are used to create and initialize objects of a class. 
		//They are called automatically when an object is created using the new keyword. 
		//Constructors are special methods that create and set up objects of a class in a single line of code."
		
		Human2 arina = new Human2 ("arina joshi",30);
		Human2 ram = new Human2 ("ram shrestha",40);
		
		System.out.println(arina.age);
		System.out.println(arina.name);
		
		System.out.println(ram.name);
		System.out.println(ram.age);
		
		String a = arina.talk();
		System.out.println(a);
		
		String b = ram.talk();           //Calling the method and storing since it has a return type of string
		System.out.println(b);
		
		 
		ram.walk();                     //  Calling the void method:
		                               //public void methodName()-
		                              //Non-static methods can be invoked on an object of the class,
                                     // such as objectName.methodName();.
		
		//NOTE:
		//In Java, the void keyword is used as the return type of a method to indicate that the method does
		//not return any value.
		//When a method has a return type of void, it signifies that the method performs a task or operation
		//without producing a result that can be assigned to a variable or used in further computations.
		
		
		Book Story = new Book ("Harry Potter","JK Rowling",1980);
		
		
		System.out.println(Story.title); 
		System.out.println(Story.author);
		System.out.println(Story.year);
		
		
		
		}

}


class Human2{
	
	int age;
	String name;
	
	//Constructor
	
	public Human2 (String nm,int ag){            //constructor of a class called Human2 takes two parameters:
		                                         //a String named nm for the name of the human and an int 
		                                         //named ag for the age.

                                                //Inside the constructor, this.name = nm; and this.age = ag;
		                                        //are used to assign the values of the parameters to the 
		                                        //instance variables name and age of the Human2 class,
		                                        //respectively.
		this.name = nm;
		this. age = ag;
		
		}
	
	public String talk() {                    //has a return type of String. 
		                                     //It means that when this method is called, it is expected to 
		                                    //return a value of type String.
		return "Hello";
	}
	
	public void walk() {                            //When calling a void method, we do not assign its result to
		                                           //a variable since there is no result to assign.
		System.out.println("I am walking");        
	}
	
	
	
	
	public class Book{
		String title;
		String author;
		int year;
		
		public Book ( String title, String author, int year) {
			this.title = title;
			this.author = author;
			this.year = year;
	
}
	}
}

