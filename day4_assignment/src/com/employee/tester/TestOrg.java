package com.employee.tester;
import com.employee.core.*;
import com.sun.prism.image.CompoundTexture;

import java.util.Scanner;
public class TestOrg {

	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);	
	System.out.println("enter maximum number of employees");
	int n=sc.nextInt();
	Employee[] e= new Employee[n];
	int count=0;
	while(true)
		{
{	
						System.out.println("select 1 for entering manager's details \n select 2 for entering worker's details ");
						int ch=sc.nextInt();
						sc.nextLine();
						
						System.out.println("enter id of employee");
						String id=sc.nextLine();
						System.out.println("enter name of employee");
						String name=sc.nextLine();
						System.out.println("enter basic salary of employee");
						double basic=sc.nextDouble();
						System.out.println("enter dept id of employee");
						int did=sc.nextInt();
						sc.nextLine();
						
						
						if(ch==1)
						{
							System.out.println("enter performance bonus of " +name);
							double bonus=sc.nextDouble();
							e[count++]=new Manager(id,name,did,basic,bonus);
						}
						
						if(ch==2)
						{
							System.out.println("enter hourly rate of "+name);
							double hourlyRate=sc.nextDouble();
							System.out.println("enter number of hours worked ");
							double hoursWorked=sc.nextDouble();
							e[count++]=new Worker(id,name,did,basic,hourlyRate,hoursWorked);
						}
						
						if(count==n)
							break;
						
					}
		}
		
				for(int i=0;i<n;i++)
				{
					if(e[i] instanceof Manager)
					System.out.println(e[i] +" ,performance bonus is "+((Manager)e[i]).getPerfBonus()+" ,net salary " +((Manager)e[i]).computeNetSalary());
					
					else
						System.out.println(e[i] +" , hourly rate is "+((Worker)e[i]).gethourlyRate()+ " ,net salary " +((Worker)e[i]).computeNetSalary());
				}
			
			
		

}
}
