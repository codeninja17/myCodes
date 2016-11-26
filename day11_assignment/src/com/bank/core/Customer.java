package com.bank.core;
import java.util.Date;
import java.util.Comparator;

public class Customer implements Comparable<Customer>{
	
	

	public static int autoGenerate=1000;
	private int custId;
	private String email;
	private String password;
	private double regAmount;
	private String regDate;
	
	
		public Customer(int custId, String email, String password, double regAmount, String regDate) {
		
		super();
		this.custId = custId;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.regDate = regDate;
	}
	
	
	public Customer(String mail)
	{
		email=mail;
	
	}

	
	
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int compareTo(Customer c)
	{
		return email.compareTo(c.email);
	}	
			@Override
	public String toString()
	{
		return "Customer id : " + custId +"\n Email :" + email +" Registration date :" +regDate ; 
	}
	
			public String getRegDate() {
				return regDate;
			}

			
			
	
	@Override 
	public boolean equals(Object o)
	{
		
		if(o instanceof Customer){
		if(this.email.equals(((Customer)o).email))
		{
			System.out.println("true");
			return true;
		}
		else 
			return false;
		}
		return false;
	}
	
	
	
}
