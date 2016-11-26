package com.employee.core;

public class Manager extends Employee {
	
	private double perfBonus;

	public Manager(String id, String name, int deptId, double basic, double perfBonus) {
		super(id, name, deptId, basic);
		this.perfBonus = perfBonus;
	}

	@Override
	public String toString() {
		return super.toString()+", performance bonus= "+perfBonus;
		
	}
	
	public double getPerfBonus() {
		return perfBonus;
	}
	
	public double computeNetSalary()
	{
		return getBasic()+perfBonus;
		
	}
	
	
}
