package two;

public class InnerClass {

	public static void main(String[] args) {
		Outerclass o = new Outerclass();
		
		Outerclass.Innerclass i = o. new Innerclass();
		
		System.out.println(o.a);
		System.out.println(o.b);
		System.out.println(o.a + o.b);
		
		System.out.println(i.x);
		System.out.println(i.y);
		System.out.println(i.x + i.y);
		
		
		
	}
}

class Outerclass {
	int a = 10;
	int b = 20;
	
	class Innerclass{
		int x = 5;
		int y = 10;
	}
}
