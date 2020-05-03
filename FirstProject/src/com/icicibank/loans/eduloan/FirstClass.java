package com.icicibank.loans.eduloan;

public class FirstClass implements GenClass

{

	public static void main(String[] args) 
	{
		System.out.println("Hi!");
		
		FirstClass obj = new FirstClass();
		obj.aaa();
		obj.zzz();
		

	}

	@Override
	public void aaa()
	{
		System.out.println("AAA");
		
	}

	@Override
	public void zzz() 
	{
	System.out.println("ZZZ");	
		
	}

}
