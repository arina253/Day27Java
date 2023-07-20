package one;

public class Day21c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//OVERLOADING
		
		Multiplication A = new Multiplication();
		A.multiply(12,12);
		A.multiply(4,5,6);
		A.multiply(2,4,6,8);

	}

}



class Multiplication{
	
	public void multiply(int q, int r) {
		System.out.println(q * r);
	}
	
	public void multiply (int q, int r, int s) {
       System.out.println(q * r * s);
}
	public void multiply (int q,int r, int s, int y) {
		System.out.println(q * r * s * y); 
	}
	
}