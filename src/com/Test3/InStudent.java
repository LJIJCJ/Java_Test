package com.Test3;

import java.io.IOException;
import java.util.Scanner;

public class InStudent implements InPerson{

	String name = "";
	String sex = "";
	String birthday = "";
	String speciality = "";
	String str = "";
	int SID;
	
	public InStudent(String name,String sex,String birthday,int SID,String speciality) {
		this.setData(name, sex, birthday);
		this.SID = SID;
		this.speciality = speciality;
	}
	
	@Override
	public void setData(String name, String sex, String birthday) {
		// TODO Auto-generated method stub
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
	}

	@Override
	public String getData() {
		// TODO Auto-generated method stub
		String str;
		str = ("姓名："+name+"，性别："+sex+"，生日："+birthday+"，学号："+SID+"，专业："+speciality);
		
		return str;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = "";
		String sex = "";
		String birthday = "";
		String speciality = "";
		String str = "";
		int SID;
		
		System.out.println("请输入数据：(姓名，性别，生日，学号，专业)");
		
		name = in.nextLine();
		sex = in.nextLine();
		birthday = in.nextLine();
		SID = in.nextInt();
		speciality = in.nextLine();
		
		InStudent student = new InStudent(name,sex,birthday,SID,speciality);
		
		str = student.getData();
		System.out.println(str);
		
		in.close();
	}

}
