package com.homework;

import java.util.Scanner;

public class TriangleArea {
	public static void main(String []args)
	{
		int x,y,S;
		Scanner in = new Scanner(System.in);
		System.out.print("请输入底、高：");
		x=in.nextInt();
		y=in.nextInt();
		S=x*y/2;
		System.out.println("面积是："+S);
		in.close();
	}

}
