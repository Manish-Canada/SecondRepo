package com.icicibank.loans.personalloan;

import com.icicibank.loans.homeloan.A;
import com.icicibank.loans.homeloan.B;

public class C  extends A
{
   public void m3() 
   {
	System.out.println("m3 from class C");
   } 
   
   public void m1()
	{
		System.out.println("overriden m1 from class C");		
	} 
	
	public static void main(String[] args)
	{
		B b = new B();
		b.m1();
		b.m2();
		System.out.println(b.x);
	
		C c = new C();
		c.m3();
		//c.m2();
		c.m1();
		System.out.println(c.x);
		
	}
	
}
