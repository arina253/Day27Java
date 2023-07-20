package two;

public class PracticeWeek5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Polymorphism-Overloading & Overriding
		 * 
		 * Overloading- Same Class, Same Method, Different Signature/Parameter &
		 * No Inheritance
		 * 
		 * Overriding- Different Class, Same Method but Implementation different,
		 * Same signature/parameter & Inheritance
		 * 
		 * Private field and Private Method- The code is only accessible within the declared class
		 *                                   & cannot access outside the class
		 *  
		 * 'super' keyword-Calling the parent class constructor with the 'value' parameter
		                  -Calling the parent method
		 *  
		 *'protected'keyword-The code is accessible in the same package and subclasses.
		 *
		 *Why And When To Use "Inheritance" and "Polymorphism"?
         - It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.*/

/****************************************************************************************************************************************************/		
		
		//Practice Program 7
		
		
		Calculator1 aaa = new Calculator1();
		
		
		aaa.addition(2,4);
		aaa.addition(2,4,6);
		aaa.addition(2,4,6,8);
		
		
		//Practice Program 8
		
		VehicleC toyota = new VehicleC();
		VehicleC nissan = new VehicleC("nissan");
		VehicleC bmw = new VehicleC("aaa","camry");
		
		
		System.out.println(bmw.name + bmw.model);
		
		
		//Practice Program 9
		
		Clinic ccc = new Clinic ("mediciti", 200,'a',12);
		ccc.displayHospital();
		
		Department xyz = new Department("vayodha",211,'a',345,"surgery");
		xyz.displayHospital();
		
		
	}

}



//Practice Program 7

class Calculator1 {
	
	public void addition(int a, int b) {
		System.out.println(a + b);
		}
	
	public void addition (int a,int b, int c) {
		System.out.println(a + b + c);
		}
	
	public void addition (int a, int b, int c, int d) {
		System.out.println(a + b + c +d);
	}
	}


//Practice Program 8

class VehicleC{
	String name;
	String model;
	
	public VehicleC() {
		System.out.println("Default constructor is always called");
	}
	
	public VehicleC(String nm) {
	this.name = nm;
	System.out.println("The name of vehicle "+this.name);
}
	
	public VehicleC(String nm,String md) {
		this.model = md;
	System.out.println("The name of vehicle "+ this.name + this.model);			
	}
	}


//Practice Program 9

class Hospital{
	String name;
	int ward;
	char code;
	
	public Hospital (String nm,int wd,char cd) {
		this.name = nm;
		this.ward = wd;
		this.code = cd;
		}
	
	public void displayHospital() {
		System.out.println("Name of Hospital: "+ this.name + this.ward + this.code);
	}
}

	
	class Clinic extends Hospital{
		int Bedno;
		
		public Clinic (String nm,int wd,char cd, int bd) {
			super(nm,wd,cd);
			this.Bedno = bd;
		}
		
		//overriding
		
		public void displayHospital() {
			System.out.println("Bed number:"+ this.Bedno);
			super.displayHospital();
		}
	}
		
		
		class Department extends Clinic{
			String deptName;
			
			public Department(String nm,int wd,char cd, int bd, String dn) { 
				super(nm,wd,cd,bd);
				this.deptName = dn;
			}
			
			public void displayHospital() {
				System.out.println("Dept. Name: " +this.deptName);
				super.displayHospital();
		}
	}



