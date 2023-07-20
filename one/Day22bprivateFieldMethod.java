package one;

public class Day22bprivateFieldMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PRIVATE FIELD AND PRIVATE METHOD
		
		
		AnimalB cat = new AnimalB(5);
		//System.out.println(cat.age);   
		//cannot access private variable outside the AnimalB class'
		
		cat.displayAge();
		
	int u =	cat.updateAge(10);
	System.out.println(u);
		
	
	//cat.displayName();
	/*The method displayName() from the type AnimalB is not visible in Day22b
	 *privateFieldMethod since method is private and outside the AnimalB class*/
	
	
	//When private method is changed to public
	cat.displayMessage();     //'I am dog'

	
	}

}





class AnimalB{
	
	private int age;    //age variable is declared as private
	
	public AnimalB(int ag) {
		this.age = ag;
	}
	
	//Method returning int
	
	public int updateAge(int updatedAge) {
		this.age = updatedAge;
		return this.age;
	}
	
	public void displayAge() {
		System.out.println(this.age);
		
	}
	
	//Method returning string
	
private String displayName() {//the displayName() method is declared as private
		return "I am dog";
	}
	
	public void displayMessage() {
		String msg = displayName();
		System.out.println(msg);
	}
}


/*******************************************************************************/

/*
 * The private keyword is an access modifier that restricts the visibility of a
 * member to the class itself. 
 * Members declared as private are not accessible from outside the class, 
 * including other classes in the same package or subclasses.

The private access modifier provides encapsulation and data hiding by 
restricting direct access to class members, ensuring that they can only be
 accessed and manipulated within the class itself.
  
  
  ***Private methods cannot be accessible directly outside the class.
  *We can access the private variable with public method
  */
