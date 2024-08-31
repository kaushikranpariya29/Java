/*2. Write a Java program to calculate average purchase of the customer as well as calculate
and display discount earned by the customer.Create a class called Customer by
considering customer id, customer name, city, contact no and last five purchases from
the store.
Perform following operations to calculate discount:
1. Get the values from user
2. Display the customer data
3. Calculate average purchase using (Total purchase/ 5)
4. Calculate discount based on following criteria
If average purchase > 50000 then discount = 5000
If average purchase > 35000 then discount = 3500
If average purchase > 20000 then discount = 2000
If average purchase < 20000 then discount = 0*/

import java.util.*;
class Customer
{
	int cid;
	String cname;
	String city;
	long cno;
	int p[];
	int total;
	int average;
	int dis;	

	Customer()
	{
		cid=0;
		cname=null;
		city=null;
		cno=0;
		total=0;
		average=0;
		dis=0;
		p=new int[6];
	}

	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Customer ID : ");
		cid=sc.nextInt();
		System.out.print("Enter Customer Name : ");
		cname=sc.next();
		System.out.print("Enter Customer City : ");
		city=sc.next();
		System.out.print("Enter Contact number : ");
		cno=sc.nextLong();
		//System.out.print("Enter " +i+ " Purchase : ");
		for(int i=1;i<6;i++)
		{
			System.out.print("Enter " +i+ " Purchase : ");
			p[i]=sc.nextInt();
		}
	}
	
	void calculate()
	{
		for(int i=1;i<6;i++)
		{
			total=total+p[i];
		}  
		average=total/5;
	}
	
	void discount()
	{
		if(average>50000)
			dis="5000";
		else if(average>35000 && average<50000)
			dis="3500";
		else if(average>20000 && average<35000)
			dis="2000";
		else
			dis="0";
	}

	void display()
	{	
		System.out.println("===========================================");
		System.out.println("----------👫️Customer Details👫️------------");	
		System.out.println("Customer ID is   : "+cid);
		System.out.println("Customer Name is : "+cname);	
		System.out.println("Customer City is : "+city);	
		System.out.println("Contact no is    : "+cno);
	
		for(int i=1;i<6;i++)
		{
			System.out.println(+i+" Purchase is    : "+p[i]);
		}
		System.out.println("-------------------------------------------");
		System.out.println("Purchases Average is : "+average);
		System.out.println("Discount is : "+dis);
		System.out.println("HAVE A NICE DAY 😊️");
	}
}
class Customer1
{
	public static void main(String args[])
	{
	Customer c=new Customer();
	c.getdata();
	c.calculate();
	c.discount();
	c.display();
	}
} 	




