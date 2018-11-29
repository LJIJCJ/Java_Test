package com.Test3;

public class Person {
	String name;
	char sex;
	int age;
	
	public Person(String name,char sex,int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	public void setData(String name,char sex,int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	public String getData() {
		String str;
		str = ("姓名："+name+",性别："+sex+",年龄："+age);
		return str;
	}
}
