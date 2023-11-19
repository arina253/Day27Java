package two;

import java.util.Arrays;
import java.util.List;

public class PracticeX {

	public static void main(String[] args) {
		
		
/*Write a Java program that utilizes the stream method to perform the following tasks on a list of integers:

	Create a list of integers, e.g., [5, 10, 15, 20, 25, 30, 35, 40].
    Use a stream to filter out all even numbers from the list.
	Use another stream to double each remaining number.
	Calculate the sum of all the doubled numbers.*/
		
		List <Integer>numbers = Arrays.asList(5,10,15,20,25,30,35,40);
//		System.out.println(numbers.stream().filter(x ->x%2 !=0).toList());
		System.out.println(numbers.stream().filter(x -> x%2 ==0).toList());
			
		}
		
		

	}


