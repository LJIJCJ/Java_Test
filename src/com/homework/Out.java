package com.homework;

public class Out extends Thread{
	public int temp = 1;
	
	public Out() {
		Print99 p1 = new Print99();
		Print99 p2 = new Print99();
		Print99 p3 = new Print99();
		Out out3 = new Out(p1,"3");
		Out out1 = new Out(p2,"1");
		Out out2 = new Out(p3,"2");
		
		out3.start();
		out1.start();
		out2.start();
	}
	
	public static void main(String[] args) {
		new Out();
	}
	public Out(Runnable r,String str) {
		super(r,str);
	}
		
}

class Print99 implements Runnable{
	static String str = "1";
	static int temp = 1;
	static final Object obj = new Object();
	
	public void run() {
		Out t =(Out) Thread.currentThread();
		while(true) {
			synchronized(obj) {
				if(t.getName().equalsIgnoreCase(str)) {
					for(int j =3*temp-2;j<=temp*3;j++) {
						for(int i =1;i<=j;i++) {
							System.out.print(i+"*"+j+"="+(i*j)+"\t");
						}
						System.out.println();
					}
					
					System.out.println("*******************"
							+ "*********************************");
					temp++;
					str = Integer.toString(temp);
					obj.notifyAll();
				}else
					try {
						obj.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
			}
			
		}
	}
}