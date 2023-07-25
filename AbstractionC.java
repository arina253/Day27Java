package two;

public class AbstractionC {

	public static void main(String[] args) {
		
				
				NIB2 C = new NIB2("Nepal Investment Bank", "NIB123", "Pokhara");
				C.loan();
				C.save();
				C.displayCountry();
				C.branchName();
				
				ADB1 B = new ADB1("Asian Development Bank", "ADB456", "Chitwan");
				B.loan();
				B.save();
				B.displayCountry();
				B.branchName();
			}
		}

		abstract class NepalRashtraBank1 {
			
			private String bankName;
			private String bankCode;

			public NepalRashtraBank1(String bankName, String bankCode) {
				this.bankName = bankName;
				this.bankCode = bankCode;
			}

			abstract void loan();
			abstract void save();
			
			public void displayCountry() {
				System.out.println("Kathmandu");
			}
		}

		class NIB2 extends NepalRashtraBank1 {
			
			private String branchLocation;

			public NIB2(String bankName, String bankCode, String branchLocation) {
				super(bankName, bankCode);
				this.branchLocation = branchLocation;
			}

			public void loan() {
				System.out.println("I am loan method from " + this.bankName);
			}

			public void save() {
				System.out.println("I am save method from " + this.bankName);
			}

			public void branchName() {
				System.out.println(this.branchLocation);
			}
		}

		class ADB1 extends NepalRashtraBank1 {
			
			private String branchLocation;

			public ADB1(String bankName, String bankCode, String branchLocation) {
				super(bankName, bankCode);
				this.branchLocation = branchLocation;
			}

			public void loan() {
				System.out.println("I am loan method from " + this.bankName);
			}

			public void save() {
				System.out.println("I am save method from " + this.bankName);
			}

			public void branchName() {
				System.out.println(this.branchLocation);
			}
		}

	


