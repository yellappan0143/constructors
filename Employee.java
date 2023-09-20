package com.jsp.jobapplication;

public class Employee 
{
	// DATA MEMBERS
	int    E_Id;
	String Name;
	double Salary;
	int    Experence;
	
	// BY CREATING PARAMETERIZE CONSTRUCTORS INITIALIZE
	public Employee(int E_id,String Name,double Salary,int Experence) 
	{
		        this.E_Id      = E_id;
			this.Name      = Name;
			this.Salary    = Salary;
			this.Experence = Experence;		
	}
	
	// CREATE A METHOD FOR UPDATE SALARY
	public void updatesalary(double NewSalary) 
	{
		this.Salary = Salary + NewSalary;
		System.out.println("UPDATED SALARY\t :"+Salary);
	}
	
	// CREATE A METHOD FOR DISPLAY DETAILS
	public void display() 
	{
		System.out.println(" EMPLOYEE DETAILS");
		System.out.println("-------------------------");
		
		System.out.println("EMPLOYEE ID \t : "+E_Id);
		System.out.println("EMPLOYEE NAME \t : "+Name);
		System.out.println("EMPLOYEE SALARY\t : "+Salary);
		System.out.println("EMPLOYEE EXPRENCE: "+Experence+"-Years");
		
		System.out.println("-------------------------");
		updatesalary(599.0d);		
	}
     
	// CREATE MAIN METHODS
	public static void main(String[] args) 
	{
	    // BY CREATING OBJECTS CLAUSE
		Employee E = new Employee(123, "Lance", 5999.0d, 04);
		         E.display();

	}

}
