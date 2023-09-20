package com.qsp.test;

public class Customer 
{
	String Name;
	long Ph_no;
	String Email;
	int C_pw;
	
	public Customer(String Name,long Ph_no,String Email,int C_pw)
	{
		this.Name=Name;
		this.Ph_no=Ph_no;
		this.Email=Email;
		this.C_pw=C_pw;
	}
	public Customer(String Name,long Ph_no,int C_pw)
	{
		this.Name=Name;
		this.Ph_no=Ph_no;
		this.C_pw=C_pw;
	}
	
	public void login() 
	{
		if(this.Email== "madesh@gmail.com"||this.Ph_no == Ph_no)
		{
			if(this.C_pw == C_pw)
			{
				System.out.println("login Succesfully");
			}else {
				System.out.println(" Invalid Password");
			}
		}else
		{
			System.out.println(" Invalid Email id");
		}
	}
	
	public void details() 
	{
		System.out.println("----------------------");
		System.out.println("Customer Details");
		System.out.println("----------------------");
		System.out.println("Name :"+Name);
		System.out.println("Phone Number :"+Ph_no);
		System.out.println("Email :"+Email);
	}
	
	public static void main(String[] args) 
	{
	    Customer C = new Customer("Madesh",7894561130l , "madesh@gmail.com", 9900);
		         C.login();
		         C.details();
		
	    Customer C1 = new Customer("Lance",9089455660l, 9100); // Second User
		         C1.login();
		         C1.details();
	}
}
