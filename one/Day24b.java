package one;

public class Day24b {

W	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kiwi b = new Kiwi();
		b.makeSound();
		b.fly();

	}

}


abstract class Birds{
	abstract void makeSound();
	public void fly() {
		System.out.println("I can fly");
	}
}

class Kiwi extends Birds{
	public void makeSound() {
		System.out.println("chirp chirp");
	}
}
