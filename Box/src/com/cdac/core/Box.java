package com.ankit.box;
import java.util.Scanner;

public class Box
{
	private int width;
	private int length;
	private int height;
	
	public Box(int width,int length,int height)
	{
			this.width=width;
			this.length=length;
			this.height=height;
		
	}
	
	public double calcVol()
	{
		return (width*length*height);
		
		
	}
	public void display()
	{
		System.out.println(" width is "+width +"height is "+height+ "length is "+length);
		
		
	}
	
	
}
