package com.qsp.test;

import java.util.Scanner;

public class Laptop 
{
	String Company_Name;
	String laptop_id;
	int Year;
	String Model;
	String Processer;
	String RamSize;
	double price;
	static int n=0;
	
	public Laptop(String Company_Name,int Year,String Model,String Processer,String RamSize,int price,String laptop_Id)
	{
		
		this.Year=Year;
		this.Model=Model;
		this.Processer = Processer;
	    this.RamSize=RamSize;
		this.price=price;
		n++;
	}
	public void DisplayDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Company Name");
		Company_Name=sc.next();
		System.out.println("Enter the Year Of laptop");
		Year = sc.nextInt();
		System.out.println("Enter the Model Name");
		Model = sc.next();
		System.out.println("Enter the Laptop Processer");
		Processer = sc.next();
		System.out.println("Enter the Ram Size");
		RamSize = sc.next();
		System.out.println("Enter the price of laptop");
		price = sc.nextInt();
		
		
		
		System.out.println("Company Name:" + Company_Name);
	    System.out.println("Year :" + Year);
		System.out.println("Model :" + Model);
		System.out.println("Pocessor  :" + Processer);
		System.out.println("RamSaize :" + RamSize);
		System.out.println("Price :" + price);
		System.out.println("Laptop Id :"+Company_Name.substring(0,3)+Year+Model.substring(0,2)+0+0+n);
		sc.close();
	}

	public static void main(String[] args) 
	{
         Laptop L = new Laptop(null, n, null, null, null, n, null);
                L.DisplayDetails();
	}

}
