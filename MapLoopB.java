package two;
import java.util.HashMap;
import java.util. Map;


public class MapLoopB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> language = new HashMap <>();

		language.put("nepali", "nepal");
		language.put("hindi", "india");
		language.put("japanese", "japan");
		language.put("english", "america");
		language.put("tagalo", "phillipines");
		
		//looping through the map using entryset method
		
		for(Map.Entry<String,String> entry:language.entrySet()){
			System.out.println(entry.getKey()+ entry.getValue());
			
		}
		
		//Looping via the map using keyset and values
		
		for (String key:language.keySet()) {
			System.out.println(key);
		}
		
		for (String values : language.values()) {
			System.out.println(values);
		}
		
		//Looping through the map using keyset and get method
		
		for (String key : language.keySet()) {
			System.out.println(key);
			System.out.println(language.get(key));
		}
		
		for (String values:language.values()) {
			System.out.println(values);
			//System.out.println(language.get(values));
			
		}
		
		
		
		
		
		}

	}


