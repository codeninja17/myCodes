package com.bank.custComp;

import java.util.Comparator;

import com.bank.core.Customer;
import java.text.SimpleDateFormat;

public class CustomerRegdateComp implements Comparator<Customer> {
	
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	@Override
	public int compare(Customer c, Customer c1)
	{
		try{
		return sdf.parse(c.getRegDate()).compareTo(sdf.parse(c1.getRegDate()));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return -1;
	}
}
