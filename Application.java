package com.jsp.jobapplication;

public class Application 
{
     // DATA MEMBER VARIABLE
		String Name;
		String Email;
		long   Mobile;
		double Tenth;   // 10TH   PERCENTAGE
		double Twelth; // 12TH   PERCENTAGE
		double Degree;// DEGREE PERCENTAGE
	
    //  BY CREATING PARAMETERIZE CONSTRUCTORS INITIALIZE
	public Application(String Name,String Email,long Mobile,double Tenth,double Twelth,double Degree)
	{
	
		this.Name   = Name;   //RHS-LOCAL VARIABLES
		this.Email  = Email; // LHS-DATA MEMBER VARIABLES CALL AS THIS KEYWORD
		this.Mobile = Mobile;
		this.Tenth  = Tenth;
		this.Twelth = Twelth;
		this.Degree = Degree;
	}
	
    //	CREATE A METHOD FOR DISPLAY DETAILS
	public  void display() 
	{
		System.out.println("\tJOB APPLICATION ");
		System.out.println("------------------------------");
		
		System.out.println("NAME \t\t : "+Name);
		System.out.println("EMAIL ID \t : "+Email);
		System.out.println("MOBILE NUMBER \t : "+Mobile);
		System.out.println("10TH PERCENTAGE  "+": "+Tenth);
		System.out.println("12TH PERCENTAGE  "+": "+Twelth);
		System.out.println("DEGREE PERCENTAGE: "+Degree);
		
		System.out.println("------------------------------");
	}

	public static void main(String[] args) 
	{
		//BY CREATING OBJECT CLAUSE
		Application A = new Application("Lance", "lance123@gmail.com", 9876543210l, 80.5, 75.9, 95.3);
		            A.display();
		
		Application A1 = new Application("Madesh", "madesh123@gmail.com", 7986541230l, 90.5, 85.9, 75.3);
		            A1.display();

	}

}
