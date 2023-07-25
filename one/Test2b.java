package one;

public class Test2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		//Question 5-Define a class vehicle with two property color and type and one method start()
		//and create object using constructor
		
		
		 
		vehicle toyota = new  vehicle ("red","camry");
		vehicle nissan = new   vehicle ("white","xxx");
		
		System.out.println(toyota.color);
		System.out.println(toyota.type);
		
		System.out.println(nissan.color);
		System.out.println(nissan.type);
		
		
		String start = "Car can start automatically";
		System.out.println(start);
		
		
			
		

	}
}





class vehicle{
String color;
String type;

public vehicle (String color,String type) {
	this.color = color;
	this.type = type;
	}

public String start() {
	return "Car can start automatically";
}
}

