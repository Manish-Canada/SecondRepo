package com.icicibank.loans.homeloan;

import java.util.Date;

public class A
{
public int x=100;
	
	public  void m1()
	{
		x=200;
		System.out.println("m1 from class A");		
	} 
	
	public static  void m4()
	{
		System.out.println("m4- static method from class A");		
	} 
	
	static 
	{
		Date dt = new Date();
		System.out.println(dt);
	}
	
	static 
	{
		Date dt = new Date();
		System.out.println("hello"+dt);
	}
	
	public static void main(String[] args)
	{
		A a = new A();
		a.m1();
		System.out.println(a.x);
		m4();
		a.m4();
		
	}
}
