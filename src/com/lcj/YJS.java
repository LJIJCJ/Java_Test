package com.lcj;

public class YJS extends Student {
	public String level;
	public YJS() {
		this.ID=8;
		this.name="LJIJCJ";
		this.level="ÑÐ¾¿Éú";
	}
	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println(level+"\t"+"ID:"+ID+"\t"+"name:"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std=new YJS();
		std.print();
	}

}
