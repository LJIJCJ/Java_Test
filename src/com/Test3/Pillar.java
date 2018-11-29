package com.Test3;

import java.util.Scanner;

public class Pillar {
	
	public static void main(String[] args) {
		int volume;
		int length;
		int width;
		int buttom;
		int height;
		Scanner in = new Scanner(System.in);
		
		System.out.println("请输入数据：（底，高）");
		buttom = in.nextInt();
		height = in.nextInt();
		Triangle triangle = new Triangle(buttom,height);

		System.out.println("请输入数据：（长，宽）");
		length = in.nextInt();
		width = in.nextInt();
		Rectangle rectangle = new Rectangle(length,width);
		
		in.close();
		
		if(triangle.buttom == rectangle.length) {
			volume = triangle.assignArea()*rectangle.width;
			System.out.println("体积为："+volume);
		}else if(triangle.buttom == rectangle.width) {
			volume = triangle.assignArea()*rectangle.length;
			System.out.println("体积为："+volume);
		}else {
			System.out.println("计算出错！");
		}
	}

	
	
}
