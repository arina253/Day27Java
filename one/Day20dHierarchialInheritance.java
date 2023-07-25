package one;

public class Day20dHierarchialInheritance {

	public static void main(String[] args) {
		
		
		//HIERARCHIAL INHERITANCE-One parent and 2 child-1 son and 1 daughter
		
/*a scenario where multiple classes inherit properties and methods from a single
		base class.*/ 
		
		Daughter esha = new Daughter ("shashi","shrestha","esha");
		
		Son1 shirish = new Son1 ("shashi","shrestha","shirish");
		
		shirish.displayFName();
		shirish.displaySName();
		
		esha.displayFName();
		esha.displayDName();
		System.out.println(esha.lastName);
		esha.displayFName();
			
			
		
}
	}





class Father1{
	String firstName;
	String lastName;
	
	public Father1 (String fn,String ln) {
		this.firstName = fn;
		this.lastName = ln;
		}
	
	public void displayFName() {
		System.out.println(this.firstName + this.lastName);
	}
}




class Son1 extends Father1{
	String sFirstName;
	
	public Son1 (String fn, String ln, String sfn) {
		super (fn,ln);
		this.sFirstName = sfn;
	}
	
	public void displaySName() {
		System.out.println(this.sFirstName);
	}
}




class Daughter extends Father1 {
	String dFirstName;
	
	public Daughter (String fn,String ln, String dfn) {
		super (fn,ln);
		this.dFirstName = dfn;
		}
	
	public void displayDName() {
		System.out.println(this.dFirstName);
	}
}
