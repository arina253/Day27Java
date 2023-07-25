package one;

public class Day25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NIB A = new NIB ("Nepal",6789,"kathmandu");
		A.deposit();
		A.save();
		System.out.println(A.country);
		System.out.println(A.regno);
		
		

	}

}

class RashtraBank{
	String country;
	int regno;
	
	public RashtraBank (String cn, int regno) {
		this.country = cn;
	}
	
	public void deposit() {
		System.out.println("I am deposit method from Rashtra Bank");
	}
	
	public void save() {
		System.out.println("I am save method from Rashtra Bank");
	}
	
}

class NIB extends RashtraBank{
	String branchLocation;
	
	public NIB(String cn, int regno, String bn) {
		super (cn,regno);
		this.branchLocation = bn;
	}
	
	public void deposit() {
		System.out.println("I am deposit method from NIB Bank");
		super.deposit();
	}
	
	public void save() {
		System.out.println("I am save method from NIB Bank");
		super.save();
	}
		
	}



