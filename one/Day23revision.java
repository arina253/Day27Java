package one;

public class Day23revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VehicleB b = new VehicleB("red", "q3", 345);
		// accessing properties
		System.out.println(b.color);
		System.out.println(b.model);
		// System.out.println(b.chaseNo); private

		// calling out method

		b.displayColor();
		b.displayChaseNoandModel();
		// b.displayModelNo():

		// Creating a instance of childClass

		CarB audi = new CarB("red", "q3", 123, "audi");
		System.out.println(audi.color);
		System.out.println(audi.model);
		System.out.println(audi.name);

		audi.displayChaseNoandModel();
		audi.displayColor();

		// overloading
		
		audi.launchDate(2004);
		audi.launchDate(2004,"Jan");
		audi.launchDate(2004,"Jan",12);
		
		
		// calling out parent method
	
		audi.greetMsg();
		
		int wheels = audi.displayWheel();
		System.out.println(wheels);

	}

}

class VehicleB {
	String color;
	String model;
	private int chaseNo;

	public VehicleB(String cl, String md, int chaseNo) {
		this.color = cl;
		this.model = md;
		this.chaseNo = chaseNo;
	}

	public void displayColor() {
		System.out.println(this.color);
	}

	public void displayChaseNoandModel() {
		System.out.println(this.chaseNo);
		this.displayModelNo();
	}

	private void displayModelNo() {
		System.out.println(this.model);
	}
	
	public void greetMsg() {
		System.out.println("Congrats on new vehicle");
		
	}
	
	protected void greetMsg2() {
		System.out.println("Congrats on new vehicle msg2");
		
	}

}

class CarB extends VehicleB {
	String name;
	private int wheel = 3; 

	public CarB(String cl, String md, int chaseNo, String nm) {
		super(cl, md, chaseNo);
		this.name = nm;
	}

	// same class , same method name , different signature

	public void launchDate(int year) {
		System.out.println(year);
	}

	public void launchDate(int year, String month) {
		System.out.println(year);
		System.out.println(month);
	}
	
	public void launchDate(int year, String month ,int date) {
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
	}
	
	public int displayWheel() {
		return this.wheel;
	}

	// override
	// same method , same signature , different class (inheritance)

	
	public void greetMsg() {
		System.out.println("Congrats on new vehicle from audi class");
		super.greetMsg();
		this.greetMsg2();
	}
		
}