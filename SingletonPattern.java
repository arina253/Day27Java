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
