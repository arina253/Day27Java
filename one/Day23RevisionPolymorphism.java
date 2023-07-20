package one;

public class Day23RevisionPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	VehicleX Honda = new VehicleX("red","r2",6789);
		
		//Accessing properties
		
		System.out.println(Honda.color);
//		System.out.println(Honda.model);
//		//System.out.println(Honda.chaseNo);--------private
//		
//		//Accessing methods
//		
//		Honda.displayColor();
//		Honda.displayChaseNoandModel();
//		//Honda.displayModel();-------------------private
//		
//		//Creating a instance of child class
//		
//		CarX Toyota = new CarX ("red","r2",6789,"toyota");
//		
//		System.out.println(Toyota.color);
//		System.out.println(Toyota.model);
//		//System.out.println(Toyota.chaseNo);--------private
//		
//		Toyota.displayColor();
//		Toyota.displayChaseNoandModel();
//		
//		//Overloading
//		
//		Toyota.launchDate(1770);
//		Toyota.launchDate(1770,"June");
//		Toyota.launchDate(1770,"June",18);
//		
//		
//		
//		
//		//Calling out parent method
//		
//		
//		
//		int wheels = Toyota.displayWheel();
//		System.out.println(wheels);
//		
//		Toyota.greetMsg();
//		
//		
//		
//		
//		}
//
//}
//
//
//
//class VehicleX{
//	String color;
//	String model;
//	 private int chaseNo;
//	
//	public VehicleX(String cl,String md,int cn) {
//		this.color = cl;
//		this.model = md;
//		this.chaseNo = cn;
//	}
//	
//	public void displayColor() {
//		System.out.println(this.color);
//	}
//	
//	private void displayModel() {
//		System.out.println(this.model);
//	}
//	
//	public void displayChaseNoandModel() {
//		System.out.println(this.chaseNo);
//		this.displayModel();
//	}
//	
//	public void greetMsg() {
//		System.out.println("Congratulations on new vehicle Honda");
//	}
//	
//	protected void greetMsg2() {
//		System.out.println("Congratulations on new vehicle Toyota");
//	}
//	
//	
//	
//	
//	
//}
//
//
//class CarX extends VehicleX{
//	String name;
//	private int wheel = 3;
//	
//	public CarX (String cl,String md,int cn, String nm) {
//		super (cl,md,cn);
//		this.name = nm;
//	}
//
//
//
////Overloading- Same class,Same method but different properties
//
//public void launchDate(int year) {
//	System.out.println(year);
//}
//
//public void launchDate(int year,String month) {
//	System.out.println(month);
//	System.out.println(year);
//}
//
//public void launchDate(int year,String month, int date) {
//	System.out.println(date);
//	System.out.println(month);
//	System.out.println(year);
//}
//
//public int displayWheel() {
//	return this.wheel;
//}
//
////Overriding- Same method,Same signature but different class and inheritance
//
//public void greetMsg () {
//	System.out.println("Congratulations on new vehicle from XYZ");
//	super.greetMsg();         //Calling superclass method
//	this.greetMsg2();        // Calling current class method
//}
//	
//}


/********************************************************************************/





    

        VehicleX Honda = new VehicleX("red", "r2", 6789);

        // Accessing properties

        System.out.println(Honda.color);
        System.out.println(Honda.model);
        // System.out.println(Honda.getChaseNo()); // Accessing chaseNo using getter

        // Accessing methods

        Honda.displayColor();
        Honda.displayChaseNoandModel();
        // Honda.displayModel(); // Private method cannot be accessed

        // Creating an instance of the child class

        CarX Toyota = new CarX("red", "r2", 6789, "toyota");

        System.out.println(Toyota.color);
        System.out.println(Toyota.model);
        // System.out.println(Toyota.getChaseNo()); // Accessing chaseNo using getter

        Toyota.displayColor();
        Toyota.displayChaseNoandModel();

        // Overloading

        Toyota.launchDate(1770);
        Toyota.launchDate(1770, "June");
        Toyota.launchDate(1770, "June", 18);

        // Calling parent methods

        Honda.greetMsg();
        Toyota.greetMsg();
        Honda.greetMsg2();
        Toyota.greetMsg2();

        int wheels = Toyota.displayWheel();
        System.out.println(wheels);
    }
}

class VehicleX {
    String color;
    String model;
    private int chaseNo;

    public VehicleX(String cl, String md, int cn) {
        this.color = cl;
        this.model = md;
        this.chaseNo = cn;
    }

    public void displayColor() {
        System.out.println(this.color);
    }

    // Private method cannot be accessed outside the class
    // private void displayModel() {
    //     System.out.println(this.model);
    // }

    public void displayChaseNoandModel() {
        System.out.println(this.chaseNo);
        // displayModel(); // Private method cannot be accessed
    }

    public void greetMsg() {
        System.out.println("Congratulations on the new vehicle Honda");
    }

    protected void greetMsg2() {
        System.out.println("Congratulations on the new vehicle Toyota");
    }

    // Getter method to access the private chaseNo property
    public int getChaseNo() {
        return this.chaseNo;
    }
}

class CarX extends VehicleX {
    String name;
    private int wheel = 3;

    public CarX(String cl, String md, int cn, String nm) {
        super(cl, md, cn);
        this.name = nm;
    }

    public void launchDate(int year) {
        System.out.println(year);
    }

    public void launchDate(int year, String month) {
        System.out.println(month);
        System.out.println(year);
    }

    public void launchDate(int year, String month, int date) {
        System.out.println(date);
        System.out.println(month);
        System.out.println(year);
    }

    public int displayWheel() {
        return this.wheel;
    }

    @Override
    public void greetMsg() {
        System.out.println("Congratulations on the new vehicle from XYZ");
        super.greetMsg(); // Calling superclass method
    }

    // The access modifier of greetMsg2() in the superclass is already protected,
    // so it is not necessary to override it in the subclass
}

/*******************************************************************************/
/*
red
r2
6789
red
r2
6789
red
r2
red
r2
1770
June
1770
18
June
1770
Congratulations on the new vehicle from XYZ
Congratulations on the new vehicle Honda
Congratulations on the new vehicle Toyota
3
*/

	
