package two;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapb {

	public static void main(String[] args) {
		
		HashMap<String,Integer> numbers = new HashMap <>();
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("three",3);
		numbers.put("four",4);
		
		System.out.println(numbers);
		
		//Looping
		
//		for (String key :numbers.keySet()) {
//			System.out.println(key);
//			System.out.println(numbers.get(key));
//		}
//		
//		for (int values: numbers.values()) {
//			System.out.println(values);
//		}
		
		//entrySet()
		
for (Map.Entry<String,Integer>entry : numbers.entrySet()){
//	System.out.println(entry.getKey());
//	System.out.println(entry.getValue());
//	System.out.println(entry.getKey() + " " + entry.getValue());
	System.out.println("*************************************");
	
	//Looping through an iterator
	
	Iterator<Map.Entry<String,Integer>>itr =  numbers.entrySet().iterator();
	while (itr.hasNext()) {
		Map.Entry<String, Integer> entry1 = itr.next();
		System.out.println(entry1.getKey());
		System.out.println(entry1.getValue());
		System.out.println(entry1.getKey() + " " + entry1.getValue());
	}
		
	}
	
}
		
		
		
		
		
		
		
	}


