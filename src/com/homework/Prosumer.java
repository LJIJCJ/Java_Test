package com.homework;

public class Prosumer {
	BufferStack bufSta = new BufferStack();
	Object obj = new Object();
	public Prosumer(){
		Producer producer = new Producer();
		Consumer consumer = new Consumer();
		producer.bufSta = bufSta;
		consumer.bufSta = bufSta;
		producer.obj = obj;
		consumer.obj = obj;
		
		Thread Pro = new Thread(producer);
		Thread Con = new Thread(consumer);
		Pro.start();
		Con.start();	
	}
	
	public static void main(String[] args) {
		new Prosumer();
	}
	
}

class BufferStack{
	int Top = 0;
	int[] Buf = new int[100];
	public boolean pop() {
		if(Top<Buf.length) {
			Buf[Top]=Top;
			System.out.println("������������"+(Top+1)+"����Ʒ: "+Buf[Top]);
			Top++;
			return true;
		}else {
			System.out.println("�����Ѵ����ֵ���������ѣ�");
			System.out.println("****************************"
					+ "**************************************"
					+ "**************************************");
			return false;
		}
	}
	
	public boolean push(){
		if(Top>0) {
			Top--;
			System.out.println("���������ĵ�"+(Top+1)+"����Ʒ��"+Buf[Top]);	
			return true;
		}else {
			System.out.println("��Ʒ��������ϣ�����������");
			System.out.println("****************************"
					+ "**************************************"
					+ "**************************************");
			return false;
		}
	}
}

class Producer implements Runnable{
	Object obj = new Object();
	BufferStack bufSta = new BufferStack();
	public void run() {
		while(true) {
			synchronized(obj) {
				if(!bufSta.pop()) {
					try {
						obj.wait();
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				obj.notifyAll();
			}
		}
	}
}

class Consumer implements Runnable{
	Object obj = new Object();
	BufferStack bufSta = new BufferStack();
	public void run() {
		while(true) {
			synchronized(obj) {
				if(!bufSta.push()) {
					try {
						obj.wait();
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				obj.notifyAll();
			}
		}
	}
}