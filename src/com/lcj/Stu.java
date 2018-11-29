package com.lcj;

public class Stu {
	private int ID;
	private String name;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Stu(int ID,String name) {
		this.ID=ID;
		this.name=name;
	}
}

