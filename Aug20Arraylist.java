package two; 

import java.util.ArrayList;


public class Aug20Arraylist {

	public static void main(String[] args) {
		
		ArrayList <String> names = new ArrayList<String>();
		
		System.out.println(names);
		
		//add()
		
		names.add("ram");
		names.add("sam");
		names.add("hari");
		names.add("mohan");
		names.add("gopal");
		System.out.println(names);
		
		//retrieve----get()
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println(names.get(3));
		System.out.println(names.get(4));
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		//update----set()
		
		names.set(0, "ganesh");
		names.set(1,"laxmi");
		System.out.println(names);
		
		//delete
		names.remove(0);
		names.remove(1);
		System.out.println(names);
		
		//size()
		
		System.out.println(names.size());
		
		//indexOf()
		System.out.println(names.indexOf("hari"));
		
		//lastIndexOf()
		
		int a = names.lastIndexOf("gopal");
		System.out.println(a);
		
		
		//clear()
	  names.clear();
	  System.out.println(names);
	  
	  //add()
	  
	  names.add("ram");
		names.add("sam");
		names.add("hari");
		names.add("mohan");
		names.add("gopal");
		System.out.println(names);
		
		
		//contains()
		boolean c = names.contains("gopal");
		System.out.println(c);
		
		//equals()
		
		System.out.println(names.equals("Gopal"));
		
	  
	  
		
		
		
		
		
		
		
		
		
		

	}

}
