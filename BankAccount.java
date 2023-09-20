package com.jsp.jobapplication;

public class BankAccount 
{
	// DATA MEMBERS
	String Name;
	long   Account_No;
	double Balance;
	static String IFSC = "ID000056";
	static String Branch = "HSR LAYOUT"; 
	
	// BY CREATING PARAMETERIZE CONSTRUCTORS INITIALIZE
	public BankAccount(String Name,long Account_No,double Balance)
	{
		this.Name       = Name;
		this.Account_No = Account_No;
		this.Balance    = Balance;
		 
	}
	
    // CREATE A METHOD FOR WITHDRAW AMOUNT
	public void withdraw(double W_Amt) 
	{
		if(Balance>=0 && W_Amt>=0)
		{
			this.Balance = Balance - W_Amt;
			
			System.out.println("WITHDRAW AMOUNT "+" : "+W_Amt);
		}
	}
	
    // CREATE A METHOD FOR DEPOSIT AMOUNT
	public void deposit(double D_Amt) 
	{
		if(Balance>=0 && D_Amt>=0)
		{
			this.Balance = Balance + D_Amt;
			System.out.println("DEPOSIT AMOUNT \t : "+Balance);
		}
	}
	
    // CREATE A METHOD FOR CHECK BALANCE ACCOUNT
    public void checkbalance() {
    	
    	 
    	System.out.println("CHECK BALANCE \t : "+Balance);
		
	}
    
    // CREATE A METHOD FOR DISPLAY ACCOUNT DETAILS 
	public  void displaydetails() 
	{
		
		System.out.println("BANK ACCOUNT DETAILS ");
		System.out.println("----------------------------");
		
		System.out.println("NAME  \t\t : "+Name);
		System.out.println("ACCOUNT NO  \t : "+Account_No);
		System.out.println("CURRENT BALANCE  : "+Balance);
		System.out.println("IFSC CODE  \t : "+IFSC);
		System.out.println("BRANCH NAME \t : "+Branch);
		
		System.out.println("----------------------------");
				
	}
	
    // CREATE MAIN METHODS
	public static void main(String[] args) 
	{
		// BY CREATING OBJECTS CLAUSE
		BankAccount INDIAN = new BankAccount("Lance", 6549873210l,5000.0d);
					
		            INDIAN.displaydetails();
		            INDIAN.	deposit(500.0d);
					INDIAN.	withdraw(100.0d);
					INDIAN.	checkbalance();
//					System.out.println("----------------------------");
//		            INDIAN.displaydetails();
  
	}
}
