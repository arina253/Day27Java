package one;

public class Day20bSingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SINGLE INHERITANCE WITH CONSTRUCTOR
		
	// a class inherits properties and behavior from a single parent class. 
		
		
		//Main class to test the inheritance
		
		TeacherS Ari = new TeacherS ("ari","joshi",10,8000);
		System.out.println(Ari.firstName);
		System.out.println(Ari.lastName);
		System.out.println(Ari.age);
		System.out.println(Ari.salary);
		
		Ari.displayName();
		Ari.displaySalary();
		

	}

}

//Superclass

class StudentN{
	String firstName;
	String lastName;
	int age;
	
	public StudentN(String fn,String ln,int ag) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;
	}
	public void displayName(){
		System.out.println(this.firstName + this.lastName);
	}
	
	
}


//Subclass inheriting from StudentN
class TeacherS extends StudentN{
	int salary;
	
	public TeacherS(String fn,String ln,int ag,int sal) {
		super (fn,ln,ag);
		this.salary = sal;
		
	}
	
	public void displaySalary() {
		System.out.println(this.salary);
	}
}






