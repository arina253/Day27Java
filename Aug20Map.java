package two;
import java.util.HashMap;
import java.util.Map;


public class Aug20Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String>info = new HashMap <String,String>();
		info.put("name", "arina");
		info.put("age", "36");
		info.put("skills", "listening");
		
		System.out.println(info);
		
		System.out.println(info.get("name"));
		
		info.put("age", "40");
		System.out.println(info);
		
		info.remove("skills");
		System.out.println(info);
		
		
		//looping via entrySet()
		
		for(Map.Entry<String,String>entry: info.entrySet() ) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
