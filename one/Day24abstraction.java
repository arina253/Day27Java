package one;

public class Day24abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//ABSTRACTION
		
		//We cannot create object of abstract class
		//WorldBank1 a = new WorldBank1();
		
		SBIA Hyderabad = new SBIA();
		
		Hyderabad.loan();
		Hyderabad.save();
		Hyderabad.displayCountry();
		Hyderabad.branchName();
		

	}

}
abstract class WorldBank1{
	
	//abstract method
	
	abstract void loan();
	abstract void save();
	public void displayCountry() {
		System.out.println("I am from India");
	}
}
	
	
	//We cannot create object of abstract class
	
	class SBIA extends WorldBank1{
		
		public void loan() {
			System.out.println("I am loan from SBIA");
		}
		
		public void save() {
			System.out.println("I am save from SBIA");
		}
		
		public void branchName() {
			System.out.println("I am Hyderabad branch");
		}
		
		}
	
	class PNBA extends WorldBank1{
		public void loan() {
			System.out.println("I am loan from PNBA");
		}
		
		public void save() {
			System.out.println("I am save from PNBA");
		}
		
		public void branchName() {
			System.out.println("I am Hyderabad branch-HNB");
		}
		
	}
	
/*******************************************************************************/
	

	 // Use of 'abstract' keyword
	 //Reason of abstraction
	 //1) when we want to have a set of rules
     //2) when we want to hide the implementation method

//Abstract class may have a regular method and abstract method.

//Abstract method doesn't have body/definition.

//Abstract class is inherited-we have to define the body for abstract method in 
//inherited class.

//When the method and implementation is same/common for all child class, we keep 
//those methods in parent class with regular method.



	
	
	
	


