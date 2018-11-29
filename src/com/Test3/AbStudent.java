package com.Test3;

import java.io.IOException;
import java.util.Scanner;

public class AbStudent extends AbPerson{
	String name;
	char sex;
	int age;
	int SID;
	String speciality;
	public AbStudent(int SID,String speciality) {
		this.SID = SID;
		this.speciality = speciality;
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
		str = ("������"+name+"���Ա�"+sex+"�����䣺"+age+"��ѧ�ţ�"+SID+"��רҵ��"+speciality);
		
		return str;
	}
	
	public static void main(String[] args) {
		String name;
		char sex = 0;
		int age;
		int SID;
		String speciality;
		Scanner in = new Scanner(System.in);
		String str;
		
		System.out.println("���������ݣ�(�������Ա����䣬ѧ�ţ�רҵ)");
		
		name = in.nextLine();
		try {
			sex =(char) System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		age = in.nextInt();
		SID = in.nextInt();
		speciality = in.nextLine();
		
		AbStudent student = new AbStudent(SID,speciality);
		student.setData(name, sex, age);
		str = student.getDetail();
		System.out.println(str);
		
		in.close();
		
	}
}
