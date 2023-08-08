package two;

public class SingletonPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Database db2 = Database.getInstance();
		db2.getConnection();
		
		

	}

}

class Database{
	
	private static Database dbObject = null;
		
	
	
	private Database(){
		
	}
	
	public static Database getInstance() {
		if (  dbObject == null) {
			 dbObject = new Database();
		}
		return dbObject;
	}
	
	public void getConnection() {
		System.out.println("You are connected to a database");
	}
}


/*What is Singleton class in Java and how can we make a class singleton?

Singleton is a design pattern by which we can create singleton class
Singleton class is a class which has only one instance at one particular time
at one particular JVM.

Make constructor private so that nobody can create object of it.
For creating one single object,we have to create private static instance of that 
class itself
Singleton instance is initially null
We have to create static block which will return same class object.
We will check in that class if that instance is null.
If it is null,we will create new with new keyword
and if not null,then return that instance itself.
*/
