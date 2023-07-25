package two;

public class PracticeWeek1 {

	public static void main(String[] args) {
		System.out.println("namaskar");
		System.out.println("Good morning");

		int x = 5;
		int y = 8;

		System.out.println(x);
		System.out.println(y);
		System.out.println("x");
		System.out.println("y");

		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

		int a = 10;
		int b = 20;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		Calculator(5, 10);

		a();

		sum(5, 10);
		sum(3, 6);
		sum(8, 9);

		a(20, 30);
		a(9, 8);
		a(4, 8);

		int cal = multiply(4, 8);
		System.out.println(cal);
		System.out.println(cal + 10);
		System.out.println(cal * 10);

		System.out.println(4 > 2);
		System.out.println(8 < 7);
		System.out.println(5>=2);
		System.out.println(5<=2);
		System.out.println(4==4);
		System.out.println(2!=2);
		
		
		
		System.out.println(3>2 && 7>6 );
		System.out.println(5>6 && 8>6);
		System.out.println(5<=2 && 8>=6);
		System.out.println(3>4 && 8>9);
		
		System.out.println(8>5 ||4<5 );
		System.out.println(7>=6 || 4<3);
		System.out.println(7<6 || 9>8);
		System.out.println(8<=7 || 8>9);
		System.out.println(9<8 || 6<4);

		
		System.out.println(4!=5);
		System.out.println(6!=6);
		
		int marks = 95;
		if ( marks > 80 ){
		System.out.println("Distinction");
		}
	    else if ( marks > 60) {
	    System.out.println("First division");
	    }
	    else if (marks>50 && marks<60 ){
	    	System.out.println("Second division");
	   }
	    else {
	    	System.out.println(" Third division");
	    }
	    
		
		int MARK = 95;
		if (MARK >90) {
			System.out.println(" distinction");
			}
		if (MARK>60) {
		System.out.println("first division");
		}
		if (MARK > 50 && MARK <60) {
			System.out.println("second division");
		}
		if (MARK <50) {
			System.out.println(" third division");
		}
		
		a=10;
		b=40;
		if (a>b) {
			System.out.println("a is greater");
		}
			else 
				System.out.println("b is greater");
		
		int m = 10;
		int n = 20;
		int o = 30;
		if (m>n && m>0) {
			System.out.println("m is greater");
		}
			else if ( n>m && n>o) {
				System.out.println(" n is greater");
			}
				else {
					System.out.println("o is greater");
				}
		
		
		String city = "Taumadhi";
				switch (city) {
					case "newroad":
							System.out.println("Kathmandu");
					case "sanepa":
						System.out.println("Lalitpur");
					case "Taumadhi":
						System.out.println("Bhaktapur");
						default:
						System.out.println("Not Listed");
					}
				
					
				String city1 = "Taumadhi";
				switch (city1) {
				case "newroad":
					System.out.println("Kathmandu");
					break;
				case "sanepa":
				System.out.println("Lalitpur");
				break;
				case "Taumadhi":
				System.out.println("Bhaktapur");
				break;
				default:
					System.out.println("Not listed");
				}
					
					String city2 = " sanepa";
					switch (city2) {
					case "yetkha":
					case "naradevi":
					case "lagan":
						System.out.println("Kathmandu");
						break;
					case "  sanepa":                                       //note: count space also as character.
					case "pulchok":
					case "kumaripati":
						System.out.println("Lalitpur");
					break;
					case "jadibuti":   
					case "taumadhi":
					case "kakan":
						System.out.println("Bhaktapur");
						break;
						default:
						System.out.println("Not listed");
					
						
					}
					
				
		
					}
		
		
		
		
	public static void Calculator(int a, int b) {
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		
		
	}

	public static void a() {
		System.out.println();
	}

	public static void sum(int x, int y) {
		System.out.println(x + y);
	}

	public static void a(int a, int b) {
		System.out.println(a - b);
	}

	public static int multiply(int x, int y) {
		System.out.println(x * y);
		return x * y;

	}
}
