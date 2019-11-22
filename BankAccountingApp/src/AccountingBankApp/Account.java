package AccountingBankApp;

public abstract class Account implements IbaseRate {
	// shared prop between checking and savings class
  private String name , SocialSecurityNumber ;
  public double balance;
  public double rate;
  private static int n=10000;
  public String  AccNumber;
  
  
	public Account(String name ,String SocialSecurityNumber  ) {
		this.name = name;
		this.SocialSecurityNumber =  SocialSecurityNumber;	
		++n;
		this.AccNumber = SetAccountNumber();
	}
	
	// abstract method to set_rate
	public abstract void SetRate() ;
	
	//list common method
	public void Deposit(double amount) {
		balance+=amount;
		//System.out.println("deposting : " + amount);
		//GetBalance();
	}
	public void WithDraw(double amount) {
		balance-=amount;
		//System.out.println("Successfull withdraw : " + amount);
		//GetBalance();
	}
	public void Transfer(String distination , double amount) {
		balance-=amount;
		System.out.println("Transfer $" + amount + "to " + distination);
		GetBalance();
	}
	
	// print Balance
	public void GetBalance() {
		System.out.println("Your Balance Now : " + balance);
	}
	
	// SetAccoutntNumber 11 digit
	private  String  SetAccountNumber() {
		// return last 2 digit in SsN
		String lstSSn =  SocialSecurityNumber.substring(SocialSecurityNumber.length()-2, SocialSecurityNumber.length());
		// 3 random numbers
		int rn = (int) (Math.random() * Math.pow(10, 3));
		// 5 unique digit numbs
		return lstSSn + "" + n + "" + rn;
	}
	
	// ShowInfo
	public void ShowInfo() {
		System.out.println("Client Name : " +name+"\nSocial Security Number : " + SocialSecurityNumber );		
	}
	
	public String GetName() {
		return name;
	}
}
