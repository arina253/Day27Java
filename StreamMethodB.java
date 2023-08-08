package two;

import java.util.Arrays;
import java.util.List;

public class StreamMethodB {

	public static void main(String[] args) {
		
		//Creating an array
		
		Teacher []association = {
				new Teacher ("hira shakya","geography",1000),
				new Teacher ("amala shrestha","science",5000),
				new Teacher ("basudev koirala", "nepali",6000),
				
				};
		
		//Converting the arrays into list using Arrays.as list()method
		
		List <Teacher>emplist = Arrays.asList(association);
		
		//Using the forEach method on the emplist
		
	emplist.stream().forEach(emp -> emp.incrementSalary(1000));
	
	//Displaying the updated salaries using for loop
	
	for (int i = 0; i < association.length; i++) {
        System.out.println(association[i].salary);
        association[i].displayFullname();
		
		}
	
	
}
}

class Teacher{
	String fullName;
	String major;
	int salary;
	
	
	
	public Teacher(String fn,String mj,int sa) {
		this.fullName = fn;
		this.major = mj;
		this.salary = sa;
		
		}
	
	public void displayFullname() {
		System.out.println(this.fullName);
	}
	
	public void incrementSalary(int x) {
		this.salary = this.salary + x;
	}
	
	
} 

