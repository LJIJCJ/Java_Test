package com.homework;

import java.util.Scanner;

public class TriangleArea {
	public static void main(String []args)
	{
		int x,y,S;
		Scanner in = new Scanner(System.in);
		System.out.print("������ס��ߣ�");
		x=in.nextInt();
		y=in.nextInt();
		S=x*y/2;
		System.out.println("����ǣ�"+S);
		in.close();
	}

}
