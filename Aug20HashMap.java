package two;

import java.util.HashMap;
import java.util.Map;

public class Aug20HashMap {

	public static void main(String[] args) {
		
		
		HashMap <String, Integer>personR = new HashMap<>();
		personR.put("ram", 10);
		personR.put("sam", 20);
		personR.put("mohan",30);
		personR.put("niti",40);
		personR.put("rohan",30);
		
		System.out.println(personR);
		
		//retrieve
		
		System.out.println(personR.get("ram"));
		System.out.println(personR.get("rohan"));
		
		//update
		
		personR.put("ram",100);
		personR.put("sam",200);
		personR.put("mohan",300);
		System.out.println(personR);
		
		//remove
		
		personR.remove("ram");
		System.out.println(personR);
		
		//LOOPING
		
		for (String key : personR.keySet()) {
			//System.out.println(key);
		System.out.println(personR.get(key));
		}
		
		for (int value: personR.values()) {
			System.out.println(value);
			
		}
		System.out.println("*******************");
		
		//via entrySet() and get()
		
		for (Map.Entry<String, Integer>entry : personR.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
		
		

	}

}
