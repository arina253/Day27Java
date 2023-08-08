package two;

import java.util.HashMap;
import java.util.Map;

public class MapLoop {

	public static void main(String[] args) {
		
		
/*Different ways to loop through a Map using the HashMap implementation.
        Looping through the Map using EntrySet
        Looping through the Map using keySet
        Looping through the Map using values
        Looping through the Map using keySet and get method
        Looping through the Map using EntrySet and get method
       
 */
		
/***********************************************************************/
		
		 
		//Program 1
		
		Map<String, String> course = new HashMap<String, String>();
		course.put("course", "javascript");
		course.put("coursetwo", "python");
		course.put("coursethree", "SQL");
		course.put("coursefour", "python");
		course.put("coursefive", "selenium");

		// Looping through the Map using EntrySet
		for (Map.Entry<String, String> entry : course.entrySet()) {
		    System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
 /*OUTPUT:course -> javascript
		coursetwo -> python
		coursethree -> SQL
		coursefour -> python
		coursefive -> selenium*/
		
/***********************************************************************/		
	    
		
		//Program2

		
		Map<String, String> students = new HashMap<String, String>();
		students.put("firstName", "arina");
		students.put("lastName", "joshi");
		students.put("rollNo", "24");
		students.put("interest", "game");
		students.put("age", "35");

		// Looping through the Map using keySet
		for (String key : students.keySet()) {
		    System.out.println(key);
		}

		// Looping through the Map using values
		for (String value : students.values()) {
		    System.out.println(value);
		}

/*OUTPUT: firstName
		lastName
		rollNo
		interest
		age
		arina
		joshi
		24
		game
		35*/
		
		
/***********************************************************************/
		
		
		//Program3

		
		Map<String, String> vehicle = new HashMap<String, String>();
		vehicle.put("name", "toyota");
		vehicle.put("model", "camry");
		vehicle.put("color", "silver");

		// Printing the entire map
		System.out.println(vehicle);

		// Accessing specific values using keys
		System.out.println(vehicle.get("color")); // Output: silver
		System.out.println(vehicle.get("model")); // Output: camry
		System.out.println(vehicle.get("name"));  // Output: toyota

		// Looping through the Map using keySet and get method
		for (String key : vehicle.keySet()) {
		    System.out.println(key);
		    System.out.println(vehicle.get(key));
		}

		// Looping through the Map using EntrySet and get method
		for (Map.Entry<String, String> entry : vehicle.entrySet()) {
		    System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

	
/*OUTPUT	{name=toyota, model=camry, color=silver}
		silver
		camry
		toyota
		name
		toyota
		model
		camry
		color
		silver*/

/***********************************************************************/

	}

}
