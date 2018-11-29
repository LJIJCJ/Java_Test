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
			System.out.println("生产者生产第"+(Top+1)+"个产品: "+Buf[Top]);
			Top++;
			return true;
		}else {
			System.out.println("生产已达最大值，请先消费！");
			System.out.println("****************************"
					+ "**************************************"
					+ "**************************************");
			return false;
		}
	}
	
	public boolean push(){
		if(Top>0) {
			Top--;
			System.out.println("消费者消耗第"+(Top+1)+"个产品："+Buf[Top]);	
			return true;
		}else {
			System.out.println("产品已消耗完毕，请先生产！");
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