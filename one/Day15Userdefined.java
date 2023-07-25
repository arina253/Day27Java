package one;

public class Day15Userdefined {

	public static void main(String[] args) {
		
		//int
		//boolean
		//String
		//Array
		//char
		
		//User defined datatype-have properties and methods(action)
		
		
		// creating a instance or object--------------create object in the main method
		
		Human arina = new Human();
		System.out.println(arina.age);           //integer not defined, will take 0
		                                       
		System.out.println(arina.name);         //string not defined, will take null
		arina.walk();
		arina.talk();
		
		arina.age = 30; 
		arina.name = "arina joshi";
		System.out.println(arina.age);
		System.out.println(arina.name);
		
		//creating another object
		
		Human ram = new Human();
		System.out.println(ram.age);
		System.out.println(ram.name);
		ram.talk();
		ram.walk();
		
		ram.age = 40;
		ram.name = "ram shrestha";
		System.out.println(ram.age);
		System.out.println(ram.name);
		
		
		
				
		}

}

class Human{
	
	//Properties and methods
	
	int age;
	String name;
	
	//Methods
	
	public void talk() {                              //public void methodName(): This method modifier indicates
		                                            //that the method is accessible from any class, but it is not 
		                                           //static (belongs to individual instances of the class). 
		                                          //It does not return any value.
				                                 //Non-static methods can be invoked on an object of the class,
		                                        // such as objectName.methodName();.
		System.out.println("I am talking");
	}
		
		public void walk() {
			System.out.println("I am walking");
		}
	}
	

