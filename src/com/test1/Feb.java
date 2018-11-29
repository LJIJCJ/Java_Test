package com.test1;

import java.util.Scanner;

public class Feb {
	public static void main(String[] args) {
		
		int temp,length=0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("请输入要显示的长度：");
		length = in.nextInt();
		in.close();
		
		for(int i=1;i<=length;i++) {
			temp = Feblach.feb(i);
			System.out.println(temp);
		}
	}
}

class Feblach{
	public static int feb(int length) {
		if(length<=2) {
			return 1;
		}else {
			return feb(length-1)+feb(length-2);
		}
	}
}