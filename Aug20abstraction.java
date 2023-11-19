package two;

public class Aug20abstraction {

	public static void main(String[] args) {
		
		NIB a = new NIB();
		a.loan();
		a.save();
		a.displayCountry();
		
		

	}

}

abstract class WorldBank{
	abstract void loan();
	abstract void save();
}


class NIB extends WorldBank{
	
	@Override
	 public void loan() {
		System.out.println("Loan method from NIBA");
	}

	@Override
	public void save() {
	    System.out.println("Save method from NIBA");
	}
	public void displayCountry() {
		System.out.println("Nepal");}
	}



