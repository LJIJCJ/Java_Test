package com.lcj;

import java.util.Calendar;
import java.util.Scanner;

class DateChange
{
	int year,month,day;
	
	public void show()
	{
		System.out.println(year+"/"+month+"/"+day);
	}
}

class Judgment
{
	public int change(DateChange changment)
	{
		int Jut=0;
			switch(changment.month)
			{
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:
				{
					if(changment.day<0 || changment.day>31)
					{
						System.out.println("�޸ķǷ������������á�");
						break;
					}
					System.out.println("�޸ĳɹ���");
					Jut=1;
					break;
				}
			case 4:case 6:case 9:case 11:
				{
					if(changment.day<0 || changment.day>30)
					{
						System.out.println("�޸ķǷ������������á�");
						break;
					}
					System.out.println("�޸ĳɹ���");
					Jut=1;
					break;
				}
			case 2:
				{
					if((changment.year%4==0 && changment.year%100!=0) || changment.year%400==0) 
					{
						if(changment.day<0 || changment.day>29)
						{
							System.out.println("�޸ķǷ������������á�");
							break;
						}
						System.out.println("�޸ĳɹ���");
						Jut=1;
						break;
					}
					else
					{
						if(changment.day<0 || changment.day>28)
						{
							System.out.println("�޸ķǷ������������á�");
							break;
						}
						System.out.println("�޸ĳɹ���");
						Jut=1;
						break;
					}
					
				}
				default:	System.out.println("�޸ķǷ������������á�");
			}
		
		return Jut;
	}
}

public class MyDate 
{
	public static void main(String []args)
	{
		
		int year=2018,month=10,day=22;
		int choice,Jut=0;
		DateChange changment = new DateChange();
		changment.year=year;
		changment.month=month;
		changment.day=day;
		Scanner in = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		calendar.set(year,month,day);
		Judgment judgment = new Judgment();
		
		System.out.println("1.������ڣ�");
		System.out.println("2.�������ڣ�");
		System.out.println("3.�������ڣ�");
		System.out.println("4.�˳���");
		outloop:
		for(;;)
		{
			year=changment.year;
			month=changment.month;
			day=changment.day;
			System.out.print("������ѡ��");
			choice = in.nextInt();
			switch(choice)
			{
			case 1:
				{
					changment.show();
					break;
				}
			case 2:
				{
					System.out.print("���������ڣ�yy/mm/dd��:\t");
					changment.year=in.nextInt();
					changment.month=in.nextInt();
					changment.day=in.nextInt();
					Jut = judgment.change(changment);
					if(Jut==0)
					{
						changment.year=year;
						changment.month=month;
						changment.day=day;
					}
					break;
				}
			case 3:
				{
					System.out.print("������������\t");
					changment.day+=in.nextInt();
					Jut = judgment.change(changment);
					if(Jut==0)
					{
						changment.year=year;
						changment.month=month;
						changment.day=day;
					}
					break;
				}
			case 4:
				{
					System.out.println("�˳��ɹ���");
					break outloop;
				}
			default: System.out.println("��������ȷ��ѡ��");
			}
		}
	in.close();
	}
}
