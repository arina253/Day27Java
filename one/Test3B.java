package one;

public class Test3B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question No.4-Write an example of method overloading
		
		
		CalculatorB XYZ = new CalculatorB();
		XYZ.Addition (2,4);
		XYZ.Addition (2,4,6);
		XYZ.Addition (2,4,6,8);
		
		
		
		//Question No.5-Question No.4-Write an example of method overriding
		
		AsianBank aaa = new AsianBank ("USA","Texas");
		aaa.deposit();
		aaa.save();
		System.out.println(aaa.branchName);
		System.out.println(aaa.country);

	}

}

////Question No.4-Write an example of method overloading

class CalculatorB{
	
	public static void Addition (int a, int b) {
		System.out.println(a + b);
	}
	
	public static void Addition (int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	public static void Addition (int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}
	
	}


////Question No.5-Question No.4-Write an example of method overriding

class ChaseBank{
	String country;
	
	public ChaseBank(String cn) {
		this.country = cn;
	}
	
	public void deposit() {
		System.out.println("I am a deposit method from Chasebank");
	}
	
	public void save() {
		System.out.println("I am a save method from Chasebank");
	}
}


class AsianBank extends ChaseBank{
	String branchName;
	
	public AsianBank(String cn,String bn) {
	super (cn);
	this.branchName = bn;
	}
	
	public void deposit() {
		System.out.println("I am a deposit method from Asianbank");
	}
	
	public void save() {
		System.out.println("I am a save method from Asianbank");
	
		}
}


