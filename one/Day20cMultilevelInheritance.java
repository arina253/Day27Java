package one;

public class Day20cMultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MULTILEVEL INHERITANCE- Grandfather--------Father------Son
		
/*a class inherits properties and methods from a derived class, making it a 
		parent for another class.*/
		
		
		//Main class to test the inheritance
		
		Son biraj = new Son ("sher","joshi","bishnu","biraj");
		System.out.println(biraj.firstName);
		System.out.println(biraj.lastName);
		System.out.println(biraj.fFirstName);
		System.out.println(biraj.sFirstName);
		
		biraj.displayGName();
		biraj.displayFName();
		biraj.displaySName();
		
		
		

	}

}

//Superclass	``
class GrandFather{
	String firstName;
	String lastName;
	
	public GrandFather(String fn,String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	
	public void displayGName() {
		System.out.println(this.firstName + this.lastName);
	}
}


//Intermediate subclass inheriting from GrandFather



class Father extends GrandFather{
	String fFirstName;
	
	public Father (String fn,String ln, String ffn) {
		super (fn,ln);
		this.fFirstName = ffn;
		}
	
	public void displayFName(){
		System.out.println(this.fFirstName);
	}
}


//// Subclass inheriting from Father


class Son extends Father {
	String sFirstName;
	
	public Son (String fn,String ln,String ffn,String sfn) {
		super (fn,ln,ffn);
		this.sFirstName = sfn;
		
	}
	
	public void displaySName() {
		System.out.println(this.sFirstName);
	}
}
	


