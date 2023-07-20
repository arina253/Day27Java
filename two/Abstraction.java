package two;

public class Abstraction {

	public static void main(String[] args) {
		
		
/*Question: Create an abstract class called "Animal" with two abstract methods: 
//"sound()" and "move()". Derive two classes, "Dog" and "Cat", from the abstract 
//class "Animal". Implement the "sound()" method in both derived classes to print
the sound made by each animal. Implement the "move()" method in each derived
class to print how each animal moves. Finally, create objects of the "Dog" and 
"Cat" classes, and call the "sound()" and "move()" methods for each object.*/

/*Your code should demonstrate abstraction by having the abstract class define
//the common methods, while the derived classes provide their specific implementations.*/

	Dog1 a = new Dog1();
	a.sound();
	a.move();
	
	Cat c = new Cat();
	c.sound();
	c.move();
	
/********************************************************************************/	
		
	
/*Question: Create an abstract class called "Shape" with an abstract method 
called "calculateArea()" and a parameterized constructor that accepts the 
dimensions required for the shape. Derive two classes, "Circle" and "Rectangle",
from the abstract class "Shape". Implement the "calculateArea()" method in both
derived classes to calculate and return the area of each shape. Create objects of
the "Circle" and "Rectangle" classes, passing the required dimensions through 
the constructor. Call the "calculateArea()" method for each object and display 
the calculated areas.*/
	
	
	
	}

}


abstract class Animal1{
	abstract void sound();
	abstract void move();
}
	
	class Dog1 extends Animal1{
		public void sound() {
			System.out.println("Dog bark");
		}
		
		public void move() {
			System.out.println("Dog move faster");
		}
	}
	
	class Cat extends Animal1{
		public void sound() {
			System.out.println("Cat meos");
		}
		
		public void move(){
			System.out.println("Cat move slowly");
		}
	}
	
/********************************************************************************/
	
	/*Question: Create an abstract class called "Shape" with an abstract method 
	called "calculateArea()" and a parameterized constructor that accepts the 
	dimensions required for the shape. Derive two classes, "Circle" and "Rectangle",
	from the abstract class "Shape". Implement the "calculateArea()" method in both
	derived classes to calculate and return the area of each shape. Create objects of
	the "Circle" and "Rectangle" classes, passing the required dimensions through 
	the constructor. Call the "calculateArea()" method for each object and display 
	the calculated areas.*/
	
	