package two;


		interface first{
			public void firstMethod();
		}

		interface second{
			public void secondMethod();
		}

		interface third{
			 public void thirdMethod();
		}

		public class InterfaceC {

			public static void main(String[] args) {
				
				five f = new five ();
				f.firstMethod();
				f.secondMethod();
				f.thirdMethod();
				f.fourA();
				f.fourB();
				
				
				
				
			}

		} 

		class four {
			public void fourA() {
				System.out.println("This is the first method of class four");
			}
			
			public void fourB() {
				System.out.println("This is the second method of class four");
			}
		}

		
		class five extends four implements first,second,third{

			public void thirdMethod() {
				System.out.println("Third Method");
				
			}

			
			public void secondMethod() {
				System.out.println("Second Method");
				
			}

			
			public void firstMethod() {
				System.out.println("First Method");
				
			}
			
		}

		
		
		
		
		
		
	


