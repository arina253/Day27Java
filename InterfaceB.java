package two;

interface RashtriyaBank{
	public void loan();
	public void save();
	
	}

interface AsianBank{
	public void displayLocation();
	public void deposit();
}

public class InterfaceB {

	public static void main(String[] args) {
		
		NIC a = new NIC();
		a.loan();
		a.save();
		a.displayLocation();
		a.deposit();
		
		
	

	}
}

class NIC implements RashtriyaBank, AsianBank{

	
	public void loan() {
		System.out.println("I am loan method from NIC");
	}

	
	public void save() {
		System.out.println("I am save method from NIC");
	}
	
	public void displayLocation() {
		System.out.println("Kathmandu");
	}
	
	public void deposit() {
		System.out.println("I am deposit method from NIC");
	}
	
	
}


		
		
		
		


