package one;

public class Day22superKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SUPER KEYWORD FOR METHOD AND SUPER KEYWORD FOR FIELD
		
		Dog a = new Dog();
		a.display();                  //I am dog
		a.displayMessage();          //I am dog when super keyword is not used
		a.displayMessage();  //I am animal when super keyword is used.
		a.displayMessage();

	}

}


/*Use of super keyword in java--------calling the parent method & calling the 
                                      parent constructor*/

class Animal{
	
	public void display() {
		System.out.println("I am animal");
	}
}

class Dog extends Animal{
	
	public void display() {
		System.out.println("I am dog");
	}
	
	public void displayMessage() {
		display();
		super.display();
	}
}

