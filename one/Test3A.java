package one;

public class Test3A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question No.1-Write a function which accepts two int,add them and return int
		
		//Calling function
		
		int sum = add (2,4);
		System.out.println(sum);
		
		
//Question No.2-Write a class using construction with two properties (fields)and 
		//1 method and create object of same class
		
		Boys Ram = new Boys ("Ram",30);
		Boys Sam = new Boys ("Sam",40);
		
		Ram.play();
		Sam.play();
		
		System.out.println(Ram.name);
		System.out.println(Ram.age);
		System.out.println(Sam.name);
		System.out.println(Sam.age);
		
		
////Question No.3-Write an example for multi level inheritance (a->b-c
		
		FatherB Raju = new FatherB ("Ram","Rai","newroad","Raju");
		Raju.displayGName();
		
		SonB Aryan = new SonB ("Ram","Rai","newroad","Raju","Aryan");
		Aryan.displayGName();
		Aryan.displayFName();
		
		System.out.println(Raju.address);
		System.out.println(Aryan.address);
		
		
		}
	
	//Question No.1-Write a function which accepts two int,add them and return int
	
	
	public static int add (int a, int b) {
		return a+b;
		
	}

}

//Question 2-Write a class using construction with two properties (fields) and 
//1 method and create object of same class

class Boys {
	String name;
	int age;
	
	public Boys(String nm,int ag) {
		this.name = nm;
		this.age = ag;
		}
	
	public void play() {
		System.out.println("Boys like to play");
	}
	
	}


//Question No.3-Write an example for multi level inheritance (a->b-c

class GrandfatherB{
	String firstName;
	String lastName;
	String address;
	
	public GrandfatherB(String fn,String ln,String ad) {
		this.firstName = fn;
		this.lastName = ln;
		this.address = ad;
		}
	
	public void displayGName(){
		System.out.println(this.firstName + this.lastName);
	}
}


class FatherB extends GrandfatherB{
	String fatherfirstName;
	
	public FatherB (String fn,String ln,String ad,String ffn) {
		super (fn,ln,ad);
		this.fatherfirstName = ffn;
	}
	
	public void displayFName() {
		System.out.println(this.fatherfirstName + this.lastName);
	}
}


class SonB extends FatherB{
	String sonfirstName;
	
	public SonB(String fn,String ln,String ad,String ffn,String sfn) {
		super(fn,ln,ad,ffn);
		this.sonfirstName = sfn;
	}
	
	public void displaySName() {
		System.out.println(this.sonfirstName + this.lastName);
	}
}
