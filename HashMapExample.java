package two;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
    	
   //Use of a HashMap in Java - to store key-value pairs and various 
   //operations performed on it. 
    	
        // Create a HashMap to store String keys and Integer values
    	
        HashMap<String, Integer> person = new HashMap<>();

        // Add key-value pairs to the HashMap
        person.put("ram", 10);
        person.put("sam", 20);
        person.put("tom", 30);
        person.put("joe", 40);
        person.put("tim", 50);

        // Print the entire HashMap
        
        System.out.println(person);

        // Accessing the value associated with the key "tim" using get()
        
        int a = person.get("tim");
        System.out.println(a); // Output: 50
        
      
  // Checking if the key "tom" exists in the HashMap using containsKey()
        boolean b = person.containsKey("tom");
        System.out.println(b); // Output: true
        

        // Total number of key-value pairs in the HashMap using size()
        int c = person.size();
        System.out.println(c); // Output: 5
        

        // Remove the key-value pair with the key "tim" from the HashMap using remove()
        person.remove("tim");
        System.out.println(person);
        

        // Update the value associated with the key "tom" to 70 using put()
        person.put("tom", 70);
        System.out.println(person);
        

        // Looping through the values in the HashMap using for-each loop
        for (int value : person.values()) {
            System.out.println(value);
        }
        
        

        // Looping through the keys in the HashMap using for-each loop
        for (String key : person.keySet()) {
            System.out.println(key);
        }
    }
}
