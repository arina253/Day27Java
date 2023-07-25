package one;

public class Day22cprotectedKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PROTECTED KEYWORD FOR INHERITED CLASS

		StudentC c = new StudentC(4567);
		c.displaySSN();

		HumanA a = new HumanA(1234);
		System.out.println(a.SSN);
	}

}

class HumanA {
	protected int SSN;

	public HumanA(int ssn) {
		this.SSN = ssn;
	}

}

class StudentC extends HumanA {
	public StudentC(int ssn) {
		super(ssn);
	}

	public void displaySSN() {
		System.out.println(this.SSN);
	}
}

/***********************************************************************************************/


/*
 * NOTE: 
 * 
 */

/*
 * the super keyword is used to refer to the superclass and invoke its constructor, 
 * the extends keyword establishes an inheritance relationship between classes
 */

/*
 * If the protected keyword is removed from the declaration of the SSN variable
 * in the HumanA class,
 *- the variable will have default access modifier visibility.
 *-the default access modifier allows access to the member within the same package only.
 *- The SSN variable would only be accessible within the HumanA class itself.
 *-the SSN variable would not be directly accessible in the StudentC class
 * (which is a subclass of HumanA)
 *-the SSN variable would not be directly accessible in the Day22cprotected
 *Keyword class (which is in a different package) using the a.SSN syntax.
 *
 *
 *'protected' keyword- allows the variables to be accessed by subclass and other
 *class within the same package 
 */
