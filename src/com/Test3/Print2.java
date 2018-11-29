package com.Test3;

public class Print2 implements Print{

	public void print() {
		System.out.println("第二类情况!");
	}
	
	public static void main(String[] args) {
		Print2 print = new Print2();
		print.print();
	}
}
