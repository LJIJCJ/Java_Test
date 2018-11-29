package com.homework;


public class SelfDefinationArray {
	public static void assignment(int[] str) {
		str[10] = 10;
	}
	public static void main(String[] args) {
		int[] str = new int[5];
		try {
			assignment(str);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界！");
	}
}
}