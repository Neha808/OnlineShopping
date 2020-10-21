package onlineshopping.demo;

import java.util.Scanner;

public class Product
{
	int pro_id;
    String pro_name;
	long pro_price;
	

	Product(int pro_id,String pro_name,long pro_price)
	{
		this.pro_id=pro_id;
		this.pro_name=pro_name;
		this.pro_price=pro_price;
		
	}
	public void setData()
	{
		System.out.println("Enter Customer Details : ");
		
		Scanner sc=new Scanner(System.in);
		
		pro_id=sc.nextInt(); 
		pro_name=sc.nextLine(); 
		pro_price=sc.nextLong();
	}
	
	public void display()
	{
		System.out.println("\n"+pro_id+"  "+pro_name+" = "+pro_price);
	}
		
}
	
	
	

	



