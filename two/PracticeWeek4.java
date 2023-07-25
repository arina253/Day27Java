package one;

public class PracticeWeek4 {

public static void main(String[] args) {
	
		
				
				
				
				
				
/*******************************************************************************************************************************************/
	
			/*
			 * CONTENT (Day 16 to Day 22)
			 * 
			 * User defined datatype: Creating class-method & properties and
			 * creating object  of class
			 * 
			 * User defined datatype with constructor-object created with 'new'keyword
			 * 
			 * Inheritance without constructor-'extends' keyword in child class
			 * 
			 * Inheritance with constructor-'extends' & 'super' keyword in child class
			 * 
			 * Single Inheritance- a class inherits properties and method from a single
			 * parent class.
			 * Eg: Student--------Teacher
			 *  
			 * Multi level Inheritance:a class inherits properties and methods from a
			 * derived class, making it a parent for another class.
			 * Eg: Grandfather--------Father--------Son
			 * 
			 * Hierarchial Inheritance:Multiple classes inherit properties and methods
			 * from a single parent class.
			 * Eg:One parent and two child- one son & one daughter
			 * 
			 * Polymorphism-Overloading & Overriding
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
	          - It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
			 *
			 * 
			 */
			
	/**************************************************************************************************************************************************/
	
			
			//Practice Program 1
			
			Boy Ram = new Boy();
			Ram.talk();
			Ram.walk();
			
			System.out.println(Ram.name);
			System.out.println(Ram.age);
			
			Ram.name = "Ram Shrestha";
			Ram.age = 54;
			
			System.out.println(Ram.name);
			System.out.println(Ram.age);
			
			
			//Practice Program 2
			
			Boy1 Ram1 = new Boy1 ("ram sss",54);
			Boy1 sam1 = new Boy1 ("sam sss",32);
			
			Ram1.talk();
			Ram1.walk();
			
			System.out.println(Ram1.name);
			System.out.println(Ram1.age);
			
			sam1.talk();
			sam1.walk();
			
			
			////Practice Program 3
			
			
			Professor1 Hari = new Professor1();
			
			Hari.displayName();
			Hari.displayAge();
			Hari.displaySalary();
			
			Hari.firstName = "Hari";
			Hari.lastName = "Shrestha";
			Hari.salary = 6000;
			Hari.age = 45;
			
			Hari.displayName();
			Hari.displayAge();
			Hari.displaySalary();
			
			
	
			//Practice Program 4
			
			Professor2 Hari2 = new Professor2 ("Hari","Shrestha",45,7890,9000);
			
			System.out.println(Hari2.firstName);
			System.out.println(Hari2.lastName);
			System.out.println(Hari2.age);
			System.out.println(Hari2.salary);
			System.out.println(Hari2.ssn);
			
			Hari2.displayName();
			Hari2.displaySalary();
			
			
			//Practice Program 5
			
			Mother3 Arina = new Mother3("Sabita","Joshi","Yetkha","Arina");
			
			Son3 Sriman = new Son3("Sabita","Joshi","Yetkha","Arina","Sriman");
			
			Arina.displayGMName();
			Sriman.displayGMName();
			
			System.out.println(Arina.address);
			System.out.println(Sriman.address);
			
			System.out.println(Arina.lastName);
			System.out.println(Sriman.lastName);
			
			Sriman.displayMName();
			
			
			//Practice Program 6
			
			SonA Shirish = new SonA ("shashi","dibya","lazimpat","shirish");
			
			DaughterA esha = new DaughterA("shashi","dibya","lazimpat","esha");
			
			Shirish.displaySName();
			esha.displayDName();
			
			System.out.println(Shirish.fatherName);
			System.out.println(Shirish.motherName);
			System.out.println(esha.fatherName);
			System.out.println(esha.motherName);
			
			
			
			
			}
	}



//Practice Program 1


class Boy{
	String name;
	int age;
	
	public void talk(){
		System.out.println("Boys can fight");
	}
	
	public void walk() {
		System.out.println("Boys can walk");
	}
}


//Practice Program 2


class Boy1{
	String name;
	int age;
	
	public Boy1(String nm, int ag) {
		this.name = nm;
		this.age = ag;
		
	}
	
	public void talk() {
		System.out.println("Ram1 can talk");
	}
	
	public void walk() {
		System.out.println("Ram1 can walk");
	}
}



//Practice Program 3


class Lecturer1{
	String firstName;
	String lastName;
	int age;
	
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
	
	public void displayAge() {
		System.out.println(this.age);
	}
}

class Professor1 extends Lecturer1{
	int salary;
	
	public void displaySalary() {
		System.out.println(this.salary);
	}
	
}

//Practice Program 4


class Lecturer2{
	String firstName;
	String lastName;
	int age;
	int ssn;
	
	public Lecturer2 (String fn, String ln, int ag,int sn) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;
		this.ssn = sn;
		}
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
		
	}


class Professor2 extends Lecturer2{
	int salary;
	
	public Professor2 (String fn, String ln, int ag,int sn,int sal){
		super (fn,ln,ag,sn);
		this.salary = sal;
		
	}
	
	public void displaySalary() {
		System.out.println(this.salary);
	}
	
}


//Practice Program 5


class Grandmother3{
	String firstName;
	String lastName;
	String address;
	
	public Grandmother3 (String fn,String ln,String ad) {
		this.firstName = fn;
		this.lastName = ln;
		this.address = ad;
	}
	
	public void displayGMName(){
		System.out.println(this.firstName + this.lastName);
	}
}


class Mother3  extends Grandmother3{
	String mFirstName;
	
	public Mother3(String fn,String ln,String ad, String mfn) {
		super (fn,ln,ad);
		this.mFirstName = mfn;
	}
	
	public void displayMName() {
		System.out.println(this.mFirstName + this.lastName );
		}
	}
	

class Son3 extends Mother3{
	String sFirstName;
	
	public Son3 (String fn,String ln,String ad,String mfn, String sfn) {
		super(fn,ln,ad,mfn);
		this.sFirstName = sfn;
	}
	
	public void displaySName() {
		System.out.println(this.sFirstName + this.lastName);
	}
	}


//Practice Program 6

class Parent{
	String fatherName;
	String motherName;
	String address;
	
	public Parent (String fn, String mn, String ad) {
		this.fatherName = fn;
		this.motherName = mn;
		this.address = ad;
		}
	
	public void displayPName() {
		System.out.println(this.fatherName + this.motherName);
	}
}


class SonA extends Parent{
	String sonName;
	
 public SonA (String fn, String mn, String ad,String sn) {
	 super (fn,mn,ad);
	 this.sonName = sn;
		
	}
 
 public void displaySName() {
	 System.out.println(this.sonName);
 }
}

class DaughterA extends Parent{
	String daughterName;

	public DaughterA(String fn, String mn, String ad, String dn) {
		super(fn, mn, ad);
		this.daughterName = dn;
	}
	
	public void displayDName(){
		System.out.println(this.daughterName);
	}
	
}

	


	




