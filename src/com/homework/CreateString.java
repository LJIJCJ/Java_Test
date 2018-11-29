package com.homework;

public class CreateString 
{
	public CreateString(String a)
	{
		System.out.println(a);
	}
	public CreateString()
	{
		System.out.println("String");
	}
	public static void main(String[] args)
	{
		System.out.print("法一：");
		CreateString[] c_1 = {
				new CreateString(),new CreateString("a"),new CreateString("b")
		};
		
		System.out.println("法二");
		
		Object[] c_2= new Object[3];
		c_2[0] = new CreateString();
		c_2[1] = new CreateString("a");
		c_2[2] = new CreateString("b");
	}
}