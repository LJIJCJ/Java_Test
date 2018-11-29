package com.homework;

import java.util.Scanner;

public class ThrowsTest {
	int[] mark = new int[50];
	int i=0;
	String str = "";
	
	
}

class Assignment{
	public static boolean assignment(int[] mark,int i) {
		Scanner in = new Scanner(System.in);
		int temp = in.nextInt();
		if(temp <0) {
			in.close();
			return false;
		}
		else {
			mark[i] = temp;
			in.close();
			return true;
		}
	}
}

class Average{
	public static int avarage(int[] mark) {
		int temp=0,average;
		for(int i = 0;i<mark.length;i++) {
			temp += mark[i];
		}
		average = temp/mark.length;
		return average;
	}
}

