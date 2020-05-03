package com.icicibank.loans.homeloan;

public class DataTypes
{

	byte b; // 1 byte (-128 to 127)
	short s; //  2 bytes (-32768 to  32767)
	int i ;      // 4 bytes    (-2147483648 to 2147483647)
	long l; // 8 bytes
	
	float f; // 4 bytes
	double d ; // 8 bytes
	
	boolean bb ; // true or false only
	char ch ; // 2 bytes
	
	String str ;
	
	static String cname;
	
	public static void main(String[] args) 
	{
		int rno=0; // must declare value at local level variable
		System.out.println("Roll No:"+ rno);
		
		DataTypes obj = new DataTypes();
		System.out.println("Byte:"+ obj.b);
		System.out.println("Short:"+ obj.s);
		System.out.println("int:"+ obj.i);
		System.out.println("long:"+ obj.l);
		System.out.println("float:"+ obj.f);
		System.out.println("double:"+ obj.d);
		System.out.println("Boolean:"+ obj.bb);
		System.out.println("char:"+ obj.ch);
		System.out.println("string:"+ obj.str);
		System.out.println("Cname: "+ cname);
	}

}
