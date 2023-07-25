package one;

public class Day22dprotected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Professor Amar = new Professor ("Maths");
		Amar.displaySubject();
		
         Amar.teach();
         Amar.teach();
	}

}
class Teacher1{
	 protected String subject;
	
	public Teacher1(String sub) {
		this.subject = sub;
	}
	
	public void teach() {
	System.out.println("teacher teach");
	}
	
}


class Professor extends Teacher1{
	String subject = "science";
	
	public Professor (String sub) {
		super (sub);
		}
	
	
	public void displaySubject() {
		System.out.println(this.subject);
		System.out.println(super.subject);
	}
	
	public void teach() {
		System.out.println("Professor teach");
		
/*The teach() method in the Professor class overrides the teach() method in the 
Teacher1 class and prints "Professor teach" when called.*/		
	}
	
}


/*******************************************************************************/


/*changing the access modifier of the subject variable in the Teacher1 class to
protected allows subclasses (such as Professor) and other classes within the 
same package to access the variable directly. */

