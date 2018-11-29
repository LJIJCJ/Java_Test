package com.Test3;

public class Triangle extends Shape{
	int sides = 3;
	int area;
	int buttom;
	int height;
	
	Triangle(int buttom,int height){
		this.buttom = buttom;
		this.height = height;
	}
	
	int assignArea() {
		
		area = buttom * height / 2;
		
		return area;
	}
}
