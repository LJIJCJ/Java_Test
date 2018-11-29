package com.lcj;

public class BKS extends Student {
	public String level;
	public BKS() {
		this.ID=7;
		this.name="LJIJCJ";
		this.level="±¾¿ÆÉú";
	}
	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println(level+"\t"+"ID:"+ID+"\t"+"name:"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std=new BKS();
		std.print();
	}

}

