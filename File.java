package two;

import java.io.FileWriter;
import java.io.IOException;

public class File {

	public static void main(String[] args) {

    try {
    	
    FileWriter writer = new FileWriter("My file1.txt",true);
    writer.write("Hello all");
    System.out.println("\n");
    writer.write("Take care");
    System.out.println("\n");
    System.out.println("Successfully written");
    writer.close();
    }
    
    catch(IOException e) {
    	System.out.println(e.getMessage());
    	e.printStackTrace();
    	}
		
		
	}

}

/* FileWriter
 * write()
 * "\n"
 * IOException e
 * e.getMessage()
 * e.printStackTrace()*/
