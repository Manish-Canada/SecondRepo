package com.icicibank.loans.homeloan;

public class B extends A // extends A --- ISA Relationship
{
	
	public void m2()
	{
		System.out.println("m2 from class B");		
	}	
	
	public void m1()
	{
		System.out.println("overriden m1 from class B");		
	} 
	
	
	
	public static void main(String[] args)
	{ 
	 A a = new A();   // HasA Relationship
	 a.m1();
	 System.out.println(a.x);
	
		
	B b = new B();
	b.m2();
	b.m1();
	System.out.println(b.x);
		
	}
	
}
