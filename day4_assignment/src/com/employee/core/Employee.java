package com.employee.core;

public class Employee {
	
	private String id;
	private String name;
	private  int deptId;
	private double basic;
	
	
	public Employee(String id, String name, int deptId, double basic) {
		super();
		this.id = id;
		this.name = name;
		this.deptId = deptId;
		this.basic = basic;
	}

	public double getBasic()
	{
		return basic+1;
		
	}

	@Override
	public String toString() {
		return "Employee id=" + id + ", name=" + name + ", deptId=" + deptId + ", basic salary=" + basic ;
	}
	
}