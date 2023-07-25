package one;

public class Day18constructorOverloaded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vehicle1 toyota = new Vehicle1();
		Vehicle1 nissan = new Vehicle1 ("nissan");
		Vehicle1 bmw = new Vehicle1 ("bmw","Q2");
		

	}

}



class Vehicle1 {
	String name;
	String model;
	
	
	//Default constructor is always called;
	//Class can have multiple constructor (constructor overloaded)
	//Constructor do not have return type
	//Constructor name should be similar to class name
	
	public Vehicle1 () {
		System.out.println("Default construction is called");
	}
	
	public Vehicle1 (String nm) {
		this.name = nm;
		System.out.println("The name of vehicle" + this.name);
	}
	
	public Vehicle1 (String nm,String mdl) {
		this.model = mdl;
		System.out.println("The name of vehicle" + this.name + this.model);
	}
}









