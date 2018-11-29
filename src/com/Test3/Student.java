package com.Test3;

import java.io.IOException;
import java.util.Scanner;

public class Student extends Person{
	int SID;
	int classNo;
	
	public Student(String name, char sex, int age,int SID,int classNo) {
		super(name, sex, age);
		// TODO Auto-generated constructor stub
		this.SID = SID;
		this.classNo = classNo;
	}
	
	public void setData(String name, char sex, int age,int SID,int classNo) {
		super.setData(name, sex, age);
		this.SID = SID;
		this.classNo = classNo;
	}
	
	public String getData() {
		String str;
		str = (super.getData()+",学号："+SID+",班级号："+classNo);
		return str;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		char sex = 0;
		int age;
		int SID;
		int classNo;
		String str;
		
		System.out.println("请输入学生信息：(姓名，性别，年龄，学号，班级号)");
		name = in.nextLine();
		try {
			sex = (char)System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		age = in.nextInt();
		SID = in.nextInt();
		classNo = in.nextInt();
		in.close();
		
		Student student = new Student(name,sex,age,SID,classNo);
		str = student.getData();
		System.out.println(str);
	}
}
