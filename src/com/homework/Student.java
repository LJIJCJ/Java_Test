package com.homework;

public class Student {
	private int ID;
	private String name;
	private char sex;
	private int age;
	private enum hobby{
		Football,Basketball,Dancing,Music
	}
	private int i;
	public Student(int ID,String name,char sex,int age,int i) {
		this.ID=ID;
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.i=i;
	}
	public Student() {
		this(007,"LJIJCJ",'��',18,1);
	}
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.toString());
	}
	@Override
	public String toString() {
		return "Student [IDΪ��" + ID + ", nameΪ��" + name + ", sexΪ��" + sex + ", ageΪ��" + age +", hobbyΪ��"+hobby.values()[i] +"]";
	}
}
