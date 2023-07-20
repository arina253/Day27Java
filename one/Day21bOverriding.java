package one;

public class Day21bOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//OVERRIDING
		/*Different class,Same method,Same signature/parameter BUT Implementation
		different and Inheritance*/
		
		SBI Hyderabad = new SBI("India", "Hyderabad");
		Hyderabad.save();
		Hyderabad.loan();
		Hyderabad.displayMessage();
		
		PNB Pune = new PNB("India","Pune");
		Pune.displayMessage();
		Pune.save();
		Pune.loan();

	}

}


class WorldBank{
	String country;
	
	//constructor
	public WorldBank (String cn) {
		this.country = cn;
	}
	
	public void save() {
		System.out.println("I am save method from Worldbank");
	}
	
	public void loan() {
		System.out.println("I am loan method from Worldbank");
	}
	
	public void displayMessage() {
		System.out.println("Welcome to Worldbank");
	}
	
}

class PNB extends WorldBank{
	String branchName;
	
	public PNB(String cn,String bn) {
		super(cn);
		this.branchName = bn;
	}
	
	//Overriding the parent methods loan and save
	
	public void save() {
		System.out.println("I am save from PNB ");
	}
	
	public void loan() {
		System.out.println("I am loan method from PNB ");
	}
	
	}

class SBI extends WorldBank{
	String branchName;
	
	public SBI(String cn,String bn) {
		super(cn);
		this.branchName = bn;
		
	}
	
	public void save() {
		System.out.println("I am save method from SBI");
	}
	
	public void loan() {
		System.out.println("I am loan method from SBI");
	}

	
}
