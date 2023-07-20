package one;

public class Day27b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car xyz = new Car ("r2", "toyota");
		Car abc = new Car ("t2", "sedane");
		
		Car.Engine  i = xyz.new Engine();
		Car.Engine k = abc.new Engine();
		
		i.engineSize();
		k.engineSize ();
		
		
		
	}

}




class Car{
	
	String carName;
	String carType;
	
	public Car (String name, String type) {
		this.carName= name;
		this.carType = type;
	}
	
	public void Greet () {
		System.out.println("congrats on new car ".concat(this.carName));
	}
	
	
	//inner class
	
	class Engine{
		
		String engineSize;
		
		//Accessing the outer class fields into inner class
		
		public void engineSize() {
			
			if (Car.this.carType.equals ("toyota")) {
				this.engineSize = "bigger";
				System.out.println(this.engineSize);
			}
			
			else if (Car.this.carType.equals("sedane")){
				this.engineSize = "smaller";
				System.out.println(this.engineSize);
		}
	}
	}
}

