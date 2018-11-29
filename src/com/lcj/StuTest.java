package com.lcj;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StuTest implements StuInterface {
	
	public List<Stu> student;
	public StuTest() {
		this.student=new LinkedList<Stu>();
	}
	
	
	@Override
	public void add(Stu a) {
		// TODO Auto-generated method stub
		student.add(a);
		System.out.println("�ڶ��������ѧ��\tID:"+a.getID()+"\tname:"+a.getName());
	}

	@Override
	public void delete(Stu b) {
		// TODO Auto-generated method stub
		student.remove(b);
		System.out.println("�ڶ���ɾ����ѧ��\tID:"+b.getID()+"\tname:"+b.getName());
	}

	@Override
	public void find(Stu c) {
		// TODO Auto-generated method stub
		Iterator<Stu> it=student.iterator();
		int a=0;
		while(it.hasNext()) {
			Stu s=(Stu)it.next();
			if(s.equals(c)) {
			System.out.println("�������ѧ������:\tID:"+c.getID()+"\tname:"+c.getName());
			a++;
			break;
			}
		}
		if(a==0)
			System.out.println("�����ﲻ���ڸ�ѧ��:\tID:"+c.getID()+"\tname:"+c.getName());
	}

	@Override
	public int currentCount() {
		// TODO Auto-generated method stub
		return student.size();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu a=new Stu(1,"xiaoming");
		Stu b=new Stu(2,"xiaohong");
		Stu c=new Stu(3,"xiaowang");
		StuTest test=new StuTest();
		test.add(a);
		test.add(b);
		test.add(c);
		System.out.println("��ѧ��������"+test.currentCount()+"��");
		test.delete(b);
		System.out.println("��ѧ��������"+test.currentCount()+"��");
		test.find(c);
		test.find(new Stu(3,"xiaogang"));
	}

}

