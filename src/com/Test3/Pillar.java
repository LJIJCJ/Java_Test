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
		
		System.out.println("���������ݣ����ף��ߣ�");
		buttom = in.nextInt();
		height = in.nextInt();
		Triangle triangle = new Triangle(buttom,height);

		System.out.println("���������ݣ���������");
		length = in.nextInt();
		width = in.nextInt();
		Rectangle rectangle = new Rectangle(length,width);
		
		in.close();
		
		if(triangle.buttom == rectangle.length) {
			volume = triangle.assignArea()*rectangle.width;
			System.out.println("���Ϊ��"+volume);
		}else if(triangle.buttom == rectangle.width) {
			volume = triangle.assignArea()*rectangle.length;
			System.out.println("���Ϊ��"+volume);
		}else {
			System.out.println("�������");
		}
	}

	
	
}
