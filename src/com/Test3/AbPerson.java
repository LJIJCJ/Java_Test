package com.Test3;

abstract class AbPerson {
	String name;
	char sex;
	int age;
	abstract void setData(String name,char sex,int age);
	abstract String getDetail();
}
