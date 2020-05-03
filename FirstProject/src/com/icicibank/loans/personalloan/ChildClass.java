package com.icicibank.loans.personalloan;

public class ChildClass extends D
{

	public static void main(String[] args)
	{
		ChildClass obj = new ChildClass();
		obj.a1();
		obj.a2();

	}

	@Override
	public void a2() 
	{
	System.out.println("a2 overridden methodin ChildClass");	
		
	}

}
