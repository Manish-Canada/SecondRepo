package com.icicibank.loans.eduloan;

public class ThirdClass
{

	int a=10,b=20,c;
	
	public void add()
	{
		c=a+b;
		System.out.println("Add"+c);
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("sub"+c);
	}
	
	public static void main(String[] args)
	
	{
		ThirdClass obj=new ThirdClass();
		obj.add();
		obj.sub();

	}

}
