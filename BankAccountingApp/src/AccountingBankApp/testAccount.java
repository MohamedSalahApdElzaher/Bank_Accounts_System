package AccountingBankApp;
import java.util.*;
public class testAccount {
	
	private static Checking c;
	private static Savings s;
	private static List<Account> a;
    private static String filePath = "D:\\Practice Java by Building Projects\\4. Build a New Bank Account Application\\new.csv";
    private static String Search_file_path = "D:\\Practice Java by Building Projects\\4. Build a New Bank Account Application\\se.txt";
	
    public static void main(String[] args) {
  	
		// read data from a file
		
		List <String[]> list = CSVFile.ReadFileData(filePath);
		a = new LinkedList<Account>();
		for(String[] acc : list) {
			String name = acc[0];
			String sSN = acc[1];
			String acc_type = acc[2];
			double initdeposit = Double.parseDouble(acc[3]);
			
			if(acc_type.equals("Checking")) {
				c = new Checking(name , sSN);
				c.Deposit(initdeposit);
				c.WithDraw(200);
				a.add(c);	
			}
				
			else {
				s = new Savings(name , sSN);
				s.Deposit(initdeposit);
				s.WithDraw(500);
				a.add(s);	
			}
					
		}
		
		// print all data
		System.out.println("Read all File Data ...\n");
		for(Account ac : a) {
			ac.ShowInfo();
		}
		
		
		// Apply Search data by name in another File		
		
		List<String[]> li_st = CSVFile.SearchFile(Search_file_path);
		List<Account> acc_list = new LinkedList<Account>();
	  
		// read list of names and search for there accounts
		for(Account ac : a) {
			for(String[] names : li_st) {
				  String n = names[0];
				  if(n.equals(ac.GetName())) {
					 acc_list.add(ac);
				  }
			}
		}
		
		// print only searched data by name
		System.out.println("Read Search File Data...\n");
		for(Account an : acc_list)
			an.ShowInfo();
		

		// below , You can also test every class with it's own methods :)
		
		/*
		// Checking Account
		   Checking c = new Checking("Mohamed Salah", "55412", 321, 8554); 
	       c.Deposit(6000);
	        c.WithDraw(300);
	        c.Transfer("57357Hospital", 500);
	    	c.ShowInfo();
 
		// Saving Account
	        Savings s = new Savings("Ahmed","4546", 88 , 3321);
	        s.Deposit(6000);
	        s.WithDraw(300);
	        s.Transfer("57357Hospital", 500);
	        s.ShowInfo();
	        */
		
		}

}
