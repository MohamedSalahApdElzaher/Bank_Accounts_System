package AccountingBankApp;

public class Savings extends Account{

	// another Savings class attributes
	private int savitydebositId , savitydebositbox;
	
	public Savings(String name ,String SocialSecurityNumber ) {	
		super(name , SocialSecurityNumber);		
		SetId();
		AccNumber = "1" + AccNumber;	
	}
	
	// SetSavitydepositid
	public void SetId() {
		savitydebositId = (int)(Math.random()  * Math.pow(10, 3)); // 3 random digit
		savitydebositbox = (int)(Math.random()  * Math.pow(10, 4)); // 4 random digit
	}
	// Savings Account ShowInfo
	
		public void ShowInfo() {
			super.ShowInfo();
			System.out.println("AccNumber : " + AccNumber );
			System.out.println("Balance : $" + balance);
			System.out.println("Savity Debosit Box : " + savitydebositbox + "\nSavity DePosit Id : " +savitydebositId);
			SetRate();
			System.out.println("Account Type : " + AccType());
			System.out.println("-----------------------------------------");
		}

	public void SetRate() {
		System.out.println("Rate : "+ GetBaseRate() * 0.25);
	}
	
	// show account Type
	public String AccType() {
		return "Savings";
	}
		
}
