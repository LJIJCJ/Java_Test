package com.test3_1;

import java.util.Scanner;

public class GradeTest {
	public static void main(String[] args) {
		Grade[] grade = new Grade[20];
		Scanner in = new Scanner(System.in);
		init(grade);
		for(int i=0;;i++) {
			System.out.println("1.输入信息：");
			System.out.println("2.查询信息：");
			System.out.println("3.退出");
			
			switch(in.nextInt()) {
			case 1:{
				System.out.println("请输入信息：（姓名，老师，科目，分数）");
				input(grade[i],in.next(),in.next(),in.next(),in.nextInt());
				break;
			}
			case 2:{
				System.out.println("输入查询信息：（姓名，老师，科目）");
				String stuName = in.next();
				String teaName = in.next();
				String couName = in.next();
				for(int j=0;j<grade.length;j++) {
					if(grade[j].stu.stu_Name.equals(stuName)) {
						if(grade[j].tea.tea_Name.equals(teaName)) {
							if(grade[j].cou.cou_Name.equals(couName))
								System.out.println(grade[j].stu.stu_Name+"\t"+grade[j].tea.tea_Name+"\t"+grade[j].cou.cou_Name+"\t"+grade[j].gra);
						}
					}
				}
				break;
			}
			case 3:return;
			}
		}
	}
	
	
	public static void input(Grade grade,String stuName,String teaName,String couName,int gra) {
		grade.stu.stu_Name = stuName;
		grade.tea.tea_Name = teaName;
		grade.cou.cou_Name = couName;
		grade.gra = gra;
	}
	
	public static void init(Grade[] grade) {
		for(int i=0;i<grade.length;i++) {
			grade[i] = new Grade();
			grade[i].tea.tea_Name = "";
			grade[i].stu.stu_Name = "";
			grade[i].cou.cou_Name = "";
		}
	}
}
