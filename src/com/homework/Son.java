package com.homework;

public class Son extends Super {
	public Son() {}
	public Son(String a) {
		super();
		System.out.println(a+"非默认构造器");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s=new Son();
	}
}

