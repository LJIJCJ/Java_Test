package com.Test3;

public class Print2 implements Print{

	public void print() {
		System.out.println("�ڶ������!");
	}
	
	public static void main(String[] args) {
		Print2 print = new Print2();
		print.print();
	}
}
