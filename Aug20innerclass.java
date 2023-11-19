package two;

public class Aug20innerclass {

	public static void main(String[] args) {
		Outer o = new Outer();
	Outer.Inner i = o.new Inner();
	System.out.println(o.m);
	System.out.println(o.n);
	System.out.println(o.m + o.n);
	
	System.out.println(i.y);
	System.out.println(i.z);
	System.out.println(i.y + i.z);
	

	}

}

class Outer{
	int m = 10;
	int n = 20;
	
	class Inner{
		int y =20;
		int z = 30;
	}
}
