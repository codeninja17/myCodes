package com.bank.implementation;
import com.bank.custExcep.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidateUtils {
	
	public static void validateMail(String mail) throws Exception
	{
		if(mail.length()<7 || mail.length()>20 || !mail.contains("@") )
			throw new CustExcep("invalid email id , email id must be of length 7~20 and must contain @");
			
	}


	public static void validatePassword(String pass) throws Exception
	{
		if(pass.length()<5 || pass.length()>10)
			throw new CustExcep("password length is invalid , valid range is 5~10");
	}
	
	public static void validateDate(String date)  throws Exception
	{
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date d= sdf.parse(date);
		
	}
	
}
