package two;

public class AbstractionB {

	public static void main(String[] args) {
		
		NIB1 C = new NIB1();
		C.loan();
		C.save();
		C.displayCountry();
		C.branchName();
		
		
		ADB B = new ADB();
		B.loan();
		B.save();
		B.displayCountry();
		B.branchName();
		
		
		
	}

}

abstract class NepalRashtraBank{
	
	abstract void loan();
	abstract void save();
	public void displayCountry() {
		System.out.println("Kathmandu");
		
		}
}

class NIB1 extends NepalRashtraBank{
	
   public void loan() {
	   System.out.println("I am loan method from NIB");
   }
   
   public void save() {
	   System.out.println("I am save method from NIB");
   }
   public void branchName() {
	   System.out.println("Pokhara");
   }
   
   
}

class ADB extends NepalRashtraBank{
	
	public void loan() {
		System.out.println("I am loan method from ADB");
	}
	
	public void save() {
		System.out.println("I am save method from ADB");
	}
	public void branchName() {
		   System.out.println("Chitwan");
}
}
