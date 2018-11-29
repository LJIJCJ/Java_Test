package homework;

import java.util.Scanner;

public class ThrowsTest {
	public static void main(String[] args) {
		String str;
		Integer temp = 0;
		int[] mark = new int[51];
		int i = 0;
		int sum = 0;
		int average = 0;
		Scanner in = new Scanner(System.in);
		while(true) {
			str = in.nextLine();
			try {
				if(str.equals("average")) {
					average = sum/i;
					System.out.println(i+"个学生的平均分为："+average);
				}else {
					temp = new Integer(str);
					mark[i] = temp.intValue();
					exam(mark[i]);
					sum += mark[i];
					i++;
					System.out.println("第"+i+"个学生成绩为："+str);
				}
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("只能输入50个分数！");
			}catch(ArithmeticException e) {
				System.out.println("没有输入分数！");
			}catch(NegativeMarkException e) {
				System.out.println("负分非法："+mark[i]+"应在：0~100");
			}catch(OutofMarkException e) {
				System.out.println("不合法的分数："+mark[i]+"应在：0~100");
			}
		}
		
	}
	static void exam(int mark) throws NegativeMarkException,OutofMarkException {
		if(mark<0) {
			throw new NegativeMarkException();
		}else if(mark>100) {
			throw new OutofMarkException();
		}
	}
	
}

class NegativeMarkException extends Throwable{
	NegativeMarkException(){}
}

class OutofMarkException extends Throwable{
	OutofMarkException(){}
}