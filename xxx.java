package two;

public class xxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DatabaseD db = DatabaseD.getObj();
		db.getConnection();

	}

}
class DatabaseD{
	private static DatabaseD dbObj=null;
	
	private DatabaseD() {
		
	}
	
	public static  DatabaseD getObj(){
		if (dbObj==null) {
		dbObj = new DatabaseD();
	}
		
		return dbObj ;
	}
	
	public void getConnection(){
		System.out.println("Connected");
		}
	}
