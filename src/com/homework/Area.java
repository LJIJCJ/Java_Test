package com.homework;

import java.util.Scanner;

public class Area {
	public static void main(String []args)
	{
		int x,y,S;
		Scanner in = new Scanner(System.in);
		System.out.print("�����볤����");
		x=in.nextInt();
		y=in.nextInt();
		S=x*y;
		System.out.println("����ǣ�"+S);
		in.close();
	}
}
