package com.Test3;

public class Rectangle extends Shape{
	int sides = 4;
	int area;
	int length;
	int width;
	
	Rectangle(int length,int width){
		this.length = length;
		this.width = width;
	}
	
	int assignArea() {
		
		area = length * width;
		
		return area;
	}
}
