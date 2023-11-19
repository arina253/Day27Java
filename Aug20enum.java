package two;

enum Sizeee
{SMALL,MEDIUM,LARGE,EXTRALARGE};


class TestSize{
	Sizeee tshirt;
	
	public TestSize(Sizeee Tshirt) {
		this.tshirt = Tshirt;
	}
	
	public void buyTshirt() {
		switch (tshirt) {
		case SMALL:
			System.out.println("Buy small size");
			break;
		case MEDIUM:
			System.out.println("Buy medium size");
			break;
		case LARGE:
			System.out.println("Buy large size");
			break;
		case EXTRALARGE:
			System.out.println("Buy extralarge size");
			break;
		}
		
	}
}



public class Aug20enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestSize a = new TestSize (Sizeee.SMALL);
		a.buyTshirt();
		

	}

}
