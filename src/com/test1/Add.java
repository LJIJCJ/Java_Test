package com.test1;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		int temp;
		int sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("���������ݣ�");
		temp = in.nextInt();
		for(;temp != 0;) {
			sum += temp%10;
			temp /= 10;
		}
		in.close();
		
		System.out.println("���λ��Ϊ��"+sum);
	}
}
