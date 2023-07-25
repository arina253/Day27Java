package one;

public class Day7 {

	public static void main(String[] args) {
		
		// Switch case without break statement- Give output from where case match.
		
		//Program 1
		
		String city = "Arlington";         //will print everything from where case matches
		switch (city) {
		case "Arlington":
		System.out.println("TX");
		case "Richmond":
		System.out.println("VA");
		case "Pittsburg":
		System.out.println("PA");
		case "Memphis":
		System.out.println("TN");
		default:
			System.out.println("Incorrect city name");
			
		}
		
		
		//Switch case with break statement- Give the correct output only.
		
		//Program 2
		
		String city2 = "Memphis";
		switch (city2) {
		case "Arlington":
		System.out.println("TX");
		break;
		case "Richmond":
			System.out.println("VA");
			break;
		case "Pittsburg":
		System.out.println("PA");
		break;
		case "Memphis":
		System.out.println("TN");
		break;
		default:
			System.out.println("Incorrect city name");
			
		}
			
			//Program 3
			
			String city3 = "Pittsburg";
			switch (city3) {
			case "Arlington":
			case "Denton":
				System.out.println("TX");
				break;
				case "Richmond":
				case "Norfolk":
					System.out.println("VA");
					break;
				case "Pittsburg":
				case "Philadelphia":
				System.out.println("PA");
				break;
				case "Memphis":
				case "Nashville":
				System.out.println("TN");
				break;
				default:
					System.out.println("Incorrect city name");
					
			}
					
					// program 4
					
					String city4 = "Pune" ;
					switch(city4) {
					case "Pune":
					case "Nagpur":
						System.out.println("MH");
						break;
					case "Indore":
					case "Bhopal":
						System.out.println("MP");
						break;
					case "Jaipur":
					case "Udaipur":
						System.out.println("RJ");
						break;
					case "Lucknow":
					case "Agra":
					case "Varanasi":
						System.out.println("UP");
						break;
					default:
						System.out.println("Incorrect city name");
					
					}
					
					
					
			
			
			}
		
		
	
		
		
		}


