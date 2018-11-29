package com.test1;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		int temp;
		int sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入数据：");
		temp = in.nextInt();
		for(;temp != 0;) {
			sum += temp%10;
			temp /= 10;
		}
		in.close();
		
		System.out.println("其各位和为："+sum);
	}
}
