package com.Test3;

import java.util.Scanner;

public class Print1 implements Print{
	String str = "hello";
	
	public Print1(String str) {
		this.str = str;
	}
	
	public void print() {
		System.out.println("Êä³öÎª£º"+str);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str;
		
		System.out.println("ÇëÊäÈë×Ö·û´®£º");
		str = in.nextLine();
		
		Print1 print = new Print1(str);
		print.print();
		in.close();
	}
}
