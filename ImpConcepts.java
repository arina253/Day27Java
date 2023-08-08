package two;
import java.util.ArrayList;
import java.util.HashMap;


public class ImpConcepts {

	public static void main(String[] args) {
		
/*********************************************************************************/		


/*Array:The size of the array is determined at the time of creation and cannot be
		changed later.
		
// Declaration and initialization of an array of integers
		
		int[] myArray = new int[5]; // creates an array with 5 elements

		// Assigning values to the array elements
		myArray[0] = 10;
		myArray[1] = 20;
		myArray[2] = 30;
		myArray[3] = 40;
		myArray[4] = 50;

		// Accessing elements of the array
		System.out.println(myArray[2]); // Output: 30
		
		
/******************************************************************************/		
		
/*ArrayList:  is a resizable dynamic array that can grow or shrink as needed. 
		It is a part of the Java Collections Framework 
		It provides additional methods to work with collections.		

// Declaration and initialization of an ArrayList of integers
		
		ArrayList<Integer> myList = new ArrayList<Integer>();

		// Adding elements to the ArrayList
		myList.add(10);
		myList.add(20);
		myList.add(30);
		myList.add(40);
		myList.add(50);

		// Accessing elements of the ArrayList
		System.out.println(myList.get(2)); // Output: 30

		// Iterating through the ArrayList
		for (int i = 0; i < myList.size(); i++) {
		    System.out.println(myList.get(i));
		}
		
		
		
/******************************************************************************/
		
		
		
/*HashMap: a part of the Java Collections Framework that stores key-value pairs.
		It allows retrieval of values based on their keys. 
		It provides fast access to elements using hashing.

		
		
// Declaration and initialization of a HashMap with keys and values of type String
		
		HashMap<String, Integer> myMap = new HashMap<String, Integer>();

		// Adding key-value pairs to the HashMap
		myMap.put("apple", 10);
		myMap.put("banana", 20);
		myMap.put("orange", 30);
		myMap.put("grapes", 40);

		// Accessing values using keys
		int value = myMap.get("banana"); // value = 20
		System.out.println(value);

		// Iterating through the HashMap
		for (String key : myMap.keySet()) {
		    int val = myMap.get(key);
		    System.out.println(key + " -> " + val);
		}

/****************************************************************************/
		
		
/*Map : an interface that represents a collection of key-value pairs, where each
 *      key is unique. 
        It is part of the Java Collections Framework
        Implemented by various classes like HashMap, LinkedHashMap, and TreeMap
        
		
		// Declaring and creating a Map using HashMap
        Map<String, Integer> myMap = new HashMap<>();
        
        // Adding key-value pairs to the Map
        myMap.put("apple", 10);
        myMap.put("banana", 20);
        

        // Accessing values using keys
        int appleValue = myMap.get("apple"); // 10
        int bananaValue = myMap.get("banana"); // 20

/********************************************************************************
 
 In Java, we cannot create an object of an interface directly because an 
 interface is like a blueprint or contract that defines a set of methods that 
 implementing classes must provide. 
 Instead,we can create an object of a class that implements the interface, and 
 then use that object to access the interface's methods.
 This is useful for achieving polymorphism and abstraction in Java.
 
 *******************************************************************************
 
 
 Different ways to loop through a Map using the HashMap implementation.
        Looping through the Map using entrySet
        Looping through the Map using keySet
        Looping through the Map using values
        Looping through the Map using keySet and get method
        Looping through the Map using EntrySet and get method
        
        
********************************************************************************
       
*/


		
		
	}
	

}
