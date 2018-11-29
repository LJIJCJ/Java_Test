package com.homework;

class Point
{
	int x,y;
	public void setX(int i)
	{
		x=i;
	}
	public void setY(int j)
	{
		y=j;
	}
	public void getPoint()
	{
		
		System.out.println("("+x+","+y+")");
	}
	public void movePoint(int i,int j)
	{
		x+=i;
		y+=j;
	}
	Point()
	{
		x=0;
		y=0;
	}
}

public class TestPoint
{
	public static void main(String []args)
	{
		Point point=new Point();
		point.getPoint();
		point.movePoint(10, 20);
		point.getPoint();
	}
}
