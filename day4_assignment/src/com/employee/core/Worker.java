package com.employee.core;

public class Worker extends Employee {
	
	private double hourlyRate;
	private double hoursWorked;
	
	
	
	public Worker(String id, String name, int deptId, double basic, double hourlyRate, double hoursWorked) {
		super(id, name, deptId, basic);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}


	@Override
	public String toString()
	{
		
		return super.toString()+", hourly rate =" +hourlyRate +", hours Worked ="+hoursWorked;
	}
	
	
	public double computeNetSalary()
	{
		return getBasic()+(hourlyRate*hoursWorked);
		
	}
	
	public double gethourlyRate()
	{
		return hourlyRate;
		
	}
	
	

}
