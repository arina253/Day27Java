package two;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Program 1
		
		//Creating object without constructor
		
		
		Girl Sita = new Girl();
		System.out.println(Sita.age);
		System.out.println(Sita.fullName);
		
		Sita.age = 30;
		Sita.fullName = "Sita Rao";
		
		System.out.println(Sita.age);
		System.out.println(Sita.fullName);
		
		
		//Program 2
		
		//Creating object with constructor
		
		GirlA Gita = new GirlA("Gita Rai",34);   /*The fullName and age values are set using the constructor parameters.*/ 
		Gita.fullName = "Gita Rai";
		Gita.age();
		Gita.displayName();  /*The displayName() method is called to print the fullName value.*/
		
		
	
		
		GirlA Rita = new GirlA ("Rita Rai",20);
		Rita.displayName();
		Rita.age();
		
		
/* You are designing a class called Book to represent books in a library.
Each Book object should have the following attributes: title, author, and year. 
Write a Java program that includes a Book class with a constructor to initialize these attributes.*/
		

Book4 Math = new Book4 ("Harry Potter","Roosevelt",1990);
Book4 Science = new Book4 ("love","bbb",2341);

Math.title();
Math.author();
Math.year();

Science.title();
Science.author();
Science.year();

		}

}





//Program 1

//Creating class without constructor


class Girl{
	//properties
	//class fields
	
	int age;
	String fullName;
	
	public void displayName() {
		System.out.println(this.fullName);
	}
}


//Program 2

//Creating class with constructor


class GirlA{
	
	String fullName;
	int age;
	
	public GirlA (String fn, int ag) {   /*It has a constructor that accepts parameters for fullName and age and initializes the corresponding class fields.*/
		this.fullName = fn;
		this.age = ag;
	}
	
	public void displayName() {        /*It has a method named displayName() that prints the value of fullName.*/
		System.out.println(this.fullName);
	}
	public void age() {
		System.out.println(this.age);  /*It has a method named age() that prints the value of age.*/
	}
}



class Book4{
	String title;
	String author;
	int year;
	
	public  Book4(String tit,String au,int ye) {//The constructor and method should be defined separately. 
		this.title = tit;
		this.author = au;
		this.year = ye;
		}
		
		public void title() {
			System.out.println(this.title);
			}
		
		public void author() {
			System.out.println(this.author);
		}
		
		public void year() {
			System.out.println(this.year);
		}
		
		
	}
	
	

