package one;

public class Day17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Program 1
		
		Person Ram = new Person ("Ram","shrestha",40);
		Person []students = {
				new Person ("Ram","shrestha",30),
				new Person ("Sita","sharma",45),
				new Person ("Hari","shakya",36),
				new Person ("Rita", "kc", 20),
				new Person ("Gopi","joshi",45)
		};
		
		//for loop
		
		for (int i = 0; i < students.length; i++) {
			students[i].displayName();
		}
		
		//while loop
		
		int t = 0;
		while (t < students.length) {
			students[t].displayName();
			t++;
			
		}
		
		//for each loop
		
		for (Person student : students) {
			student.displayName();
		}
		
		
		//Program 2
		
		Calculator May = new Calculator();
		May.addition (2,4);
		May.addition (2,4,6);
		May.addition (2,4,6,8);
		
		
		}

}




//Program 1

class Person {
String firstName;
String lastName;
int age;

public Person (String fn, String ln, int ag) {
	this.firstName = fn;
	this.lastName = ln;
	this.age = ag;
}

public void displayName() {
	System.out.println(this.firstName + this.lastName);
}
}

//Program 2

class Calculator{
	
	public void addition (int x, int y) {
		System.out.println(x + y);
		}
	
	public void addition (int x,int y,int z) {
		System.out.println(x + y + z);
	}
	
	public void addition (int x,int y,int z,int a) {
		System.out.println(x + y + z + a);
	}
}





