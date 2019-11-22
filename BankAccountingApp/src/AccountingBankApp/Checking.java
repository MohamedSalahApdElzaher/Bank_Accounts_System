package AccountingBankApp;

public class Checking extends Account{
	
	
	private int deptcardnumber = (int)(Math.random()  * Math.pow(10, 3)); // 3 random digit
	private int debtcardpin = (int)(Math.random()  * Math.pow(10, 4)); // 4 random digit
	
	public Checking(String name ,String SocialSecurityNumber) {
		
		super(name , SocialSecurityNumber);
		
		AccNumber = "2" + AccNumber;
		//System.out.println("Account Type : Checking Account");

	}
	
	// Checking Account ShowInfo
	
	public void ShowInfo() {
		super.ShowInfo();
		System.out.println("AccNumber : " + AccNumber + "\nBalance : "+ balance);
		System.out.println("Debt Card pin : " +debtcardpin+ "\nDept Card Number : " + deptcardnumber);
		SetRate();
		System.out.println("Account Type : " + AccType());
		System.out.println("-----------------------------------------");
	}

	private String AccType() {
		// TODO Auto-generated method stub
		return "Checking";
	}


	@Override
	public void SetRate() {
		System.out.println("Rate : "+ GetBaseRate() * 0.15);  // assign base rate value from interface to Rate
	
	}
}