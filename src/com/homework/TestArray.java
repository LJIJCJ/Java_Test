package com.homework;

class ArraySort 
{
	int sim[]=new int[10];
	public ArraySort(int []sim)
	{
		for(int i=0;i<10;i++)
		{
			sim[i]=10-i;
		}
	}
	public void setOrder()
	{
		int counter;
		for(int i=0;i<10;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if(sim[i]>sim[j])
				{
					counter=sim[i];
					sim[i]=sim[j];
					sim[j]=counter;
				}
			}
		}
	}
}

public class TestArray 
{
	public static void main(String []args)
	{
		int sim[]=new int [10];
		ArraySort array = new ArraySort(sim);
		array.sim=sim;
		array.setOrder();
		for(int i=0;i<10;i++)
		{
			System.out.println(array.sim[i]);
		}
	}
}
