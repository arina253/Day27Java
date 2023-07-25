package one;

public class Day20aInheritWithoutConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student madan = new Student();
		System.out.println(madan.firstName);
		System.out.println(madan.lastName);
		System.out.println(madan.age);
		
		madan.firstName = "madan";
		madan.lastName = "joshi";
		madan.age = 60;
		
		System.out.println(madan.firstName);
		System.out.println(madan.lastName);
		System.out.println(madan.age);
		madan.displayName();
		
		
		//Creating object of TeacherA
		
		TeacherN a = new TeacherN();
		System.out.println(a.salary);
		
		a.firstName = "madan a";
		a.lastName = "joshi j";
		a.age = 80;
		a.salary = 9000;
		
		System.out.println(a.firstName);
		System.out.println(a.lastName);
		System.out.println(a.age);
		System.out.println(a.salary);
		
		a.displaySalary();
		

	}

}


class Student{
	String firstName;
	String lastName;
	int age;
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

//Creating child  class

class TeacherN extends Student{
	int salary;
	
	public void displaySalary() {
		System.out.println(this.salary);
	}
}

