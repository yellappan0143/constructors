package com.qsp.test;

public class Account 
{
    String Name;
    long Acc_no;
    String IFSC;
    double Balance;
    static String BankName="INDIAN BANK";
    static String Branch="HSR LAYOUT";
    
    public  Account(String Name,long Acc_no,String IFSC,double Balance) 
    {
		this.Name    = Name;
		this.Acc_no  = Acc_no;
		this.IFSC    = IFSC;
		this.Balance = Balance;
		
	}
    
    public void deposit(double Amt) 
    {
    	if(Balance>=Amt)
    	{
    		Balance=Balance+Amt;
    		System.out.println("Deposited Amount : "+Amt+" And Balance Amount : "+Balance);
    	}
		
	}
    
    public void withdraw(double Amt) 
    {
		if(Amt>0)
		{
			Balance=Balance-Amt;
			System.out.println("Withdraw Amount : "+Amt+" And Balance Amount : "+Balance);
		}
	}
    
    public void display() 
    {
    	System.out.println("Bank Details");
		System.out.println("-----------------------");
		System.out.println("Name : "+Name);
		System.out.println("Account No : "+Acc_no);
		System.out.println("IFSC Code : "+IFSC);
		System.out.println("Branch Name : "+Branch);
		System.out.println("Bank Name : "+BankName);
	}
    

	public static void main(String[] args) 
	{
		Account A = new Account("Madesh", 6558990993l, "ISB000067", 5999.0);
		       
		        A.display();
		        System.out.println("----------------------");
		        A.deposit(500.0);
		        A.withdraw(199.0);

	}

}
