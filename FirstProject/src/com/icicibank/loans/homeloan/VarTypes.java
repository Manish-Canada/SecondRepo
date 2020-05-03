package com.icicibank.loans.homeloan;

public class VarTypes {
    // primitive variable
	int x=100;  // instance or non static or global variable
	static String cname= "Nirma"; // static variable
	static VarTypes obj;
	
	
	public void m1() 
	{
		int z=10; // local variable
		System.out.println(z);
		
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(cname);
		System.out.println(VarTypes.cname);
		
	}
	
	public static void m2() 
	{
		obj = new VarTypes();
		System.out.println(obj.x);
		System.out.println(cname);
		
	}
	
	
	public static void main(String[] args)

	{
		//  Reference var
		obj = new VarTypes();
		System.out.println (obj.x); 
		System.out.println(cname); // or VarTypes.cname
		
	}
		
	
}
