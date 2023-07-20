package one;

public class PRACTICE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Employee ram = new Employee ("ram","sanepa",54,98765);
		Employee sam = new Employee ("sam","yetkha",43,54321);
		System.out.println(ram.address);
		System.out.println(ram.age);
		System.out.println(ram.phone);
		ram.details();
		sam.details();	
		
		
		
		Employee2 hari = new Employee2 ("hari","newroad",12,23456,8000);
		Employee2 gopal = new Employee2 ("gopal","pulchok",23,23459,9000);
		
		System.out.println(hari.salary);
		System.out.println(hari.age);
		System.out.println(hari.address);
		System.out.println(hari.phone);
		
		gopal.displaySalary();
		hari.displaySalary();
		
		
		
		
		
		
		

	}

}




class Employee{
	String name;
	String address;
	int age;
	int phone;
	
	public Employee (String nm,String ad,int ag,int ph) {
		this.name = nm;
		this.address = ad;
		this.age = ag;
		this.phone = ph;
		
	}
	
	public void details() {
		System.out.println(this.name  + this.address   + this.age   + this.phone);
	}
}




class Employee2 extends Employee{
	int salary;
	
	public Employee2 (String nm,String ad,int ag,int ph,int sal) {
		super (nm,ad,ag,ph); 
	//Call the parent class constructor with the 'value' parameter
		this.salary = sal;
		
	}
	
	public void displaySalary() {
		System.out.println(this.salary);
	}
}

	


	
