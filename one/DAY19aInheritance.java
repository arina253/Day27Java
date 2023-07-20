package one;

public class DAY19aInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//INHERITANCE WITHOUT CONSTRUCTOR
		
		
		//Program 1-  Creating object for parent class without constructor
		
		
	StudentA ram = new StudentA();
	System.out.println(ram.firstName);
	System.out.println(ram.lastName);
	System.out.println(ram.ssn);
	
	ram.displayName();
	
	
	//Program 2- Creating object for parent class with constructor
	
	
	TeacherA ramb = new TeacherA();
	System.out.println(ramb.salary);
	System.out.println(ramb.firstName);
	System.out.println(ramb.lastName);
	System.out.println(ramb.ssn);
	
	ramb.displayName();
	ramb.displaySalary();
	

	}

}


//Program 1- Creating parent class without constructor



class StudentA{
	String firstName = "ram";
	String lastName = "joshi";
	int ssn = 789;
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
	}



 //Program 2- Creating child class


class TeacherA extends StudentA{
	int salary = 2000;
	
	public void displaySalary() {
		System.out.println(this.salary);
	}
}

