package com.bank.tester;
import com.bank.core.*;
import com.bank.custComp.CustomerRegdateComp;

import java.util.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;
import static com.bank.implementation.ValidateUtils.*;
public class CustomerTester {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Customer> l=new ArrayList<>();
		while(true)
		{
		System.out.println("select 1 for creating a new customer id \n select 2 for displaying customer \n  select 3  for updating password  \4 for exit  ");
		int ch=sc.nextInt();
		if(ch==1)
		{
		boolean flag=true;
		while(flag)
		{
		try{
		System.out.println("enter customer email");
		String email=sc.next();
		validateMail(email);
		System.out.println("enter new password");
		String password=sc.next();
		validatePassword(password);
		System.out.println("enter registration balance");
		Double regAmt=sc.nextDouble();
		System.out.println("enter registration date");
		String date=sc.next();
		validateDate(date);
		
		Customer c= new Customer(Customer.autoGenerate++,email,password,regAmt,date);
		l.add(c);
		flag=false;
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		}
		}
		
		
		else if(ch==2)
		{
			Iterator<Customer> a= l.iterator();
			while(a.hasNext())
				System.out.println(a.next());
			
		}
		
		else if(ch==3)
		{	
			System.out.println("enter email id");
			String mail= sc.next();
			
			int index=l.indexOf(new Customer(mail));
			
			if(index!=-1)
			{
			System.out.println("inside if");
			Customer c=l.get(index);
			System.out.println("enter new password");
			String newpass = sc.next();
			c.setPassword(newpass);
			Customer temp=l.set(index ,c);
			}
			
			else
				System.out.println("not found");
			
			
		}
		else if(ch==4)
			break;
		
		}

		Collections.sort(l);
		System.out.println(l);
		
		System.out.println("sorting as per date");
		Collections.sort(l,new CustomerRegdateComp());
		System.out.println(l);
		
		//System.out.println(a.getClass().getName());
		
		
	/*System.out.println("using for each");
		for(Customer c1 : l)
			System.out.println(c1); */
		sc.close();
	

}
}