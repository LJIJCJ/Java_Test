package com.Test3;

import java.io.IOException;
import java.util.Scanner;

public class AbTeacher extends AbPerson{

	String name;
	char sex;
	int age;
	int tID;
	String department;
	
	public AbTeacher(int tID,String department) {
		this.tID = tID;
		this.department = department;
	}
	
	@Override
	void setData(String name, char sex, int age) {
		// TODO Auto-generated method stub
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	@Override
	String getDetail() {
		// TODO Auto-generated method stub
		String str;
		str = ("姓名："+name+"，性别："+sex+"，年龄："+age+"，教师号："+tID+"，部门："+department);
		
		return str;
	}
	
	public static void main(String[] args) {
		String name;
		char sex = 0;
		int age;
		int tID;
		String department;
		Scanner in = new Scanner(System.in);
		String str;
		
		System.out.println("请输入数据：(姓名，性别，年龄，教师号，部门)");
		
		name = in.nextLine();
		try {
			sex =(char) System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		age = in.nextInt();
		tID = in.nextInt();
		department = in.nextLine();
		
		AbTeacher teacher = new AbTeacher(tID,department);
		teacher.setData(name, sex, age);
		str = teacher.getDetail();
		System.out.println(str);
		
		in.close();
		
	}

}
