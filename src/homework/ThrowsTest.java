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
					System.out.println(i+"��ѧ����ƽ����Ϊ��"+average);
				}else {
					temp = new Integer(str);
					mark[i] = temp.intValue();
					exam(mark[i]);
					sum += mark[i];
					i++;
					System.out.println("��"+i+"��ѧ���ɼ�Ϊ��"+str);
				}
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ֻ������50��������");
			}catch(ArithmeticException e) {
				System.out.println("û�����������");
			}catch(NegativeMarkException e) {
				System.out.println("���ַǷ���"+mark[i]+"Ӧ�ڣ�0~100");
			}catch(OutofMarkException e) {
				System.out.println("���Ϸ��ķ�����"+mark[i]+"Ӧ�ڣ�0~100");
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