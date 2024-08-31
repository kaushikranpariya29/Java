/*1. Write a Java program to calculate strike rate of the cricketer as well as allocate and
display player category based on strike rate.
Create a class called Cricketer by considering cricketer id, cricketer name, specialization
and score of last five tournaments out of 100.
Perform following operations to allocate category
1. Get the values from user
2. Display all the platinum cricketer data
3. Calculate strike rate using (Total score of 5 tournaments *100/500)
4. Allocate category based on following criteria
If strike rate> 90 then category = Platinum
If strike rate> 70 then category = Gold
If strike rate> 60 then category = Silver*/


import java.util.*;
class Cricket
{
	int cid;
	String cname;
	String spe;
	int s[];
	int total;
	String cetegory;
	int sr;	

	Cricket()
	{
		cid=0;
		cname=null;
		spe=null;
		total=0;
		cetegory=null;
		sr=0;
		s=new int[6];
	}

	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Cricketer ID: ");
		cid=sc.nextInt();
		System.out.print("Enter Cricketer Name: ");
		cname=sc.next();
		System.out.print("Enter Cricketer Specialization: ");
		spe=sc.next();
		
		
		for(int i=1;i<6;i++)
		{
			System.out.print("Enter " +i+ " Match Score : ");
			s[i]=sc.nextInt();
		}
	}
	
	void calculate()
	{
		for(int i=1;i<6;i++)
		{
			total=total+s[i];
		}  
		sr=total*100/500;
	}
	
	void criteria()
	{
		if(sr>90)
			cetegory="Platinum";
		else if(sr>70 && sr<90)
			cetegory="Gold";
		else if(sr>60 && sr<70)
			cetegory="Silver";
		else
			cetegory="Bronze";
	}

	void display()
	{	
		System.out.println("===========================================");
		System.out.println("----------🏏️Cricketer Details🏏️-----------");	
		System.out.println("Cricketer ID is  : "+cid);
		System.out.println("Cricketer Name is : "+cname);	
		System.out.print("Cricketer Specialization: "+spe);
	
		for(int i=1;i<6;i++)
		{
			System.out.println(+i+" Match Score is   : "+s[i]);
		}
		System.out.println("Total Scores is : "+total);
		System.out.println("Total STRICK RATE is : "+sr);
		System.out.println("Cetegory is : "+cetegory);
		System.out.println("HAVE A NICE DAY 😊️");
	}
}
class Cricket1
{
	public static void main(String args[])
	{
	Cricket c=new Cricket();
	c.getdata();
	c.calculate();
	c.criteria();
	c.display();
	}
} 	

