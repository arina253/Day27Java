package two;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/*Implement a single inheritance scenario in Java involving a superclass Vehicle and a subclass Car.
 *The Vehicle class should have a protected field speed and a method accelerate() 
 *that increases the speed by a given value. The Car class should inherit from
 *Vehicle and have an additional method start() that prints "Car has started" 
 *to the console. Write the code for both classes.*/
 
		
//Main class to test the inheritance
		
 Car toyota = new Car(45);
 
 System.out.println(toyota.speed);
 toyota.accelerate();
 toyota.start();
 
 

	}

}

//Superclass

class Vehicle5{
	int speed;
	
	public Vehicle5(int sp) {
		this.speed = sp;
	}
	public void  accelerate() {
		System.out.println("The car can accelerate"); 
	}
}
 
//Subclass inheriting from Vehicle5

class Car extends Vehicle5{
	
	public Car (int sp) {
		super (sp);
	}
	
	public void start() {
		System.out.println("Car has started to the console");
	}
	
}
