package onlineshopping.demo;

import java.util.Scanner;

public class Shoppingcart{

	public static void main(String[] args) {
		Product p1=new Product(01,"Microwave",20000);
		Product p2=new Product(02,"TV",25000);
		Product p3=new Product(03,"laptop",50000);
		Product p4=new Product(04,"Washig machine",15000);
		Product p5=new Product(05,"Phone",10000);
		p1.display();
		p2.display();
        p3.display();
        p4.display();
        p5.display();
		
		Scanner sc=new Scanner (System.in);
		System.out.println("\n 1.Microwave \n 2.TV  \n 3.Washing machine \n 4.laptop \n 5.phone \n 6.Generate Bill ");
		
		
		int sum=0;
		boolean flag=false;
		do
		{
			System.out.println("Enter your choice: ");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:System.out.println("Enter the number of Microwave: ");
				int num=sc.nextInt();
				int value=num*20000;
				sum=sum+value;
				break;
				
			case 2:System.out.println("Enter the number of tv ");
				int num1=sc.nextInt();
				int value1=num1*25000;
				sum=sum+value1;
				break;
				
			case 3:System.out.println("Enter the number of Washing machine ");
				int num2=sc.nextInt();
				int value2=num2*15000;
				sum=sum+value2;
				break;
				
			case 4:System.out.println("Enter the number of laptop");
				int num3=sc.nextInt();
				int value3=num3*50000;
				sum=sum+value3;
				break;
				
			case 5:System.out.println("Enter the number of phone");
				int num4=sc.nextInt();
				int value4=num4*15000;
				sum=sum+value4;
				break;
				
			
			case 6:flag=true;
			
			}
			
		}while(flag!=true);
		
		System.out.println("Total bill is: "+sum);
		sc.close();
	}

}







