package two;

public class Aug20try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []numbers = {11,22,33,44,55};
		
		
		try {
			System.out.println("Hello");
			System.out.println(numbers[4]);
			System.out.println(5/0);
			System.out.println(numbers[5]);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("Executed after exception handling");
		}

	}

}
