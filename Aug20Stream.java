package two;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Aug20Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String>names = Arrays.asList("ram","","sam","hari","sita","");
		
		System.out.println(names.stream().map(a -> a.toUpperCase()).toList());
		
		System.out.println(names.stream().filter(a ->a.isEmpty()).toList());
		System.out.println(names.stream().filter(a ->a.isEmpty()).count());
		
		
		
		List <Integer>salary = Arrays.asList(100,200,300,400,500);
		System.out.println(salary.stream().map(a ->a +a * 0.1).toList());
	}

}
