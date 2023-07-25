package one;

public class Day24c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Abstraction with constructor 
		
		
		CarY Toyota = new CarY(2);
		System.out.println(Toyota.wheel);
		Toyota.brake();

	}

}


abstract class VehicleY{
	
	int wheel;
	
	public VehicleY(int w) {
		this.wheel = w;
	}
	
	abstract public void brake();
	
}

class CarY extends VehicleY{
	
	public CarY (int w ) {
		super (w);
	}
	
	public void brake() {
		System.out.println("I am brake from CarX");
	}
}