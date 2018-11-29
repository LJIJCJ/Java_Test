package com.homework;

import java.util.Scanner;

class Founder
{
	public static void founder(int[] Pri)
	{
		if(Pri.length<=1)return;
		Pri[1]=0;
		for(int i=2;i<=Pri.length;i++)
		{
			int Jut=1;
			for(int j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0) 
				{
					Jut=0;
					break;
				}
				
			}
			if(Jut==1)Pri[i-1]=0;
		}
	}
}

public class PrimeNumber {
	public static void main(String []args)
	{
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入查找范围：");
		n=in.nextInt();
		int Pri[] = new int[n];
		for(int i=0;i<n;i++)Pri[i]=1;
		Founder.founder(Pri);
		System.out.println("素数有：");
		for(int i=0;i<n;i++)
		{
			if(Pri[i]==0)System.out.println(i+1);
		}
		in.close();
	}
}
