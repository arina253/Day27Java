package one;

public class Day19bInheritance {

	public static void main(String[] args) {
		
		
		//PROGRAM INHERITANCE WITH CONSTRUCTOR
		
		//Program 1-creating object for parent class variable "StudentB"
		
		
		StudentB Hari = new StudentB ("Hari","rai",567);
		System.out.println(Hari.firstName);
		System.out.println(Hari.lastName);
		System.out.println(Hari.ssn);
		
		Hari.displayName();
		
		
		//Program 2- creating object for child class variable "TeacherB"
		
		TeacherB Harit = new TeacherB ("Harit","rai",789,9876);
		System.out.println(Harit.firstName);
		System.out.println(Harit.lastName);
		System.out.println(Harit.ssn);
		System.out.println(Harit.salary);
		
		Harit.displayName();
		Harit.displaySalary();
		
		
		}

}


//Program 1- Creating  parent class "StudentB" with constructor


class StudentB {
	
	String firstName;
	String lastName;
	int ssn;
	
	public StudentB (String fn,String ln,int sn) {
		this.firstName = fn;
		this.lastName = ln;
		this.ssn = sn;
	}
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}



//Program 2- Creating child class "TeacherB" with 'extends' and 'super' keyword



class TeacherB extends StudentB{     
//The 'extends' keyword in Java is used to establish inheritance between classes. 
// It allows a  child class to inherit the properties and methods of a parent class
	
	int salary;                                 
	
	
	//It is mandatory to have child constructor as parent is having constructor.
	//First line of child constructor should be called to parent...constructor.
	
	
	public TeacherB (String fn, String ln, int sn, int sal) {
		super (fn,ln,sn);
		
// 'super'keyword - Call the parent class constructor with the 'value' parameter
		
		this.salary = sal;
		}
	
	public void displaySalary() {
		System.out.println(this.salary);
}
	
	
}






